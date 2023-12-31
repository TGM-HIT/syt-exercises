---
hide:
  - navigation
---

# "*Linux Systemwartung*" - Taskdescription

## Einführung
Die Wartung eines Servers ist ausschlaggebend für den Einsatz von Diensten im Internet. Wichtige Informationen über die Auslastung und Verwendung von Services müssen leicht abrufbar sein und bei wichtigen Ereignissen müssen die Informationswege kurz gehalten werden.

## Ziele
Diese Übung gibt Einblick in die gängigen Werkzeuge zur Systemüberwachung von GNU/Linux Servern. Es soll der Einsatz dieser Werkzeuge an einfachen Aufgaben geschult werden.

## Kompetenzzuordnung
#### GK SYT6 Betriebssysteme | Servermanagement | Wartung
* "Vorteile der Wartungsautomatisierung erklären"
* "Wartung über die Shell durchführen"
#### EK SYT6 Betriebssysteme | Servermanagement | Wartung
* "Betriebssysteme automatisch installieren"

## Voraussetzungen
* Grundverständnis von Netzwerk und Betriebssystemkonfiguration
* Grundverständnis von virtuellen Maschinen und dem Einsatz eines Hypervisors
* Grundverständnis und Handhabung von GNU/Linux Systemen (Shell)


## Detaillierte Aufgabenbeschreibung

### Grundanforderungen
#### 1. Installation von Webdienst
Installiere in deiner *Debian based* VM zunächst den Apache Webserver. Er findet sich im Paket **apache2**. Führe zuvor `apt update` als root aus, um deine Paketdefinitionen auf den aktuellen Stand zu bringen. Welche Distribution verwendest du? Welches Release ist in `/etc/apt/sources.list` eingetragen? Wie lange wird dieses Release noch mit Updates unterstützt? Was muss nach dem *End-of-life-date (EOL)* getan werden, um die installierte Distribution weiter verwenden zu können? Gibt es hierfür eine elegantere Methode?

Konfiguriere deine VM so, dass du von deinem Host mittels http://localhost:8080 auf diesen Webserver  zugreifen kannst. (Hint: apache lauscht als http-Server per default auf Port 80). Du musst dafür die Netzwerkeinstellungen deiner Virtuellen-Umgebung ändern. Welche Seite erscheint, wenn du danach auf deinem host die URL http://localhost:8080 ansurfst?

#### 2. Dienste verwalten
Der im obigen Schritt installierte Webserver wird auch automatisch gestartet und in Zukunft beim Systemstart mitgeladen. Der dahinter liegende Mechanismus nennt sich in Debian systemd. Hierbei werden Services mittels verschiedenen Kommandos verwaltet, am meisten wird das Kommando `systemctl` verwendet. Mittels `systemctl stop apache2` lässt sich der soeben installierte Webserver beenden, mittels `systemctl start apache2` wieder starten; beide Schritte lassen sich mit `systemctl restart apache2` ausführen (zB zum Neuladen der Konfiguration). Führe diese Schritte aus und verifiziere jeweils, ob der Webserver läuft oder nicht. Wie kann der Status eines Dienstes mittels `systemctl` überprüft werden?

Wenn ein Dienst nicht automatisch gestartet werden soll, ist dieser `disabled`, welcher Befehl ist notwendig um die Verlinkung für `systemd` zu aktivieren? Was passiert dabei genau?

#### 3. Arbeitsspeicher und Systemresourcen
Du kannst dir unter Linux laufende Prozesse mit dem Kommando `ps` anzeigen lassen. Per default zeigt `ps` allerdings immer nur Prozesse, die unter deinem aktuellen Benutzer in der aktuellen Konsole laufen. Wie viele Prozesse sind das bei dir?

Um alle am System laufenden Prozesse anzeigen zu lassen, verwende die Option `ps ax`. Dies zeigt dir alle laufenden Prozesse von allen Benutzern. Wie viele Prozesse verwendet der Apache Webserver? Wie kannst du dir zu den Prozessen den Benutzer anzeigen lassen, unter dem sie laufen?

Um laufend die aktuellen Prozesse anzeigen zu lassen, gibt es das Tool `top`. Zu diesem gibt es aber eine komfortable Alternative namens `htop`. Installiere es auf deinem System und rufe `htop` auf. Zusätzliche zu den laufenden Prozessen siehst du oben am Bildschirm noch weitere Systemanzeigen. Welche sind das? Warum zeigt `htop` z.B. für den Apache-Webserver mehr Prozesse an als `ps`?

Mittels `htop` lassen sich auch Prozesse beenden. Starte in einem neuen Reiter die Ausgabe von Zufallsbytes mit dem Befehl `cat /dev/urandom`. Finde diesen neuen, laufenden Prozess in `htop` und beende diesen mittels den möglichen Funktionen im Prozessbetrachter.

#### 4. Festplattenplatz
Den auf der Festplatte verbrauchten Platz einer Datei kannst du dir mittels dem Kommando `du` anzeigen lassen. Dieses wird meist mit der Option `-h` ausgeführt, um die Resultate in Kilo-, Mega- und Gigabyte anzeigen lassen anstatt in Blöcken. Üblicherweise verwendet man zusätzlich die Schalter `-s` und `-c` um die Größe der Elemente in einem Verzeichnis anzeigen zu lassen. Recherchiere in der Manpage zu `du`, was diese beiden Optionen bewirken und führe `sudo du -sch /var/log/*` aus. Was sagt dir die Ausgabe?

