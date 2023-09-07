# Abgabe Uebungsblatt 2.1.3 - 2.1.5

## Grundlegende Kompetenzen (#18)
### Modul 2.1.3 Benutzer und Berechtigungen
- [ ] Gib den deinem Benutzer entsprechenden Eintrag aus deiner/etc/passwd- Datei an (bzw.aus deiner VM) und erkläre die Funktion der einzelnen Felder.
- [ ] Gib alle Gruppen an, denen dein aktueller Benutzer zugeordnet ist.
- [ ] Was ist der Unterschied zwischen den Kommandos ``sudo`` und ``su``?
- [ ] Wie kann man Benutzern die Berechtigungen geben, ``sudo`` auszuführen?
- [ ] Was behinhaltet die Datei ``/etc/shadow``?
### Modul 2.1.4 Dateiberechtigungen unter Linux
- [ ] Erstelle eine Liste der im Modul vorkommenden Kommandos inklusive einer kurzen Beschreibung.
- [ ] Erkläre was man unter der *UID* und *GID* eines Benutzers versteht. Welche *UID* bzw. *GID* hatdein aktueller Benutzer (zB. in der VM)?
- [ ] Welchen Gruppen gehört dein Benutzer (in der VM) an?
- [ ] Erkläre (kurz) die wichtigsten Ausgaben des ``stat``-Kommandos.
- [ ] Erstelle eine Dokumentation und erkläre die einzelnen Elemente der Dateiberechtigungen unter Linux, wie sie von ``stat`` oder ``ls -l`` ausgegeben werden.
- [ ] Erstelle darunter eine Tabelle, die beschreibt, welche Auswirkungen die Berechtigungen r, w und x für Dateien bzw. Verzeichnisse besitzen.
- [ ] Erstelle eine neue Datei mit ``touch``, zeige dir mit ``ls -l`` die Berechtigungen an. Was bedeuten sie?
- [ ] Ändere die Permissions dieser Datei mittels ``chmod`` nun so, dass du (der Owner) die Dateilesen und schreiben darfst, deine Gruppe nur schreiben und andere Benutzer gar keinen Zugriff auf die Datei haben.
- [ ] Erstelle ein Verzeichnis und gib die entsprechenden Berechtigungen, dass du (der Owner) alle Berechtigungen auf dieses Verzeichnis hast, Mitglieder deine Gruppe Dateien bearbeiten, aber keine neuen anlegen dürfen und andere Benutzer nur die Dateinamen sehen aber keinen weiteren Zugriff haben.
- [ ] Erstelle ein Verzeichnis mit zwei beliebgigen Dateien und den Berechtigungen ``dr––––``. Welche Ausgabe gibt dir ``ls -l verzeichnisname/``?
### Modul 2.1.5 Der Verzeichnisbaum, spezielle Berechtigungen und Links
- [ ] Erstelle eine Tabelle mit den folgenden Verzeichnisnamen und einer kurzen Beschreibung,welche Dateien sich darin befinden: ``/, /bin, /dev, /etc, /mnt, /root, /home, /var, /tmp, /sys``
- [ ] In welchen Verzeichnissen finden sich üblicherweise ausführbare Binärdateien?
- [ ] Welche Dateien/Unterverzeichnisse finden sich bei dir unter ``/var/log``. Was beinhalten Sie?

## Erweiterte Kompetenzen (#8)
### Modul 2.1.4 Dateiberechtigungen unter Linux
- [ ] Wofür verwendet man das ``umask``-Kommando?
- [ ] Erkläre wie ``umask`` funktioniert. Was bewirkt eine umask von ``066``?

### Modul 2.1.5 Der Verzeichnisbaum, spezielle Berechtigungen und Links
- [ ] Was bewirkt die ``setuid``-Berechtigung bei einer Datei und wie wird sie gesetzt?
- [ ] Erkläre in eigenen Worten, warum ``passwd`` diese Berechtigung benötigt.
- [ ] Welche Berechtigungen besitzt das ``sudo``-binary auf deinem System? Erkläre warum.
- [ ] Was bewirkt die ``setgid``-Permission bei Vezeichnissen?
- [ ] Erkläre, wie *hard links* bzw. *symbolic links* angelegt werden.
- [ ] Erkläre den Unterschied zwischen *hard links* und *symbolic links*.

## Kommentare
* Synopsis / Usage nicht ganz verstanden
* Selbständig auch die man-page andenken
* `--help` vor der Ausführung starten
* Dateistruktur noch einmal analysieren

