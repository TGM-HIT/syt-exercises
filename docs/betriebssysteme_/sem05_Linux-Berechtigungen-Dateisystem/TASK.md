# "*Dateioperationen, Struktur und Rechteverwaltung*" - Taskdescription

## Einführung
Mehrbenutzerbetrieb ist in Linux-Systemen nicht die Ausnahme sondern die Regel. Um gemeinsam auf einer Recheneinheit arbeiten zu können ist eine ausgeklügelte Berechtigungsstruktur unabdingbar.

Die Struktur und Architektur des Verzeichnisbaums eines Unix-Systems unterscheidet sich drastisch von einem Windows-System - nicht alles was eingehängt ist, ist auch ein physikalische Speichereinheit.

## Ziele
Das Ziel dieser Übung ist das Erlernen und Umsetzen einfacher Berechtigungsaufgaben. Dabei liegt die Zuordnung von Rechten bei Benutzern und Gruppen im Fokus.

Es wird ebenfalls die Hierarchie und Architektur des Dateisystems analysiert und eine Wiederholung und Vertiefung von Dateioperationen vorgenommen. Neu kommt die Anwendung von Kompressionswerkzeugen hinzu.

Diese Übung soll als Zusammenfassung des zehnten und zwölften Kapitels aus dem Linux-Foundation Kurs ["Introduction to Linux"](https://www.edx.org/course/introduction-to-linux) aufgefasst werden. Eine Schritt-für-Schritt Erarbeitung dieses Kapitels ist für die Übungsdurchführung von Vorteil.

## Kompetenzzuordnung
#### EK SYT5 Betriebssysteme | Linux | Befehle
* "erweiterte Dateisystemoperationen umsetzen"

## Voraussetzungen
* Grundverständnis vom Aufbau eines Betriebssystems
* Einführung in Linux - Kapitel 7 und *optional* Kapitel 8 und 9
* Grundlegende Kenntnisse in der Verwendung der Kommandozeile
* Absolvierung der Übung *"Kommandozeile - Dateien und Verzeichnisse"*

## Detaillierte Aufgabenbeschreibung
Starte deine virtuelle Maschine oder verbinde dich mit einer Konsole auf einen Linux-Rechner. Du kannst auch die grafische Oberfläche deines Linux-Systems nutzen.

### Grundanforderungen

Wir arbeiten in einer sogenannten Shell, die bestimmte Eigenschaften und Funktionen mitbringt, welche ist dies standardmäßig in Xubuntu? Wie können die aktuellen, sessionbasierten Umgebungsvariablen angezeigt werden? Was würde anders sein, wenn man zum Beispiel in die `csh` wechselt?

#### Verzeichnishistorie

Die Befehle `popd` und `pushd` helfen bei der Navigation über mehrere Verzeichnisse. Beschreibe kurz wie der Wechsel funktioniert und wo diese Funktion sehr von Nutzen sein könnte.

Welche andere Art der Visualisierung hilft der leichteren Administration von sehr verzweigten Verzeichnisbäumen? Wie kann dabei die Tiefe eingeschränkt werden? Wie können nur Verzeichnisse ohne die Dateien gefiltert werden?

#### Verlinkungen

Wie können Dateien unabhängig ihrer wahren Identifikation auch von anderen benutzt werden? Wie unterscheiden sich dabei *hard* von *soft links* ? Was ist ein Inode und wie kann diese Identifikation mit dem Befehl `ls` anzeigen?

#### Wer suchet, der findet!

Der Befehl `find` ist ein sehr mächtiger Befehl, wo liegt dabei der Unterschied zu `locate`? Durchsuche das Heimatverzeichnis nach Dateien, die in den letzten fünf Minuten verändert wurden! Welche Option verwendest du? Leite dabei Fehlermeldungen (z.B. Berechtigungsmeldungen) nach `/dev/null` um!

#### Pakete installieren

Jede Distribution hat die Möglichkeit aus einem gewarteten Paketverzeichnis Programme zu installieren. Welche verbreiteten Distributionen verwenden welchen Paket-Manager? Welche verschiedene Levels sind dabei im Einsatz, oder wo ist der Unterschied von `apt` und `dpkg`?

Wie kann man nun den Ort von Befehlen von neu installierten Paketen finden? `dpkg -L apt` liefert zum Beispiel alle Files des Pakets **apt**. Man könnte natürlich die Ausgabe über die Pipe auch mit dem Befehl `grep` einschränken, oder aber man verwendet einen anderen Befehl, der einem sagt **WO** etwas liegt ...

Ein wichtiger Unterschied zu deinem Windows-Betriebssystem wirst du schon bei der letzten Übung festgestellt haben: Die Verzeichnisstruktur enthällt nicht nur eingehängte, physikalische Datenträger sondern auch logische Informationen. Linux unterscheidet dabei unterschiedliche Typen, z.B. `proc` `tmpfs` `configfs` aber auch `ext3` `ext4` und `nfs` (mit dem Befehl `ls /lib/modules/$(uname -r)/kernel/fs/` kann man sich alle unterstützten Filesystem-Typen des laufenden Kernels ansehen). Um alle eingehängten logischen als auch physischen Einheiten aufzulisten verwendet man den Befehl `mount -l`.

Den Befehl `mount` kann man auch mit entsprechenden Optionen und Argumenten verwenden um auch händisch Devices in die Verzeichnisstruktur einzuhängen. Um nicht immer alle Elemente nachsehen zu müssen, sind die wichtigsten Endpunkte in der Konfigurationsdatei `/etc/fstab` aufgelistet. Diese wird auch beim Booten entsprechend beachtet (siehe `man fstab`).

Um Zugriff und Veränderungen von physikalischen Geräten (z.B. USB-Stick, Harddisk, etc.) zu ermöglichen, kann `parted` in der Konsole oder `gparted` auf der grafischen Oberfläche verwendet werden. **ACHTUNG** - Änderungen an Partitionstabellen und Partitionen physikalischer Speichermedien können zu Datenverlust führen - bitte immer zweimal überprüfen, was man da gerade ändert!!!

Nehmt nun einen USB-Stick und mountet diesen in eurem Linux-Gerät! Welches Dateisystem hat euer Stick? Welche Größe und Aufteilung ist konfiguriert? Welchen Einhängepunkt hat euch das System automatisch zugeordnet? Oder habt ihr gar erst das Filesystem nachinstallieren müssen um Zugriff zu erhalten?

#### Dateisystem - Architektur
Durchforstet euer System und beschreibt kurz, was in den folgenden Verzeichnissen vorzufinden ist: `/etc` `/usr/bin` `/sbin` `/proc` `/dev` `/var` `/boot` `/lib` `/lib/modules` `/run/media` `/opt` `/sys` `/tmp`

#### Dateitypen und Inhalte
In Windows erkennt man Dateien meist an ihren Endungen - ein `programm.exe` oder ein `LiesMich.txt` ist durch die Endung als ausführbares Programm oder Textdatei erkennbar. Bei Unix-Systemen ist eine Datei-Endung nicht zwingend notwendig. Der Befehl `file` versucht durch die Anwendung von drei verschiedenen Tests (*filesystem*, *magic* oder *language*) den Typen der Datei zu erkennen. 

Überprüft die Ausgabe von `file` zu eurem laufenden Kernel (Tipp: `/boot/vmlinuz` ist ein guter Startpunkt zur Suche) und folgenden zwei Files: `/usr/bin/ls` und `/etc/resolv.conf`

Welche Informationen konntet ihr hier erhalten?

#### Kompression

Dateien und Verzeichnisse sind leichter zu handhaben, wenn sie zusammengefasst und komprimiert sind. Im Kurs sind die Kompressionsprogramme `gzip`, `bzip2`, `xz` und `zip` angeführt worden. Beschreibe kurz deren Vor- und Nachteile!

Um schnell ein ganzes Verzeichnis zu packen wird auch der Archivierer `tar` oft verwendet, der auch die einzelnen Kompressionsalgorithmen als Argument akzeptiert. Erstelle als privilegierter Benutzer ein Backup des Konfigurationsverzeichnisses `/etc` in zwei der oben erwähnten Kompressionsalgorithmen (Tipp: `gzip` wird mit dem Argument `-z` verwendet). Wie würde man diese komprimierten Archive wieder entpacken?

#### Accounts, Benutzer und Gruppen
Wer bist du gerade in deiner Konsole? Welcher Befehl hilft dir dabei?

Gib den Eintrag für deinen aktuellen Benutzer aus der `/etc/passwd` Datei an und beschreibe die einzelnen Informationen. Wie könntest du dafür nur einen zusammengesetzten Befehl nutzen, ohne zu wissen wer gerade der eingeloggte Benutzer im Terminal ist?

Welchen Gruppen ist dein Benutzer zugeordnet? Welcher Befehl kommt hier zum Einsatz? Wieso verwenden Unix-Systeme Gruppen? Wie werden Gruppen speziellen Benutzern zugeordnet?

#### Dateiberechtigungen

Die Befehle `chgrp`, `chmod` und `chown` sind wichtige Hilfsmittel um die Berechtigungen im Verzeichnisbaum anzupassen. Wo liegen hier die Unterschiede? Konsultiere die Manpage der einzelnen Befehle und fasse kurz zusammen!

Ein `ls -l ~` zeigt dir dein Heimatverzeichnis an. Die erste Spalte beinhaltet dabei die Information zu den Verzeichnissen und Dateien darin. Erstelle eine Datei mit dem Namen `keineBerechtigung.txt`. Wer darf auf diese neu erstellte Datei schreibend zugreifen? Wie kannst du der Gruppe auch diese Rechte erteilen?  Welche zwei Arten sind dabei möglich?

Erstelle nun in deinem Heimatverzeichnis ein Unterverzeichnis `Leere` und nimm dir als Besitzer, der Gruppe und allen anderen das Recht in das Verzeichnis zu wechseln! Welche Methode ist hier die einfachere? Was passiert, wenn du nun in das Verzeichnis mit `cd Leere` wechseln willst? Wie kannst du dies wieder beheben?


### Erweiterungen

#### Netzwerkmount
Oft werden Linux-Rechner als Server verwendet, die von anderen Servern Daten zur weiteren Nutzung benötigen. Das *Network File System (NFS)* ist dabei ein gängiges Protokoll, um entfernte Datenspeicher gemeinsam zu nutzen. Wie könnte man einen solchen Network-Share in seine Verzeichnisstruktur einbinden? Wie sieht dabei der lesende und schreibende Zugriff auf Dateien eines solchen Netzlaufwerks aus, kann und darf hier jeder alles? Installiere bei Bedarf notwendige Pakete um beim Abgabegespräch dich auf eine Freigabe der Lehrkraft zu verbinden!

#### Dateien vergleichen und patchen

`diff` und `patch` sind zwei Kommandos, die Programmierern in der Shell nur allzu oft über den Weg laufen (`diff` auch sehr gerne gemeinsam mit dem Versionierungstool `git`). Kopiere die Datei `~/.bashrc` und füge zum Ende der kopierten Datei den Alias `hello` hinzu, der dir eine kleine Nettigkeit auf die Konsole ausgibt. Wie kann man nun den Unterschied zu der Ursprungsdatei anzeigen? Was bedeutet dabei das erste Zeichen vor einer Änderung?

Wie kann man mit `patch` nun eine Änderung der vorhandenen `~/.bashrc` durchführen, sodass immer nur *die eine Änderung* ausgeführt wird?

#### Effizienz einzelner Komprimierungstools

Zeige anhand des Verzeichnisses `/usr/src/linux/include` (Header-Files deines Kernels) die unterschiedlichen Zeiten des Packens, Entpackens und der ersparten Größe von `gzip`, `bzip2`, und `xz`. Header-Files sind Textdateien, wie sieht die Effizienz der Komprimierungstools bei binären Dateien aus?

#### Umgebungsvariablen

Die Variablen `$PATH`, `$HOME` und `$SHELL` sind vielleicht schon bekannt, wo werden diese gesetzt? Wie kann man deren Inhalt in der Konsole anzeigen?

Der Befehl `export` hilft beim Management dieser Umgebungsvariablen. Wie kann mit `export` ein neuer Wert für die aktive Session übergeben werden?

Wenn Python ausgeführt wird, kann es manchmal von Nöten sein, die Umgebungsvariable `PYTHONPATH` zu setzen. Wie ist das ausschließlich für das Ausführen von `python3 script.py` möglich?

Wo liegen die Unterschiede bei der Verwendung von `set` und `export`?

#### Historie

Der Befehl `history` zeigt dir eine bestimmte Anzahl der zuletzt eingegebenen Befehle in der aktuellen Session deiner Shell an. Gib dir die aktuelle Konfiguration mit `set` aus und filtere mit `grep` nach der Zeichenkette `HIST`. Wo befindet sich die Datei, die deine History enthält?

Mit den Pfeiltasten ↑ und ↓ kannst du in der Historie scrollen. Viel einfacher ist es aber den gewünschten Befehl mit dem `!` und dem entsprechenden Index anzusprechen.

#### Tastenkombinationen

Schon mal auf die Tabulator Taste gedrückt während der Eingabe eines Befehls oder einer Option? Und auch schon zwei Mal hintereinander?

Was machen die folgenden Tastenkombinationen und wann kann man diese einsetzen? `Ctrl + ` L D Z C H A W U E

## Fragestellungen

### Erweiterungen
* Wie kann man aus der grafischen Oberfläche zur System-Kommandozeile wechseln? Und wofür steht **tty**?
* Wofür steht **bash** und mit welchen anderen Interpretern ist diese verwandt?
* Was ist **POSIX** und wie unterstützt es die Verwendung von verschiedenen Distributionen?
* Wie kommen die Datenströme `stdin stdout stderr` in der Shell zum Einsatz? Können diese umgeleitet werden und wenn ja wie?
* Man steht an und kommt nicht weiter, wie heißt noch mal dieser eine Befehl ... Welcher Befehl hilft einem bei der Suche durch *alle* Manpages und listet die gefundenen Begriffe übersichtlich auf?
* Wofür verwendet man das `umask`-Kommando?
* Erkläre wie `umask` funktioniert. Was bewirkt eine `umask` von `0066`?
* Was bewirkt die `setuid`-Berechtigung bei einer Datei und wie wird sie gesetzt?
* Welche Berechtigungen besitzt das `sudo`-binary auf deinem System? Warum?
* Was bewirkt die `setgid`-Permission bei Vezeichnissen?

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden. Die Abgabe ist als PDF in moodle zu tätigen.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Es ist sehr wahrscheinlich, dass auf Verständnis gefragt wird und beim Gespräch auch praktische Fähigkeiten im Umgang mit der Linux-Konsole gefragt sind.

## Bewertung
Gruppengrösse: 1 Person

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Dokumentation und Verständnis von "Verzeichnishistorie"
- [ ] Dokumentation und Verständnis von "Verlinkungen"
- [ ] Dokumentation und Verständnis von "Netzwerkmount"
- [ ] Dokumentation und Verständnis von "Dateien vergleichen und patchen"
- [ ] Dokumentation und Verständnis von "Effizienz einzelner Komprimierungstools"
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Dokumentation und Verständnis von "Suche im Filesystem"
- [ ] Dokumentation und Verständnis von "Paketmanager"
- [ ] Dokumentation und Verständnis von "Umgebungsvariablen"
- [ ] Dokumentation und Verständnis von "Historie"
- [ ] Dokumentation und Verständnis von  "Tastenkombinationen"
- [ ] Ausarbeitung aller erweiterten Fragestellungen

## Quellen
* "Introduction to Linux - Chapter 10: File Operations & Chapter 12: User Environment" Linux-Foundation; zuletzt besucht 2020-12-09; [online](https://courses.edx.org/courses/course-v1:LinuxFoundationX+LFS101x+1T2020)
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-11-25; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)

---
**Version** **20230904*v3*
