# Distributed Computing "*Datamanagement - Synchronisation*" - Taskdescription

## Einführung
Diese Übung soll die möglichen Synchronisationsmechanismen und Konsistenzproblematiken bei verteilten Applikationen aufzeigen.

## Ziele
Das Ziel dieser Übung ist eine Anbindung einer Applikation an ein Webservices zur gleichzeitigen Bearbeitung von bereitgestellten Informationen.

## Voraussetzungen
* Grundlagen einer höheren Programmiersprache
* Grundlagen über Synchronisation und Replikation
* Grundlegendes Verständnis über Entwicklungs- und Simulationsumgebungen
* Verständnis von Webservices

## Detailierte Ausgabenbeschreibung
Es ist eine dezentrale Anwendung zu implementieren, die einen Informationsabgleich von verschiedenen Clients ermöglicht. Dabei ist ein synchronisierter Zugriff zu realisieren. Als Beispielimplementierung soll eine "Einkaufsliste" gewählt werden. Dabei soll sichergestellt werden, dass die Information auch im Offline-Modus abgerufen werden kann, zum Beispiel durch eine lokale Client-Datenbank.

Es ist freigestellt, welche Implementierungsumgebung dafür gewählt wird. Wichtig ist dabei die Dokumentation der Vorgehensweise und des Designs. Es empfiehlt sich, die im Unterricht vorgestellten Methoden sowie Argumente (pros/cons) für das Design zu dokumentieren.

Die theoretische Dokumentation ist als LaTeX-Protokoll zu realisieren und im Repository abzulegen. Das Markdown [Readme](README.md) soll die notwendigen Ausführungsbeschreibungen enthalten, um die Implementierung starten und testen zu können.

**Grundanforderungen**
- Artikel erstellen (Name und Menge)
- Artikel als gekauft kennzeichnen
- Artikel editieren und löschen

**Erweiterungen**
- Einkaufsliste offline editieren
- Gruppierung von Artikeln (mehrere Listen, z.B. "Bauhaus" und "Supermarkt")

## Bewertung
Gruppengrösse: 2-3 Personen
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
- [ ] Testfälle mit Testframework automatisiert überprüfbar
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Offline-Verfügbarkeit
- [ ] System global erreichbar

### Classroom Repository
[Hier](https://classroom.github.com/g/filjznW3) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Quellen
* [Firebase](https://firebase.google.com/docs/database/)
* [diffsync "Enables real-time collaborative editing of arbitrary JSON objects"](https://github.com/janmonschke/diffsync)
