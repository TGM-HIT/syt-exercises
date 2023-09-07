# Systemanbindung "Sensoren und Aktoren" - Taskdescription

## Einführung
Diese Aufgabe soll den Einsatz von Sensoren und Aktoren mit Mikrocontrollern verständlich machen, und das Zusammenspiel der beiden näherbringen .

## Ziele
Das Ziel ist es Messdaten über einen analogen Input einzulesen, zu bearbeiten und anschließend auszugeben.

## Kompetenzzuordnung
**GK SYT6 Industrielle Informationstechnik | Systemanbindung | Sensoren und Aktoren**  

* "verarbeitete analoge Signale zur Steuerung und aktiven Nutzung einsetzen"

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache
* Übung "Messverfahren"

## Detaillierte Aufgabenbeschreibung
**Grundanforderungen**  
Es soll der **Arduino Mega 2560 Mikrocontroller** [3, 4] oder **NodeMCU ESP32**[11]  verwendet werden um einen Ultraschall-Entfernungssensors (HC-SR04) auszulesen [5], diesen zu verarbeiten und auf der seriellen Schnittstelle auszugeben. Die gemessenen Werte müssen entsprechend interpretiert [6, 7] werden. Mögliche Fehler bzw. Ausreißer müssen erkannt, wenn möglich ersetzt und gemeldet werden. Werte müssen auf der seriellen Schnittstelle ausgegeben werden. Die verarbeiteten Werte sollen dann dazu verwendet werden um einen Servo Motor [8] zu steuern. In einem ersten Schritt sollen die Sensorwerte sowie die Servo Positionen in Wertebereiche eingeteilt werden. In der zweiten Version des Programms sollen die Sensorwerte zu den Servo Positionen linear interpoliert werden.

Mögliche Anwendungen wäre zum Beispiel [Automatic Trash](https://www.az-delivery.de/en/blogs/azdelivery-blog-fur-arduino-und-raspberry-pi/automatischer-papierkorb-entwurf) ([Video](https://www.facebook.com/watch/?v=421956858229574)) oder ein [Radar](https://github.com/indiejoseph/Radar).

Dafür muss das erstellte Programm auf den Mikrocontroller übertragen werden. Dies kann entweder mit der [Arduino IDE](https://www.arduino.cc/en/Main/Software) als Desktop-Applikation oder aber auch mit dem Web Editor erfolgen. Beim Web Editor muss aber das Plugin zum Einbinden von lokal angeschlossenen Geräten installiert werden [1, 2].

Die Schaltung soll vor dem physischen Aufbau entsprechend dokumentiert werden. Dabei bietet sich die Umgebung von [Fritzing](https://fritzing.org/home/) [10] an. Diese Software bietet leider kein Testumgebung, dafür könnte man mit ähnlichen Bauteilen weiterhin Tinkercad nutzen.

**Erweiterungen**  
Nun wird angenommen, der Sensor misst den Abstand zum Servo Arm, kann also seine Änderungen messen. Das Programm soll nun eine Distanz vom Benutzer einlesen und dem Arm so bewegen um diese Distanz automatisch einzunehmen. Die Distanz kann zum Beispiel über Serial oder über einen anderen Sensor, z.B. ein Potentiometer, eingelesen werden.

## Fragestellungen

### Grundlegend

* Wie funktioniert der eingesetzte Sensor? Welche Faktoren sind dabei zu beachten?
* Was ist ein Aktor? Nenne Beispiele?
* Wie funktioniert der eingesetzte Aktor? Worauf ist bei der Verwendung zu Achten?
* Was für ein Signal wird verwendet um einen Servo zu steuern? Wie ist das aufgebaut? Wo wird es noch verwendet?
* Was muss bei der Verarbeitung der Sensordaten beachtet werden?
* Wie können Fehler bzw. Ausreißer erkannt und ausgebessert werden?
* Wie kann in der Version des Programms mit den Wertebereichen das "flackern" des Servos verhindert werden?

### Erweitert

* Was ist eine Hysterese/ein Schmitt-Trigger?
* Was ist ein Regelkreis? Was sind mögliche Anwendungen dafür?
* Wie funktioniert die Rückkopplung im Regelkreis?

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist.

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden. Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der grundlegenden Fragestellungen
- [ ] Dokumentation der Beschaltung

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger, grundlegender Code auf Arduino Board oder ESP32 upgeloadet und richtig beschaltet
- [ ] Sensordaten richtig ausgelesen und angepasst

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen auch für die erweiterten Anforderungen

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger, erweiterter Code auf Arduino Board oder ESP32 upgeloadet und richtig beschaltet

### Classroom Git-Repository
[Hier](https://github.com/500) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Quellen
[1] "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  
[2] "Arduino API Reference" [online](https://www.arduino.cc/reference/en/language/functions/analog-io/analogread/)  
[3] "Arduino Mega 2560" Arduino Shop; zuletzt besucht am 2019-10-17 [online](https://store.arduino.cc/arduino-mega-2560-rev3)  
[4] "Datasheet ATmega2560" Atmel [online](http://ww1.microchip.com/downloads/en/DeviceDoc/Atmel-2549-8-bit-AVR-Microcontroller-ATmega640-1280-1281-2560-2561_datasheet.pdf)  
[5] "HC-SR04 Ultrasonic Sensor" components101.com Datasheet [online](https://components101.com/ultrasonic-sensor-working-pinout-datasheet)   
[6] "Ultraschall Messmodul HC-SR04" mikrocontroller.net [online](https://www.mikrocontroller.net/attachment/218122/HC-SR04_ultraschallmodul_beschreibung_3.pdf)
[7] "How to Set Up an Ultrasonic Range Finder on an Arduino" circuitbasics.com [online](http://www.circuitbasics.com/how-to-set-up-an-ultrasonic-range-finder-on-an-arduino)  
[8] "Servo ansteuern" starthardware.org; zuletzt besucht 2021-02-27; [online](https://starthardware.org/servo/)  
[9] "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)  
[10] "Fritzing 0.9.4 Download" (sponsored by MBorko) [online](https://fritzing.org/download/0.9.4/windows-64bit/fritzing.0.9.4.64.pc_and_dll.zip)     
[11] "NodeMCU ESP32" joy-it.net; zuletzt besucht am 2022-13-02 [online](https://joy-it.net/de/products/SBC-NodeMCU-ESP32)


---

---
**Version** *20220213v2*