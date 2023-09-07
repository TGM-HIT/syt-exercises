# GEK9.1 Embedded Systems "IoT in der Cloud"

## Einführung
Diese Übung gibt eine Einführung in die Verwendung von Sensoren und deren Datenanzeige in der Cloud.

## Ziele
Das Ziel ist es mit verschiedenen Sensoren Daten auszulesen und diese entsprechend aggregiert über eine Weboberfläche anzuzeigen.
Um die Sensordaten verarbeiten und weiterleiten zu können ist entweder ein uC oder ein SBC (z.B. RaspberryPi) notwendig, der über geeignete Schnittstellen Daten an die Cloud weiterleitet.

## Voraussetzungen
* Verwendung von Single-Board-Computer bzw. Mikrokontroller
* Verständnis von Bussystemen im Hardware-Bereich
* Aufsetzen von Webservices
* Implementierung von zustandslosen Schnittstellen

## Detailierte Ausgabenbeschreibung
### Recherche
Überlegen Sie sich die notwendigen Schritte um unterschiedliche Low-Cost Sensoren an einen Gateway anschließen zu können, um die aquirierten, kontinuierlichen Messdaten über ein Webservice anzeigen zu lassen und diese exportierbar zu machen.

Bedenken Sie dabei die folgenden Punkte:

* Abtastrate der Informationen
* Aggregierung der Daten
* Schnittstellendefinition (Hardware, Gateway, Services, etc.)
* Energieversorgung
* Speicherverbrauch
* Verbindung

### Implementierung
Implementieren Sie einen Prototypen, der die oben beschriebenen Punkte realisiert. Verwenden Sie dabei die bereitgestellte Hardware (RaspiCameraV2, PIR SB312, Light BH1750, Temperature DHT11, Pressure BMP280, AZ-Delivery 35-in-1) und deployen Sie Ihr Webservice auf eine öffentlich zugängliche Einheit (z.B. Heroku).

## Bewertung
Gruppengrösse: 3-4 Personen  
Protokoll  
Online-Deployment  
### Grundlegende Anforderungen **überwiegend erfüllt**
+ Recherche und Zusammenfassung der verwendeten Technologien
+ Erstellung eines Prototyps zur Aquirierung von Sensordaten
+ Deployment und Dokumentation der grafischen Anzeige der Sensordaten

### Grundlegende Anforderungen **zur Gänze erfüllt**
+ Aufbau des ganzen Systems mit entsprechender Langzeit-Dokumentation (grafisch)
+ Weitere Verwertung der Sensordaten als Export über ReST-Schnittstelle

### Erweiterte Anforderungen **überwiegend erfüllt**
+ anpassbare Abtastrate der Sensordaten
+ Export der Daten über ReST-Schnittstelle mit entsprechender Wahl des Zeitfensters
+ Verwendung von Grenzwerten bzw. Ereignissen zur automatischen Benachrichtigung bei Überschreitung oder Auslösung

### Erweiterte Anforderungen **zur Gänze erfüllt**
+ halb-/automatische Analyse der Sensordaten zur Steuerung von Aktoren

### Classroom Repository
[Hier](https://github.com/500) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Resources
* "Semaf Electronics" [online](https://electronics.semaf.at/startseite)
* "35 in 1 Arduino Sensorenkit Modulkit" AZ Delivery [online](https://www.az-delivery.de/products/35-in-1-arduino-zubehor-kit?_pos=4&_sid=fc18e5112&_ss=r)
* "Fritzing - Electronic Design Automation software" [online](https://github.com/fritzing/fritzing-app)
* "Tinkercad - Online Circuits simulation" [online](https://www.tinkercad.com/learn/circuits)
* "InfluxDB - open source time series database" [online](https://www.influxdata.com/)
* "Grafana - The open observability platform" [online](https://grafana.com/)

