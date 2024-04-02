---
hide:
  - navigation
---

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
Um diese Übung in der vorgegebenen Zeit umsetzen zu können, ist die erfolgreiche Installation der _**Docker-Engine**_ vor dem Antritt zur Laborübung verpflichtend. Es wird empfohlen, [Docker Desktop](https://www.docker.com/products/docker-desktop/) am Host System zu installieren. Realitätsnäher wäre es diese auf einem Server (VM) diese in einer Linux-Umgebung auszuführen. Für diese Übung ist das nicht notwendig, sondern Docker am nativen Betriebssystem zu verwenden.
Die Anleitungen sind auf der offiziellen Docker Seite zu finden: https://docs.docker.com/engine/install/

Die erfolgreiche Installation kann auch mit dem Aufruf von `docker run docker/whalesay cowsay boo` getestet werden.

## Detaillierte Aufgabenbeschreibung
### 1. Der erste Container
Container sind Instanzen von Docker-Images, die mit dem Befehl `docker run` ausgeführt werden können. Der Hauptzweck von Docker ist das Ausführen von Containern.
Um die Berechtigung zu haben, mit den Docker-Befehlen zu hantieren, sollte der Benutzer in der Gruppe `docker` hinzugefügt werden, dies kann durch das Kommando `sudo usermod -aG docker $USER` vollzogen werden (im Anschluss ist ein Logout/Session-Refresh notwendig). Dies erübrigt dann die dauernde Voranstellung des `sudo` Kommandos! (Unter Windows und macOS nicht notwendig, kann übersprungen werden).

Um daher mit dem _Docker client_ Images und Container steuern zu können, muss der _Docker daemon_ als System-Dienst aktiviert und gestartet werden! In Debian-basierten Systemen kann dies mit `systemctl status docker.service` überprüft werden. Wie funktioniert das unter Windows? Wie kann dann der Dienst gestartet bzw. gestoppt werden?

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

Liste dir nun alle aktiven und passiven Container in deinem System mit dem Befehl `docker ps -a` auf und analysiere den Output!

### 2. Fertige Images und deren Einstiegspunkt
Wir wollen nun einfach und schnell einen Blog deployen. [Ghost](https://hub.docker.com/_/ghost) bietet sich dafür geradezu an! Auf der _Docker Hub_ Seite sehen wir eine einfache Möglichkeit zum Starten des Blogs:

`docker run -d --name some-ghost -e NODE_ENV=development -e url=http://localhost:3001 -p 3001:2368 ghost:latest`

Was bedeutet der Befehl und dessen Einzelteile? Aber viel schöner ist eigentlich der Outcome des Befehls, öffne deinen Browser und klick auf [http://localhost:3001](http://localhost:3001)! Ließ dir die [Ghost Documentation auf Docker Hub](https://hub.docker.com/_/ghost) durch und finde heraus, wie man auf das Admin Backend kommt. Publishe einen neuen Artikel auf deinem Ghost Blog!

### 3. Images verwalten
Wie wir bereits wissen, können mehrere Container auf ein und demselben Image beruhen, welche von offizieller Seite heruntergeladen werden können. Mit dem Befehl `docker images` bzw. `docker image ls` können alle lokal herunter geladenen als auch selbst erstellten Images angezeigt werden. Welche Informationen werden dabei angezeigt? Will man ein Image nur herunterladen (ohne es gleich in einem Container zu verwenden), kann der Befehl `docker pull` verwendet werden. 

Mit der Zeit und nach einigen Updates kann es zu einem doch recht großen Speicherverbrauch kommen. Um nicht benutzte Images nicht immer händisch entfernen zu müssen, bietet Docker eine kleine Option an: `docker image prune -a`  
Um jedoch gezielt ein Image zu entfernen kann der Befehl `docker rmi hello-world:latest` eingegeben werden. Was passiert, wenn ein Container jedoch noch dieses Image benötigt? Welche anderen Optionen hat `docker image` noch zu bieten?

### 4. Container verwalten
Welche Container sind denn gerade am Laufen? Der Befehl `docker ps` gibt darüber Auskunft. Wie werden die inaktiven Container angezeigt?  
Um einen Container zu starten bzw. zu stoppen sind welche Kommandos notwendig? (kleiner Tipp, `docker --help` hilft)

Zwei weitere Kommandos sind bei laufenden Containern noch sehr hilfreich, `top` und `stats`. Sollte der gestartete Container einen Prozess am Laufen erhalten, welcher Informationen an den Standard-Output ausgibt, kann mit `docker logs -f some-ghost` dies an die aktuelle Konsole eingesehen werden.

Vom Installationsprozess sind noch die `hello-world` Container übrig geblieben. Verwende `docker rm` um diese zu entfernen!

### 5. Container miteinander orchestrieren
Der Docker client ist sehr mächtig und hilft bei allen notwendigen administrativen Tätigkeiten. Jedoch können bei mehreren Containern, die vielleicht auch noch miteinander interagieren sollen, viele einzelne Kommandos schnell sehr unübersichtlich. Denke nur zurück an die Erstellung des Ghost-Containers!

Docker Compose ist ein Tool zum Definieren und Ausführen von Docker-Anwendungen mit mehreren Containern. Mit Compose kommt eine YAML-Datei zum Einsatz, um die Dienste der kompletten Anwendung zu konfigurieren. Anschließend erstellt und startet man mit einem einzigen Befehl alle Dienste aus der Konfiguration, wie im letzten Semester in INSY mit MariaDB und Adminer geschehen.

[Uptime Kuma](https://github.com/louislam/uptime-kuma) ist ein einfaches Tool um zu überwachen, ob Webseiten oder Services online sind.

```yaml
version: '3.3'

services:
  uptime-kuma:
    image: louislam/uptime-kuma:latest
    container_name: uptime-kuma
    volumes:
      - ./uptime-kuma-data:/app/data
    ports:
      - 3001:3001
    restart: always
```

Wenn dieses File als `docker-compose.yml` abgespeichert wird, muss bei allen Aufrufen das Datei-Argument nicht angehängt werden. Die Datei sollte ihren eigenen Ordner bekommen. Dieser sollte auch nicht in einem Cloud Speicher Ordner (OneDrive, Dropbox, ...) abgelegt werden, da hier ein Volume verwendet wird. Wenn der Installations-Prozess erfolgreich abgeschlossen wurde, ist das Tool docker-compose lauffähig und kann nun Uptime Kuma als Container und komplettes Service gestartet werden. Dies kann durch `docker-compose up -d` bewerkstelligt werden. Starte den Container mit dem compose Befehl.

Du wirst einen Error beim Starten erhalten (wenn nicht, ist schon vorher etwas nicht nach Plan verlaufen.). Wieso? Wie ist dieser zu lösen? (Ließ die Error Message genau)

Welche zusätzlichen Konfigurationen sind nun in die YAML-Datei aufgenommen worden?

Der größte Vorteil des Compose Tools ist jedoch die Verbindung von mehreren Containern zu einer Applikation, ob eben mit Volumes, dem Netzwerk aber auch von der Environment-Konfiguration. Der beste Punkt ist jedoch die leichte Start-, Stop- und Update-Möglichkeit. Wie werden nun alle Container in einem YAML mit nur einem Befehl gestoppt, upgedatet bzw. gelöscht?

Öffne das Frontend von Uptime Kuma und erstelle einen Account. Erstelle einen Monitor für https://elearning.tgm.ac.at/ und einen weiteren für deinen Ghost Container. Eventuell schaffst du es auch Notificationen zu senden falls eines Webseiten down geht.

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

Speichere das Dockerfile (mit diesem Namen ohne Endung) in einem neuen Ordner. Erstelle [docker.cow](https://raw.githubusercontent.com/docker/whalesay/master/docker.cow) im selben Ordner und [verändere den Wal](https://www.asciiart.eu/) (damit zu erkennen ist, dass es dein eigenes Image ist) 

Mit dem Befehl `docker build -t mywhale:latest .` (nicht den . am Ende vergessen!) wird nun ein Image erstellt und für die Verwendung bei lokalen Containern zur Verfügung gestellt. Der Test kann mit `docker run mywhale cowsay boooo` gestartet werden!

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
- [ ] Teil 4: Container verwalten
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Teil 5: Docker-Compose verwenden
- [ ] Teil 6: Container mittels eigenen Dockerfiles erstellen und deployen

## Quellen
* "Was ist Docker? Welche Vorteile bietet Containerisierung?" redhat.com; zuletzt besucht 2023-02-12; [online](https://www.redhat.com/de/topics/containers/what-is-docker)
* "Vergleich zwischen Containern und VMs" redhat.com; zuletzt besucht 2023-02-12; [online](https://www.redhat.com/de/topics/containers/containers-vs-vms)
* "Docker overview" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/get-started/overview/)
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

---
**Version** *20240324v3*
