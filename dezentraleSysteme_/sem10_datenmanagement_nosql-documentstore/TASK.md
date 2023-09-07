# Datenmanagement *NoSQL Documentstore* - Taskdescription

## Einführung
Diese Übung soll die Verwendung eines Document-Stores mittels Couchbase dokumentieren und möglichen Anwendungsgebiete identifizieren.

## Ziele
Das Ziel dieser Übung ist die Installation und Verwendung einer NoSQL Implementierung eines Documentstores. Als Beispiel wurde aus Gründen der einfachen Synchronisationsverwaltung Couchbase gewählt. Dabei sollen nach der Installation aus einer gängigen Programmiersprache einfache CRUD Befehle ausgeführt werden.

## Voraussetzungen
* Grundlagen einer höheren Programmiersprache
* Grundlagen über NoSQL-Datenbanken
* Grundlegendes Verständnis über Entwicklungs- und Simulationsumgebungen
* Verständnis von SDKs und deren Einbindung

## Aufgabenstellung
Es soll der neueste Couchbase Community Server installiert bzw. in einer eigenen Instanz lauffähig zur Verfügung gestellt werden. Dabei ist zu beachten, dass durch die Verwendung einer "öffentlichen IP-Adresse" eine verteilte Architektur möglich gemacht wird.

Im Anschluss ist die Verwendung einer höheren Programmiersprache zur Verbindung mit Couchbase zu dokumentieren. Dabei sollen grundlegende CRUD-Befehle getestet werden. Auch hier soll eine einfache Erweiterungsmöglichkeit bedacht werden, um gleichzeitige Zugriffe auf die Datenstrukturen zu ermöglichen.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
### Grundanforderungen **zur Gänze erfüllt**
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Beschreibung der Installation und Bereitstellung der Couchbase Instanz
- [ ] Recherche und Dokumentation der grundlegenden Funktionsweise von Couchbase
- [ ] Dokumentation der Cluster-Funktionalität
- [ ] Implementierung und Dokumentation der CRUD Funktionen
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] verteiltes Deployment der SDK-Implementierung
- [ ] Implementierung eines Prototypen zur Veranschaulichung eines Hochverfügbarkeits-UseCases
- [ ] System global erreichbar

## Quellen
* [Couchbase](https://www.couchbase.com/downloads?family=Server)
