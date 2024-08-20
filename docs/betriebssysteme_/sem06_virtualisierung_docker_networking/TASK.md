---
hide:
  - navigation

---

# "Docker Networking" - Taskdescription

## Einführung

Docker Container können über virtuelle Netzwerke miteinander kommunizieren. Hier gilt es nun container in Netzwerke einzubinden und die Hostnamen richtig zu verwenden.

## Ziele

Docker Netzwerke kennen und richtig anwenden lernen

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

### Grundlegend

1. #### Networking  Tutorial

Arbeite zuerst das [Networking with standalone containers](https://docs.docker.com/engine/network/tutorials/standalone/) Docker Tutorial durch um die Basics von Docker Netzwerken zu verstehen. Auch die anderen Docker Networking Tutorial (Docker Host, Macvlans) sind zu empfehlen.

2. #### Docker compose ausführen

``` yaml title="compose.yml"
--8<-- "https://raw.githubusercontent.com/dominikhoebert/docker-projects/master/reverse-proxy-exercise/compose.yml"
```

[Source](https://github.com/dominikhoebert/docker-projects/blob/master/reverse-proxy-exercise/compose.yml)

Erstelle in deinem Benutzerordner einen neuen Ordner, nenne diesen zB. `reverse-proxy-exercise`. Erstelle darin die `compose.yml`. Versuche diese zu verstehen. Führe diese dann mit `docker compose up -d`aus.

3. #### Adguard konfigurieren

Rufe die Adguard WebUI [http://localhost:3000/](http://localhost:3000/) auf. Folge den Schritten und setzte einen Login. Setze dann Adguard als deinen DNS Server laut Anleitung. Verwende dazu entweder `127.0.0.1` oder `localhost`. Danach ist das Adguard Dashboard über [http://localhost:82/](http://localhost:82/) erreichbar. Rufe ein paar Internet Seiten auf (im besten Fall welche mit Werbung) und überprüfe ob der DNS- Anfragen Counter steigt.

4. #### DNS-Umschreibungen

In der Adguard UI öffne *Filter* → DNS-Umschreibungen. Hiermit können beliebige URLs auf andere URLs oder auch auf IP Adressen umgeleitet werden. ZB. wollen wir die Adguard UI nicht mehr mit *localhost:82* aufrufen, sondern mit zB. *adguard.home*. Dazu kann eine Umschreibung von *adguard.home* auf *localhost* erstellt werden. Besser noch sollen alle URLs die auf *.home* enden auf *localhost* umgeleitet werden. Dazu kann ein Sternchen * als Platzhalter benutzt werden. _*.home_ → *localhost*.

Wenn nun versucht wird Adguard über [http://adguard.home](http://adguard.home) zu erreichen wird dies noch nicht gelingen. 

5. #### Nginx Proxy Manager konfigurieren

Rufe nun die Nginx Proxy Manager WebUI [http://localhost:81/](http://localhost:81/) auf. Login mit `admin@example.com/changeme`, welches sofort geändert werden sollte. Erstelle nun einen neuen Proxy-Host für die Domain *adguard.home*. Da in einem Docker Netzwerk der Servicename als Hostname für den Container verwendet wird kann  `adguardhome` als Forward Hostname verwendet werden. Verwende hier Port 80 als Forward Port. Nun sollte Adguard über [http://adguard.home](http://adguard.home) erreichbar sein.

Erstelle noch zwei weitere Proxy Hosts für die Nginx Proxy Manager UI und WhoAmI.

### Erweitert

Verwende nun einen beliebigen anderen Reverse Proxy ([Traefik](https://doc.traefik.io/traefik/), [Nginx](https://docs.nginx.com/nginx/admin-guide/web-server/reverse-proxy/), [Caddy](https://caddyserver.com/docs/quick-starts/reverse-proxy), ...) anstelle von NPM. Erkläre wie dieser zu verwenden ist. Erkläre wieso dieser besser für ein fortgeschrittenes Setup ist (Automation).

Starte eine beliebige zusätzliche App/Service in einem eigenem Compose und erstelle einen Proxy Host für diesen. Auf welches Hindernis stößt du, wie ist dieses zu umgehen?

Welche Schritte sind notwendig, um dieses Setup für Production abzusichern?

Erstelle ein grafisches Diagramm, dass das Prinzip eines Reverse Proxys erklärt.

## Fragestellungen

- Was ist ein bridge Network? Welche Vorteile hat es?
- Welche anderen virtuellen Netzwerktypen gibt es? Wann sind diese zu verwenden?
- Was ist der alpine Container? Wofür wird er verwendet?
- Welche Services werden in der Übung verwendet?
- Was kann mit DNS-Umschreibungen erreicht werden? Wie würde das in der Realität verwendet werden?
- Welche anderen Funktionalitäten bringt Adguard noch?
- Welche anderen Möglichkeiten gibt es anstelle des Container Hostnamen zu verwenden? (host.docker.internal, IP?)
- Was ist der Unterschied zwischen einem DNS-Rewrite (Überschreibung) und einem Proxy bzw. Reverse Proxy?

## Abgabe

Es bietet sich an, die Dokumentation in Markdown zu verfassen und diese auch für den Eigengebrauch abzulegen. Dokumentationsrichtlinie ist zu beachten. Screenshots sind nur bedingt hilfreich, wenn man Befehle oder Quellcode schnell wieder verwenden möchte. Als Dokumentationsabgabe kann leider nur **.pdf** akzeptiert werden.

## Bewertung

Gruppengrösse: 1 Person

### Grundlegende Anforderungen *überwiegend erfüllt*

- [ ] Übung erfolgreich abgeschlossen

###  Grundlegende Anforderungen *zur  Gänze erfüllt*

- [ ] Fragestellungen beantwortet

### Erweiterte Anforderungen *überwiegend erfüllt*

- [ ] Anderen Reverse Proxy verwendet

###  Erweiterte Anforderungen *zur  Gänze erfüllt*

- [ ] weiteres Service in zweitem Compose Proxy Host angelegt

## Quellen

* "Docker – die revolutionäre Container-Technologie" Ionos - Digital Guide; zuletzt besucht 2023-02-14; [online](https://www.ionos.de/digitalguide/server/knowhow/was-ist-docker/)
* "Docker Documentation: How to Build, Share and Run" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/)
* "Docker Hub Overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/docker-hub/)
* "Docker Compose overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/compose/)
* "Best practices for writing Dockerfiles" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/)

[1] „AdGuard Home | Netzwerkweite Anwendung für alle Betriebssysteme: Windows, MacOS, Linux“. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://adguard.com/de/adguard-home/overview.html  
[2] „docker-projects/reverse-proxy-exercise/compose.yml at master · dominikhoebert/docker-projects“. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://github.com/dominikhoebert/docker-projects/blob/master/reverse-proxy-exercise/compose.yml  
[3] D. Höbert, dominikhoebert/docker-projects. (20. August 2024). CSS. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://github.com/dominikhoebert/docker-projects  
[4] „Networking with standalone containers“, Docker Documentation. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://docs.docker.com/engine/network/tutorials/standalone/  
[5] „Nginx Proxy Manager“. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://nginxproxymanager.com/  
[6] „NGINX Reverse Proxy | NGINX Documentation“. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://docs.nginx.com/nginx/admin-guide/web-server/reverse-proxy/  
[7] C. W. Server, „Reverse proxy quick-start - Caddy Documentation“. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://caddyserver.com/  
[8] „Traefik Proxy Documentation - Traefik“. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://doc.traefik.io/traefik/  
[9] traefik/whoami. (20. August 2024). Go. Traefik Labs. Zugegriffen: 20. August 2024. [Online]. Verfügbar unter: https://github.com/traefik/whoami  


---

**Version** *20240820v1*