# Embedded Devices "Anzeige und Analyse von Sensordaten" - Taskdescription

## Einführung
Die Theorieeinheiten sollen als Einführung in die hardwarenahe Programmierung und die Verwendung von Embedded Devices dienen.

## Ziele
Das Ziel ist es das Grundwerkzeug zur Verwendung von Mikrokontrollern zu verstehen und einsetzen zu können. Dabei sollen Sensordaten aufgenommen und verarbeitet werden.

## Kompetenzzuordnung
#### GK SYT7 Industrielle Informationstechnik | Embedded Systems | Hardware-programmierung
* "hardwarenahe Programmiersprachen für typische Anwendungen von embedded Systems einsetzen"

#### GK SYT7 Industrielle Informationstechnik | Embedded Systems | Input/Output und Interrupts
* "die Grundstrukturen und Schnittstellen von embedded Systems erläutern und einfache Anwendungen damit erstellen"

#### EK SYT7 Industrielle Informationstechnik | Embedded Systems | Hardware-programmierung
* "komplexere Hardwareanwendungen mit Hilfe von embedded Systems umsetzen"

## Voraussetzungen
* Verwendung von Mikrokontrollern
* Kenntnis einer Programmiersprache (z.B. Java, Python)
* Grundverständnis von digitalen Systemen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* SBC lauffähig und netzwerktechnisch vorbereitet (z.B. RaspberryPi mit Raspbian [6] und ssh-Zugriff) [11]

## Detailierte Aufgabenbeschreibung
Tipp: Konzentriere dich für den Beginn auf die Umsetzung mit dem RaspberryPi, da dies als Einstieg auf jeden Fall deine Kräfte zerren wird!

Es sollen die Daten eines Bewegungssensors angezeigt und ausgewertet werden. Es kann jedes beliebige Modul-Board mit einem entsprechenden Sensor eingesetzt werden (z.B. das ModulBoard GY-291 mit dem ADXL345 [14]), welches die relative Position bestimmt.

### Grundanforderungen
Die Daten des Sensors sollen an einen SBC (z.B. RaspberryPi) übertragen, entsprechend interpretiert und angezeigt werden. Dabei ist zu beachten, dass die Daten aufbereitet werden müssen. Es genügt jedoch, die Sensorwerte über die Konsole erkenntlich zu machen. Wenn keine externe Hardware, wie ein Mikrocontroller zur Verfügung steht, kann angedacht werden den Sensor direkt am SBC angesteckt zu bekommen. Wie erhält hier der RaspberryPi die Daten? Was muss alles getan werden, damit die Daten entsprechend angezeigt werden?

Bedenke, dass du die Abgabe in einem Repository zur Verfügung stellen sollst. Dein Code soll auch auf anderen Orten funktionieren. Python bietet hierfür ein *virtuelles Environment* an, das mit nur wenigen Befehlen aktiviert und verwendet werden kann. In diese virtuelle Umgebung können auch die notwendigen Python Pakete installiert werden (Tipp: **requirements.txt** verwenden), damit keine Systemabhängigkeiten verletzt werden.

### Erweiterungen
Wie können jetzt Sensoren, die direkt auf einem Mikrocontroller oder an diesen angesteckt wurden mit einem SBC verbunden werden? In den Examples von STM32 finden sich Implementierungen zu den gängigen seriellen Bussystemen, die hier leicht mit dem RaspberryPi verbunden werden können.

Hierbei kann  z.B. der MEMS LSM303DLHC Bewegungs- und Magnetsensor [1], der auf dem STM32F3-Discovery Board enthalten ist [7], verwendet werden. Der Einsatz des Onboard-MEMS ist in den Beispiel-Projekten des STM32F3-Discovery-Boards zu finden [5].

#### Grafische Anzeige
Die Daten des Bewegungssensors bieten sich an in einem 3D-Plot angezeigt zu werden. Hier können die angepassten Daten mit vorhandenen Libraries und Tools leicht visualisiert werden [12, 13].

## Fragestellungen
* Wie funktioniert der Bewegungssensor? Welche Daten werden bereitgestellt? Wie kann man diese Daten abfragen?
* Welche Schnittstellen bietet der Raspi an (UART, SPI, I2C, etc.)?
* Wie aktiviere ich die vorhandenen Sensor-Schnittstellen am RaspberryPi?
* Welche Pins sind am Header für die einzelnen Kommunikationsbusse vorgesehen?
* Welche Bussysteme könnten eingesetzt werden, damit Informationen von einem Sensor an einen Mikrocontroller oder einen SBC übertragen werden können?
* Welche Informationen bzw. Datenpakete werden wann übertragen? Wie spielen da Interrupts eine Rolle?
* Was bedeutet der Begriff Polling?
* Wo ist der grundsätzliche Unterschied zwischen I2C und SPI? Welche Anschlüsse werden auf der Hardware meist wie benannt bzw. wofür stehen SDA, SCL und CS?

