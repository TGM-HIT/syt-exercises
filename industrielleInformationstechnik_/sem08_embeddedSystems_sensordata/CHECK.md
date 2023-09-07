# Industrial Programming "Anzeige und Analyse von Sensordaten" - Abgabecheck

### Getting newest changes and generate Report

```bash
python ~/bin/getRepositoriesByAssigment.py -a syt4-gek813-sensordata
python ~/bin/assignmentGradeReport.py -a syt4-gek813-sensordata -t ~/repositories/tgm_/tools/assignments/report-templates/overview.xhtml
```

### Check the implementation

```bash

gedit `find | grep "^./src.*\.py$" & find | grep "^./src.*\.xml$"` &

```

### Description
Es soll ein Sensor gewählt werden, dessen Daten kontinuierlich mittels eines Single-Board-Computers (SBC) verarbeitet werden. Dabei ist zu beachten, dass gewisse zeitliche Kriterien zu erfüllen sind. Die Verarbeitung der Daten ist erst im erweiterten Teil zu implementieren. Vorerst sollen nur die Sensordaten mit unterschiedlichen Methoden ausgelesen und gespeichert werden.

## Bewertung
Gruppengrösse: 1 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Ausführbarkeit in README.md dokumentiert
- [ ] Welche Probleme können bei der Verwendung von Sensoren auftreten?
- [ ] Wie sind externe Sensoren anzusprechen? Welche verbreitete Protokolle gibt es dabei?
- [ ] Wie können Daten aggregiert werden? Welche Anforderungen müssen dabei beachtet werden?
- [ ] Wie können zeitabhängige Messdaten leicht gespeichert und verarbeitet werden?
- [ ] Welche Möglichkeiten gibt es Daten zu vergleichen und diese zur Steuerung einzusetzen?
- [ ] Was muss beim Einsatz eines SBCs oder Mikrocontrollers zur fortwährenden Aufnahme von Messdaten beachtet werden?
- [ ] Konfiguration und Inbetriebnahme eines SBCs
- [ ] Auslesen von extern angeschlossenen Sensordaten

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Verarbeitung und entsprechende Aggregierung von Sensordaten
- [ ] Weitergabe der Sensordaten an entsprechende externe Schnittstellen (z.B. ReST)

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Installation eines time-series Datastores
- [ ] Verwendung einer webbasierten, grafischen Anzeige der Sensordaten

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] automatisierte Funktionsüberprüfung
- [ ] Warnmeldung bei Überschreiten von vordefinierten Schwellenwerten

### Kommentare
* Commit-Messages bitte sprechender deklarieren!
* Für EK bitte zum Abgabegespräch melden!
* Dokumentation stellenweise sehr oberflächlich
* SBC Doku zwecks Start einfach verlinken
* Protokoll-Unterschiede besser zur Auswahl klarstellen
* Protokoll-Informationen (Länge, Übertragungsgeschwindigkeit, Anzahl der TN, etc.) sehr mager
* Recherche verbesserungswürdig
* try-catch Exceptionhandling nicht verwendet
* try-catch Exceptionhandling auf Aufgaben aufteilen!
* Aggregierung bitte noch erläutern
* Threshold extern festlegen
* venv verwenden
* `requirements.txt` klar definieren (stick to the rules!)
* Keine gesamten Listings ins README/Protokoll -> besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* Sources bitte nicht im Hauptverzeichnis von Repository ablegen
* Quellen nach IEEE referenzieren
* Quellen nach IEEE referenzieren und auch die Zitate entsprechend kennzeichnen (Copy+Paste muss kursiv und unter Anführungszeichen gestellt werden, sonst Plagiat!)
* Quellen aus dem SYT-Theorie Kurs helfen bei einer ausschließlich theoretischen Abarbeitung der Übung

