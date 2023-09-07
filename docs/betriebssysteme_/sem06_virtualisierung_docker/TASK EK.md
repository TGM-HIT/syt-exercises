# "Containerization" - Taskdescription

## Einführung

Eine Applikation in einen Docker Container umzuwandeln hat viele Vorteile: vereinfachte Installation, keine Abhängigkeiten, Skalierbarkeit, einfach zum Updaten,.... Dieser Vorgang nennt sich Containerization.

## Ziele

Das Ziel dieser Übung ist die Containerization einer eigenen Applikation.

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

## Detaillierte Aufgabenbeschreibung
### Erweitert

Suche dir eine einfache Applikation, welche du in deiner schon mehrjährigen Informatiker Karriere erstellt hast, heraus und *containerize* sie.

Das Programm muss nicht super sinnvoll sein, sollte aber einfache Eingaben verarbeitet und etwas ausgeben (solltest du keines finden, erstelle dir schnell ein einfaches Dummy Programm). Wähle am besten ein Consolen Programm, GUIs sind schwieriger umzuwandeln. Bonuspunkte, wenn das Programm eine Serveranwendung ist und/oder eine Weboberfläche besitzt. Programmiersprache ist fast egal, für die meisten Programmiersprachen gibt es brachbare Basisimages (Python und Java sind zu empfehlen).

Erstelle ein Dockerfile zum erstellen des Image.

Zuerst musst du dir ein geeignetes Basisimage suchen, welches dir eine geeignete Laufumgebung für deine Programmiersprache zur Verfügung stellt (Befehl `FROM`). Verwende dann `COPY` um deine benötigten Dateien in das Image zu kopieren. Mit `RUN` lassen sich gegebenenfalls Dependencies installieren. Verwende `ENTRYPOINT` und `CMD` dein Programm im Container zu starten (beide sind für diese Abgabe zu verwenden).

Erstelle ein Image mit `docker built`.

Publishe dein Image und stelle es deiner Lehrperson zum testen zur Verfügung.

## Abgabe
Es bietet sich an, die Dokumentation in Markdown zu verfassen und diese auch für den Eigengebrauch abzulegen. Dokumentationsrichtlinie ist zu beachten. Screenshots sind nur bedingt hilfreich, wenn man Befehle oder Quellcode schnell wieder verwenden möchte. Als Dokumentationsabgabe kann leider nur **.pdf** akzeptiert werden.

## Bewertung
Gruppengrösse: 1 Person
### Erweiterte Anforderungen *überwiegend erfüllt*
- [ ] Eigenes Programm containerized und lauffähig
### Erweiterte Anforderungen *zur  Gänze erfüllt*
- [ ] Sowohl `ENTRYPOINT` als auch `CMD` sinnvoll verwendet
- [ ] Image gepublished

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
**Version** *20230325v1*