## Abgabe
Der verwendete Code soll lauffähig zur Verfügung gestellt werden. Es ist ein konsolenbasiertes Deployment (z.B. Makefile) zu präferieren. Die durchgeführten Schritte müssen im README.md enthalten sein.

Beim Abgabegespräch für die erweiterten Anforderungen muss der verwendetet Code entsprechend erläutert werden können. Die verwendeten Bauteile müssen ebenso beschrieben werden.

## Bewertung
Gruppengrösse: 2 Person(en)
### Grundanforderungen **überwiegend erfüllt**
- [ ] Programmierung und Konfiguration eines Single-Board-Computers
- [ ] Aufnahme von Sensordaten bzw. Verbindung eines Sensors
- [ ] Konfiguration und Inbetriebnahme eines SBCs
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Anzeige von Sensordaten
- [ ] Ausführbarkeit in README.md dokumentiert
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Entsprechende Verarbeitung von Sensordaten (Achsen und Beschleunigung)
- [ ] Kommunikation zwischen uC+Sensor und SBC
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Visualisierung der Sensordaten (z.B. mit gnuplot)
- [ ] vertiefende Informationen zu der verwendeten Hardware und Software sowie des Übertragungssystems

### Classroom Repository
[Hier](https://classroom.github.com/a/lgSQpDbu) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Quellen
* [1] "LSM303DLHC - 3D digital linear acceleration and magnetic sensor. " STM Application Note [online](https://www.st.com/resource/en/datasheet/lsm303dlhc.pdf)
* [2] "Accelerometers" Hobby Electronics [online](http://www.hobbytronics.co.uk/accelerometer-info)
* [3] " How to Interface an IMU Sensor With Raspberry Pi " MakerPro  [online](https://maker.pro/raspberry-pi/tutorial/how-to-interface-an-imu-sensor-with-a-raspberry-pi)
* [4] "Rotation und Beschleunigung mit dem Raspberry Pi messen" RaspberryPi-Tutorials  [online](https://tutorials-raspberrypi.de/rotation-und-beschleunigung-mit-dem-raspberry-pi-messen/)
* [5] "STM32Cube MCU Package for STM32F3 series" STMicroelectronics [online](https://github.com/STMicroelectronics/STM32CubeF3/tree/master/Projects/STM32F3-Discovery/Examples/BSP)
* [6] "Raspbian * Lite" Raspberry OS [online](https://www.raspberrypi.org/downloads/raspbian/)
* [7] "STM32F3DISCOVERY Discovery kit - User Manual" STM32F3 Manuals [online](https://www.st.com/content/ccc/resource/technical/document/user_manual/8a/56/97/63/8d/56/41/73/DM00063382.pdf/files/DM00063382.pdf/jcr:content/translations/en.DM00063382.pdf)
* [8] "GPIO Pin Header" Raspberry Pi Documentation [online](https://www.raspberrypi.org/documentation/usage/gpio/)
* [9] "CircuitPython Microcontroller Wiring" adafruit [online](https://learn.adafruit.com/lsm303-accelerometer-slash-compass-breakout/python-circuitpython)
* [10] "Raspberry Pi: I2C-Konfiguration und -Programmierung" netzmafia [online](http://www.netzmafia.de/skripten/hardware/RasPi/RasPi_I2C.html)
* [11] "Raspberry Pi - Easy startup" [online](https://elearning.tgm.ac.at/mod/page/view.php?id=80118)
* [12] "3D graphs in Matplotlib" [online](https://pythonprogramming.net/3d-graphing-python-matplotlib/)
* [13] "Update a Graph in Real Time" [online](https://learn.sparkfun.com/tutorials/graph-sensor-data-with-python-and-matplotlib/update-a-graph-in-real-time)
* [14] "ADXL345 Python/I2C Example Code" Deprecated but good code! [online](https://github.com/pimoroni/adxl345-python/blob/master/adxl345.py)
* [15] "3-Achsen Beschleunigungs- und Lagesensor" [online](https://elektro.turanis.de/html/prj075/index.html)
* [16] "GY-521 MPU-6050 3-axis gyroscope and acceleration sensor " [online](https://www.az-delivery.de/en/products/gy-521-6-achsen-gyroskop-und-beschleunigungssensor)
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* "Sensoren und Sensorenschnittstellen" Felix Hüning; De Gruyter Studium; 2016

---
**Version** *202209273v7*
