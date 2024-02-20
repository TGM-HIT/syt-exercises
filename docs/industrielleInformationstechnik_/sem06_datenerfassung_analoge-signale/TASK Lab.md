---
hide:
  - navigation
---

# Datenerfassung "Analoge Signale aufnehmen und verarbeiten" - Taskdescription

## Einführung
Diese Aufgabe soll den Einsatz von Sensoren und analogen Bauteilen mit Mikrocontrollern verständlich machen und die Verarbeitung der Sensordaten näher bringen.

## Ziele
Das Ziel ist es Messdaten über einen analogen Input einzulesen, zu bearbeiten und anschließend auszugeben.

## Kompetenzzuordnung
**GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung**  
* "analoge Signale aufnehmen und in einer entsprechenden Qualität verarbeiten"

**GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung**  
* "aufgenommene Signale bearbeiten"

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache

## Fragestellungen
* Wie funktioniert das "Simple one-wire serial interface"?
* Wie funktioniert der eingesetzte Temperatur- und Luftfeuchtesensor (DHT11)? Welche Faktoren sind dabei zu beachten? [^5][^6]
* Wie oft pro Sekunde können Daten vom Sensor abgefragt werden?
* Wie funktioniert der Ultraschallsensor HC-SR04? [^21]
* Welche Funktion bietet die Hardware-Library an? Was passiert dort im Code? [^11]
* Was ist der Unterschied zwischen Kalibrierung, Eichung und Justierung? [^13]
* Welche Eckpunkte muss man bei laufenden Systemen beachten?
* Was muss bei der Verarbeitung der Sensordaten beachtet werden? [^17]
* Welche Sensoren können mit der Zeit falsche Werte liefern? Wie kann man dem entgegenwirken? [^19][^20][^22]
* Welche äußeren Einflüsse können Sensoren stören? Wie kann man diese minimieren?
* Was ist MQTT? Wo wird es verwendet? Was wird dafür benötigt? Was sind dessen Vor- und Nachteile? [^23]
* Was ist ein Interrupt? Welche Arten gibt es? Wie läuft das im Code ab? [^26][^28]
* Was ist ein Timer? Wie wird dieser konfiguriert? [^33][^34]
* Was ist Deep Sleep? Wofür wird dieser verwendet? Wie wird dieser konfiguriert? Welche Wake Methoden gibt es? [^27][^30]

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist.

