# Distributed Computing "*Mobile Synchronisation*" - Taskdescription

## Einführung
Diese Übung soll die möglichen Synchronisationsmechanismen bei mobilen Applikationen aufzeigen.

## Ziele
Das Ziel dieser Übung ist eine Anbindung einer mobilen Applikation an ein Webservices zur gleichzeitigen Bearbeitung von bereitgestellten Informationen.

## Voraussetzungen
* Grundlagen einer höheren Programmiersprache
* Grundlagen über Synchronisation und Replikation
* Grundlegendes Verständnis über Entwicklungs- und Simulationsumgebungen
* Verständnis von Webservices

## Detailierte Ausgabenbeschreibung
Es ist eine mobile Anwendung zu implementieren, die einen Informationsabgleich von verschiedenen Clients ermöglicht. Dabei ist ein synchronisierter Zugriff zu realisieren. Als Beispielimplementierung soll eine "Taskliste" gewählt werden. Dabei soll sichergestellt werden, dass die Information auch im Offline-Modus abgerufen werden kann, zum Beispiel durch eine lokale Client-Datenbank.

Es ist freigestellt, welche mobile Implementierungsumgebung dafür gewählt wird. Wichtig ist dabei die Dokumentation der Vorgehensweise und des Designs. Es empfiehlt sich, die im Unterricht vorgestellten Methoden sowie Argumente (pros/cons) für das Design zu dokumentieren.

**Grundanforderungen**
- Task erstellen
- Task starten und beenden
- Tags erstellen und Tasks zuordnen
- Tasks pausieren
- nur einen aktiven Task zulassen

**Erweiterungen**
- Gesamtzeit seiner persönlichen Tasks anzeigen lassen
- Nach Tags sortieren und filtern
- Gesamtzeiten nach Tag, Woche, Monat, Jahr und Tags gruppieren
- Gruppenzeit (über Tags) anzeigen und entsprechend ausgeben, wer wieviel Zeit investiert hat

## Bewertung
Gruppengrösse: 2 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Beschreibung des Synchronisationsansatzes und Design der gewählten Architektur (Interaktion, Datenhaltung)
- [ ] Recherche möglicher Systeme bzw. Frameworks zur Synchronisation und Replikation der Daten
- [ ] Dokumentation der gewählten Schnittstellen
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung der gewählten Umgebung auf lokalem System
- [ ] Überprüfung der funktionalen Anforderungen zur Erstellung und Synchronisation der Datensätze
- [ ] funktionale Implementierung
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Implementierung eines Replikationsansatzes zur Konsistenzwahrung
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Offline-Verfügbarkeit
- [ ] System global erreichbar

## Quellen
* [Firebase](https://firebase.google.com/docs/database/)
* [Android Studio](https://developer.android.com/studio/)
