---
hide:
  - navigation
---

# Datenerfassung "Internet of Things" - Taskdescription

## Einführung

Der ESP32 eignet sich mit seiner Wifi und Bluetooth Fähigkeit perfekt für kostengünstige IoT Anwendungen. Damit lassen sich sehr einfach MQTT, ein Protokoll zum Austausch von leicht gewichtigen IoT Messages. Damit lassen sich dann auch komplexe IoT Netzwerke oder Smart Homes realisieren.

## Ziele

Die Wifi Funktion des ESP32 zu verwenden um sich zu einem MQTT Server zu verbinden und Nachrichten zu senden. Interrupts verwenden um auf einen Button zu reagieren und den Microcontroller in den Sleep Modus zu versetzten um Strom zu sparen.


## Kompetenzzuordnung
**GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung**  

* "analoge Signale aufnehmen und in einer entsprechenden Qualität verarbeiten"

**GK SYT6 Industrielle Informationstechnik | Datenerfassung | Aufnahme und Verarbeitung**  

* "aufgenommene Signale bearbeiten"

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* Kenntnis einer Programmiersprache
* Übung "Sensoren und Datenerfassung"

## Detaillierte Aufgabenbeschreibung
### Grundanforderungen

[ESP32 Installation und Pinout](https://elearning.tgm.ac.at/mod/page/view.php?id=90535)

#### 1. Sensorwerte ausgeben

Verbinden den von der Lehrperson erhaltenen Sensor mit dem ESP und gib dessen Sensorwerte auf dem Seriellen Monitor aus.

#### 2. WiFi verbinden

Binde `WiFi.h` ein und erstelle im Projektordner `secrets.h` mit folgendem Inhalt: 

```C
#define WIFI_SSID "IOT"
#define WIFI_PASSWORD "20tgmiot18"

#define MQTT_SERVER "projekte.tgm.ac.at"
#define MQTT_PORT 18883
#define MQTT_USER "schueler3xhit"
#define MQTT_PASSWORD "mqttHIT"
```

Binde auch dieses ein. Die Namen können nun im Programm verwendet werden. Verbinde dich zum IOT WiFi und gibt deine IP im Monitor aus [^4][^7].

#### 3. MQTT verbinden

Stelle eine Verbindung zum MQTT Server her [^4][^7]. Verwende dazu folgende Library "PubSubClient" by Nick O'Leary (>=v2.8.0). Verwende `esp32-nachname` als MQTT Client ID. Sende deine Sensorwerte an folgendes MQTT Topic zu senden:

```
hit/3x/nachname/sensor_typ
```

[MQTT-Explorer](https://mqtt-explorer.com/) kann verwendet werden, um die gesendeten Messages zu überprüfen.
Konfiguration: siehe Credentials oben; zusätzlich Advanced --> "hit/3x/#" zu den Subscriptions hinzufügen.

Sensorwerte müssen zu einem Char Array umgewandelt werden.

```c++
const char topic[40] = "hit/3x/nachname/sensor_typ";
char charBuf[50];
int sensorValue = analogRead(sensor);
String(sensorValue).toCharArray(charBuf, 50);
client.publish(topic, charBuf);
```

#### 4. Button Interrupt
Schließe einen Button an (INPUT_PULLUP/INPUT_PULLDOWN) und verwende Interrupts [^1][^3], um beim Button Druck die Sensorwerte senden. Versuche die ISR (Interrupt Service Routine) so kurz wie möglich zu halten.

```c
bool pressed = false;

void IRAM_ATTR ISR() {
	pressed = true;
}

void loop() {
	if (pressed) {
		Serial.println("Pressed");
		pressed = false;
		// Your Code here
	}
```

#### 5. Sleep
Sende den Mikrocontroller in den Deep Sleep, wenn der Button für 5 Sekunden nicht gedrückt wird. Wecke ihn mit dem Button wieder auf [^2][^5].

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden. Dokumentation laut Dokumentationsrichtlinie, soll außerdem enthalten: Schaltplan (verwende [Fritzing](https://fritzing.org/home/), [Tinkercad](https://www.tinkercad.com/), [Wokwi](https://wokwi.com/), ...), Fotos der realen Schaltung, sowie Screenshots. Gruppenarbeiten sind nicht gestattet, Übung ist auf eigener Hardware (Laptop, Microcontroller) durchzuführen. Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Wifi verbinden durchgeführt
- [ ] MQTT verbinden durchgeführt

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Button Interrupt durchgeführt
- [ ] Sleep durchgeführt


[^1]: „Configuring & Handling ESP32 GPIO Interrupts In Arduino IDE“, Last Minute Engineers. Zugegriffen: 21. November 2023. [Online](https://lastminuteengineers.com/handling-esp32-gpio-interrupts-tutorial/)  
[^2]: „ESP32 Deep Sleep with Arduino IDE and Wake Up Sources | Random Nerd Tutorials“. Zugegriffen: 21. November 2023. [Online](https://randomnerdtutorials.com/esp32-deep-sleep-arduino-ide-wake-up-sources/)  
[^3]: K. Magdy, „ESP32 Interrupt Pins (External Interrupts in Arduino) GPIO Interrupt“, DeepBlue. Zugegriffen: 21. November 2023. [Online](https://deepbluembedded.com/esp32-external-interrupts-pins-arduino-examples/)  
[^4]: „ESP32 MQTT Publish Subscribe with Arduino IDE | Random Nerd Tutorials“. Zugegriffen: 21. November 2023. [Online](https://randomnerdtutorials.com/esp32-mqtt-publish-subscribe-arduino-ide/)  
[^5]: „In-Depth: ESP32 Deep Sleep & Wakeup Sources | Timer, Touch & External“, Last Minute Engineers. Zugegriffen: 21. November 2023. [Online](https://lastminuteengineers.com/esp32-deep-sleep-wakeup-sources/)  
[^6]: T. Nordquist, „MQTT Explorer“, MQTT Explorer. Zugegriffen: 5. Dezember 2023. [Online](http://mqtt-explorer.com/)  
[^7]: D. Tao, „MQTT on ESP32: A Beginner’s Guide“, www.emqx.com. Zugegriffen: 21. November 2023. [Online](https://www.emqx.com/en/blog/esp32-connects-to-the-free-public-mqtt-broker)  

---
**Version** *20240220v4*

