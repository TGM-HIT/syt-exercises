# Abgabe Uebungsblatt 2.2.1 - 2.2.3

## Grundlegende Kompetenzen (#16)
- [ ] Wofür dient das ``tar`` Kommando grundsätzlich? Welchen Effekt besitzen die Optionen ``-c -v -f`` und ``-t``.
- [ ] Wozu dienen die Kommandos ``gzip`` und ``gunzip `` und wie verwendet man sie?
- [ ] Wozu dienen die Kommandos ``bzip2`` und ``bunzip2`` und wie verwendet man sie?
- [ ] Wozu dienen die Kommandos ``zip`` und ``unzip`` und wie verwendet man sie?
- [ ] Lade eine Textdatei von [textfiles.com](http://www.textfiles.com/directory.html) herunter und komprimiere sie mit allen vier Verfahren (tar,gzip,bzip2 und zip). Wähle dafür eine etwas größere Datei aus.
- [ ] Führe denselben Arbeitsschritt nun mit einer selbsgewählten (größeren).jpg-Datei durch.
- [ ] Vergleiche die verschiedenen Größen der Archive. Welches Verfahren komprimiert am besten, welches am schlechtesten? Wie lassen sich die Dateien wieder entpacken?
- [ ] Beschreibe die Verwendung der drei vordefinierten I/O-Channels **stdout**, **stderr** und **stdin**.
- [ ] Erkläre die Funktion der Operatoren ``>`` und ``>>`` auf der Kommandozeile.
- [ ] Erkläre die Funktion des Operatoren ``2>`` und gib ein Anwendungsbeispiel an.
- [ ] Beschreibe die Funktionweise von sowie den Unterschied zwischen den Operatoren ``|`` und ``<``.
- [ ] Wann hängt man an ein Kommando üblicherweise ``| more`` an und welchen Effekt hat das?
- [ ] Wie beendet man den ``vi`` Editor?
- [ ] Erstelle mit einem beliebigen Texteditor auf der Kommandozeile eine Textdatei namens ``skript.sh``, die mit ``#!/bin/sh`` beginnt, und weiters die Zeile ``echo "Hallo Welt"`` beinhaltet.
- [ ] Lässt sich diese Datei ohne Weiteres mit ``$ ./skript.sh`` ausführen? Warum nicht, bzw. was musst du dafür ändern?
- [ ] Was musst du tun, damit das Skript auch mit ``$ skript.sh``, d.h. ohne Vezeichnisangabe, ausführbar ist?

## Erweiterte Kompetenzen (#9)
- [ ] Wie kann man mittels ``find`` alle **.jpg**-Dateien finden, die unter ``/home`` liegen?
- [ ] Wie kann man die vorige Suche case-insensitive machen?
- [ ] Verwende ``cut`` um aus einem erweiterten Directory Listing (``ls -l``) den Owner der Datei anzuzeigen.
- [ ] Gib aufbauend auf dem vorigen Beispiel alle jene Benutzer aus, denen eine oder mehrere Dateien im aktuellen Verzeichnis gehört. (Hint: ``uniq``)
- [ ] Erkläre, wofür man reguläre Ausdrücke verwendet, gib drei (nichttriviale) an und erkläre deren Funktionsweise.
- [ ] Erkläre die Verwendung von ``grep`` und demonstriere den Effekt und die Verwendung der Switches ``-e -v -r`` an.
- [ ] Erzeuge mittels ``du -sch /usr/lib`` eine Liste aller Einträge unter ``/usr/lib``. Filtere mittels ``grep`` daraus alle Einträge zwischen 10 und 99 MB heraus.
- [ ] Erkläre, wofür man das ``test``-Kommando verwendet und welche Abkürzung es dafür gibt.
- [ ] Erstelle ein Skript, das einen Usernamen einliest und ausgibt, ob dieser User eine Datei unter ``/tmp`` besitzt.

## Bewertungskommentare
