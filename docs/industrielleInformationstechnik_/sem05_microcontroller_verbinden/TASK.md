---
hide:
  - navigation
---

# Embedded Devices "Mikrocontroller verbinden" - Taskdescription

## Einführung
Manchmal müssen die Recourcen von mehreren Mikrocontrollern geteilt werden, wenn mehr Rechenleistung oder mehr Pins benötigt werden. Dazu können die Mikrocontroller auf  verschiedene Arten verbunden werden, manchmal reichen ein paar Kabel, manchmal wird ein Bussystem benötigt.

## Ziele
Das Ziel ist es zwei Mikrocontroller miteinander zu verbinden, um Daten austauschen zu können.

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache (z.B. Java)
* GK *Einführung in Mikrocontroller* abgeschlossen

## Detaillierte Aufgabenbeschreibung
Zwei Arduinos sollen miteinander verbunden werden um einander Signale senden zu können. Dazu soll ein Arduino mit einem Button beschalten werden, der zweite Arduino mit einer LED (es kann auch die Onboard LED verwendet werden). Wenn der Button gedrückt wird soll die LED am anderen Arduino leuchten. Dazu müssen die Arduinos mit zwei Drähten verbunden werden, einmal muss GND auf gleiches Potential gelegt werden, dann sollen zwei Ditigal-Pins verbunden werden. Versuche nun ein Programm zu schreiben, verwende einfach *digitalWrite* und *digitalRead* um ein Signal zu übertragen.

Als eine zweite Version verwende ein anderes Bus-System zur Kommunikation. Versuche auch kompliziertere Daten zu senden.

Die Schaltung soll vor dem physischen Aufbau in einer Simulationsumgebung getestet und entsprechend dokumentiert werden. Dabei bietet sich die Umgebung von [Tinkercad](https://www.tinkercad.com) an.

### Fragestellungen
* Was ist ein Bussystem? Welche Bussysteme werden typischerweise im Zusammenhang mit Microconrollern verwendet?
* Wie funktioniert die serielle Kommunikation?
* Wie funktioniert I2C und SPI? Welche Pins werden verwendet?

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist.

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden.
Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengröße: 1 Person

### Anforderungen **überwiegend erfüllt**
- [ ]  Ausarbeitung der grundlegenden Fragestellungen
- [ ]  Einsatz der Simulationsumgebung mit funktionierendem Code
- [ ]  V1 mit digitalRead/Write
### Anforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger Code auf Arduino Board upgeloadet und richtig beschaltet
- [ ] Recherche aller Fragen dokumentiert und entsprechend zitiert
- [ ] V2 mit anderem Bus

### Classroom Repository
[Hier](https://github.com/500) befindet sich das Abgabe-Repository zum Entwickeln und Commiten der Lösung.
Dies ist optional und für geübte Entwickler gedacht.

## Quellen
[1] "Mikrocontroller und Mikroprozessoren", T. Ungerer und U. Brinkschulte, 3. Auflage Berlin Heidelberg New York: Springer-Verlag, 2010.  
[2] "What is a Microcontroller?" Core Electronics Video, 2017-02-17; zuletzt besucht am 2019-10-17 [online](https://core-electronics.com.au/tutorials/arduino-workshop-for-beginners.html)  
[3] "Mikrokontroller" mikrocontroller.net; zuletzt besucht am 2019-10-17 [online](https://www.mikrocontroller.net/articles/Mikrocontroller)  
[4] "Arduino Mega 2560" Arduino Shop; zuletzt besucht am 2019-10-17 [online](https://store.arduino.cc/arduino-mega-2560-rev3)  
[5] "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  
[6] "Built-In Examples Blink" Arduino Tutorials, 2015-07-28; zuletzt besucht am 2019-10-17 [online](https://www.arduino.cc/en/Tutorial/Blink)  
[7] "Atmel ATmega640/V-1280/V-1281/V-2560/V-2561/V Datasheet" Atmel; zuletzt besucht am 2020-01-07 [online](https://ww1.microchip.com/downloads/en/devicedoc/atmel-2549-8-bit-avr-microcontroller-atmega640-1280-1281-2560-2561_datasheet.pdf)  

---
**Version** *20211003v1*
