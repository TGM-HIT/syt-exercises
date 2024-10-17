---
hide:
  - navigation
---

# Embedded Devices "Einführung in Mikrocontroller" - Taskdescription

## Einführung
Diese Aufgabe soll den Einsatz von Mikrocontrollern zum einfachen Ansteuern und Ansprechen von Elektronikbauteilen ermöglichen.

*"Ein Mikrocontroller stellt im Prinzip einen Mikrorechner auf einem Chip dar. Ziel ist es, eine Steuerungs- oder Kommunikationsaufgabe mit möglichst wenigen Bausteinen zu lösen. Prozessorkern, Speicher und Ein-/Ausgabeschnittstellen eines Mikrocontrollers sind auf die Lösung solcher Aufgaben zugeschnitten. Durch die große Vielfalt möglicher Aufgabenstellungen existieren daher eine Vielzahl verschiedener Mikrocontroller, welche die Zahl verfügbarer Mikroprozessoren um ein Weites übertrifft."* [1]

Mikrocontroller werden oft für das Steuern und Regeln von externer Hardware und Elektronik benutzt. Dabei werden die verschiedenen Aufgaben in speziell implementierten Programmen realisiert. Dabei bildet die Taktfrequenz und die Bit-Breite des Datenbusses eines Mikrocontrollers ein entscheidendes Merkmal zur Auswahl für das jeweilige Einsatzgebiet. [2,3]

## Ziele
Das Ziel ist es den Aufbau von Mikrocontrollern zu verstehen und diese bei verschiedenen Hardwareprojekten einsetzen und einfache Programme schreiben zu können.

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache (z.B. Java)

## Detaillierte Aufgabenbeschreibung

### [ESP32 Installation](https://tgm-hit.github.io/syt-exercises/industrielleInformationstechnik_/sem03_einf%C3%BChrung_microcontroller/Microcontroller_Installation/)

#### Übung 1: Blink

