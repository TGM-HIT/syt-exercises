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

1. ### Networking  Tutorial

Arbeite zuerst das [Networking with standalone containers](https://docs.docker.com/engine/network/tutorials/standalone/) Docker Tutorial durch um die Basics von Docker Netzwerken zu verstehen. Auch die anderen Docker Networking Tutorial (Docker Host, Macvlans) sind zu empfehlen.

docker compose 

``` title="test"
--8<-- "test.md"
```



``` yaml title="compose.yml"
--8<-- "https://raw.githubusercontent.com/dominikhoebert/docker-projects/master/reverse-proxy-exercise/compose.yml"
```



## Fragestellungen

- Was ist ein bridge Network? Welche Vorteile hat es?
- Welche anderen virtuellen Netzwerktypen gibt es? Wann sind diese zu verwenden?
- Was ist der alpine Container? Wofür wird er verwendet?

## Abgabe

Es bietet sich an, die Dokumentation in Markdown zu verfassen und diese auch für den Eigengebrauch abzulegen. Dokumentationsrichtlinie ist zu beachten. Screenshots sind nur bedingt hilfreich, wenn man Befehle oder Quellcode schnell wieder verwenden möchte. Als Dokumentationsabgabe kann leider nur **.pdf** akzeptiert werden.

## Bewertung

Gruppengrösse: 1 Person

### Anforderungen *überwiegend erfüllt*

- [ ] 

###  Anforderungen *zur  Gänze erfüllt*

- [ ] 

## Quellen

* "Docker – die revolutionäre Container-Technologie" Ionos - Digital Guide; zuletzt besucht 2023-02-14; [online](https://www.ionos.de/digitalguide/server/knowhow/was-ist-docker/)
* "Docker Documentation: How to Build, Share and Run" docker docs; zuletzt besucht 2023-02-12; [online](https://docs.docker.com/)
* "Docker Hub Overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/docker-hub/)
* "Docker Compose overview" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/compose/)
* "Best practices for writing Dockerfiles" docker docs; zuletzt besucht 2023-02-14; [online](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/)

* https://docs.docker.com/engine/network/tutorials/standalone/

---

**Version** *20240820v1*