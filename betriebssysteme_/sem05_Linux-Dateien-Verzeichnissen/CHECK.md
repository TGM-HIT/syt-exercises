# "*Kommandozeile - Dateien und Verzeichnisse*" - Checklist

## Grundlegende Kompetenzen "überwiegend"
- [ ] `man` und `--help` verwendet
- [ ] Optionen mit einem `-` für kurze und `--` für lange Namen erläutert
- [ ] Anzeige und Erklärung der PATH-Variable (Reihenfolge, Ort der Definition)
- [ ] Semikolon bei Windows
- [ ] Erkläre `rm -rf`!
- [ ] Grundbefehle abgeschlossen - kann mit `man` und `--help` umgehen
- [ ] Verlassen der Konsole und des Servers abgeschlossen
- [ ] `exit` und `Ctrl+D` erklärt - Unterschied zu `logout` ist klar

## Grundlegende Kompetenzen "vollständig"
- [ ] Unterschied zwischen absoluten und relativen Pfad mit dem Punkte davor `./pfad/name` und dem Slash `/var/lib/apt` vor dem Pfadnamen
- [ ] Wechsel in Home-Directory `cd` und `cd ~` bzw. `cd $HOME`
- [ ] Kopie von Verzeichnissen mit der Option `-r` für rekursive Bearbeitung
- [ ] Erkläre `cp -u` aus der Manpage
- [ ] Was macht der Befehl `du -hd1`?
- [ ] Dokumentation und Abschluss von "absoluter/relativer Verzeichnisbaum"
- [ ] `.` und `..` ist klar
- [ ] Dokumentation und Abschluss von "Befehle, Dateien und die Pipe"
- [ ] `ls -l /etc/* > listing.txt`
- [ ] `echo "Hallo Welt!" > ~/Hallo.txt` - `~` ist der Platzhalter für `$HOME`
- [ ] `dpkg --list | grep linux`
- [ ] `mkdir -p ~/eins/zwei/drei && cp ~/Hallo.txt ~/eins/zwei/drei/.`
- [ ] Erkläre was `||` macht!

## Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Dokumentation und Verständnis von "Verzeichnishistorie"
- [ ] `tree -d --filelimit 15`
- [ ] Dokumentation und Verständnis von "Verlinkungen"
- [ ] `ls -i`

## Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Dokumentation und Verständnis von "Suche im Filesystem"
- [ ] Was macht `locate`?
- [ ] `find ~ -mmin 5`
- [ ] Suche nach dem Verzeichnis wo Logfiles abgelegt werden!?
- [ ] Dokumentation und Verständnis von "Paketmanager"
- [ ] `dpkg` ist die Basis für `apt-get` und `apt` - Aufbau erklärt
- [ ] `whereis` im Gegensatz zu `which` - Unterschied?
- [ ] **tty** steht für *teletypewriter* und wird für die Hardware-Konsolen verwendet - Unterschied zu *pseudo-teletype (pts)* in der grafischen Oberfläche
- [ ] **bash - GNU Bourne-Again SHell** verbunden mit **ksh** und **csh**
- [ ] **Portable Operating System Interface (POSIX)** is a family of standards specified by the IEEE Computer Society for maintaining compatibility between operating systems; Erklärung der Core-Services (Prozesse, Signale, File&Directory Operationen, Pipes, etc.)
- [ ] stdin 0 stdout 1 stderr 2; Umleitung möglich mit `&>` oder `2>` etc.
- [ ] `apropos` hilft - Anwendung testen mit einem Begriff wie z.B. *"Archiv"*

## Kommentare
* gut und ausführlich beschrieben
* kann praktische Aufgaben bei Gespräch lösen
* Synopsis / Usage nicht ganz verstanden
* Selbständig auch die man-page andenken
* `--help` vor der Ausführung starten
* Dateistruktur noch einmal analysieren

