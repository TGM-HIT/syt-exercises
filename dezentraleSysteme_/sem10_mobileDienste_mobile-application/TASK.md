# Dezentrale Systeme "*Mobile Application*" - Taskdescription

## Einführung
Bei dieser Übung sollen mögliche Synchronisationsmechanismen für mobile Applikationen zur Anwendung kommen.

## Ziele
Das Ziel dieser Übung ist eine Anbindung einer mobilen Applikation an ein Webservices zur gleichzeitigen Bearbeitung von bereitgestellten Informationen. Es ist freigestellt welchen Use-Case man wählt, jedoch ist eine Chat-Applikation bzw. eine Einkaufsliste als Use-Case empfehlenswert. Das Webservice kann zentral oder auch mittels einer Peer2Peer-Implementierung realisiert werden.

Ein weiteres, wichtiges Ziel ist es, die persönliche Umsetzung einer mobilen Applikation als Grundlage für zukünftige Projekte. Hierbei sollen wichtige Fertigkeiten erprobt werden, um mögliche Ideen selbständig umsetzen zu können. Der Zusammenschluss von unterschiedlichen Gruppenmitgliedern ist dabei als förderlicher Nebenaspekt zu berücksichtigen.

## Kompetenzzuordnung
**GK SYT10 Dezentrale Systeme | Mobile Dienste | verteilte Applikation**  
* "ein dezentrales System für mobile Dienste implementieren"

**EK SYT10 Dezentrale Systeme | Mobile Dienste | verteilte Applikation**  
* "asynchrone sowie peer-basierte mobile Applikationen entwerfen und implementieren"
* "heterogene Services zur automatisierten Verarbeitung und Problemanalyse einsetzen"

## Voraussetzungen
* Grundlagen einer höheren Programmiersprache
* Grundlagen über Synchronisation und Replikation
* Grundlegendes Verständnis über Entwicklungs- und Simulationsumgebungen
* Verständnis von Webservices

## Detailierte Ausgabenbeschreibung
Es ist eine mobile Anwendung zu implementieren, die einen Informationsabgleich von verschiedenen Clients ermöglicht. Dabei ist ein synchronisierter Zugriff zu realisieren. Dabei soll sichergestellt werden, dass die Information auch im Offline-Modus abgerufen werden kann, zum Beispiel durch eine lokale Client-Datenbank.

Es ist freigestellt, welche mobile Implementierungsumgebung dafür gewählt wird. Wichtig ist dabei die Dokumentation der Vorgehensweise und des Designs. Es empfiehlt sich, die im Unterricht vorgestellten Methoden sowie Argumente (pros/cons) für das Design zu dokumentieren.

Es ist freigestellt, welche Use-Cases dafür gewählt wird. Wichtig ist dabei die Dokumentation der Vorgehensweise und des Designs.

Die Bewertung des Beispiels erfolgt wöchentlich, um eine kontinuierliche Entwicklung sicherzustellen. Die einzelnen Abgabekriterien werden in weiterer Folge entsprechend definiert.

## Abgabe
Die Userstories müssen in **STORIES.md** zusammengefasst sein. Die eigentliche Taskzuordnung ist mit entsprechenden Tools (Issues) leichter zu administrieren.

Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Implementierungen müssen entsprechend beschrieben und leicht deployable sein!

Es soll ein Protokoll erstellt werden, welches technische Hintergründe und Umsetzungsentscheidungen festhalten muss. Dieses ist in LaTeX (Protokollrichtlinien bzw. Template beachten) zu führen und soll auf Moodle regelmäßig als **Protokoll.pdf** abgegeben werden.

### Classroom Repository
[Hier](https://classroom.github.com/g/BmCf93m0) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Bewertung
Gruppengrösse: 3-4 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Definition der Userstories (ID, Story, Points, Priority, Head)
- [ ] Einrichtung der Entwicklungsumgebung (IDE, SW-Dev-Tools, Deployment, etc.)
- [ ] Beschreibung des Synchronisationsansatzes und Design der gewählten Architektur (Interaktion, Datenhaltung)
- [ ] Beschreibung der gewählten Systeme bzw. Frameworks zur Synchronisation und Replikation der Daten
- [ ] Dokumentation der gewählten Schnittstellen
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung der gewählten Umgebung auf lokalem System
- [ ] Überprüfung der funktionalen Anforderungen zur Erstellung und Synchronisation der Datensätze
- [ ] funktionale Implementierung der must-have Userstories
- [ ] Offline-Verfügbarkeit
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Implementierung eines Replikationsansatzes zur Konsistenzwahrung
- [ ] funktionale Implementierung aller should-have Userstories
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] System global erreichbar
- [ ] funktionale Implementierung von nice-2-have Userstories


## Quellen
* [1] "Creating a Vue Application" vuejs.org [online](https://vuejs.org/guide/essentials/application.html)
* [2] "Introducing Couchbase Lite" couchbase [online](https://docs.couchbase.com/couchbase-lite/current/index.html)
* [3] "Shopping Lists" borko.at [online](https://shopping.borko.at/)

---
**Version** *20230303v3*
