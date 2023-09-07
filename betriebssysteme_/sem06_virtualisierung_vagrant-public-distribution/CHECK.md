# "Virtualisierung öffentlich bereitstellen" - Checklist

## Bewertung 
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Welche Möglichkeiten gibt es bei der Bereitstellung von Skripten mit `vagrant.vm.provision :shell` und wo liegen hier mögliche Vor- und Nachteile?
- [ ] Wie oft wird das Skript automatisch ausgeführt? Wie kann man das Ausführen manuell triggern?
- [ ] Wie wird ein Update des Systems ausgeführt ohne der Bestätigung des Benutzers?
- [ ] Wie kann der Ordner des Hostsystems innerhalb von virtuellen Maschinen mittels `vagrant` genutzt werden?
- [ ] Wo liegt das Default-Verzeichnis von `apache2` und `nginx`?

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung und Dokumentation der grundlegenden, funktionalen Anforderungen
- [ ] `vagrant.vm.provision :shell` Skript geschrieben
- [ ] `index.html` eingebunden

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Anpassung und Dokumentation der (möglichen) Bereitstellung einer Vagrant-Box
- [ ] Welche Elemente sind für eine eigene Box in `vagrant` unabdingbar?
- [ ] Wie funktionert das Packaging?
- [ ] Wie kann man die VMAdditions installieren? Und wieso braucht `vagrant` diese?
- [ ] Welche anderen Provider gibt es bei Vagrant noch?
- [ ] Wie kann man normalen Benutzer Root-Rechte automatisch zuweisen?
- [ ] Wohin und wie könnte man erstellte virtuelle Maschinen noch deployen (Stichwort Cloud-Anbieter)?
- [ ] Welche wichtigen Elemente sind in der `packer` Konfiguration im `json` File abzubilden?
- [ ] Wie können nach der Initialisierung der virtuellen Maschine automatisch Pakete installiert werden? Wo kann dies konfiguriert werden?

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Dokumentation von `package` und der automatischen Erstellung von Vagrant-Boxen
- [ ] Erläuterung der Nutzung von Vagrant Cloud

## Kommentare
- sauber gearbeitet
- bitte genauer arbeiten!
- Quellen Richtlinie der IEEE beachten!
- Bitte die Bilder mit Unterschrift ("Caption") versehen und die Quelle referenzieren
* Link zur Liste von anderen Boxen wäre hilfreich
* Konfiguration von Host für Netzwerk-Forwarding fehlt
* Dokumentation des Forwarding auf IP unvollständig
* Localhost beim Forwarding unzureichend
* apt -&gt; Wrapper für Debian-basiertes Packaging-System
* Achtung, nur "die eine Binärdatei" ist sehr selten nur eine Datei (Libraries, andere Dateien, ...)
* Config von nginx, Default-Ordner, Veränderung von index.html