Mittels `df` lässt sich der noch freie Speicherplatz anzeigen (auch hier wird `-h` verwendet, um lesbare Größeneinheiten anzeigen zu lassen). Das Kommando `df -h <verzeichnis>` gibt dabei den für `<verzeichnis>` noch freien Speicherplatz an, das heißt, den freien Speicherplatz der Partition, auf der `<verzeichnis>` liegt. Was bewirkt ein Aufruf von `df -h` ohne Angabe eines Verzeichnisses?

#### 5. Logdaten
Du kennst ja schon den Befehl `systemctl status` aus der vorherigen Teilaufgabe. Du hast bemerkt, dass mit der Übergabe des Service-Namen nur ein Teil der Logging-Information angezeigt wird. Wie lassen sich nun alle Logdaten zu einem Service mittels `systemd` anzeigen? Wie unterscheiden sich diese Informationen zu denen im Verzeichnis `/var/log`?

Der englische Name *Journal* lässt auf ein Protokoll oder Tagebuch schließen, wie kann dieses durchsucht werden? Finde den Filter, der nur Logeinträge für das heutige Datum anzeigt!

#### 6. Netzwerkverbindungen
Mit dem Kommando `netstat` lassen sich verschiedene Daten des Netzwerksubsystems anzeigen, wie z.B. die Routingtabellen `netstat -r` oder offene Sockets `netstat -l`. Da Sockets unter Unix-Systemen auch sehr häufig zur Interprozesskommunikation zwischen Prozessen auf demselben Rechner eingesetzt werden, ist die Ausgabe hier oft sehr unübersichtlich. Um alle (und nur die) tcp-Verbindungen anzeigen zu lassen, werden oft die Optionen `netstat -talp` zusammen verwendet. Führe dieses Kommando in deiner VM aus, nachdem du die Webseite aus dem ersten Schritt oben vom Host aus aufgerufen hast, und erkläre die Ausgabe. Wie funktioniert dies für das Protokoll UDP?

#### 7. Automatisierung und Task-Scheduler
Um das vorliegende System am laufenden Stand zu halten ist es möglich automatische Updates durchführen zu lassen. Dies kann über verschiedene Möglichkeiten geschehen (z.B. `unattended-upgrade`). Konfiguriere das automatische Upgrade von Security-Updates in deiner VM. Was sind dabei die wichtigsten *Default* Einstellungen?

Wiederkehrende Aufgaben (Tasks) können mit dem Dienst `cron` oder auch dem `systemd.timer` durchgeführt werden. Definiere einen Prozess, der dir die Information über deine Festplatten-Auslastung jeden Tag um 06:00 in der Früh in eine Datei speichert, die in das Verzeichnis `/var/log/harddisk/` als `20230212-0600.log` (nach dem aktuellen Datum) gespeichert wird . Kleiner Tipp, du kannst ein Bash-Script schreiben, welches von den oben genannten Diensten aufgerufen wird und teste dein Script bevor du die Timer einsetzt.

## Abgabe
Die einzelnen Teile sind der Reihe nach zu lösen, da gewisse Abhängigkeiten in der Umsetzung als auch in der Komplexität gegeben sind. Meist ist die Verwendung der Manpage ausreichend. Die ausgeführten Befehle sind entsprechend zu dokumentieren und auch verwendete Hilfsmittel sind als Quellen anzugeben. Es bietet sich an, die Dokumentation in Markdown zu verfassen und diese auch für den Eigengebrauch abzulegen. Screenshots sind nur bedingt hilfreich, wenn man Befehle oder Quellcode schnell wieder verwenden möchte. Als Dokumentationsabgabe kann leider nur **.pdf** akzeptiert werden.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Teil 1: Update, Installation und Netzwerkeinstellung
- [ ] Teil 2: Dienste mit systemd starten, stoppen und verwalten
- [ ] Teil 3: Prozessinformationen auslesen und interpretieren
- [ ] Teil 4: Festplattenplatz beobachten
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Teil 5: Logdaten auslesen und interpretieren
- [ ] Teil 6: Netzwerkverbindungen beobachten
- [ ] Teil 7: Automatisierte Updates und Task-Scheduler verwenden

## Quellen
* "DebianReleases" Debian Wiki; zuletzt besucht 2023-02-12; [online](https://wiki.debian.org/DebianReleases)
* "UnattendedUpgrade" Debian Wiki; zuletzt besucht 2023-02-12; [online](https://wiki.debian.org/UnattendedUpgrades)
* "Automatische Updates (Debian)" MattWiki; zuletzt besucht 2023-02-12; [online](https://otremba.net/wiki/Automatische_Updates_(Debian))
* "systemd/Timers" archlinuxWiki; zuletzt besucht 2023-02-12; [online](https://wiki.archlinux.org/title/systemd/Timers)

---
**Version** *20230212v2*