## Quellen
[^1]: "Arduino Mega 2560" Arduino Shop; zuletzt besucht am 2019-10-17 [online](https://store.arduino.cc/arduino-mega-2560-rev3)  
[^2]: "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  
[^3]: "Datasheet ATmega2560" Atmel [online](http://ww1.microchip.com/downloads/en/DeviceDoc/Atmel-2549-8-bit-AVR-Microcontroller-ATmega640-1280-1281-2560-2561_datasheet.pdf)  
[^4]: "Arduino API Reference" [online](https://www.arduino.cc/reference/en/language/functions/analog-io/analogread/)  
[^5]: "DHT11 Humidity & Temperature Sensor" mouser.com Datasheet [online](https://www.mouser.com/datasheet/2/758/DHT11-Technical-Data-Sheet-Translated-Version-1143054.pdf)  
[^6]: "How to Set Up the DHT11 Humidity Sensor on an Arduino" circuitbasics.com [online](http://www.circuitbasics.com/how-to-set-up-the-dht11-humidity-sensor-on-an-arduino/)  
[^7]: "How to Set Up an Ultrasonic Range Finder on an Arduino" circuitbasics.com [online](http://www.circuitbasics.com/how-to-set-up-an-ultrasonic-range-finder-on-an-arduino)  
[^8]: "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)  
[^9]:: "HC-SR04 Ultrasonic Sensor" components101.com Datasheet [online](https://components101.com/ultrasonic-sensor-working-pinout-datasheet)   
[^10]: "Fritzing 0.9.4 Download" (sponsored by MBorko) [online](https://fritzing.org/download/0.9.4/windows-64bit/fritzing.0.9.4.64.pc_and_dll.zip)  
[^11]: "DHT Arduino Library" github.com; Mark Ruys [online](https://github.com/markruys/arduino-DHT)    
[^12]: "NodeMCU ESP32" joy-it.net; zuletzt besucht am 2022-13-02 [online](https://joy-it.net/de/products/SBC-NodeMCU-ESP32)   
[^13]: "Kalibrieren, Justieren, Verifizieren und Eichen von Messgeräten" Endress+Hauser, zuletzt besucht am 2020-03-20 [online](https://www.at.endress.com/de/dienstleistungsportfolio/messgeraete-kalibrierservice/service-kalibrieren-messger%C3%A4te)  
[^14]: "Messtechnik - Grundlagen und Anwendungen der elektrischen Messtechnik" Rainer Parthier, Springer Vieweg, 8. Auflage, 2016  
[^15]: "KY-028 Digital Temperature Sensor Module" ArduinoModules, zuletzt besucht am 2020-03-20 [online](https://arduinomodules.info/ky-028-digital-temperature-sensor-module/)  
[^16]: "Messtechnik und Sensorik" Jörg Böttcher; zuletzt besucht am 2020-03-20 [online](https://messtechnik-und-sensorik.org/inhaltsverzeichnis/)    
[^17]: "Sensoren und Sensorenschnittstellen" Felix Hüning, De Gruyter Oldenbourg, 1. Auflage, 2016  
[^18]: "NodeMCU ESP32" joy-it.net; zuletzt besucht am 2022-13-02 [online](https://joy-it.net/de/products/SBC-NodeMCU-ESP32)      
[^19]: "Systematische Abweichung" Wikipedia; zuletzt besucht am 2023-02-21 [online](https://de.wikipedia.org/wiki/Systematische_Abweichung)   
[^20]: "Störsignal" Wikipedia; zuletzt besucht am 2023-02-21 [online](https://de.wikipedia.org/wiki/St%C3%B6rsignal)   
[^21]: "Ultraschallsensor FAQ: Außeneinflüsse auf die Sensorik" Pepperl-Fuchs; zuletzt besucht am 2023-02-21 [online](https://blog.pepperl-fuchs.com/de/2018/ausseneinfluesse-auf-ultraschallsensoren/)   
[^22]: "Messunsicherheit" Wikipedia; zuletzt besucht am 2023-02-21 [online](https://de.wikipedia.org/wiki/Messunsicherheit)  
[^23]: „What is MQTT and How It Works | Random Nerd Tutorials“. Zugegriffen: 20. Februar 2024. [Online](https://randomnerdtutorials.com/what-is-mqtt-and-how-it-works/)  
[^24]: „MQTT - The Standard for IoT Messaging“. Zugegriffen: 20. Februar 2024. [Online](https://mqtt.org/)  
[^25]: „MQTT“, Wikipedia. 13. Februar 2024. Zugegriffen: 20. Februar 2024. [Online](https://en.wikipedia.org/w/index.php?title=MQTT&oldid=1207091720)  
[^26]: „Configuring & Handling ESP32 GPIO Interrupts In Arduino IDE“, Last Minute Engineers. Zugegriffen: 21. November 2023. [Online](https://lastminuteengineers.com/handling-esp32-gpio-interrupts-tutorial/)  
[^27]: „ESP32 Deep Sleep with Arduino IDE and Wake Up Sources | Random Nerd Tutorials“. Zugegriffen: 21. November 2023. [Online](https://randomnerdtutorials.com/esp32-deep-sleep-arduino-ide-wake-up-sources/)  
[^28]: K. Magdy, „ESP32 Interrupt Pins (External Interrupts in Arduino) GPIO Interrupt“, DeepBlue. Zugegriffen: 21. November 2023. [Online](https://deepbluembedded.com/esp32-external-interrupts-pins-arduino-examples/)  
[^29]: „ESP32 MQTT Publish Subscribe with Arduino IDE | Random Nerd Tutorials“. Zugegriffen: 21. November 2023. [Online](https://randomnerdtutorials.com/esp32-mqtt-publish-subscribe-arduino-ide/)  
[^30]: „In-Depth: ESP32 Deep Sleep & Wakeup Sources | Timer, Touch & External“, Last Minute Engineers. Zugegriffen: 21. November 2023. [Online](https://lastminuteengineers.com/esp32-deep-sleep-wakeup-sources/)  
[^31]: T. Nordquist, „MQTT Explorer“, MQTT Explorer. Zugegriffen: 5. Dezember 2023. [Online](http://mqtt-explorer.com/)  
[^32]: D. Tao, „MQTT on ESP32: A Beginner’s Guide“, www.emqx.com. Zugegriffen: 21. November 2023. [Online](https://www.emqx.com/en/blog/esp32-connects-to-the-free-public-mqtt-broker)    
[^33]: K. Magdy, „ESP32 Timers & Timer Interrupt Tutorial (Arduino IDE)“, DeepBlue. Zugegriffen: 20. Februar 2024. [Online](https://deepbluembedded.com/esp32-timers-timer-interrupt-tutorial-arduino-ide/)  
[^34]: „Timer - - — Arduino ESP32 latest documentation“. Zugegriffen: 20. Februar 2024. [Online](https://docs.espressif.com/projects/arduino-esp32/en/latest/api/timer.html)


---
**Version** *20240220v2*

