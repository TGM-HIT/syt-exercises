# Embedded Devices "Anzeige und Analyse von Sensordaten"

## Bewertung
Gruppengrösse: 1 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Wie funktioniert der Bewegungssensor? Welche Daten werden bereitgestellt? Wie kann man diese Daten abfragen?
- [ ] Welche Schnittstellen bietet der Raspi an (UART, SPI, I2C, etc.)?
- [ ] Wie aktiviere ich die vorhandenen Sensor-Schnittstellen am RaspberryPi?
- [ ] Welche Pins sind am Header für die einzelnen Kommunikationsbusse vorgesehen?
- [ ] Welche Bussysteme könnten eingesetzt werden, damit Informationen von einem Sensor an einen Mikrocontroller oder einen SBC übertragen werden können?
- [ ] Welche Informationen bzw. Datenpakete werden wann übertragen? Wie spielen da Interrupts eine Rolle?
- [ ] Was bedeutet der Begriff Polling?
- [ ] Wo ist der grundsätzliche Unterschied zwischen I2C und SPI? Welche Anschlüsse werden auf der Hardware meist wie benannt bzw. wofür stehen SDA, SCL und CS?
- [ ] Programmierung und Konfiguration eines Single-Board-Computers
- [ ] Aufnahme von Sensordaten bzw. Verbindung eines Sensors
- [ ] Konfiguration und Inbetriebnahme eines SBCs
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Anzeige von Sensordaten
- [ ] Ausführbarkeit in README.md dokumentiert

### Kommentare
* Befehle in Markdown bitte entsprechend quoten!
* Debug Output in finaler Abgabe entfernen!
* Dokumentation stellenweise sehr oberflächlich
* Init von SBC verlinken bzw. einbinden - (siehe Info in SYT-Theorie-Kurs)
* Keine gesamten Listings ins README/Protokoll -> besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* Kein Graph im README
* requirements.txt entsprechend definieren
* virtual-environment nicht verwendet
* .gitignore für das venv Verzeichnis?
* Code bitte nicht in das Root-Verzeichnis legen, besser in sprechenden Ordner!
* Quellen bitte am Ende des Dokuments zusammenfassen
* Bilder bitte mit relativen Pfad einbinden (und auch commiten)
* `sudo` ist bei venv nicht notwendig, wenn User in udev Gruppe enthalten ist!
* 0x68 ist kein ADXL345 sondern ein MPU6050
* Commit Messages bitte auf konkrete Verbesserungen/Änderungen hin benennen

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Entsprechende Verarbeitung von Sensordaten (Achsen und Beschleunigung)
- [ ] Kommunikation zwischen uC+Sensor und SBC
- [ ] ExceptionHandling beachtet
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Visualisierung der Sensordaten (z.B. mit gnuplot)
- [ ] vertiefende Informationen zu der verwendeten Hardware und Software sowie des Übertragungssystems

