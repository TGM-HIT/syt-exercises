# Embedded Devices "Time-critical data-transmission" - Taskdescription

## Einführung
Diese Übung basiert auf den Grundlagen aus hardwarenaher Programmierung. Sie vertieft die Verwendung von Mikrokontrollern und die Weitergabe von Daten mittels Anbindung an Single-Board-Computern. 

## Ziele
Das Ziel der Übung ist das Verständnis und das Handling von gängigen Mikrokontroller-Toolchains zu vertiefen und komplexere Systeme zu entwerfen. Die Verwendung von Prioritäten bei Interrupts als auch die Recherche von real-time Umgebungen wird geschult.

## Kompetenzzuordnung
**GK SYT10 Industrielle Informationstechnik | Embedded Systems | zeitkritische Anwendungen**
* "Anforderungsanalysen für zeitkritische Systeme durchführen und entsprechende Implementierungen umsetzen"

## Voraussetzungen
* Grundverständnis von Mikrokontroller-Programmiernug und das Deployment mittels Toolchains
* Grundkenntnisse über die sichere Verkabelung von embedded Devices
* Verwendung von Interrupts
* Einsatz von Single-Board-Computern

## Detailierte Ausgabenbeschreibung
Basierend auf der Übung "Ampel mit LEDs" (mit externen LEDs) soll eine Ampelschaltung erweitert werden. Der aktuelle Status der Ampel muss an einen SPI-Bus zur weiteren Verwendung (z.B. Raspberry-Pi) übertragen werden. Bei einer fehlerhaften Übertragung oder aber einem Ausfall des Ports, muss der Fehlerzustand eingeschaltet werden (Gelb blinkend).

Um das Übertragen überprüfen zu können, soll mittels eines LogicAnalyzers der Bus bei einer Datenübermittlung beobachtet werden. Die Konfiguration und Inbetriebnahme des Analyzers wurde in der Labor-Vorstellung vorgestellt. Bei Problem bitte immer auf die Versionsnummer des Programmes achten (z.B. [aur-1.2.18](https://schou.dk/linux/saleae/))!

### Implementierung
Verwenden Sie zur Implementierung eine konsolen-basierte Deployment-Umgebung zur Programmierung und zum Flashen Ihrer Umsetzung (z.B. [pico-template](https://github.com/mborko/pico-template)). Die einzelnen Ampelstati sollen kodiert an den SPI-Bus angelegt werden. Dabei sollen die entsprechenden Zeiten pro Bit genau eingehalten werden:

| Status        | Code      |
| :-----------: | :-------: |
| Rot           | 1-1-1-0   |
| Rot-Gelb      | 1-1-0-1   |
| Grün          | 0-0-1-0   |
| Grün blinkend | 0-1-0-1   |
| Gelb          | 1-0-0-0   |
| Gelb blinkend | 0-0-0-1   |

Sollte für mehr als 60 ms kein HIGH Signal am Bus beobachtet werden, muss die Ampelsteuerung entsprechend neu gestartet werden. Dies soll mittels eines "Check-Tasks" erfolgen. Dabei ist der Einstaz eines Echtzeit-Betriebssystems (z.B. FreeRTOS) verpflichtend. Nach dem Neustart ist zuerst der Fehlerzustand zu starten (Gelb blinkend). Nur nach erfolgreicher Verbindung zum SPI-Bus soll die Ampel neu gestartet werden.

## Fragestellungen
+ Was ist ein SPI-Bus und wie ist dieser aufgebaut?
+ Welche Vorteile ergeben sich bei der Verwendung eines Kommunikationsbusses?
+ Welche Möglichkeiten der Beschaltung sind beim SPI-Bus möglich und wie wirkt sich die Clock darauf aus?
+ Wie werden zeitkritische Anwendungen (real-time) eingeteilt?
+ Wie kommt ein Watchdog bei zeitkritischen Anwendungen zum Einsatz?
+ Wie kann man Interrupts priorisieren?
+ Was sind Real-Time Operating-Systems (RTOS) und wie kann man diese auf Mikrokontrollern einsetzen?

## Abgabe
Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Etwaiger Programmcode zur Sensordaten-Verarbeitung ist ebenfalls zu dokumentieren. Implementierungen müssen entsprechend beschrieben und leicht deployable sein!

### Classroom Git-Repository
[Hier](https://classroom.github.com/a/Ky1qCxcs) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Bewertung
Gruppengrösse: 1-2 Person(en)
### GK Anforderungen **überwiegend erfüllt**
- [ ] Beantwortung der Fragestellungen
- [ ] Verwendung von konsolenbasiertem Deployment
- [ ] Umsetzung der Ampelsteuerung und Ausgabe auf den SPI-Bus

### GK Anforderungen **zur Gänze erfüllt**
- [ ] Ausführung und Dokumentation der Implementierung
- [ ] Ausgabe der Information des SPI-Busses mittels eines Logic-Analyzers
- [ ] Reset der Ampelsteuerung

### EK Anforderungen **überwiegend erfüllt**
- [ ] Ausgabe der Information des SPI-Busses über einen Single-Board-Computer

### EK Anforderungen **zur Gänze erfüllt**
- [ ] Reset der Ampelsteuerung mittels Watchdog oder Interrupt-Implementierung


## Quellen
* [Ampelkunde](https://www.wien.gv.at/verkehr/ampeln/ampelkunde.html)
* [SPI for RaspberryPi](https://www.raspberrypi.org/documentation/hardware/raspberrypi/spi/README.md)
* [Logic Analyzer](https://www.saleae.com/de/downloads/)
* [FreeRTOS Demo Implementations for RP2040](https://github.com/FreeRTOS/FreeRTOS-SMP-Demos/tree/main/FreeRTOS/Demo/CORTEX_M0%2B_RP2040)
* [Multitasking on Raspberry Pico](https://lochnerweb.de/index.php/pico_multitasking)

---
**Version** *20240222v4*

