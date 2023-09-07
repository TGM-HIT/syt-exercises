# Embedded Devices "Anzeige und Analyse von Sensordaten" - Taskdescription

## Einführung
Single-Board-Computer und/oder Mikrocontroller werden zur Aufnahme und Verarbeitung von Sensordaten eingesetzt.

## Ziele
Das Ziel ist es eine geeignete Schnittstelle zur Aufnahme von Sensordaten auszuwählen. Die Daten sollen aggregiert und zur weitern Verarbeitung bearbeitet bzw. angezeigt werden. Es soll möglich sein, die aufgenommenen Daten zur Steuerung und Regelung einzusetzen.

## Kompetenzzuordnung
**GK SYT8 Industrielle Informationstechnik | Embedded Systems | Datenaquirierung**  
* "Sensordaten aufnehmen, aufarbeiten und über gängige industrielle Kommunikationssysteme zur Verfügung stellen"

**EK SYT8 Industrielle Informationstechnik | Embedded Systems | Datenaquirierung**  
* "Datenanalysen automatisieren und Ergebnisse zur Steuerung aufbereiten"

## Voraussetzungen
* Verwendung von Mikrokontrollern und Single-Board-Computern (SBC)
* Kenntnis einer hardwarenahen Programmiersprache
* Grundverständnis von digitalen Systemen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Programmierung und Konfiguration eines Single-Board-Computers
* Aufnahme von Sensordaten
* Auswahl und Gegenüberstellung von Kommunikationsschnittstellen

## Detailierte Aufgabenbeschreibung
Die Themenschwerpunkte sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware gegeben ist.

Es kann ein Sensor aus dem Sensorkit gewählt werden, dessen Daten kontinuierlich mittels eines Single-Board-Computers (SBC) oder bei analogen Signalen mittels Mikrocontrollers (Raspberry Pico - RP2040) verarbeitet werden. Dabei ist zu beachten, dass gewisse zeitliche Kriterien zu erfüllen sind, das verwendete Bussystem soll die Sensordaten nicht verzögern. Die grafische Verarbeitung der Daten ist erst im erweiterten Teil zu implementieren. Vorerst sollen nur die Sensordaten mit unterschiedlichen Methoden ausgelesen und kontinuierlich gespeichert werden. Dabei kann auch zur einfachen Umsetzung auch zuerst nur ein File herangezogen werden.

Wenn analoge Signale erst mittels ADC über den Microcontroller verarbeitet werden und dann an den SBC als Gateway weitergeleitet werden, können zwischenzeitlich Daten aggregiert werden. Nicht jeder gemessene Wert muss auch an den Gateway gesendet werden, somit kann bei der Übertragung Energie gespart werden. Die Schwellenwerte, die eine verringerte Übertragung gewährleisten, sollten in einer Konfigurationsdatei klar verständlich dokumentiert und geändert werden können. Die Aggregierung (z.B. Mittelwert über Zeit; Entfernung von Ausreißern, etc.) muss aber nachvollziehbar sein.

### Vorschlag zur Umsetzung
Grundsätzlich ist die Idee eine physikalische Umgebungsinformation (z.B. Temperatur, Bewegung, etc.) über den Mikrocontroller zu verarbeiten und an ein Gateway über ein standardisiertes Protokoll weiterzuleiten. Die Freiheit gängige Systeme selbst zu vergleichen und auszuwählen, kann zu einer Überforderung führen, deshalb wird nun ein Vorschlag zur einfachen Umsetzung unterbreitet:

