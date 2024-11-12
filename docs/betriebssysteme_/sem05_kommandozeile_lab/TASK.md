---
hide:
  - navigation
---

# "Kommandozeile" - Taskdescription

## Einführung
*"Linux kernel-based operating systems have been widely adopted in a very wide range of uses. All the advantages and benefits of free and open-source software apply to the Linux kernel, and to most of the rest of the system software."* [wiki](https://en.wikipedia.org/wiki/Linux_range_of_use)

Ob in Server-Systemen, am Desktop, in mobilen Geräten oder in eingebetteten Systemen (Stichwort Internet-of-Things), Linux kommt als Betriebssystem immer mehr und mehr zum Einsatz. Viele Vorteile sind in dem frei verfügbaren Betriebssystem vereint, das von Linus Torvalds im Oktober 1991 ins Leben gerufen wurde.

Die Verbreitung und Anpassungsmöglichkeiten sprechen für das Erlernen und Verwenden dieses bemerkenswerten Betriebssystems.

## Ziele
Das Ziel dieser Übung ist das Kennenlernen der Linux-Kommandozeile. Obwohl Linux schon sehr intuitive und ansprechende grafische Oberflächen anbietet, ist die Verwendung der Kommandozeile eine wichtige Fähigkeit im Umgang mit Serversystemen. Man kann in der Kommandozeile auch oft mehr erreichen und meist schneller zum Ziel kommen.

Diese Übung soll als Zusammenfassung des siebten Kapitels aus dem Linux-Foundation Kurs ["Introduction to Linux"](https://www.edx.org/course/introduction-to-linux) aufgefasst werden. Eine Schritt-für-Schritt Erarbeitung dieses Kapitels ist für die Übungsdurchführung von Vorteil.

## Kompetenzzuordnung
#### GK SYT5 Betriebssysteme | Linux | Befehle
* "einfache Befehle mit den wichtigsten Optionen verwenden"
* "Berechtigungen auf Dateisystemebene erklären und administrieren"

## Voraussetzungen
* Grundverständnis vom Aufbau eines Betriebssystems
* Einführung in Linux - Kapitel 1 bis 6
* Einführung in Linux - Kapitel 7 und *optional* Kapitel 8 und 9
* Grundlegende Kenntnisse in der Verwendung von der Kommandozeile
  

## Detaillierte Aufgabenbeschreibung
Starte deine virtuelle Maschine oder verbinde dich mit einer Konsole auf einen Linux-Rechner. Du kannst auch die grafische Oberfläche deines Linux-Systems nutzen. Welche Möglichkeiten gibt es die Kommandozeile zu öffnen? Was ist ein **terminal emulator** und wo kommt dieser zum Einsatz?

Es gibt viele Befehle und unzählige Pakete, die das Linux System erweitern und zu einem mächtigen Werkzeug machen. Es gibt jedoch einige wenige Befehle, die man als Linux-Benutzer wirklich immer wieder braucht und die das Arbeiten in der Konsole zu einer Ästhetik werden lassen. Essenzielle Befehle sind dabei folgende: `cd` `cat` `echo` `ls` `rm` `man` `exit` `login` `mkdir` `head` `tail` `less` `find` `locate` `cp` `mv` `pwd` `touch` `sudo` `df` `du` `tree` `ps`

Wenn wir mal nicht weiter wissen, dann schreien wir laut ... **HILFE!!!**
Und das lässt sich fast immer an einen Befehl anhängen: `man --help` Hier haben wir auch gleich zwei wichtige Helferlein kennengelernt, zum ersten die **Hilfe-Option** und die **Manpage**. Die besagte *Synopsis* erläutert uns dabei die Möglichkeiten den Befehl auszuführen. Dabei sind drei wichtige Einteilungen zu unterscheiden:

    * Befehl
    * Option
    * Argumente

Grundsätzlich gilt bei Linux, dass man wissen sollte, was man tut ... Als User `root` wird man meist gar nicht mehr gefragt, daher bitte um **VORSICHT** wenn man zum Beispiel im root-Verzeichnis rekursiv alle Unterverzeichnisse löschen möchte (der Befehl ist nur mit 6 Zeichen auch sehr kompakt) - hier kommt kein **Wollen Sie das wirklich?** und kann auch für die Hardware verheerende Folgen haben (Stichwort gemountete UEFI Partition).
Daher bitte in der virtuellen Maschine einen Snapshot einrichten und am besten dort einmal auf gesichertem Terrain die ersten Schritte ausprobieren - da kann *fast* gar nichts passieren!

Auch die interaktiven "Übungen" des Kurses können eine gewisse Sicherheit vermitteln, die das Kennenlernen der Befehle in einer sicheren Umgebung garantieren!

### Grundanforderungen

#### Grundbefehle
Beschreibe kurz die folgenden Befehle und führe mögliche Anwendungsgebiete an: `cd; cat; echo; ls; rmdir; man; exit; login; mkdir` Nimm dir dabei immer die *Synopsis* des Kommandos als Sprungbrett her (du sieht diese als *usage:* )!

#### Verlassen des Terminals
Jetzt sind schon einige Befehle verständlicher! Wie kann man das Terminal nun verlassen? Wie kann der Befehl auch durch eine Tastenkombination aufgerufen werden? Wo liegt der Unterschied zu dem naheliegenden `logout`? Was passiert wenn man mittels `ssh` auf einem Server verbunden ist?

#### absoluter/relativer Verzeichnisbaum
Anders als unter Windows ist das Dateisystem in Linux kein auf nur physikalische Laufwerke beschränkte Umgebung. Es sind Kernel-Informationen und Konfigurationen von einzelnen Prozessen sowie angeschlossene Geräte direkt im Verzeichnisbaum abrufbar. Wie heißt der Befehl, der einen den aktuellen Ort mitteilt? Was ist das Heimverzeichnis? Wie kann man dorthin gelangen? In welchem Verzeichnis liegen die meisten Benutzer-Befehle unter Linux?

Die Verwendung von `/` ist als Windows-Benutzer vielleicht etwas gewöhnungsbedürftig - ist aber auf der Tastatur leichter vorzufinden. Durch die Verwendung von relativen Pfadangaben ist aber eine Orientierung viel einfacher. Wo liegt der Unterschied zu absoluten Pfaden? Und was sind `.` und `..`?

#### Befehle, Dateien und die Pipe
Um eine Datei (ohne Inhalt) ganz schnell zu erstellen bietet sich der Befehl `touch` an. Man könnte auch einen Editor in der Kommandozeile verwenden. Dies ist aber ein Kapitel für sich (siehe Chapter 11: Text Editors). In der Grundbefehlliste sind aber auch die Befehle `echo` und `cat` zu recherchieren gewesen. Wie könnte man aber nun die Ausgabe von `ls -l /etc/*` in eine Datei umleiten? Wo ist dabei der Unterschied zu `>` und `>>`? Und wenn das in die eine Richtung geht, kann man auch aus einer Datei Befehle bestimmte Informationen übergeben? Schreibe in eine Datei namens `~/Hallo.txt` den Text *"Hallo Welt!"*. Welcher Befehl bietet sich dafür an? Was bedeutet die `~`?

Viele Befehle haben genau eine Aufgabe, die Kombination mit anderen Befehlen macht die Kommandozeile aber so mächtig. Wie kann man die Ausgabe eines Befehls für einen anderen Befehl nutzen? Zeige dir mit `dpkg --list` alle bekannte Pakete des Systems an und filtere nun nur Pakete die in der Beschreibung `linux` erhalten (Tipp: der Befehl `grep` hilft).

Logische Verknüpfungen von Befehlen helfen uns auch bei der Abarbeitung und Verschachtelung von Abläufen. Erstelle mit dem Befehl `mkdir -p ~/eins/zwei/drei` die beschriebene Verzeichnisstruktur und kopiere die Datei `Hallo.txt` aus dem Heimatverzeichnis in das letzte der erstellten Verzeichnisse - und das aber nur dann wenn, der Befehl `mkdir` erfolgreich war! Wie kommen dir dabei logische Operatoren zu Hilfe?

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

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden. Die Abgabe ist als PDF in moodle zu tätigen.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Es ist sehr wahrscheinlich, dass auf Verständnis gefragt wird und beim Gespräch auch praktische Fähigkeiten im Umgang mit der Linux-Konsole gefragt sind.

## Bewertung
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Grundbefehle abgeschlossen
	* `man` und `--help` verwendet
	* Optionen mit einem `-` für kurze und `--` für lange Namen erläutert
	* Anzeige und Erklärung der PATH-Variable (Reihenfolge, Ort der Definition)
	* Semikolon bei Windows
- [ ] Konsole - Starten und Verlassen
	* `exit` und `Ctrl+D` erklärt - Unterschied zu `logout` ist klar
	* `Ctrl+C` verwenden
	* Erklären von `rm -rf`
	* Erklären von `df -h`
- [ ] Ausarbeitung mind. der ersten Hälfte der grundlegenden Fragestellungen
- [ ] Dokumentation und Abschluss von "Dateisystem - Architektur"
- [ ] Dokumentation und Abschluss von "Dateitypen und Inhalte"

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Dokumentation und Abschluss von "absoluter/relativer Verzeichnisbaum"
	* Unterschied zwischen absoluten und relativen Pfad mit dem Punkte davor `./pfad/name` und dem Slash `/var/lib/apt` vor dem Pfadnamen
	* Wechsel in Home-Directory `cd` und `cd ~` bzw. `cd $HOME`
	* Kopie von Verzeichnissen mit der Option `-r` für rekursive Bearbeitung
	* Erkläre `cp -u` aus der Manpage
	* `.` und `..` ist klar
- [ ] Dokumentation und Abschluss von "Befehle, Dateien und die Pipe"
	* `ls -l /etc/* > listing.txt`
	* `echo "Hallo Welt!" > ~/Hallo.txt` - `~` ist der Platzhalter für `$HOME`
	* Was macht der Befehl `grep`?
	* `dpkg --list | grep linux`
	* `mkdir -p ~/eins/zwei/drei && cp ~/Hallo.txt ~/eins/zwei/drei/.`
	* Erkläre was `||` macht!
- [ ] Ausarbeitung aller grundlegenden Fragestellungen
- [ ] Dokumentation und Abschluss von "Kompression"
- [ ] Dokumentation und Abschluss von "Accounts, Benutzer und Gruppen"
- [ ] Dokumentation und Abschluss von "Dateiberechtigungen"

## Quellen
* "Introduction to Linux - Chapter 7: Command Line Operations" Linux-Foundation; zuletzt besucht 2020-11-25; [online](https://courses.edx.org/courses/course-v1:LinuxFoundationX+LFS101x+1T2020)
* "35 Linux Basic Commands Every User Should Know" Artūras B.; 2020-06-29; zuletzt besucht 2020-11-25; [online](https://www.hostinger.com/tutorials/linux-commands)
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-11-25; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* J. Garrison, rothgar/awesome-tuis. (12. November 2024). Zugegriffen: 12. November 2024. [Online]. Verfügbar unter: https://github.com/rothgar/awesome-tuis


---
**Version** *20241112v6*
