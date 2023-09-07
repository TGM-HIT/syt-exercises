# Embedded Devices "IoT Gateway" - Taskdescription

## Einführung
Diese Übung basiert auf den Grundlagen aus hardwarenaher Programmierung. Sie vertieft die Verwendung von Mikrokontrollern und die Weitergabe von Daten mittels Anbindung an Single-Board-Computern. 

## Ziele
Das Ziel der Übung ist das Verständnis und das Handling von gängigen Mikrokontroller-Toolchains zu vertiefen und komplexere Systeme zu entwerfen.

## Voraussetzungen
* Grundverständnis von Mikrokontroller-Programmierung und das Deployment mittels Toolchains.
* Grundkenntnisse über die sichere Verkabelung von embedded Devices.

## Detailierte Ausgabenbeschreibung
Basierend auf der Übung "GPIO-Pins in Mikrocontroller-Boards" soll eine Ampelschaltung implementiert werden. Die aktuelle Information über den Status der Ampel soll auch an ein IoT-Gateway (z.B. Raspberry-Pi) übertragen werden. Dieser soll den Mikrokontroller auch resetten können.

### Implementierung
Verwenden Sie zur Implementierung eine konsolen-basierte Deployment-Umgebung zur Programmierung und zum Flashen Ihrer Umsetzung (z.B. [stm32f4-template](https://github.com/mborko/stm32f4-template)). Die einzelnen Ampelstatus sollen kodiert an einen GPIO-Pin angelegt werden. Dabei sollen die entsprechenden von 5ms Zeiten pro Bit genau eingehalten werden:

| Status        | Code    |
| :-----------: | :-----: |
| Rot           | 1-1-1   |
| Rot-Gelb      | 1-1-0   |
| Grün          | 0-0-1   |
| Grün blinkend | 0-1-0   |
| Gelb          | 1-0-0   |
| Gelb blinkend | 0-0-0   |

Sollte für mehr als 20 ms ein HIGH Signal am eigenen Reset-Eingang beobachtet werden, ist die Ampelsteuerung entsprechend zu resettieren.


## Bewertung
Gruppengrösse: 1 Person
### Anforderungen **überwiegend erfüllt**
+ Umsetzung einer Ampelsteuerung mit internen/externen LEDs (15/200)
+ Verwendung von konsolenbasiertem Deployment (15/200)
+ Ausführung und Dokumentation der bestehenden Implementierung (30/200)

### Anforderungen **zur Gänze erfüllt**
+ Ausgabe des Ampelstatus an externen GPIO-Pin mittels zeitbasierten Code (90/200)
+ Reset der Ampelsteuerung über externen GPIO-Pin (50/200)

### Classroom Repository
[Hier](https://classroom.github.com/a/-F4EoA4r) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.


## Quellen
* [Ampelkunde](https://www.wien.gv.at/verkehr/ampeln/ampelkunde.html)