#### Raspberry Pico W - MQTT Publisher
Das [Raspberry Pi RP2040 Template Repository](https://github.com/mborko/pico-template) hilft bei der schnellen Umsetzung der [offiziellen Raspberry Pico Examples](https://github.com/raspberrypi/pico-examples) und zeigt auch die einfache Verbindung mehrerer Beispiele. Es wird empfohlen die Ausführung und Kompilierung in einer Linux-Umgebung durchzuführen (obwohl Windows mit [WSL2](https://learn.microsoft.com/en-us/windows/wsl/install) auch möglich wäre). Es wird **dringend** empfohlen die [*offiziellen Quellen von Raspberry*](https://www.raspberrypi.com/documentation/microcontrollers/) als erste Anlaufstelle für Fragen zu nutzen, und sich nicht vom x-ten Tutorial irgendwelche Infos zu holen, die im Endeffekt für eine ganz andere Version gedacht waren.

Im pico-template findet sich eine funktionierende MQTT Implementierung, die mit der einfachen Nutzung des ADC gekoppelt werden kann, um zum Beispiel den Wert eines Potentiometers weiter an einen MQTT-Broker zu versenden (siehe `hello/adc`). Bei der MQTT Implementierung muss im `mqtt/include/wifi_config.h` Header-File das Ziel-WLan angepasst werden, sowie bei gewünschter Änderung auch `mqtt/include/mqtt_config.h` auch die Einstellungen der IP-Addresse sowie Client- und Topic- des MQTT-Brokers.

Die Verwendung des ADC Beispiels ist dabei die einfachste Variante, muss der umgewandelte Wert nur als MQTT-Nachricht verpackt werden. Der eigentliche Mehrwert wäre jedoch die Umsetzung mit einem Sensor-Board, welches mittels I2C oder SPI angebunden wird an den Pico. Achtung, diese Variante kann jedoch zu einer größeren Wissensaufnahme führen!

Nach dem erfolgreichen Anpassen und Kompilieren kann das `build/mqtt/mqtt.uf2` File nach der Aktivierung des Bootsel-Prozesses (Pressen von Bootsel-Button am Pico während gleichzeitigem Anschluss von USB Kabel an Rechner) einfach in das Verzeichnis hinüber gespielt werden. Weitere Infos finden sich im ["Getting started with Raspberry Pi Pico"](https://datasheets.raspberrypi.com/pico/getting-started-with-pico.pdf) in Kapitel 3.2.

#### Raspberry Pi - MQTT Gateway
Um das WLAN für die MQTT Interkommunikation nutzen zu können, muss dieses vom RaspberryPi auch konfiguriert werden. Die offizielle Hilfeseite, gibt dabei unter dem Kapitel [Setting up a Routed Wireless Access Point](https://www.raspberrypi.com/documentation/computers/configuration.html#setting-up-a-routed-wireless-access-point) alle notwendigen Informationen! Es sind dabei die Einstellungen für den eigentlichen Zugriff über das Ethernet-Kabel zu eurem Rechner nicht zu überschreiben!

Es gibt nun viele Möglichkeiten MQTT auf dem RaspberryPi zu verwenden, die einfachste einen Broker zu konfigurieren und zu starten ist mittels [Mosquitto](https://mosquitto.org/). Da das Package schon im Main-Repository ist, ist man mit `sudo apt update && sudo apt install mosquitto mosquitto-clients` schon bereit. Über die [offizielle Dokumentation](https://mosquitto.org/documentation/) des Brokers, kann man im Anschluss die Feineinstellung durchführen.

Ein weiteres Tool, welches die programmtechnische Weiterverarbeitung von eingehenden Nachrichten erleichtert, ist die Python-Implementierung [paho-mqtt](https://github.com/eclipse/paho.mqtt.python). Dabei sollte man die schon bekannten Python-Umgebungs-Policies (Tipp: venv) beachten, um ein kleines Programm zum Empfangen und zur Weiterverarbeitung der vom Mikrokontroller gesendeten Nachrichten zu implementieren.

## Fragestellungen
Die Fragestellungen können natürlich in erschwertem Modus mit gängigen Suchmaschinen gelöst werden, es empfiehlt sich jedoch die gesammelten Werke im SYT-Theorie-Kurs [1] ebenso für die Suche in Betracht zu ziehen. Folgende Werke könnten dabei helfen: "Sensoren und Sensorschnittstellen" von Felix Hüning; "Sensornetzwerke in Theorie und Praxis" von Ansgar Meroth und Petre Sora; "Grundlagen und Anwendungen der elektrischen Messtechnik" von Rainer Parthier; etc.

* Welche Probleme können bei der Verwendung von Sensoren auftreten?
* Wie sind externe Sensoren anzusprechen? Welche verbreitete Protokolle gibt es dabei (I2C, SPI, MQTT, etc.)? Welche Vor- und Nachteile bzw. wie kann man diese miteinander vergleichen?
* Wie können Daten aggregiert bzw. deren Informationsmenge eingeschränkt werden? Welche Anforderungen müssen dabei beachtet werden?
* Wie können zeitabhängige Messdaten leicht gespeichert und verarbeitet werden?
* Welche Möglichkeiten gibt es Daten zu vergleichen und diese zur Steuerung einzusetzen?
* Was muss beim Einsatz eines SBCs oder Mikrocontrollers zur fortwährenden Aufnahme von Messdaten beachtet werden? Welche Grenzen werden bei längerem Einsatz zu einem Problem werden?

## Abgabe
Die Fragestellungen sollen im File **research.md** abgehandelt werden. Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Etwaiger Programmcode zur Sensordaten-Verarbeitung ist ebenfalls zu dokumentieren. Implementierungen müssen entsprechend beschrieben und leicht deployable sein! Die Abgabe findet ausschließlich über das Git-Repository statt.

### Classroom Git-Repository
[Hier](https://classroom.github.com/a/6wu_XreF) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Bewertung
Gruppengrösse: 1-2 Person(en)
### Grundanforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen
- [ ] Konfiguration und Inbetriebnahme eines SBCs
- [ ] Auslesen von extern angeschlossenen Sensordaten
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Verarbeitung und entsprechende Aggregierung von Sensordaten
- [ ] Weitergabe der Sensordaten an entsprechende externe Schnittstellen

### Quellen
* [1] "Systemtechnik Theorie Unterlagen - Embedded Devices - Sensoren und Aktoren" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=199)
* "35 in 1 Arduino Sensorenkit Modulkit" AZ Delivery [online](https://www.az-delivery.de/products/35-in-1-arduino-zubehor-kit?_pos=4&_sid=fc18e5112&_ss=r)
* [2] "Serial Communications Methods via GPIO"; MBTechWorks; last visited: 2019-04-08; [online](https://www.mbtechworks.com/hardware/raspberry-pi-UART-SPI-I2C.html)
* [3] "Real-Time Data Analytics in Sensor Networks" Themis Palpanas; Article; July 2014; [online](https://www.researchgate.net/publication/268348929_Real-Time_Data_Analytics_in_Sensor_Networks)
* [4] "Time Series Data Analysis of Wireless Sensor Network Measurements of Temperature" Siddhartha Bhandari et al.; Article; May 2017;[online](https://www.researchgate.net/publication/317255116_Time_Series_Data_Analysis_of_Wireless_Sensor_Network_Measurements_of_Temperature)
* "Setting up a Routed Wireless Access Point" [online](https://www.raspberrypi.com/documentation/computers/configuration.html#setting-up-a-routed-wireless-access-point)
* "MQTT client" Lightweight IP stack [online API](https://www.nongnu.org/lwip/2_1_x/group__mqtt.html)
* "Eclipse Paho™ MQTT Python Client" [github.com](https://github.com/eclipse/paho.mqtt.python)
* "Mosquitto Documentation" [mosquitto.org](https://mosquitto.org/documentation/)
* "Wireless communication between Raspberry Pi’s via MQTT broker/client" [tutorial](https://tutorials-raspberrypi.com/raspberry-pi-mqtt-broker-client-wireless-communication/)
  

---
**Version** *20230220v5*
