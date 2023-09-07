# Datenerfassung "Mindeststandards bei Messverfahren einhalten" - Taskdescription

## Einführung
Diese Aufgabe soll den Einsatz von Sensoren und analogen Bauteilen mit Mikrocontrollern verständlich machen und die Verarbeitung der Sensordaten näher bringen. Dabei soll die Qualität der gemessenen Daten analysiert werden.

## Ziele
Das Ziel ist es Messdaten zu kalibrieren und deren Wertebereich sicher zu stellen.

## Kompetenzzuordnung
#### GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung
* "analoge Signale aufnehmen und in einer entsprechenden Qualität verarbeiten"

#### EK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung
* "aufgenommene Signale bearbeiten sowie Störquellen erkennen und vermeiden"

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache
* Übung "Sensoren und Datenerfassung"

## Detaillierte Aufgabenbeschreibung
### Grundanforderungen
Es soll der **Arduino Mega 2560 Mikrocontroller** [1, 3] oder **NodeMCU ESP32**[10]  verwendet werden um einen analogen Wert auszulesen, diesen zu verarbeiten und auf der seriellen Schnittstelle auszugeben. Die gemessenen Werte müssen entsprechend kalibriert [5, 6, 8] und auf der seriellen Schnittstelle mit einer Geschwindigkeit von 19200 Bits/s ausgegeben werden. Es soll dabei eine Anfangsphase von 10 Sekunden definiert werden, wo der maximale und minimale Sensorwert (es darf jeder beliebige analoge Sensor verwendet werden) abgefragt wird. Am Ende der Kalibrierungsphase soll die Onboard-LED (Tipp: Digital Pin 13) abgeschalten werden. Die Bandbreite der nun gemessenen Werte wird auf den Wertebereich des ADCs gelegt und erhöht somit die Genauigkeit der Messergebnisse.

Das erstellte Programm und die gewählte Schaltung soll getestet werden. Dies kann entweder mit der [Arduino IDE](https://www.arduino.cc/en/Main/Software) als Desktop-Applikation oder aber auch mit dem Web Editor erfolgen. Beim Web Editor muss aber das Plugin zum Einbinden von lokal angeschlossenen Geräten installiert werden [2].

Die Schaltung soll vor dem physischen Aufbau entsprechend dokumentiert werden. Dabei bietet sich die Umgebung von [Tinkercad](https://www.tinkercad.com/) an. Mit Tinkercad kann auch der Code im Voraus auf seine Funktionstüchtigkeit getestet werden.

### Erweiterungen
Der digitale Temperatursensor KY-028 hat auf dessen Platine ein Potentiometer. Wofür ist dieses gedacht und wie kann damit eine Anpassung der Messwerte vorgenommen werden?

Es soll ein Programm implementiert werden, welches aussagekräftige Daten vom Temperatursensor aufnimmt und auf der seriellen Schnittstelle mit einer Geschwindigkeit von 19200 Bits/s in **°C** ausgibt. Dabei ist der Sensorwert alle 100 ms abzufragen.

## Fragestellungen
* Was ist der Unterschied zwischen Kalibrierung, Eichung und Justierung?
* Welche Eckpunkte muss man bei laufenden Systemen beachten?
* Was muss bei der Verarbeitung der Sensordaten beachtet werden?
* Welche Sensoren können mit der Zeit falsche Werte liefern? Wie kann man dem entgegenwirken?
* Welche äußeren Einflüsse können Sensoren stören? Wie kann man diese minimieren?

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist [7, 8, 9].

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
[1] "Arduino Mega 2560" Arduino Shop; zuletzt besucht am 2019-10-17 [online](https://store.arduino.cc/arduino-mega-2560-rev3)  
[2] "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  
[3] "Datasheet ATmega2560" Atmel [online](http://ww1.microchip.com/downloads/en/DeviceDoc/Atmel-2549-8-bit-AVR-Microcontroller-ATmega640-1280-1281-2560-2561_datasheet.pdf)  
[4] "Arduino API Reference" [online](https://www.arduino.cc/reference/en/language/functions/analog-io/analogread/)  
[5] "Kalibrieren, Justieren, Verifizieren und Eichen von Messgeräten" Endress+Hauser, zuletzt besucht am 2020-03-20 [online](https://www.at.endress.com/de/dienstleistungsportfolio/messgeraete-kalibrierservice/service-kalibrieren-messger%C3%A4te)  
[6] "Messtechnik - Grundlagen und Anwendungen der elektrischen Messtechnik" Rainer Parthier, Springer Vieweg, 8. Auflage, 2016  
[7] "KY-028 Digital Temperature Sensor Module" ArduinoModules, zuletzt besucht am 2020-03-20 [online](https://arduinomodules.info/ky-028-digital-temperature-sensor-module/)  
[8] "Messtechnik und Sensorik" Jörg Böttcher; zuletzt besucht am 2020-03-20 [online](https://messtechnik-und-sensorik.org/inhaltsverzeichnis/)    
[9] "Sensoren und Sensorenschnittstellen" Felix Hüning, De Gruyter Oldenbourg, 1. Auflage, 2016    
[10] "NodeMCU ESP32" joy-it.net; zuletzt besucht am 2022-13-02 [online](https://joy-it.net/de/products/SBC-NodeMCU-ESP32)      


---
**Version** *20220213v2*
