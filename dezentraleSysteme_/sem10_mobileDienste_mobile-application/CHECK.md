# "Mobile Application" - Checklist

### Getting newest changes and view generated Report
```bash
python ~/bin/getRepositoriesByAssigment.py -a syt5-gek1033-mobile-application
python ~/bin/assignmentGradeReport.py -a syt5-gek1033-mobile-application -t ~/repositories/tgm_/tools/assignments/report-templates/overview.xhtml
google-chrome-stable syt5-gek1033-mobile-application/report/index.html &
```

### Check the implementation
```bash
gradle clean run
gradle test

gedit `find | grep "^./src.*\.java$" & find | grep "^./src.*\.xml$"` &
```

## Bewertung
Gruppengrösse: 2 Personen
Gruppenmitglieder:
URL: [github]()

### Grundanforderungen **überwiegend erfüllt**
- [ ] Definition der Userstories (ID, Story, Points, Priority, Head)
- [ ] Einrichtung der Entwicklungsumgebung (IDE, SW-Dev-Tools, Deployment, etc.)
- [ ] Beschreibung des Synchronisationsansatzes und Design der gewählten Architektur (Interaktion, Datenhaltung)
- [ ] Beschreibung der gewählten Systeme bzw. Frameworks zur Synchronisation und Replikation der Daten
- [ ] Dokumentation der gewählten Schnittstellen
- [ ] Dokumentation enthält Informationen über angepassten Sourcecode
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung der gewählten Umgebung auf lokalem System
- [ ] Überprüfung der funktionalen Anforderungen zur Erstellung und Synchronisation der Datensätze
- [ ] funktionale Implementierung der must-have Userstories
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Implementierung eines Replikationsansatzes zur Konsistenzwahrung
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Offline-Verfügbarkeit
- [ ] System global erreichbar
- [ ] funktionale Implementierung der should-have Userstories


### Kommentare
- Start nicht beschrieben
- Userstory nicht (thematisch, prioritäts) sortiert
- `flutter run` Devices fehlt
-  Sync auf UseCase hin beleuchten!
- Datastore Informationen noch nicht beschrieben
- API Verwendung und Umsetzung des UseCases nicht beschrieben
- Code-Struktur und Code-Design nicht beschrieben (zweck einfachen Einstiegs)
- Keine Fehlermeldungen (Registrierung, Anmeldung, etc.)
- mindestens 6 Testcases für die Registrierung und Anmeldung

