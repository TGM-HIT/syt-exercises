# Embedded Devices "Hardware-Programming" - Taskdescription

## Einführung
Die Übung soll als Einführung in die hardwarenahe Programmierung und die Verwendung von Embedded Devices dienen.

## Ziele
Das Ziel ist es das Grundwerkzeug zur Verwendung von Mikrokontrollern zu verstehen und einsetzen zu können. Dabei ist die Programmiersprache C als neue aber nicht zu hohe Hürde zu erklimmen: *"... Java and C are closely related.  In fact, Java was developed bystarting with C and adding features designed to help programmers develop com-plex programs more quickly and with fewer errors. Thus you will have no problemunderstanding the high-level structure of a C program."* [C for Java Programmers](https://www.cs.rochester.edu/u/ferguson/csc/c/c-for-java-programmers.pdf)

## Kompetenzzuordnung
#### GK SYT7 Industrielle Informationstechnik | Embedded Systems | Hardware-programmierung
* "hardwarenahe Programmiersprachen für typische Anwendungen von embedded Systems einsetzen"

#### EK SYT7 Industrielle Informationstechnik | Embedded Systems | Hardware-programmierung
* "komplexere Hardwareanwendungen mit Hilfe von embedded Systems umsetzen"

## Voraussetzungen
* Verwendung von Mikrokontrollern
* Kenntnis einer Programmiersprache (z.B. Java)
* Grundverständnis von digitalen Systemen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen

## Detaillierte Aufgabenbeschreibung

### Grundanforderungen
Das zur Verfügung gestellte Template zur Benutzung von einem STM32F3-Discovery Board  [stm32f3-template](https://github.com/mborko/stm32f3-template) kann nach der Installation der entsprechenden Pakete (z.B. in einer virtuellen Maschine), mit dem Befehl `make clean flash` auf ein angeschlossenes Board *programmiert* werden. Das Makefile hat dabei alle wichtigen Programme, Dateien und Verzeichnisse der Toolchain (arm-none-eabi) und der Firmware (STM32CubeF3) verlinkt und zur einfachen Benutzung bereitgestellt.

In dem Source-File `src/template/Src/main.c` befindet sich dabei die Grundlogik dieses Beispielprojekts. Zu beachten ist dabei die Trennung von Definition (Headerfiles) und der Implementierung (C-Files). Die Funktion `int main(void)` ist dabei der Startpunkt der Ausführung. Erst nach der Initialisierung der Hardware und der System-Clock ist eine Verwendung möglich. Diese ist bei der Mikrocontroller-Programmierung meist in einer Endlosschleife (oder durch Interrupt-Service-Routinen, kurz ISR) realisiert.

Passe die Endlosschleife im Template-Projekt so an, dass nur die Funktion mit den blinkenden LEDs aufgerufen wird. Jegliche Benutzereingaben sollen dabei ignoriert werden.

Kopiere das Template-Projekt in ein eigenes Verzeichnis unter `./src` und wähle den Namen `ampelschaltung`. Passe nun das Makefile an, damit dieses Projekt bei einem Aufruf von `make clean flash` als Template gewählt wird. Verwende nur mehr drei der 8 LEDs aus dem "Blinkrad" - bevorzugt nur die Farben Rot, Gelb und Grün.

### Erweiterungen
Verwende die von dir kopierte Template-Umgebung und implementiere mit den LEDs vom Discovery-Board eine echte Ampelschaltung (siehe "Kleine Ampelkunde"). Halte dich an die entsprechenden Zeiten!

Um die GPIO-Ports auch für weitere Projekte verwenden zu können, passe deinen Code soweit an, dass extern angeschlossene LEDs zur Verwendung kommen. Welche Punkte müsstest du dabei beachten? Wie können die von dir gewählten Pins initialisiert werden?

Die Library kann bei komplexen Beispiel sehr hilfreich sein - in dem Fall der Ampel ist sie eher hinderlich. Wie kann die Funktionalität der gesetzten GPIO-Ports vereinfacht werden, ohne dabei die Library zu nutzen? Wie können dabei die einzelnen Pins mittels Bitmuster gesetzt werden?

## Fragestellungen
* Wo sind große Unterschiede zwischen C und anderen hohen Programiersprachen?
* Was ist ein Header-File und wo werden in C die Funktionen implementiert?
* Wie kommen Toolchains bzw. Firmwares bei der Programmierung von Embedded Systems zum Einsatz?
* Wie sind Datenblätter eines Mikrokontrollers und des Demo-Boards (z.B. STM32F3-Discovery) aufgebaut? Wo finde ich dabei die *Interface Description* der Toolchain?
* Was bedeutet das Akronym *HAL* bei der Implementierung von Embedded Devices?
* Was macht der Befehl **make** und wie ist das Makefile im [stm32f3-template](https://github.com/mborko/stm32f3-template) Repository aufgebaut?
* Wo ist die Methode *BSP_LED_Init()* definiert und wo implementiert? Welche Schritte werden in der implementierten Methode durchgeführt? Was ist dabei der Pull-Mode?
* Was ist ein GPIO-Port und wieviele sind auf dem STM32F3-Discovery einsetzbar?
* Auf welchem GPIO Pin liegen die einzelnen LEDs des STM32F3-Discovery Boards?
* Wie könnten die LEDs auch ohne der implementierten Library angesteuert werden?

## Abgabe
Die Fragestellungen sollen im File **research.md** abgehandelt werden. Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten.  
Der erstellte Programmcode ist ebenfalls zu dokumentieren. Implementierungen müssen entsprechend beschrieben und leicht über das Makefile deployable sein!

### Classroom Git-Repository
[Hier](https://github.com/500) befindet sich das Abgabe-Repository zum Entwickeln und Commiten der Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen
- [ ] Anpassung des Source-Codes zur Verwendung von nur einer Funktion
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Kopie des Template-Projekts und Anpassung des Makefiles zur Verwendung von nur drei LEDs
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Implementierung der grundlegenden, funktionalen Anforderung
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Verwendung von extern angeschlossenen LEDs
- [ ] Setzen der LEDs mittels Bitmuster auf den GPIO-Port ohne Verwendung der Library

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* "Kleine Ampelkunde - Lichtzeichen" wien.gv.at; zuletzt besucht 2020-11-18; [online](https://www.wien.gv.at/verkehr/ampeln/ampelkunde.html)
* "Learn C" learn-c.org; zuletzt besucht 2020-11-18; [online](https://www.learn-c.org/)
* "C for Java Programmers" George Ferguson; zuletzt besucht 2020-11-18; [online](https://www.cs.rochester.edu/u/ferguson/csc/c/c-for-java-programmers.pdf)
* "STM32 Cube F3 Firmware Package" github.com; zuletzt besucht 2020-11-18; [online](https://github.com/STMicroelectronics/STM32CubeF3)
* "Getting Started with STM32CubeF3 - Architecture Overview" github.com; zuletzt besucht 2020-11-18; [online](https://github.com/STMicroelectronics/STM32CubeF3/blob/master/Documentation/STM32CubeF3GettingStarted.pdf)


---
Version 20201118v2
