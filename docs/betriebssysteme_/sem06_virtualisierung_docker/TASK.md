# "Virtualisierung mit Docker" - Taskdescription

## Einführung

Verwendung von Containern soll die gemeinsame Arbeit als auch die Anpassung von Deployments bei z.B. Kunden deutlich vereinfachen.

## Ziele

Das Ziel dieser Übung ist die Anpassung von containerbasierten Virtualisierungsumgebungen und die einfache Veröffentlichung und Bereitstellung der benutzerdefinierten Containern.

## Kompetenzzuordnung

**GK SYT6 Betriebssysteme | Virtualisierung | virtuelle Umgebung**  

* "Cloud-basierte virtuelle Maschinen erstellen"  
* "Serverdienste installieren"

**EK SYT6 Betriebssysteme | Virtualisierung | virtuelle Umgebung**  

* "Skalierungsfeatures von cloud-basierten Virtualisierungsplattformen verwenden"
* "Container zur Dienstbereitstellung verwenden"

## Voraussetzungen
* Grundverständnis von Netzwerk und Betriebssystemkonfiguration
* Grundverständnis von virtuellen Maschinen und dem Einsatz eines Hypervisors
* **Lauffähige Docker-Umgebung**

## Installation
Um diese Übung in der vorgegebenen Zeit umsetzen zu können, ist die erfolgreiche Installation der _**Docker-Engine**_ vor dem Antritt zur Laborübung verpflichtend. Es wird empfohlen, diese in einer Linux-Umgebung auszuführen. Die Anleitungen sind auf der offiziellen Docker Seite zu finden: https://docs.docker.com/engine/install/

_**Es wird empfohlen Docker-Desktop zusätlich nativ am Host System zu installieren.**_

Für *Debian* sind die Installations-Befehle hier kurz zusammengefasst:
```bash
## All following commands must be executed as root, therefore we are switching to the root account
sudo su -

apt update
apt install ca-certificates curl gnupg lsb-release
curl -fsSL https://download.docker.com/linux/debian/gpg | gpg --dearmor -o /etc/apt/trusted.gpg.d/docker.gpg
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/trusted.gpg.d/docker.gpg] https://download.docker.com/linux/debian \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

apt update && apt install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

## Here we are testing the installed Docker Engine
docker run hello-world

## Now installing the handy docker-compose for faster configuration and deployment
apt install python3-pip
pip3 install setuptools && pip3 install docker-compose
```

Die erfolgreiche Installation kann auch mit dem Aufruf von `docker run docker/whalesay cowsay boo` getestet werden.

Sollte die Installation trotz Warnung, unbedingt auf der Host-Maschine unter Windows oder MacOS durchgeführt werden, ist die gebündelte Version der Docker-Desktop Variante zu präferieren, da dort alle Abhängigkeiten automatisch nachgereicht werden. Es wird hier aber aus Zeitgründen kein Support angeboten!

## Detaillierte Aufgabenbeschreibung
_"... but it works on my machine!"_ ist als Ausrede bei einem Kunden in der heutigen Zeit nicht mehr gültig und kann für so viele Anwendungsgebiete in der IT schon am Anfang der Produkt-Entwicklung umgangen werden. Wieso immer alles auf dem Host-System installieren, um dann nach einigen Wochen oder Monaten und mangelnder Dokumentation nicht mehr zu wissen, welche Abhängigkeiten benötigt wurden, um das entwickelte System beim Kunden oder in der Cloud zu deployen? Dabei ist _DevOps_ mit Containern so einfach geworden!

Die Aufgabenstellung beruht auf den in den Quellen angegebenen Tutorials und soll die wichtigsten Befehle und Möglichkeiten mit Docker vorstellen und trainieren. Es ist sehr hilfreich die kurzen Vorstellungen von _redhat_ [1, 2] und auch die Übersicht von _docker_ selbst [3] zu lesen, besonders sollte die Architektur klar sein:  

