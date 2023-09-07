# Embedded Devices "Hardware-Programming"

## Bewertung
Gruppengrösse: 1 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Wo sind große Unterschiede zwischen C und anderen hohen Programiersprachen?
- [ ] Was ist ein Header-File und wo werden in C die Funktionen implementiert?
- [ ] Wie kommen Toolchains bzw. Firmwares bei der Programmierung von Embedded Systems zum Einsatz?
- [ ] Wie sind Datenblätter eines Mikrokontrollers und des Demo-Boards (z.B. STM32F3-Discovery) aufgebaut? Wo finde ich dabei die Interface Description der Toolchain?
- [ ] Was bedeutet das Akronym HAL bei der Implementierung von Embedded Devices?
- [ ] Was macht der Befehl make und wie ist das Makefile im stm32f3-template Repository aufgebaut?
- [ ] Wo ist die Methode BSP_LED_Init() definiert und wo implementiert? Welche Schritte werden in der implementierten Methode durchgeführt? Was ist dabei der Pull-Mode?
- [ ] Was ist ein GPIO-Port und wieviele sind auf dem STM32F3-Discovery einsetzbar?
- [ ] Auf welchem GPIO Pin liegen die einzelnen LEDs des STM32F3-Discovery Boards?
- [ ] Wie könnten die LEDs auch ohne der implementierten Library angesteuert werden?
- [ ] Anpassung des Source-Codes zur Verwendung von nur einer Funktion
- [ ] Ausführbarkeit des Codes
- [ ] Beschreibung der Entwicklungs-Umgebung vorhanden
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Kopie des Template-Projekts und Anpassung des Makefiles zur Verwendung von nur drei LEDs
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Implementierung der grundlegenden, funktionalen Anforderung
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Verwendung von extern angeschlossenen LEDs
- [ ] Setzen der LEDs mittels Bitmuster auf den GPIO-Port ohne Verwendung der Library


### Kommentare
* Bitte zum Abgabegespräch melden!
* Dokumentation stellenweise sehr oberflächlich
* Keine gesamten Listings ins README/Protokoll -> besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* GPIO Pin != Port
* Wie kommen PullUp bzw. PullDown zur Geltung?
* nicht verwendeten Code bitte entfernen - erhöht Lesbarkeit! und entfernt mögliche Fehlerfallen!
* eingefügte Bilder bitte mit relativen Pfad einbinden (und auch commiten)

### Kommentare zur Nachabgabe
* Commit Messages bitte auf konkrete Verbesserungen/Änderungen hin benennen

### Kommentare zur EK-Abgabe
* Ampelkunde nochmal checken - Zeitintervalle könnten besser getroffen werden
* git verwenden! tags oder einfach auf die ID switchen!
* Funktion verwenden!
* #define für Präprozessor für LED-Ampel-Farben verwenden! Code-Lesbarkeit und Wartbarkeit wird erhöht
* README verwenden für Projekt-Übersicht

