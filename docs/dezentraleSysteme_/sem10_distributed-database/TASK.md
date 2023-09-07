# Middleware Engineering "Distributed Database" - Taskdescription

## Einführung
Diese Übung soll helfen die Grundlagen und Funktionsweise von verteilten Datenbanken und deren Entwurf zu verstehen. Das Thema wird mit dem Entwurf von verteilten Datenbanken begonnen und wird weiters mit der Umsetzung einer verteilten Datenbank auf einem lokalen Rechner umgesetzt.

## Ziele
Das Ziel dieser Übung ist eine bestehende lokale Datenbank und deren DB Modell zu analysieren. Danach soll ein Konzept erstellt werden, um diese lokale Datenbank in eine verteilte Datenbank zu transformieren. Im ersten Schritt soll die Verteilung nur lokal anhand von DB Schemata durchgeführt werden.

## Voraussetzungen
* Grundlagen von verteilten Datenbanken
* Installation eines DBMS (Postgres, MySQL)
* SQL Kenntnisse (Laden einer Datenbank, SELECT)

## Aufgabenstellung
Unter Verwendung der Sample Database [Dell DVD Store](http://linux.dell.com/dvdstore/readme.txt) (siehe auch Quellen) soll eine lokale Datenbank in eine verteilte Datenbank transferiert werden. Mit dieser Aufgabe soll die Fragmentierung einer Datenbank durchgeführt werden. Basierend auf einer Tabelle/View des DVD Stores sollen folgende Fragmentierungsarten umgesetzt werden:

* horizontale Fragmentierung nach mindestens 2 Kriterien
* vertikale Fragmentierung
* kombinierte Fragmentierung

Die Fragmente sollen jeweils in einem Schema mit der Bezeichnung

* Schema horizontal
* Schema vertical
* Schema combination

in Tabellen mit sinnvollen Namen gespeichert werden. Die Fragmentierung soll sinnvoll unter selbst definierten Annahmen spezifiziert werden.

Dokumentieren Sie die Arbeitsschritte und die Definition der Fragmente.

Im Anschluss soll zu jeder Fragmentierungsart ein SELECT Statement zum Sammeln aller Daten entworfen werden. Dabei soll gezeigt werden, dass durch die Verteilung keine Datensätze verloren gegangen sind. Verwenden Sie dazu "SELECT count(*) FROM ...."

* Anzahl der Datensätze vor der Fragmentierung
* Anzahl der Datensätze der einzelnen Fragmente
* Anzahl der Datensätze aus dem SELECT statement, das alle Daten wieder zusammenfügt


## Fragestellung für Protokoll
* Was versteht man unter dem Begriff Allokation beim Entwurf einer verteilten Datenbank?
* Beschreiben Sie die Korrektheitsanforderungen bei der Fragementierung von verteilten Datenbanken.
* Wie geht man bei einer horizontalen DB-Fragemtierung vor? Beantworten Sie diese Frage anhand eines Beispiels.
* Die Transparenz von verteilten Datenbanken ist in mehrere Stufen gegliedert. Beschreiben Sie die Lokale-Schema-Transparenz.
* Was versteht man unter dem Begriff Fragmentierung beim Entwurf einer verteilten Datenbank? Wie sieht eine vertikale Fragmentierung aus? Erklären Sie die Begriffe anhand von einem Beispiel.


## Bewertung
Gruppengrösse: 2 Personen
### Grundanforderungen **überwiegend erfüllt**
- [ ] Analyse des bestehenden Datenbankmodells
- [ ] Design und Durchführung einer horizontale Fragmentierung (min. 2 Kriterien)
- [ ] Design und Durchführung einer vertikale Fragmentierung
- [ ] Design und Durchführung einer kombinierte Fragmentierung
### Grundanforderungen **zur Gänze erfüllt**
- [ ] SELECT Statement, um Anzahl der Datensätze vor der Fragmentierung anzuzeigen
- [ ] SELECT Statement zur Anzahl der Datensätze der einzelnen Fragmente
- [ ] Anzahl der Datensätze aus dem SELECT statement, das alle Daten wieder zusammenfügt


## Quellen
* [Grundlagen verteilter Datenbanken](https://elearning.tgm.ac.at/mod/resource/view.php?id=57931)
* [DVD Datastore Readme](http://linux.dell.com/dvdstore/readme.txt)
* [Datafiles](http://linux.dell.com/dvdstore/ds21.tar.gz)
* [Postgresql Structure](http://linux.dell.com/dvdstore/ds21_postgresql.tar.gz)