![Docker architecture](https://docs.docker.com/engine/images/architecture.svg)

### 1. Der erste Container
Container sind Instanzen von Docker-Images, die mit dem Befehl `docker run` ausgeführt werden können. Der Hauptzweck von Docker ist das Ausführen von Containern.
Um die Berechtigung zu haben, mit den Docker-Befehlen zu hantieren, sollte der Benutzer in der Gruppe `docker` hinzugefügt werden, dies kann durch das Kommando `sudo usermod -aG docker $USER` vollzogen werden (im Anschluss ist ein Logout/Session-Refresh notwendig). Dies erübrigt dann die dauernde Voranstellung des `sudo` Kommandos!

Um daher mit dem _Docker client_ Images und Container steuern zu können, muss der _Docker daemon_ als System-Dienst aktiviert und gestartet werden! In Debian-basierten Systemen kann dies mit `systemctl status docker.service` überprüft werden. Wie kann dann der Dienst gestartet bzw. gestoppt werden?

Wir haben nach der Installation schon unseren ersten Container initialisiert und gestartet. Dies ist mit dem Kommando `docker run hello-world` geschehen. Der Output hat so ausgesehen:

```bash
Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

To try something more ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu bash

Share images, automate workflows, and more with a free Docker ID:
 https://hub.docker.com/

For more examples and ideas, visit:
 https://docs.docker.com/get-started/
```

Finde heraus, was die Schritte 1. bis 4. zu bedeuten haben, und was da genau passiert ist! Liste dir nun alle aktiven und passiven Container in deinem System mit dem Befehl `docker ps -a` auf und analysiere den Output! Wenn du den Befehl `docker run hello-world` öfters ausgeführt hast, wirst du mehrere Container vom Image `hello-world` sehen, wieso ist das so? Kleiner Tipp: `man docker run` hilft dir dabei!

### 2. Fertige Images und deren Einstiegspunkt
Mit dem Image `hello-world` werden wir die Welt wohl nicht erobern können, daher kommen wir gleich zu dem zweiten Punkt der Ausgabe zurück: Was ist der _Docker Hub_ und wie hilft uns dieser schnell unsere Aufgaben lösen zu können? Einfach mal das Overview von "Docker Hub" bei der Docker Dokumentation anklicken hilft, um dieses Rätsel zu lösen!

Wir wollen nun einfach und schnell einen Blog deployen. [Ghost](https://hub.docker.com/_/ghost) bietet sich dafür geradezu an! Auf der _Docker Hub_ Seite sehen wir eine einfache Möglichkeit zum Starten des Blogs:

`docker run -d --name some-ghost -e NODE_ENV=development -e url=http://localhost:3001 -p 3001:2368 ghost:latest`

Dabei lernen wir gleich neue Optionen des Docker clients kennen, z.B. `-d`, `--name`, `-e` und `-p`. Was bedeuten diese?  
Aber viel schöner ist eigentlich der Outcome des Befehls, öffne deinen Browser und klick auf [http://localhost:3001](http://localhost:3001)!

### 3. Images verwalten
Wie wir bereits wissen, können mehrere Container auf ein und demselben Image beruhen, welche von offizieller Seite heruntergeladen werden können. Mit dem Befehl `docker images` bzw. `docker image ls` können alle lokal herunter geladenen als auch selbst erstellten Images angezeigt werden. Welche Informationen werden dabei angezeigt?

Will man ein Image nur herunterladen (ohne es gleich in einem Container zu verwenden), kann der Befehl `docker pull` verwendet werden. Dabei stellt sich die Frage, in welcher Version (oder Tag) bzw. für welche Plattform. Welche Möglichkeiten bietet Ghost dabei an, wo können diese eingesehen werden? Wo würde dann zum Beispiel die _linux/arm/v7_ Architektur verwendet werden?

Mit der Zeit und nach einigen Updates kann es zu einem doch recht großen Speicherverbrauch kommen. Um nicht benutzte Images nicht immer händisch entfernen zu müssen, bietet Docker eine kleine Option an: `docker image prune -a`  
Um jedoch gezielt ein Image zu entfernen kann der Befehl `docker rmi hello-world:latest` eingegeben werden. Was passiert, wenn ein Container jedoch noch dieses Image benötigt? Welche anderen Optionen hat `docker image` noch zu bieten?

### 4. Container verwalten
Welche Container sind denn gerade am Laufen? Der Befehl `docker ps` gibt darüber Auskunft. Wie werden die inaktiven Container angezeigt?  
Um einen Container zu starten bzw. zu stoppen sind welche Kommandos notwendig? (kleiner Tipp, `docker --help` hilft)

Wenn zum Beispiel der vorhin erstellte Container mit dem Namen `some-ghost` gestoppt und wieder gestartet wurde, sind keine weiteren Argumente notwendig. Wieso ist das so?  Jeder Container in Docker hat einen Lebenszyklus, beschreibe die einzelnen Zustände und die Befehle, die verwendet werden, um diese Zustände zu wechseln (z.B. von Laufend zu Pausiert bzw. Gestoppt)   
Nach der Eingabe von `docker inspect some-ghost` wird eine lange Liste aller Konfigurationen in *JSON*-Format ausgegeben. Was besagt dabei der Key mit dem Namen `"Args":`? Wo liegen eigentlich die Dateien, die innerhalb eines Containers verwendet werden? Und wieso hat jeder Container seine eigenen Directories?

Zwei weitere Kommandos sind bei laufenden Containern noch sehr hilfreich, `top` und `stats`. Wieviel Speicher verbraucht der Container `some-ghost` im laufenden Betrieb? Sollte der gestartete Container einen Prozess am Laufen erhalten, welcher Informationen an den Standard-Output ausgiebt, kann mit `docker logs -f some-ghost` dies an die aktuelle Konsole eingesehen werden.

Vom Installations-Prozess sind noch die `hello-world` Container übrig geblieben. Verwende `docker rm` um diese zu entfernen! Welche Identifikationsmöglichkeiten bestehen beim Verwalten von Containern? Wie ist die ID zu interpretieren?
Nach dem Entfernen des letzten `hello-world` Containers kann nun auch das nicht mehr benutzte Image von `hello-world` entfernt werden. Welche Schritte sind dafür von Nöten, nur diese und keine anderen, unbenutzten Images zu entfernen?

### 5. Container miteinander orchestrieren
Der Docker client ist sehr mächtig und hilft bei allen notwendigen administrativen Tätigkeiten. Jedoch können bei mehreren Containern, die vielleicht auch noch miteinander interagieren sollen, viele einzelne Kommandos schnell sehr unübersichtlich. Denke nur zurück an die Erstellung des Ghost-Containers!

Docker Compose ist ein Tool zum Definieren und Ausführen von Docker-Anwendungen mit mehreren Containern. Mit Compose kommt eine YAML-Datei zum Einsatz, um die Dienste der kompletten Anwendung zu konfigurieren. Anschließend erstellt und startet man mit einem einzigen Befehl alle Dienste aus der Konfiguration.

Ghost hat genau so eine zusammengestelltes YAML-Datei zur einfachen Konfiguration auf [Docker Hub](https://hub.docker.com/_/ghost) bereitgestellt (mit kleinen Anpassungen):
```yaml
version: '3.1'

services:

  ghost:
    image: ghost:latest
    restart: always
    ports:
      - 8822:2368
    volumes:
      - ./ghost-data:/var/lib/ghost/content
    environment:
      # see https://ghost.org/docs/config/#configuration-options
      database__client: mysql
      database__connection__host: db
      database__connection__user: root
      database__connection__password: example
      database__connection__database: ghost
      # this url value is just an example, and is likely wrong for your environment!
      url: http://localhost:8822
      NODE_ENV: development

  db:
    image: mysql:8.0
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: example
```

Wenn dieses File als docker-compose.yml abgespeichert wird, muss bei allen Aufrufen das Datei-Argument nicht angehängt werden. Wenn der Installations-Prozess erfolgreich abgeschlossen wurde, ist das Tool docker-compose lauffähig und kann nun nicht nur der Ghost-Container sondern auch die MySQL-Datenbank als Container und komplettes Service gestartet werden. Dies kann durch docker-compose up -d bewerkstelligt werden. Starte die beiden Container mit dem compose Befehl.

Welche zusätzlichen Konfigurationen sind nun im Gegensatz zum `docker run` Befehl in die YAML-Datei aufgenommen worden?

Wenn Dateien eines Services im lokalen Verzeichnis zur einfachen Administration (z.B. Änderung, Backup, Wiederverwendung) zur Verfügung gestellt werden sollen, bietet sich die `volumes` Einstellung an. Dort wird links der lokale Ordner und rechts der absolute Ort im Container angegeben. In der [Docker Reference](https://docs.docker.com/compose/compose-file/#volumes) sind noch mehr Informationen zu finden.

Die Netzwerkeinstellung ist hier noch immer per Default in Verwendung, welche ist diese? Warum kann man im Browser mit localhost auf den Container zugreifen? Welche Einstellung nimmt man dabei mit `ports` vor?  
Docker Compose bietet hier noch viel mehr Möglichkeiten an, die auch in der [Docker Reference - Networks](https://docs.docker.com/compose/compose-file/#networks-top-level-element) einsehbar sind.

Der größte Vorteil des Compose Tools ist jedoch die Verbindung von mehreren Containern zu einer Applikation, ob eben mit Volumes, dem Netzwerk aber auch von der Environment-Konfiguration. Der beste Punkt ist jedoch die leichte Start-, Stop- und Update-Möglichkeit. Wie werden nun alle Container mit nur einem Befehl gestoppt, upgedatet bzw. gelöscht?

### 6. Eigene Images erstellen und deployen
Wie sicher schon bekannt ist, kann ein Image nur sehr schwer im nachhinein verändert werden. Um eigene Anpassungen durchzuführen, bietet sich an, sein eigenes Image zu erstellen. Hierfür ist das `Dockerfile` notwendig:

```Docker
FROM ubuntu:14.04

# install cowsay, and move the "default.cow" out of the way so we can overwrite it with "docker.cow"
RUN apt-get update && apt-get install -y cowsay --no-install-recommends && rm -rf /var/lib/apt/lists/* \
	&& mv /usr/share/cowsay/cows/default.cow /usr/share/cowsay/cows/orig-default.cow

# "cowsay" installs to /usr/games
ENV PATH $PATH:/usr/games

COPY docker.cow /usr/share/cowsay/cows/
RUN ln -sv /usr/share/cowsay/cows/docker.cow /usr/share/cowsay/cows/default.cow

CMD ["cowsay"]
```

Nach dem Download von [docker.cow](https://raw.githubusercontent.com/docker/whalesay/master/docker.cow) kann man die ASCII-Ausgabe noch seinen eigenen Wünschen entsprechend anpassen.

Mit dem Befehl `docker build -t mywhale:latest .` wird nun ein Image erstellt und für die Verwendung bei lokalen Containern zur Verfügung gestellt. Der Test kann mit `docker run mywhale cowsay boooo` gestartet werden!

Wo passiert hier der ganze Zauber? Bei der Architektur wurde schon vorgestellt, dass ein Container eigentlich nur eine Aufgabe erfüllen soll, und dafür in sich abgeschlossen sein sollte. Leider ist dies nicht immer ganz so einfach, und da passiert es schon mal, dass mehr als nur ein Programm bzw. Prozess aus einem Container gestartet wird. Und genau dort wollen wir mal hinsehen, es ist der `CMD` welcher nur genau einmal im `Dockerfile` definiert werden kann, und den Container Prozess ausmacht. Davor kann alles Notwendige in einem sogennanten `ENTRYPOINT` konfiguriert werden (siehe z.B. den [Entrypoint von Ghost](https://github.com/docker-library/ghost/blob/master/5/debian/docker-entrypoint.sh)). Was wird bei dem Ghost-Container für ein `CMD` ausgeführt? Wo steht das geschrieben? Ist es möglich diesen Befehl zu verändern?

Was genau ist nun alles geschehen? Wie könnte man verschiedene Versionen des Images erstellen? Gibt es vielleicht noch andere, kleinere Basis-Systeme für solch ein Image? Wie heißen diese? Welchen Paketmanager verwendet dieses? Kleiner Tipp, Docker hat ein [Github-Repository](https://github.com/docker/whalesay) für genau dieses Problem!

Was muss man nun tun, damit dieses lokale Image auch für andere im Internet zur Verfügung gestellt wird? [Docker Hub Repositories](https://docs.docker.com/docker-hub/repos/) bietet dabei eine sehr einfache Möglichkeiten an! Welche Befehle müsste man eingeben, um das `mywhale`-Image auf Docker-Hub zu publishen?

## Abgabe
Die einzelnen Teile sind der Reihe nach zu lösen, da gewisse Abhängigkeiten in der Umsetzung als auch in der Komplexität gegeben sind. Meist ist die Verwendung der Manpage ausreichend. Die ausgeführten Befehle sind entsprechend zu dokumentieren und auch verwendete Hilfsmittel sind als Quellen anzugeben. Es bietet sich an, die Dokumentation in Markdown zu verfassen und diese auch für den Eigengebrauch abzulegen. Screenshots sind nur bedingt hilfreich, wenn man Befehle oder Quellcode schnell wieder verwenden möchte. Als Dokumentationsabgabe kann leider nur **.pdf** akzeptiert werden.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Teil 0: Installation der Docker-Engine
- [ ] Teil 1: Aufruf und Verwendung von Containern
- [ ] Teil 2: Bereitgestellte Images nutzen
- [ ] Teil 3: Images verwalten
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Teil 4: Container verwalten
- [ ] Teil 5: Docker-Compose verwenden
- [ ] Teil 6: Container mittels eigenen Dockerfiles erstellen und deployen

## Quellen
* [1] "Was ist Docker? Welche Vorteile bietet Containerisierung?" redhat.com; zuletzt besucht 2023-02-12; [online](https://www.redhat.com/de/topics/containers/what-is-docker)
* [2] "Vergleich zwischen Containern und VMs" redhat.com; zuletzt besucht 2023-02-12; [online](https://www.redhat.com/de/topics/containers/containers-vs-vms)
* [3] "Docker overview" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/get-started/overview/)
* "Docker – die revolutionäre Container-Technologie" Ionos - Digital Guide; zuletzt besucht 2023-02-14; [online](https://www.ionos.de/digitalguide/server/knowhow/was-ist-docker/)
* "Docker Documentation: How to Build, Share and Run" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/)
* "Docker Hub Overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/docker-hub/)
* "Docker Compose overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/compose/)
* "Best practices for writing Dockerfiles" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/)

* "Install Docker Engine on Debian" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/engine/install/debian/)
* "Docker-Tutorial: Installation und Betrieb der Container-Plattform" Ionos - Digital Guide; zuletzt besucht 2023-02-12; [online](https://www.ionos.de/digitalguide/server/konfiguration/docker-tutorial-installation-und-erste-schritte/)
* "Installing Docker on Ubuntu/Debian" hetzner Community; zuletzt besucht 2023-02-12; [online](https://community.hetzner.com/tutorials/howto-docker-install)
* "Docker Guide" baeldung; letzte Änderung 2022-12-28; zuletzt besucht 2023-02-14; [online](https://www.baeldung.com/ops/docker-guide)
* "Docker Lernen für Anfänger" lerneprogrammieren; zuletzt besucht 2023-02-14; [online](https://lerneprogrammieren.de/docker/)
* "Docker 101 Tutorial" Docker; zuletzt besucht 2023-02-14; [online](https://www.docker.com/101-tutorial/)
* "Docker Tutorial" tutorialspoint - simply easy learning; zuletzt besucht 2023-02-14; [online](https://www.tutorialspoint.com/docker/index.htm)
* "Container Entrypoint" lostechies; zuletzt besucht 2023-03-14; [online](https://lostechies.com/gabrielschenker/2016/08/21/container-entrypoint/)
* "Docker CMD vs ENTRYPOINT: What’s The Difference & How To Choose" bmc.com; zuletzt besucht 2023-03-14; [online](https://www.bmc.com/blogs/docker-cmd-vs-entrypoint/)
* "Demystifying ENTRYPOINT and CMD in Docker" aws.amazon.com; zuletzt besucht 2023-03-14; [online](https://aws.amazon.com/blogs/opensource/demystifying-entrypoint-cmd-docker/)

---
**Version** *20230214v2*