Es soll der **ESP32** verwendet werden um ein Blinklicht zu implementieren. Dabei soll eine externe LED am digitalen Port 8 angeschlossen werden und in einer Frequenz von 2 Hz zum Blinken gebracht werden. Dafür muss das erstellte Programm auf den Mikrocontroller übertragen werden. Dies kann entweder mit der [Arduino IDE](https://www.arduino.cc/en/Main/Software) als Desktop-Applikation erfolgen. Stelle zuerst sicher, dass du das Board in der IDE [richtig installiert hast](https://elearning.tgm.ac.at/mod/page/view.php?id=90535). 

Als Basis kann das Beispiel aus den Arduino Tutorials herangezogen werden [6]. Wenn mit dem Online-Editor gearbeitet wird, muss das Example bei den Basics ausgewählt werden:

Die Schaltung soll vor dem physischen Aufbau in einer Simulationsumgebung getestet und entsprechend dokumentiert werden. Dabei bietet sich die Umgebung von [Tinkercad](https://www.tinkercad.com) an. Hier kann auch der Arduino-Code getestet werden. 

Eine LED blinken lassen entspricht dem "Hello World!" der Microcontroller, damit kann eine Ausgabe wahrgenommen werden, somit bestätigt werden, dass das Programm, der Upload und der Microcontroller selbst funktioniert. Nun sollen die Microcontoller Grundlagen ausprobiert werden.

Verwende deinen Microcontroller um folgende Aufgaben zu lösen.

#### Übung 2: Without Delay

Blink LED: lasse eine LED blinken, ohne *delay* zu verwenden. (Tipp: verwende *millis()* (siehe Quellen) stattdessen)

#### Übung 3: Dimmen

Serielle Kommunikation: sende dem Microcontroller Befehle über die Serielle Schnittstelle um die Helligkeit der LED zu kontrollieren. (z.B. beim Empfangen eines Symbols die Helligkeit erhöhen)

#### Übung 4: Button

Bchließe einen Button an den Microcontroller an, lasse die LED leuchten wenn der Button gedrückt ist.

#### Übung 5: Debounce (Optional)

LED und Button: überlege dir eine Methode die Helligkeit der LED mit einem Button zu steuern.

### Fragestellungen
* Was ist ein Mikrocontroller und wie ist dieser aufgebaut?
* Was sind *Timer, EEPROM, Flash, SRAM, A/D Converter und Oscillator* im Blockschaltdiagramm und welche Aufgaben haben sie?
* Wo sind die grundsätzlichen Unterschiede zwischen einem PC und einem Mikrocontroller? Wie unterscheiden sich hier Anwendung und Entwicklung?
* Welche Besonderheiten gibt es in Bezug auf das Betriebssystem?
 Was machen die Methoden ``setup()`` und ``loop()`` in der Arduino Entwicklungsumgebung? 
* Wie spricht man den digitalen Pin 8 an? Was bedeutet dabei das *HIGH* und *LOW*?
* Wieso sollte man die *delay*-Funktion vermeiden?

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist.

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden.
Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung Labor
Gruppengröße: 1 Person

### Anforderungen **überwiegend erfüllt**
- [ ]  Übung 1: Blink läuft auf eigener Hardware
- [ ]  Übung 2: Without Delay läuft auf eigener Hardware
### Anforderungen **zur Gänze erfüllt**
- [ ] Übung 3: Dimmen läuft auf eigener Hardware
- [ ] Übung 4: Button läuft auf eigener Hardware

### Classroom Repository
[Hier](https://github.com/500) befindet sich das Abgabe-Repository zum Entwickeln und Commiten der Lösung.
Dies ist optional und für geübte Entwickler gedacht.

## Quellen
[1] "Mikrocontroller und Mikroprozessoren", T. Ungerer und U. Brinkschulte, 3. Auflage Berlin Heidelberg New York: Springer-Verlag, 2010.  
[2] "What is a Microcontroller?" Core Electronics Video, 2017-02-17; zuletzt besucht am 2019-10-17 [online](https://core-electronics.com.au/tutorials/arduino-workshop-for-beginners.html)  
[3] "Mikrokontroller" mikrocontroller.net; zuletzt besucht am 2019-10-17 [online](https://www.mikrocontroller.net/articles/Mikrocontroller)[5] "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  
[4] "Built-In Examples Blink" Arduino Tutorials, 2015-07-28; zuletzt besucht am 2019-10-17 [online](https://www.arduino.cc/en/Tutorial/Blink)  
[5] "Blink Without Delay" arduino.cc; zuletzt besucht am 2022-09-14 [online](https://www.arduino.cc/en/Tutorial/BuiltInExamples/BlinkWithoutDelay)   
[6] "Lektion 13 – LEDs dimmen mit der analogen Ausgabe" starthardware.org; zuletzt besucht am 2022-09-14 [online](https://starthardware.org/lektion-13-leds-dimmen-mit-der-analogen-ausgabe/)   
[7] "Pulse-width modulation" Wikipedia; zuletzt besucht am 2022-09-14 [online](https://en.wikipedia.org/wiki/Pulse-width_modulation)   
[8] "PWM - Pulsweitenmodulation" Elektronik Kompendium; zuletzt besucht am 2022-09-14 [online](https://www.elektronik-kompendium.de/sites/kom/0401111.htm)   
[9] "Serial.read()" arduino.cc; zuletzt besucht am 2022-09-14 [online](https://www.arduino.cc/reference/en/language/functions/communication/serial/read/)   
[10] "Serial.begin()" arduino.cc; zuletzt besucht am 2022-09-14 [online](https://www.arduino.cc/reference/de/language/functions/communication/serial/begin/)   
[11] "Serial" arduino.cc; zuletzt besucht am 2022-09-14 [online](https://www.arduino.cc/reference/de/language/functions/communication/serial/)   
[12] "Potentiometer" Wikipedia; zuletzt besucht am 2022-09-14 [online](https://de.wikipedia.org/wiki/Potentiometer)   
[13] "Analog Read Serial" Arduino Docs; zuletzt besucht am 2022-09-14 [online](https://docs.arduino.cc/built-in-examples/basics/AnalogReadSerial)   
[14] "Button" Arduino; zuletzt besucht am 2022-09-14 [online](https://www.arduino.cc/en/Tutorial/BuiltInExamples/Button)   
[15] "Pullup- und Pulldown-Widerstände" elektro.turanis; zuletzt besucht am 2022-09-14 [online](https://elektro.turanis.de/html/prj035/index.html)   
[16] "ESP32 PWM with Arduino IDE (Analog Output)" andomnerdtutorials; zuletzt besucht am 2022-09-14 [online](https://randomnerdtutorials.com/esp32-pwm-arduino-ide/)    
[17] "ATmega2560 Blockschaltbild" Microchip.com; zuletzt besucht am 2022-10-07 [online](https://ww1.microchip.com/downloads/en/devicedoc/atmel-2549-8-bit-avr-microcontroller-atmega640-1280-1281-2560-2561_datasheet.pdf)   


---
**Version** *20231204v3*