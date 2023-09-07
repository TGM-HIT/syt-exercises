# "*Kommandozeile - Dateien und Verzeichnisse*" - Taskdescription

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
* Grundlegende Kenntnisse in der Verwendung von der Kommandozeile
  

## Fragestellungen
### Grundanforderungen
* Wo bekommt man Unterstützung für einen Befehl?
* Wo liegt der Unterschied zwischen der Übergabe von einem oder zwei Bindestrichen bei der Verwendung von Optionen? (z.B. `sudo -h` und `sudo --help`)
* Welche Funktionsweise hat die `$PATH`-Variable? Wie wird sie verwendet und wie ist sie unter Linux aufgebaut? Wie ist `$PATH` unter Windows aufgebaut?
* Wie kann die `$PATH` Variable angepasst werden? Wann kommt die Anpassung zur Anwendung?

* Woran erkennt man einen relativen Pfad (im Gegensatz zu einem absoluten)?
* Nenne zwei Arten, wie man das `home` Verzeichnis des aktuellen Benutzers ermitteln kann. Wo liegt dieses üblicherweise?
* Ein  Benutzer  möchte  seinen  Download-Ordner  archivieren  und  tut  dies  mittels `cp Downloads/ backup`. Warum funktioniert das nicht und was sollte er stattdessen aufrufen?
* Was beinhaltet die Datei `/etc/shadow`?
* Was ist der Unterschied zwischen den Kommandos `sudo` und `su`?
* Wie kann man Benutzern die Berechtigung erteilen, `sudo` auszuführen?
* Welchen Gruppen gehört dein Benutzer an?
* Welche drei Dateien sind im Homeverzeichnis für die Initialisierung deiner Shell zuständig? Wann wird welche verwendet?
* In welchen Verzeichnissen finden sich üblicherweise ausführbare Binärdateien?
* Was kann mit dem Befehl `stat` an Information ausgelesen werden? Wo liegt hier der Unterschied zu einem `ls -l`?

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden. Die Abgabe ist als PDF in moodle zu tätigen.

## Quellen
* "Introduction to Linux - Chapter 7: Command Line Operations" Linux-Foundation; zuletzt besucht 2020-11-25; [online](https://courses.edx.org/courses/course-v1:LinuxFoundationX+LFS101x+1T2020)
* "35 Linux Basic Commands Every User Should Know" Artūras B.; 2020-06-29; zuletzt besucht 2020-11-25; [online](https://www.hostinger.com/tutorials/linux-commands)
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-11-25; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)

---
**Version** **20230904*v5*