# Container

## Voraussetzungen
* betriebsbereites Linux (z.B. _Ubuntu 20.04 LTS_) mit funktionierender Netzwerkverbindung und SSH Zugang (grafische Oberfläche wird _NICHT_ benötigt), bevorzugt als virtuelle Maschine (=> Snapshot zu Übungsbeginn nicht vergessen)

## Einführung in Container
Bei der _klassischen Hardware-Virtualisierung_ (wie zum Beispiel _VMware_, _VirtualBox_, _HyperV_, ...) wird ein komplettes _Gast_-Betriebssystem im _Host_-System installiert. Bei _Containern_ hingegen werden nur isolierte Prozesse (samt den dafür notwendigen Bibliotheken) auf einem gemeinsamen _Host_-System ausgeführt.

Die _containerbasierte Virtualisierung_ zeichnet sich daher durch einen deutlich geringeren Resourcenverbrauch aus (da die zusätzlichen Gastsysteme der _klassischen Virtualisierung_ nicht vorhanden sind). Dadurch können auf einem System allerdings auch nur Container für eben dieses _Host_-System ausgeführt werden (d.h. unter einer Windows-Hostsystem können auch nur Windows-Container ausgeführt werden).

In der [Grafik](https://www.ionos.de/digitalguide/fileadmin/DigitalGuide/Screenshots/DE-virtuelle-maschinen.png) ist der unterschiedliche Aufbau von _Virtuellen Maschinen_ und _Containern_ dargestellt.
 

### Fragen
* Skizziere den unterschiedlichen Aufbau von _virtuellen Maschinen_ und _containerbasierter Virtualisierung_.
* Beschreibe die Aufgaben von _Docker Engine_, _Docker Image_ und _Docker Hub_.
* Beschreibe die Aufgabe des _Dockerfile_ und skizziere den Inhalt beispielhaft.
 

## Installation der Docker Engine
Installiere die _Docker Engine_ auf deiner virtuellen Maschine über das Ubuntu Repository (`snap install docker`), Debian Repository (`apt install docker.io`) oder aus dem Docker Repository (_docker-engine_). Konfiguriere die _Docker Engine_ so, dass diese auch von normalen Benutzern verwendet werden kann (d.h. dass kein _Root_-Zugriff benötigt wird).
 

### Testen
* Starte den _hello-world_ Container `docker run hello-world`. Dokumentiere die Ausgabe.
* Dokumentiere die Ausgabe von `docker images`.
* Dokumentiere die Ausgabe von `docker ps` und `docker ps -a`.
* Dokumentiere die häufig verwendeten Parameter von `docker run` (`-v`, `-d`, `-p`, `-i`, `-t`).

## Docker Images erstellen
* Erstelle ein _Dockerfile_ in einem neuen Ordner mit dem folgenden Inhalt:
```
FROM docker/whalesay:latest
RUN apt-get -y update && apt-get install -y fortunes
CMD /usr/games/fortune -a | cowsay

```

* Erstelle ein Image aus diesem _Dockerfile_ (`docker build -t docker-whale .`) und dokumentiere die Ausgabe.
* Führe das neu erstellte Image aus (`docker run docker-whale`) und dokumentiere die Ausgabe.

## Docker Images verwenden

### Webserver
* Suche eine Image mit einem Webserver im _Docker Hub_ (z.B. _apache_, _nginx_). Verwende _offizielle_ Images.
* Dokumentiere, welche Parameter diese Image unterstützt. Versuche insbesondere herauszufinden, wie man dem Webserver die Webinhalte übergibt.
* Erstelle eine einfache HTML-Seite.
* Starte einen Container mit einem Webserver (z.B. _apache_, _nginx_), der die erstellte HTML-Seite anbieten soll. Dokumentiere den dazu verwendeten Befehl. Teste, ob die Webseite erreichbar ist.
 

### Datenbank
* Suche ein _MySQL_ Image im _Docker Hub_. Dokumentiere, wie man bei einem _MySQL_ Container die Zugangsdaten setzen kann. Dokumentiere weiters, wie man die Daten des Containers dauerhaft speichern kann.
* Starte einen _MySQL Server_ Container (die Daten sollen persistent gespeichert werden, d.h. bei einem Neustart des Containers weiter zur Verfügung stehen). <span style="color:red">ACHTUNG: verwende `mysql:5.7` und NICHT `mysql:latest`!</span>
* Versuche dich aus einem _MySQL Client_ Container auf diesen Server zu verbinden.
 

### Mehrere Container
* Suche ein _WordPress_ Image im _Docker Hub_.
* Starte einen _WordPress_ Container. Dieser Container soll den zuvor erstellten _MySQL Server_ Container als Datenbank verwenden. Dokumentiere, welchen Befehl du dazu verwendet hast. <span style="color:red">ACHTUNG: Betreibe beide Container im gleichen Docker-Netzwerk!</span>
* Teste den _WordPress_ Container.
 

# Provisionierung
Als Provisionierung bezeichnet man die automatische Installation und Konfiguration von Diensten in einem System. Dies kann unterschiedliche Ausprägungen haben, zum Beispiel die automatische Erstellung einer _virtuellen Maschine_ (Vagrant) oder eines _Containers_ (Docker) oder aber auch direkt die Installation von Software im Betriebssystem selbst.

Provisionierung kann im einfachsten Fall einfach über gescriptete Konsolenbefehle realisiert werden, im Normalfalls wird dazu aber spezielle Software verwendet wie zum Beispiel _Chef_, _Puppet_, _Ansible_ oder ähnliches.

 

### Aufgaben
* Vergleiche die Funktionalität von mindestens 4 Provisionierungstools.
* Versuche mit einem dieser Systeme eine vollständige _WordPress_-Installation in einer _leeren_ virtuellen Maschine zu automatisieren.
* Dokumentiere die Provisionerung und Teste das Ergebnis.


## Quellen und Dokumente
* [Docker-Tutorial: Installation und Betrieb der Container-Plattform](https://www.ionos.de/digitalguide/server/konfiguration/docker-tutorial-installation-und-erste-schritte/)
* [Ubuntu 20.04.3 LTS Server](https://ubuntu.com/download/server)

