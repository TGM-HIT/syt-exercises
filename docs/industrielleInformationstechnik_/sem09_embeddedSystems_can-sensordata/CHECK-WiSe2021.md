# Embedded Devices "Sensordaten im industriellen Einsatz" - Checkliste

## Bewertung
Gruppengrösse: 1 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Welche Übertragungsreichweiten und Geschwindigkeiten kommen beim CAN-Bus zum Einsatz?
- [ ] Wieviele Teilnehmer können dabei miteinander kommunizieren?
- [ ] Welche Möglichkeiten des einfachen Deployments bieten sich an, wenn verschiedene Services zur Darstellung von Sensordaten miteinander agieren sollen?
- [ ] Wie können Grenzwerte definiert werden, die zur Steuerung bzw. Notifikation herangezogen werden?

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Ausführbarkeit in README.md dokumentiert
- [ ] Konfiguration und Inbetriebnahme eines SBCs
- [ ] Auslesen von extern angeschlossenen Sensordaten
- [ ] Verarbeitung und entsprechende Aggregierung von Sensordaten

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Installation eines time-series Datastores
- [ ] Verwendung einer webbasierten, grafischen Anzeige der Sensordaten
- [ ] Weitergabe der Sensordaten an entsprechende externe Schnittstellen (z.B. ReST)

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] automatisierte Funktionsüberprüfung
- [ ] Recherche und Umsetzungsbeispiel der jeweiligen Spezialisierung
- [ ] Konfiguration und Inbetriebnahme eines CAN Busses
- [ ] Warnmeldung bei Überschreiten von vordefinierten Schwellenwerten

### Kommentare
* Für EK bitte zum Abgabegespräch melden!
* Dokumentation stellenweise sehr oberflächlich
* SBC Doku zwecks Start einfach verlinken
* Protokoll-Unterschiede besser zur Auswahl klarstellen
* Recherche bitte verbessern
* try-catch Exceptionhandling nicht verwendet
* Aggregierung bitte noch erläutern
* Threshold extern festlegen
* venv verwenden
* `requirements.txt` klar definieren (stick to the rules!)
* Keine gesamten Listings ins README/Protokoll -> besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* eingefügte Bilder bitte mit relativen Pfad einbinden (und auch commiten)
* Quellen nach IEEE referenzieren

