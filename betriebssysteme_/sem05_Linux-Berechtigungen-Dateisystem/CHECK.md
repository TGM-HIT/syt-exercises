# "*Dateioperationen, Struktur und Rechteverwaltung*" - Checkliste

## Bewertung
Gruppengrösse: 1 Person

### grundlegende Fragenstellungen
- [ ] Was beinhaltet die Datei `/etc/shadow`?
- [ ] Was ist der Unterschied zwischen den Kommandos `sudo` und `su`?
- [ ] Wie kann man Benutzern die Berechtigung erteilen, `sudo` auszuführen?
- [ ] Welchen Gruppen gehört dein Benutzer an?
- [ ] Welche drei Dateien sind im Homeverzeichnis für die Initialisierung deiner Shell zuständig? Wann wird welche verwendet?
- [ ] In welchen Verzeichnissen finden sich üblicherweise ausführbare Binärdateien?
- [ ] Was kann mit dem Befehl `stat` an Information ausgelesen werden? Wo liegt hier der Unterschied zu einem `ls -l`?
### Grundanforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung mind. der ersten Hälfte der grundlegenden Fragestellungen
- [ ] Dokumentation und Abschluss von "Dateisystem - Architektur"
- [ ] Dokumentation und Abschluss von "Dateitypen und Inhalte"
- [ ] `file` zu Linux-Kernel, einem Binary und einer Text-Datei erklärt
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Ausarbeitung aller grundlegenden Fragestellungen
- [ ] Dokumentation und Abschluss von "Kompression"
- [ ] `tar -zcf etc.tar.gz /etc` und auch `-j` für bzip2 bzw. `-J` für xz
- [ ] Dokumentation und Abschluss von "Accounts, Benutzer und Gruppen"
- [ ] Befehl `whoami` erklärt
- [ ] Befehl `cat /etc/passwd | grep $USER` erklärt
- [ ] Befehl `groups` erklärt
- [ ] Dokumentation und Abschluss von "Dateiberechtigungen"

### erweiterte Fragenstellungen
- [ ] Wofür verwendet man das `umask`-Kommando?
- [ ] Erkläre wie `umask` funktioniert. Was bewirkt eine `umask` von `0066`?
- [ ] Was bewirkt die `setuid`-Berechtigung bei einer Datei und wie wird sie gesetzt?
- [ ] Welche Berechtigungen besitzt das `sudo`-binary auf deinem System? Warum?
- [ ] Was bewirkt die `setgid`-Permission bei Vezeichnissen?
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Dokumentation und Verständnis von "Netzwerkmount"
- [ ] Dokumentation und Verständnis von "Dateien vergleichen und patchen"
- [ ] Dokumentation und Verständnis von "Effizienz einzelner Komprimierungstools"
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Dokumentation und Verständnis von "Umgebungsvariablen"
- [ ] Dokumentation und Verständnis von "Historie"
- [ ] Dokumentation und Verständnis von  "Tastenkombinationen"
- [ ] Ausarbeitung aller erweiterten Fragestellungen

## Kommentare
* Synopsis / Usage nicht ganz verstanden
* Selbständig auch die man-page andenken
* `--help` vor der Ausführung starten
* Dateistruktur noch einmal analysieren

