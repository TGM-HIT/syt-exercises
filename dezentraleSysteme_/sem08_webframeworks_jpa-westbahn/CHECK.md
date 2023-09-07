# Distributed Computing "Komponentenbasierte Programmierung" - Abgabecheck

### Getting newest changes and generate Report

```bash
python ~/bin/getRepositoriesByAssigment.py -a syt4-gek832-jpa-westbahn
python ~/bin/assignmentGradeReport.py -a syt4-gek832-jpa-westbahn -t ~/repositories/tgm_/tools/assignments/report-templates/overview.xhtml
```

### Check the implementation

```bash
gradle clean run
gradle test

gradle idea
idea .

gedit `find | grep "^./src.*\.java$" & find | grep "^./src.*\.xml$"` &
```

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Was ist ORM und wie kommt dabei JPA zum Einsatz?
- [ ] Welche Vorteile bietet die komponentenbasierte Implementierung in einer Webapplikation?
- [ ] Was ist die PersistenceUnit und wo wird diese definiert?
- [ ] Wozu dient die application.properties und wo muss diese abgelegt werden?
- [ ] Welche Annotationen kommen häufig bei Entitätstypen zum Einsatz? Welche Eckpunkte müssen beachtet werden?
- [ ] Wie ruft man in JavaSE den EntityManager auf?
- [ ] Welche Methoden benötigt man für CRUD und worauf muss man dabei achten?
- [ ] Dokumentation und Beschreibung der angewendeten Schnittstelle

### Grundanforderungen **zur Gänze erfüllt**
- [ ] `gradle clean run` mit sprechenden Output ausführbar
- [ ] Annotationen zur Persistierung in den Klassen definiert
- [ ] UML richtig umgesetzt
- [ ] **Reservierung** in `.xml` definiert

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Finde alle Reservierungen für einen bestimmten Benutzer, der durch die eMail-Adresse definiert wird
- [ ] Liste alle Benutzer auf, die eine Monatskarte besitzen
- [ ] Liste alle Tickets für eine bestimmte Strecke aus (durch Anfangs- und Endbahnhof definiert), wo keine Reservierungen durchgeführt wurden
- [ ] Abfragen testen

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Constraints / Valididierung definiert und getestet in `task03()`
- [ ] Zug und Strecke können nicht denselben Start- und Endbahnhof besitzen
- [ ] Die eMail des Benutzers soll ein gängiges eMail-Pattern befolgen.
- [ ] Die Startzeit eines Sonderangebotes kann nicht in der Vergangenheit liegen.
- [ ] Der Name eines Bahnhofs darf nicht kürzer als zwei und nicht länger als 150 Zeichen sein. Sonderzeichen sind bis auf den Bindestrich zu unterbinden
- [ ] Ausreichende Testobjekte zur Validierung der Persistierung
- [ ] Überprüfung der funktionalen Anforderungen mittels Regressionstests

### Kommentare
* bitte sprechendere Commit-Messages verwenden!
* Recherche teilweise sehr oberflächlich
* Exception beim Ausführen (`/META-INF/reservierung.xml` wäre besser gewesen!)
* Transient nicht verstanden!
* Wieso ist `@Transient` außerhalb deiner Tabelle?
* Bitte doublettenlose Collections verwenden, keine Arrays!
* getter/setter fehlen!
* @Column hinterfragen!
* Debug Output in finaler Abgabe entfernen!
* Inheritance-Auswahl bei Ticket nicht beschrieben!
* gesamtPraemienMeilen als derived fehlt!
* Deployment bitte immer einfach gestalten -Wieso MySQL? H2 filebased ist viel einfacher zu testen!
* Keine gesamten Listings ins README - besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* mehr Beispiel-Objekte zum Testen verwenden!

* Bitte für EK zum Abgabegespräch melden!
* Die Constraints/Validierung wäre sehr einfach gewesen mit z.B.** @Future** und **@Email**
* README muss nicht komplette Elemente enthalten, sondern wie auch schon angedacht nur Snippets und die Beschreibung der Vorgehensweise!
* Bitte sich an die IEEE-Zitierregeln halten! Resources am Ende des Dokuments!
* Die Informationen, die du für die persistenceUnit und die properties dokumentiert hast, wird dir nur bedingt helfen bei der Implementierung!
* Unübersichtliche Aufteilung der Beschreibung von JPA/Hibernate Infos
* ClassReserv.hbm.xml bitte nur Reservierung... nennen!
* Bei einer vorhandenen Build-Umgebung (gradle) bitte nicht eigenhändig auf mvn deprecaten!
* Anpassung der Packagestruktur ist suboptimal
* enum überdenken!
* hashCode / equals sollten zur eindeutigen Identifizierung angedacht werden

