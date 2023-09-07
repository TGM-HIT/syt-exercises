### Grundanforderungen **überwiegend erfüllt**
- [ ] Unter welcher Option ist das Betriebssystem (also das Basisimage) vermerkt?
- [ ] Wie lässt sich ein Port vom Hostsystem in die VM weiterleiten (forwarden)?
- [ ] Wie lässt sich ein privates (Host-Only) Netzwerk einrichten oder der VM eine oeffentliche IP-Adresse zuweisen?
- [ ] Was bewirkt die Option `config.vm.provision`? (In eigenen Worten)
- [ ] Was bewirkt `apt update`?
- [ ] Welches Paket enthaelt in debian den php-Interpreter? In welcher Version liegt es in Debian Stretch vor?
- [ ] Wie kannst du dir mittels `apt` die Versionsnummern von Paketen anzeigen lassen?
- [ ] Was ist der Unterschied zwischen den Kommandos `apt update` und `apt upgrade`?
- [ ] Welche Moeglichkeiten gibt es, mittels `apt` Pakete wieder zu loeschen?

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Debian stretch-64 installiert und Vagrantfile dokumentiert
- [ ] `vagrant up` und `vagrant ssh` funktionstüchtig
- [ ] `apt update` und `apt upgrade` verwendet
- [ ] `apt install cowsay` ausgeführt

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] apt und dpkg Unterschiede erklärt
- [ ] `dpkg --list` erklären

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Beschreibung und Verwendung von nginx
- [ ] Verändere `<h1>` auf einen neuen Wert und Anzeige im Browser
- [ ] Wie kann man den Default-Webcontainer auf ein anderes Verzeichnis setzen?

## Kommentare
* vagrant up bei Vagrantfile hochfahren!
* "BlackBox" bitte im Protokoll vermeiden
* Provisioning nicht ganz klar
* vagrant help ... hilft
* Link zur Liste von anderen Boxen wäre hilfreich
* Konfiguration von Host für Netzwerk-Forwarding fehlt
* Dokumentation des Forwarding auf IP unvollständig
* Localhost beim Forwarding unzureichend
* apt -&gt; Wrapper für Debian-basiertes Packaging-System
* Achtung, nur "die eine Binärdatei" ist sehr selten nur eine Datei (Libraries, andere Dateien, ...)
* Config von nginx, Default-Ordner, Veränderung von index.html

