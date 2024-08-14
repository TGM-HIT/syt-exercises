---
hide:
  - navigation
---

# "Virtualisierung mit Docker" - Taskdescription

## Einführung

_"... but it works on my machine!"_ ist als Ausrede bei einem Kunden in der heutigen Zeit nicht mehr gültig und kann für so viele Anwendungsgebiete in der IT schon am Anfang der Produkt-Entwicklung umgangen werden. Wieso immer alles auf dem Host-System installieren, um dann nach einigen Wochen oder Monaten und mangelnder Dokumentation nicht mehr zu wissen, welche Abhängigkeiten benötigt wurden, um das entwickelte System beim Kunden oder in der Cloud zu deployen? Dabei ist _DevOps_ mit Containern so einfach geworden!

Die Aufgabenstellung beruht auf den in den Quellen angegebenen Tutorials und soll die wichtigsten Befehle und Möglichkeiten mit Docker vorstellen und trainieren. Es ist sehr hilfreich die kurzen Vorstellungen von _redhat_ [1, 2] und auch die Übersicht von _docker_ selbst [3] zu lesen, besonders sollte die Architektur klar sein:  

![Docker architecture](https://docs.docker.com/engine/images/architecture.svg)

## Ziele

Theoretische Hintergründe der Docker Virtualisierungstechnologie kennenlernen

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

## Fragestellungen
1. Erkläre in eigenen Worten die Docker Architektur. Was sind die Aufgaben von Docker Client, Docker Host, Regestry und daemon? [1, 3, 4]
2. Was ist der Unterschied zwischen einem Image und einem Container? [2]
3. Was ist der Unterschied zwischen einem Docker Container und er virtuellen Maschine? [1, 4]
4. Der Output des Kommando `docker run hello-world` hat so ausgesehen:

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

Finde heraus, was die Schritte 1. bis 4. zu bedeuten haben, und was da genau passiert ist!  

5. Wenn der Befehl `docker run hello-world` öfters ausgeführt hast, werden mehrere Container vom Image `hello-world` erstellt, wieso ist das so? Kleiner Tipp: `man docker run` [5]
6. Was genau macht `docker run`? Wie können wir die Shell des Containers erreichen?
7. Was ist der _Docker Hub_ und wie hilft uns dieser schnell unsere Aufgaben lösen zu können? Overview von "Docker Hub" bei der Docker Dokumentation anklicken hilft [6]
8. Erkläre den Befehl: `docker run -d --name some-ghost -e NODE_ENV=development -e url=http://localhost:3001 -p 3001:2368 ghost:latest` (`-d`, `--name`, `-e` und `-p`. Was bedeuten diese?)
9. In welcher Version (oder Tag) bzw. für welche Plattform werden Container angeboten? Welche Möglichkeiten bietet Ghost dabei an, wo können diese eingesehen werden? Wo würde dann zum Beispiel die _linux/arm/v7_ Architektur verwendet werden?
10. Wie können Images und Container gelöscht werden? (`docker image prune -a`/ `docker rmi`) Welche anderen Optionen hat `docker image` noch zu bieten?
11. Welche Container sind denn gerade am Laufen? Wie werden die inaktiven Container angezeigt? Um einen Container zu starten bzw. zu stoppen sind welche Kommandos notwendig? (kleiner Tipp, `docker --help` hilft)
12. Wenn zum Beispiel der vorhin erstellte Container mit dem Namen `some-ghost` gestoppt und wieder gestartet wurde, sind keine weiteren Argumente notwendig. Wieso ist das so?
13. Jeder Container in Docker hat einen Lebenszyklus, beschreibe die einzelnen Zustände und die Befehle, die verwendet werden, um diese Zustände zu wechseln (z.B. von Laufend zu Pausiert bzw. Gestoppt)
14. Nach der Eingabe von `docker inspect some-ghost` wird eine lange Liste aller Konfigurationen in *JSON*-Format ausgegeben. Was besagt dabei der Key mit dem Namen `"Args":`?
15. Wo liegen eigentlich die Dateien, die innerhalb eines Containers verwendet werden? Und wieso hat jeder Container seine eigenen Directoires?
16. Wie können die logs eines Containers eingesehen werden?
17. `top` und `stats`. Wieviel Speicher verbraucht der Container `some-ghost` im laufenden Betrieb?
18. Welche Identifikationsmöglichkeiten bestehen beim Verwalten von Containern? Wie ist die ID zu interpretieren?
19. Was ist Docker Compose? Wie ist es zu verwenden? Was sind dessen Vorteile? Wie wird ein compose File erstellt? Wo können die benötigten Informationen dazu gefunden werden? [7]
20. Was sind Volumns? Welche Arten gibt es? Wie wird damit gearbeitet? Was sind deren Vorteile? Tipp: [Docker Reference](https://docs.docker.com/compose/compose-file/#volumes) 
21. Die Netzwerkeinstellung ist hier noch immer per Default in Verwendung, welche ist diese? Warum kann man im Browser mit localhost auf den Container zugreifen? Welche Einstellung nimmt man dabei mit `ports` vor? [Docker Reference - Networks](https://docs.docker.com/compose/compose-file/#networks-top-level-element)
22. Wie können eigene Docker Images erstellt werden? Was ist ein Dockerfile? Wie ist es aufgebaut? [8]
23. Was machen `FROM`, `RUN`, `ENV`, `WORKDIR` und `COPY`? Was ist der unterschied zwischen `CMD` und `ENTRYPOINT`? [16, 17, 18, 19]
24. Wie können eigene Images mit anderen geteilt werden?

## Quellen
* [1] "Was ist Docker? Welche Vorteile bietet Containerisierung?" redhat.com; zuletzt besucht 2023-02-12; [online](https://www.redhat.com/de/topics/containers/what-is-docker)
* [2] "Vergleich zwischen Containern und VMs" redhat.com; zuletzt besucht 2023-02-12; [online](https://www.redhat.com/de/topics/containers/containers-vs-vms)
* [3] "Docker overview" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/get-started/overview/)
* [4] "Docker – die revolutionäre Container-Technologie" Ionos - Digital Guide; zuletzt besucht 2023-02-14; [online](https://www.ionos.de/digitalguide/server/knowhow/was-ist-docker/)
* [5] "Docker Documentation: How to Build, Share and Run" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/)
* [6] "Docker Hub Overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/docker-hub/)
* [7] "Docker Compose overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/compose/)
* [8] "Best practices for writing Dockerfiles" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/)
* [9] "Install Docker Engine on Debian" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/engine/install/debian/)
* [10] "Docker-Tutorial: Installation und Betrieb der Container-Plattform" Ionos - Digital Guide; zuletzt besucht 2023-02-12; [online](https://www.ionos.de/digitalguide/server/konfiguration/docker-tutorial-installation-und-erste-schritte/)
* [11] "Installing Docker on Ubuntu/Debian" hetzner Community; zuletzt besucht 2023-02-12; [online](https://community.hetzner.com/tutorials/howto-docker-install)
* [12] "Docker Guide" baeldung; letzte Änderung 2022-12-28; zuletzt besucht 2023-02-14; [online](https://www.baeldung.com/ops/docker-guide)
* [13] "Docker Lernen für Anfänger" lerneprogrammieren; zuletzt besucht 2023-02-14; [online](https://lerneprogrammieren.de/docker/)
* [14] "Docker 101 Tutorial" Docker; zuletzt besucht 2023-02-14; [online](https://www.docker.com/101-tutorial/)
* [15] "Docker Tutorial" tutorialspoint - simply easy learning; zuletzt besucht 2023-02-14; [online](https://www.tutorialspoint.com/docker/index.htm)
* [16] "Container Entrypoint" lostechies; zuletzt besucht 2023-03-14; [online](https://lostechies.com/gabrielschenker/2016/08/21/container-entrypoint/)
* [17] "Docker CMD vs ENTRYPOINT: What’s The Difference & How To Choose" bmc.com; zuletzt besucht 2023-03-14; [online](https://www.bmc.com/blogs/docker-cmd-vs-entrypoint/)
* [18] "Demystifying ENTRYPOINT and CMD in Docker" aws.amazon.com; zuletzt besucht 2023-03-14; [online](https://aws.amazon.com/blogs/opensource/demystifying-entrypoint-cmd-docker/)
* [19] "dominikhoebert/Docker-ENTRYPOINT-CMD-Container-Test" Dominik Höbert; github.com; zuletzt besucht 2023-04-26; [online](https://github.com/dominikhoebert/Docker-ENTRYPOINT-CMD-Container-Test)
* [20] "Docker Showcase" Dominik Höbert; SYT Theorie; [online](https://elearning.tgm.ac.at/mod/page/view.php?id=51254)
* [21] "docker-projects" - Github; Dominik Höbert; Zugegriffen: 2024-05-10 [Online](https://github.com/dominikhoebert/docker-projects)

---
**Version** *20240510v2*
