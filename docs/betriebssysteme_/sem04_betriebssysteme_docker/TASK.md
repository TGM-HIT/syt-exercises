---
hide:
  - navigation
---

# "*Docker Einführung*" - Taskdescription

## Einführung

VMs sind ein wichtiges Tool für einen Informatiker. Viele Aufgaben werden mit VMs gelöst. Immer mehr werden diese aber von leichteren Containern abgelöst. Ein Guter Umgang mit Containern ist somit unerlässlich. 

## Ziele

Container mit Docker Desktop Oberfläche erstellen und verwalten


## Kompetenzzuordnung

#### SYT4  Betriebssysteme - Anwendung

* Virtualisierung - Betriebssysteme in virtuellen Maschinen installieren, Snapshots von virtuellen Maschinen einsetzen, diese klonen, importieren und exportieren
* Bedienung von Betriebssystemen - einfache  Befehle mit den wichtigsten Optionen verwenden sowie Berechtigungen auf  Dateisystemebene erklären und administrieren
* Konzepte - die grundlegen Konzepte des Betriebssystems in der Praxis erkennen

## Voraussetzungen

* GK *Betriebssysteme Anwendungen* abgeschlossen

## Detaillierte Aufgabenbeschreibung
Bitte versuche alle wichtigen Information kurz und prägnant zu verschriftlichen.

### Grundlegend

#### Docker

Installiere dir [Docker](https://www.docker.com/get-started/). Mit Docker lassen sich kleine virtuelle Maschinen, genannt Container, starten. Es soll nun eine Webserver mithilfe von Docker aufgesetzt werden.

##### Nginx

1. Öffne die Docker Desktop GUI, suche oben in der Suchleiste nach `ubuntu/nginx`, klicke auf `Pull`.
2. Nachdem das Image heruntergeladen wurde kann es links unter `Images` gefunden werden. Klicke neben dem Image auf `Run`.
3. Klappe `Optional Settings`auf. Gib dem Container einen sprechenden Namen (z.B. `ubuntu-nginx`).
4. Wähle Host Port 81. Volumes: Host path: wähle einen neuen leeren Ordner auf der Festplatte; Container path: `/var/www/html`
5. RUN. Nachdem der Container erfolgreich gestartet wurde (grünes Container Symbol), kann die Webseite des Webservers im Browser aufgerufen werden [http://localhost:81/](http://localhost:81/) (Eventuell wird eine Fehlerseite oder ein Willkommen Seite angezeigt)
6. Erstelle in dem neuen leeren Ordner aus Schritt 4 eine neue `index.html` mit einem kurzen Text als Inhalt. [http://localhost:81/](http://localhost:81/) sollte nun diese Seite anzeigen.
7. Versuche die Webseite eines Klassenkollegen in deinem Browser zu öffnen: `http://ip:81/`

##### Ghost

Selten soll eine Webseite von Grund auf gebaut werden, stattdessen können fertige CMS verwendet werden.

1. Öffne die Docker Desktop GUI, suche oben in der Suchleiste nach `ghost`, klicke auf `Pull`.
2. Nachdem das Image heruntergeladen wurde kann es links unter `Images` gefunden werden. Klicke neben dem Image auf `Run`.
3. Klappe `Optional Settings`auf. Gib dem Container einen sprechenden Namen (z.B. `ghost`).
4. Wähle Host Port 82. Es muss noch eine Environments Variable gesetzt werden: NODE_ENV=development (Variable=Value)
5. RUN. Nachdem der Container erfolgreich gestartet wurde (grünes Container Symbol), kann die Webseite des Webservers im Browser aufgerufen werden [http://localhost:82/](http://localhost:82/) (Eventuell wird eine Fehlerseite oder ein Willkommen Seite angezeigt)
6. [http://localhost:82/ghost](http://localhost:82/ghost) führt zum Backend des CMS. Erstelle einen Login (Email kann fake sein, Ghost kann keine Emails schicken) und erstelle einen neuen Artikel.
7. Versuche die Webseite eines Klassenkollegen in deinem Browser zu öffnen: `http://ip:82/`

### Erweitert

Mit Docker lassen sich eine Vielzahl verschiedenster Services deployen, nicht nur Webseiten. Es lassen sich auch Minecraft Server in einem Container laufen. Setzte einen [Minecraft Server in einem Docker Container](https://docker-minecraft-server.readthedocs.io/en/latest/) mithilfe von Docker Compose auf. Zeige wie du und deine Freunde sich darauf verbinden können. Erkläre alle Befehle in dem Docker Compose. Zeige wie der Minecraft Server mit Befehlen gesteuert werden kann. 


## Fragestellungen

### Grundlegend

- Was ist ein Container? Was ist der Unterschied zu einer VM?
- Was ist Docker? Gibt es alternativen zu Docker?
- Wieso sind beim Starten eines Containers Ports anzugeben? Warum zwei davon?
- Was ist der Vorteil wenn Port 80 gewählt wurde? Was tun wenn dieser schon belegt ist?
- Was ist ein Volume? Was sind dessen Vorteile?

### Erweitert

* Was ist Docker Compose? Was sind dessen Vorteile?
* Von wo werden die Images geladen?
* Wo lassen sich alle Infos zu dem Container finden?
* Wie lassen sich Befehle im Container ausführen?
* Was für andere Services lassen sich mit Docker deployen?

## Abgabe
Die durchgeführten Tätigkeiten und gewünschten Elemente müssen auf einem Grafiz zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Vor diesem Gespräch ist das Grafiz eingescannt als ein **PDF** File auf moodle abzugeben. (Microsoft Office Lens [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app/microsoft-office-lens-pdf-scan/id975925059); Online PDF Editor [pdffiller](https://www.pdffiller.com/de/))

## Bewertung
Gruppengröße: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Nginx Übung erfüllt
- [ ] Fragestellunge beantwortet
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Ghost Übung erfüllt
### Erweiterte Anforderungen **überwiegend erfüllt**

- [ ] Minecraft Server aufgesetzt

### Erweiterte Anforderungen **zur Gänze erfüllt**

- [ ] Fragestellungen beantwortet

## Quellen

[1] „Get Started | Docker“. Zugegriffen: 29. Dezember 2023. [Online]. Verfügbar unter: https://www.docker.com/get-started/  
[2] „ghost - Official Image“. Zugegriffen: 29. Dezember 2023. [Online]. Verfügbar unter: https://hub.docker.com/_/ghost  
[3] „itzg/minecraft-server - Docker Image | Docker Hub“. Zugegriffen: 30. Dezember 2023. [Online]. Verfügbar unter: https://hub.docker.com/r/itzg/minecraft-server/  
[4] „Minecraft Server on Docker (Java Edition)“. Zugegriffen: 30. Dezember 2023. [Online]. Verfügbar unter: https://docker-minecraft-server.readthedocs.io/en/latest/#using-docker-compose  
[5] „ubuntu/nginx - Docker Image“. Zugegriffen: 29. Dezember 2023. [Online]. Verfügbar unter: https://hub.docker.com/r/ubuntu/nginx  
[6] "docker-projects" - Github; Dominik Höbert; [Online](https://github.com/dominikhoebert/docker-projects) Zugegriffen: 2024-05-10  
[7] "Docker Showcase" Dominik Höbert; SYT Theorie; [online](https://elearning.tgm.ac.at/mod/page/view.php?id=51254)


---
**Version** *20231230v1*
