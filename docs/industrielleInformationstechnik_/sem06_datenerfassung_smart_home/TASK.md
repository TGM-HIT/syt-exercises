# Datenerfassung "Smart Home" - Taskdescription

## Einführung

Der Wifi-fähige ESP32 lässt sich ausgezeichnet in komplexe Netzwerke und Smart Home Anwendungen integrieren um so automatisierungen über mehrere Geräte zu ermöglichen.

## Ziele

MQTT und Home Assistant verwenden um Autmatisierungen über mehrere Geräte zu realisieren.


## Kompetenzzuordnung
**GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung**  
* "analoge Signale aufnehmen und in einer entsprechenden Qualität verarbeiten"

**GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung**  
* "aufgenommene Signale bearbeiten"

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache
* Übung "Internet of Things"

## Detaillierte Aufgabenbeschreibung

### Fragestellungen

1. Was ist MQTT? Wofür wird es verwendet? Was sind dessen Vor- und Nachteile?
2. Was ist Home Assistant? Wo wird es verwendet? Was sind dessen Stärken?
3. Was sind Interrupts? Welche Arten gibt es am ESP32? Wofür werden sie verwendet?
4. Was ist der Sleep Modus am ESP32? Was sind dessen Vorteile?

### Anforderungen

[ESP32 Installation und Pinout](https://elearning.tgm.ac.at/mod/page/view.php?id=90535)

1. #### Aktor verbinden

Erweitere deine Schaltung aus der Laborübung Internet of Things. Schließe einen beliebigen Aktor (LED, Buzzer, Lautsprecher, Display, Motor, Servo ...) an deine Schaltung an.

2. #### MQTT subscribe

Subscribe zu einem Topic eines Kollegen (oder schreibe selbst Messages mit MQTT Explorer, sollte kein Kollege in der Nähe sein). Steuere deinen Aktor mit diesen Messages.

3. #### Home Assistant Installation

Starte eine Home Assistant Instanz in Docker. Verbinde HA mit dem MQTT Server: Einstellungen -> Geräte & Dienste -> + Integration hinzufügen -> MQTT -> MQTT

```
Server: projekte.tgm.ac.at
Port: 18883
Benutzername: schueler3xhit
Passwort: mqttHIT
```

4. #### Automatisierungen

Erstelle einen MQTT Sensor in HA. Erstelle Automationen in HA, um deinen Aktor zu steuern.

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden. Dokumentation laut Dokumentationsrichtlinie, soll außerdem enthalten: Schaltplan (verwende [Fritzing](https://fritzing.org/home/), [Tinkercad](https://www.tinkercad.com/), [Wokwi](https://wokwi.com/), ...), Fotos der realen Schaltung, sowie Screenshots. Gruppenarbeiten sind nicht gestattet, Übung ist auf eigener Hardware (Laptop, Microcontroller) durchzuführen. Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengrösse: 1 Person
### Anforderungen **überwiegend erfüllt**
- [ ] Fragestellungen beantwortet
- [ ] Aktor verbinden durchgeführt
- [ ] MQTT subscribe durchgeführt

### Anforderungen **zur Gänze erfüllt**
- [ ] Home Assistant Installation durchgeführt
- [ ] Automatisierungen durchgeführt

## Quellen

[1] 262588213843476, „docker-compose.yml file for Home Assistant for Windows“, Gist. Zugegriffen: 5. Dezember 2023. [Online]. Verfügbar unter: https://gist.github.com/peyanski/4d803963e890955886d40ae00d1cfb90
[2] „ESP32 MQTT Publish Subscribe with Arduino IDE | Random Nerd Tutorials“. Zugegriffen: 21. November 2023. [Online]. Verfügbar unter: https://randomnerdtutorials.com/esp32-mqtt-publish-subscribe-arduino-ide/
[3] H. Assistant, „Home Assistant“, Home Assistant. Zugegriffen: 5. Dezember 2023. [Online]. Verfügbar unter: https://www.home-assistant.io/
[4] H. Assistant, „MQTT button“, Home Assistant. Zugegriffen: 5. Dezember 2023. [Online]. Verfügbar unter: https://www.home-assistant.io/integrations/button.mqtt/
[5] T. Nordquist, „MQTT Explorer“, MQTT Explorer. Zugegriffen: 5. Dezember 2023. [Online]. Verfügbar unter: http://mqtt-explorer.com/
[6] D. Tao, „MQTT on ESP32: A Beginner’s Guide“, www.emqx.com. Zugegriffen: 21. November 2023. [Online]. Verfügbar unter: https://www.emqx.com/en/blog/esp32-connects-to-the-free-public-mqtt-broker
[7] H. Assistant, „MQTT Sensor“, Home Assistant. Zugegriffen: 5. Dezember 2023. [Online]. Verfügbar unter: https://www.home-assistant.io/integrations/sensor.mqtt/


---
**Version** *20231205v1*

