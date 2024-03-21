---
hide:
  - navigation
---

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
**Erweiterungen**  
An einem Servo Motor ist am Drehpunkt ein Neigungssensor/Lagesensor/Beschleunigungsensor befestigt. Es ist ein Programm zu schreiben, welches diesen Sensor möglichst waagerecht hält, auch wenn der Servo bewegt wird. (Frage deine Lehrperson für den Aufbau (HOED))

Die Schaltung soll vor dem physischen Aufbau entsprechend dokumentiert werden. Dabei bietet sich die Umgebung von [Fritzing](https://fritzing.org/home/) [10] an. Diese Software bietet leider kein Testumgebung, dafür könnte man mit ähnlichen Bauteilen weiterhin Tinkercad nutzen.

## Fragestellungen

### Grundlegend

* Was ist ein Aktor? Was ist eine Regelgröße? Nenne Beispiele? [^9]
* Wie funktioniert der Servo Motor? Worauf ist bei der Verwendung zu Achten? [^11]
* Was für ein Signal wird verwendet um einen Servo zu steuern? Wie ist das aufgebaut? Wo wird es noch verwendet? [^10]
* Was muss bei der Verarbeitung der Sensordaten beachtet werden?
* Wie können Fehler bzw. Ausreißer erkannt und ausgebessert werden?
* Wie kann Interpolation helfen Servo Bewegungen ruhiger zu machen?

### Erweitert

* Was ist eine Hysterese/ein Schmitt-Trigger?
* Was ist ein Regelkreis? Was sind mögliche Anwendungen dafür?
* Wie funktioniert die Rückkopplung im Regelkreis?

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist.

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden. Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengrösse: 1 Person
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Funktionstüchtiger, erweiterter Code auf Arduino Board oder ESP32 upgeloadet und richtig beschaltet

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Ausarbeitung der Fragestellungen auch für die erweiterten Anforderungen

## Quellen
[^1]: "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  
[^2]: "Arduino API Reference" [online](https://www.arduino.cc/reference/en/language/functions/analog-io/analogread/)  
[^3]: "Arduino Mega 2560" Arduino Shop; zuletzt besucht am 2019-10-17 [online](https://store.arduino.cc/arduino-mega-2560-rev3)  
[^4]: "Datasheet ATmega2560" Atmel [online](http://ww1.microchip.com/downloads/en/DeviceDoc/Atmel-2549-8-bit-AVR-Microcontroller-ATmega640-1280-1281-2560-2561_datasheet.pdf)   
[^5]: "Servo ansteuern" starthardware.org; zuletzt besucht 2021-02-27; [online](https://starthardware.org/servo/)  
[^6]: "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)  
[^7]: "Fritzing 0.9.4 Download" (sponsored by MBorko) [online](https://fritzing.org/download/0.9.4/windows-64bit/fritzing.0.9.4.64.pc_and_dll.zip)     
[^8]: "NodeMCU ESP32" joy-it.net; zuletzt besucht am 2022-13-02 [online](https://joy-it.net/de/products/SBC-NodeMCU-ESP32)   
[^9]: "Regelgröße" wikipedia; zuletzt besucht 2023-03-03; [online](https://de.wikipedia.org/wiki/Regelgr%C3%B6%C3%9Fe)  
[^10]: "Pulsdauermodulation" wikipedia; zuletzt besucht 2023-03-03; [online](https://de.wikipedia.org/wiki/Pulsdauermodulation)  
[^11]: "Servomotor" wikipedia; zuletzt besucht 2023-03-03; [online](https://de.wikipedia.org/wiki/Servomotor)  
[^12]: "Elektronik für Informatiker" Dr. Manfred Rost, Dr. Sandro Wefel; zuletzt besucht 2023-03-03; [online](https://elearning.tgm.ac.at/pluginfile.php/73626/mod_resource/content/0/ElektronikFuerInformatiker_2013.pdf) [Kapitel 9]  


---
**Version** *20240321v2*
