# Dezentrale Systeme "*Mobile Application*" - Taskdescription

## Einführung
Bei dieser Übung sollen mögliche Synchronisationsmechanismen für mobile Applikationen zur Anwendung kommen.

## Ziele
Das Ziel dieser Übung ist eine Anbindung einer mobilen Applikation an ein Webservices zur gleichzeitigen Bearbeitung von bereitgestellten Informationen. Es ist eine Einkaufsliste als Business-Case definiert. Das Webservice kann zentral oder auch mittels einer Peer2Peer-Implementierung realisiert werden.

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
Es ist eine mobile Einkaufsliste zu implementieren, die einen Informationsabgleich von verschiedenen Clients ermöglicht. Dabei ist ein synchronisierter Zugriff zu realisieren. Dabei soll sichergestellt werden, dass die Information auch im Offline-Modus abgerufen werden kann, zum Beispiel durch eine lokale Client-Datenbank. Die Erkennung von Konflikten und die aktive Synchronisierung ist dabei verpflichtend umzusetzen.

Es ist freigestellt, welche mobile Implementierungsumgebung dafür gewählt wird. Wichtig ist dabei die Dokumentation der Vorgehensweise, des Designs und des Technoligie-Stacks. Es empfiehlt sich, die im Unterricht vorgestellten Methoden sowie Argumente (pros/cons) für das Design und die Architektur zu dokumentieren.

Die Bewertung des Beispiels erfolgt wöchentlich, um eine kontinuierliche Entwicklung sicherzustellen. Die einzelnen Abgabekriterien werden in weiterer Folge entsprechend definiert.

## Abgabe
Die Userstories müssen in **STORIES.md** zusammengefasst sein. Die eigentliche Taskzuordnung ist mit entsprechenden Tools (Issues) zu administrieren. Hierfür bietet sich die Toolchain von Github an.

Im Repository soll das `README.md` die notwendigen Schritte beschreiben. Bitte die Binaries und Class-Files in das `.gitignore` eintragen, sodass keine irrtümliche Abgabe erfolgt (besonders das `node-modules` Verzeichnis). Die Source-Code Files sollen getrennt abgelegt werden. Jegliche Änderungen müssen im `CHANGELOG.md` dokumentiert werden.

Es soll eine technische Dokumentation erstellt werden, welche Hintergründe und Umsetzungsentscheidungen festhalten muss. Diese ist in dem Verzeichnis `Documentation` in entsprechenden Markdown-Files zu führen und soll auf Moodle regelmäßig als Link im Kommentarfeld aktualisiert werden. Es müssen dabei Bilder und Zusatzinformationen als Assets abgespeichert werden.

Bei der Verwendung von KI-Tools müssen die Prompts im Verzeichnis `prompts/` als Markdown-Files exportiert werden. Hier soll darauf geachtet werden, dass die Anfrage als auch die Quellen der Antworten ersichtlich sind.

### Classroom Repository
[Hier](https://classroom.github.com/a/qVk-mcoW) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Bewertung
Gruppengrösse: 4(5) Personen
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
* "About task lists" [github](https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/about-task-lists)
* "Git Commit Good Practice" [openstack](https://wiki.openstack.org/wiki/GitCommitMessages#Examples_of_good_practice)
* "How to write Git-Commit-Messages" [elearning](https://elearning.tgm.ac.at/mod/page/view.php?id=3508)

* "End-to-End Testing with Cypress.io" [online](https://docs.cypress.io/app/end-to-end-testing/writing-your-first-end-to-end-test)
* "Writing tests with Playwright" [online](https://playwright.dev/docs/writing-tests)

---
**Version** *20260130v8*
