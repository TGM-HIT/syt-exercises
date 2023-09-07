# Distributed Computing "*Datamanagement - Synchronized Pomodoro*" - Taskdescription

## Einführung
Diese Übung soll die möglichen Synchronisationsmechanismen und Konsistenzproblematiken bei verteilten Applikationen aufzeigen.

## Ziele
Das Ziel dieser Übung ist eine Anbindung einer Applikation an ein Webservices zur gleichzeitigen Bearbeitung von bereitgestellten Informationen.  

Die Übung wird im  Theorieunterricht besprochen und vorgezeigt. Die vorgestellten  Teilimplementierungen können so zu einem Ganzen zusammengefasst werden.

## Voraussetzungen
* Grundlagen einer höheren Programmiersprache
* Grundlagen über Synchronisation und Replikation
* Grundlegendes Verständnis über Entwicklungs- und Simulationsumgebungen
* Verständnis von Webservices

## Detailierte Ausgabenbeschreibung
Es ist eine dezentrale Anwendung zu implementieren, die einen Informationsabgleich von verschiedenen Clients ermöglicht. Dabei ist ein synchronisierter Zugriff zu realisieren. Als Beispielimplementierung soll ein "Pomodoro-Timer" gewählt werden. Dabei soll sichergestellt werden, dass die Information auch im Offline-Modus abgerufen werden kann, zum Beispiel durch eine lokale Client-Datenbank. Der Endpunkt soll für **alle** Clients die gleichen Informationen anzeigen (collaborative).

Es ist freigestellt, welche Implementierungsumgebung dafür gewählt wird. Wichtig ist dabei die Dokumentation der Vorgehensweise und des Designs. Es empfiehlt sich, die im Unterricht vorgestellten Methoden sowie Argumente (pros/cons) für das Design zu dokumentieren.

Die theoretische Dokumentation ist als LaTeX-Protokoll zu realisieren und im Repository abzulegen. Das Markdown [Readme](README.md) soll die notwendigen Ausführungsbeschreibungen enthalten, um die Implementierung starten und testen zu können.

**Grundanforderungen**

- Timer definieren (default: 25 min)
- Timer starten / pausieren / reseten

**Erweiterungen**

- Pomodoro / kurze Pause / lange Pause entsprechend verketten
- Pomodori loggen
- Authentifizierung

## Bewertung
Gruppengrösse: 2-3 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Beschreibung des Synchronisationsansatzes und Design der gewählten Architektur (Interaktion, Datenhaltung)
- [ ] Recherche möglicher Systeme bzw. Frameworks zur Synchronisation und Replikation der Daten
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung der gewählten Umgebung auf lokalem System
- [ ] Dokumentation der gewählten Schnittstellen
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Implementierung eines Replikationsansatzes zur Konsistenzwahrung
- [ ] Überprüfung der funktionalen Anforderungen zur Erstellung und Synchronisation der Datensätze
- [ ] funktionale Implementierung
- [ ] Offline-Verfügbarkeit
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Testfälle mit Testframework automatisiert überprüfbar
- [ ] System global erreichbar
- [ ] Authentifizierung

### Classroom Repository
[Hier](https://classroom.github.com/g/5rm-E-kY) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Quellen
* [Firebase](https://firebase.google.com/docs/database/)
* [diffsync "Enables real-time collaborative editing of arbitrary JSON objects"](https://github.com/janmonschke/diffsync)
* [Pomodoro Technik](https://youtu.be/VFW3Ld7JO0w)
* [Heroku - PaaS](https://www.heroku.com/)
