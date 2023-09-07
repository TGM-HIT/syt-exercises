# Distributed Computing "*RMI Task Loadbalancer*" - Abgabecheck

### Getting newest changes and generate Report

```bash
python ~/bin/getRepositoriesByAssigment.py -a syt4-gk833-rmi-taskloadbalancer
python ~/bin/assignmentGradeReport.py -a syt4-gk833-rmi-taskloadbalancer -t ~/repositories/tgm_/tools/assignments/report-templates/overview.xhtml
```

### Check the implementation

```bash
gradle clean engine
gradle compute
gradle compute --args="localhost 1234"
gradle compute --args="localhost Fibonacci 123456"
cat build.gradle

gradle computeFibonacci --args="localhost 123456"

gedit `find | grep "^./src.*\.java$" & find | grep "^./src.*\.xml$"` &

```

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Was ist RMI und welches Prinzip der verteilten Programmierung kommt dabei zur Anwendung?
- [ ] Was sind Stubs? Welche Aufgabe hat dabei das Proxy-Objekt?
- [ ] Was wird in der Registry gespeichert?
- [ ] Wie kommt das Remote-Interface zum Einsatz? Was ist bei der Definition von Methoden zu beachten?
- [ ] Was ist bei der Weitergabe von Objekten unabdingbar?
- [ ] Welche Methoden des UnicastRemoteObject kommen bei der Server-Implementierung zum Einsatz?
- [ ] Wie kann der Server ein sauberes Schließen ermöglichen? Was muss mit dem exportierten Objekt geschehen?
- [ ] Ausführbarkeit in README.md dokumentiert
- [ ] java.policy dokumentiert
- [ ] Java RMI-Tutorial um "sauberes Schließen" erweitern (try-catch-finally)
- [ ] Aufruf `gradle engine` ausführbar
- [ ] Aufruf `gradle compute --args="localhost 1234"` ausführbar
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung eines neuen Tasks (z.B. Fibonacci)
- [ ] Implementierung eines Loadbalancer-Interfaces (register/unregister)
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Client-Loadbalancer-Server-Verbindungen über mehrere Rechner hinweg lauffähig (z.B. mittels Portweiterleitung)
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Überlegungen zum Design und mögliche Implementierung weiterer Loadbalancing-Methoden (Weighted Distribution oder Least Connections)

### Kommentare
* Commit-Messages überdenken!
* What does Serializable mean?
* Überlauf bei Fibonacci!
* Debug Output in finaler Abgabe entfernen!
* ExceptionHandling beachten!
* Keine gesamten Listings ins README/Protokoll -> besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* IP Adresse nicht in Code hardcoden - Properties-File verwenden
* IEEE Citation Standard beachten!

