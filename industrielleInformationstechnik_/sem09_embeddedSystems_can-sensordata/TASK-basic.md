# GK9.1 Embedded Devices "Sensordaten im industriellen Einsatz" - Taskdescription

## Einführung
Single-Board-Computer und/oder Mikrocontroller werden zur Aufnahme und Verarbeitung von Sensordaten eingesetzt. Dabei sind gängige Kommunikationsschnittstellen, die auch in der Industrie eingesetzt werden zu verwenden.

## Ziele
Das Ziel ist es vorhande Implementierung anzupassen und gegebenenfalls komponentenorientiert aufzubauen. Sensordaten sollen aggregiert und zur weiteren Verarbeitung weitergeleitet werden. Es soll möglich sein, die aufgenommenen Daten zur Steuerung und Regelung einzusetzen, welche auch mit intelligenten Algorithmen versehen werden können.

## Kompetenzzuordnung
**GK SYT9 Industrielle Informationstechnik | Embedded Systems | Kommunikationsschnittstellen**  
* "heterogene Systeme miteinander über gängige Kommunikationsschnittstellen koppeln und dabei verschiedene Sensoren und Aktoren interagieren lassen"

## Voraussetzungen
* Verwendung von Mikrokontrollern und Single-Board-Computern (SBC)
* Kenntnis einer hardwarenahen Programmiersprache
* Grundverständnis von digitalen Systemen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Programmierung und Konfiguration eines Single-Board-Computers
* Aufnahme von Sensordaten
* Einsatz von industriellen Kommunikationsschnittstellen

## Detailierte Aufgabenbeschreibung
Auf Basis einer schon implementierten Umgebung soll eine Anpassung vorgenommen werden. Es bietet sich an, die Implementierung aus dem letzten Semester *"Anzeige und Analyse von Sensordaten"* als Basis heran zu nehmen.

Die dort aufgenommenen und zur Anzeige gebrachten Sensordaten sollen nun auf folgende Punkte angepasst werden:

* Entfernung und Anzahl an Sensor-Einheiten
* Öffentliche Anzeige der Daten
* Erweiterung der Schnittstelle

Die Daten wurden meist über einfache Kommunikationsschnittstellen aufgenommen (z.B. SPI oder I2C). Diese haben nur eingeschränkte Reichweiten als auch nur eine begrenzte Anzahl an Kommunikationspartner. Diese Einschränkungen sollen entsprechend erweitert werden. Dabei bietet sich der CAN Bus an. Welche Elemente müssten hier hinzugefügt werden, damit das bestehende System an diesem Bus partizipieren kann? Was macht dabei der Controller bzw. der Transeiver?

### Grundanforderungen
#### Datenübertragung
Verwenden Sie entweder die schon bestehende Hardware-Umgebung und erweitern Sie diese um die CAN-Elemente, oder zeigen Sie eine einfache Umsetzung von CAN-fähigen Sensor-Knoten. Der zur Verfügung stehende CAN-Controller (MCP2515) hat eine SPI-Schnittstelle, die zur Datenübertragung genutzt wird. Vergewissern Sie sich, dass die Implementierung diese auch ansprechen kann. Hier wäre eine komponentenorientierte Programmierung der funktionalen Anforderung der Datenaquirierung und Verarbeitung von Nöten.

#### Anzeige
Die aufgenommenen Sensordaten sollen, wie schon in der letzten Aufgabenstellung, über ein Webservice zur Verfügung gestellt werden. Die vorgeschlagenen Dienste (InfluxDB und Grafana) bieten hier eine schnelle und einfache Umsetzungsmöglichkeit.

## Fragestellungen
* Welche Übertragungsreichweiten und Geschwindigkeiten kommen beim CAN-Bus zum Einsatz?
* Wieviele Teilnehmer können dabei miteinander kommunizieren?
* Welche Möglichkeiten des einfachen Deployments bieten sich an, wenn verschiedene Services zur Darstellung von Sensordaten miteinander agieren sollen?
* Wie können Grenzwerte definiert werden, die zur Steuerung bzw. Notifikation herangezogen werden?

## Abgabe
Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Etwaiger Programmcode zur Sensordaten-Verarbeitung ist ebenfalls zu dokumentieren. Implementierungen müssen entsprechend beschrieben und leicht deployable sein!

### Classroom Git-Repository
[Hier](https://github.com/500) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Bewertung
Gruppengrösse: 1-2 Person(en)
### Grundanforderungen **überwiegend erfüllt**
- [ ] Konfiguration und Inbetriebnahme des CAN-Busses
- [ ] Auslesen von extern angeschlossenen Sensordaten
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Verarbeitung von Sensordaten
- [ ] Warnmeldung bei Überschreiten von vordefinierten Schwellenwerten
- [ ] Weitergabe der Sensordaten an entsprechende externe Schnittstellen zur Steuerung von Aktoren


### Quellen
* "Grundlagen zum CAN Bus" [mikrocontroller.net](https://www.mikrocontroller.net/attachment/6819/canbus.pdf)
* "Bussysteme in der Fahrzeugtechnik - Controller Area Network CAN nach ISO 11898" W.Zimmermann, R.Schmidgall; Springer; 5. Auflage; 2014
* "Sensornetzwerke in Theorie und Praxis - Bussysteme für embedded Schaltungen" A.Meroth, P.Sora; Springer; 2018
* "MCP2515 CAN Bus Breakout Board With SPI Interface" [copperhilltech](https://copperhilltech.com/mcp2515-can-bus-breakout-board-with-spi-interface/)
* "Adding CAN to the Raspberry PI" Craig Peacock, 2020-01-17, BeyondLogic [beyondlogic](https://www.beyondlogic.org/adding-can-controller-area-network-to-the-raspberry-pi/)
* "CAN-Bus am Raspberry Pi" [crycode.de](https://crycode.de/can-bus-am-raspberry-pi)
* "Getting Started on Heroku" [heroku.com](https://devcenter.heroku.com/start)
* "Local Development with Docker Compose" [heroku.com](https://devcenter.heroku.com/articles/local-development-with-docker-compose)
* "Evaluation of CAN Bus Security Challenges" [mdpi](https://www.mdpi.com/1424-8220/20/8/2364?type=check_update&version=2)
* "Cyber-Security for the Controller Area Network Communication Protocol" [berkley](https://escholarship.org/content/qt5422g038/qt5422g038_noSplash_f8c542841c55634ea7b98bb06ff39d1b.pdf)
* "Time Series Data Analysis of Wireless Sensor Network Measurements of Temperature"  [researchgate](https://www.researchgate.net/profile/Raja_Jurdak/publication/317255116_Time_Series_Data_Analysis_of_Wireless_Sensor_Network_Measurements_of_Temperature/links/5947893445851525f899bbc4/Time-Series-Data-Analysis-of-Wireless-Sensor-Network-Measurements-of-Temperature.pdf)
* "Real-Time Data Analytics in Sensor Networks" [researchgate](https://www.researchgate.net/profile/Themis_Palpanas/publication/268348929_Real-Time_Data_Analytics_in_Sensor_Networks/links/5661f8fe08ae4931cd5c7196/Real-Time-Data-Analytics-in-Sensor-Networks.pdf)

---
**Version** *20221006v4*
