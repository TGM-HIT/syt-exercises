---
hide:
  - navigation
---

# "Virtualisierung öffentlich bereitstellen" - Taskdescription

## Einführung

Verwendung von virtuellen Maschinen soll die gemeinsame Arbeit als auch die Anpassung von Deployments bei z.B. Kunden deutlich vereinfachen.

## Ziele

Das Ziel dieser Übung ist die Anpassung von text-basierten Virtualisierungsumgebungen und die einfache Veröffentlichung der angepassten virtuellen Instanzen.

## Kompetenzzuordnung

**GK SYT6 Betriebssysteme | Virtualisierung | virtuelle Umgebung**  

* "Cloud-basierte virtuelle Maschinen erstellen"  
* "Serverdienste installieren"

**EK SYT6 Betriebssysteme | Virtualisierung | virtuelle Umgebung**  

* "Skalierungsfeatures von cloud-basierten Virtualisierungsplattformen verwenden"
* "Container zur Dienstbereitstellung verwenden"

## Voraussetzungen

* Grundverständnis von Netzwerk und Betriebssystemkonfiguration
* Grundverständnis von virtuellen Maschinen und dem Einsatz eines Hypervisors
* Grundverständnis von text-basierten Virtualisierungsumgebungen
* Lauffähige Virtualisierungsumgebung

## Detaillierte Aufgabenbeschreibung

### Anpassung einer VM
Um diese Übung absolvieren zu können ist ein gewisses Grundverständnis in der Handhabung von `vagrant` notwendig. Dieses wurde in einer der vorherigen Übungen aufgebaut.

Nach der Initialisierung einer virtuellen Instanz kann es notwendig sein, bestimmte Pakete bzw. entsprechende Konfigurationen auszuführen. Dies kann mit `vagrant.vm.provision :shell` realisiert werden [shell-provision].

Editiere das schon vorhandene Vagrantfile und füge ein `init.sh` Skript als Provisioning-Quelle hinzu. Der Inhalt dieses Skripts soll bei einem neuen Erstellen auf jeden Fall ausgeführt werden. In der Initialisierung soll das System auf den neuesten Stand gebracht werden - ohne dem Zutun des Benutzers (Tipp: es gibt ein Argument, welches alles mit **yes** beantwortet). 

Danach soll sichergestellt werden, dass der `apache2` Webserver installiert/upgedated und mit folgender `index.html` gestartet wird:

```html
<!DOCTYPE html>
<html>
  <body>
    <h1>Das ist meine supertolle Webseite!</h1>
  </body>
</html>
```
Tipp: Es ist möglich in diesem `init.sh` Skript auch Dateien aus dem Host-System zu übertragen. Man müsste nur wissen, wo der Webserver nach seiner `index.html` sucht.

### Erstellung einer eigenen Box
Um von Grund auf eine eigene virtuelle Instanz erstellen zu können geht diese offizielle Anleitung **Creating a Base Box** [createbox] auf die notwendigen Schritte näher ein. Die grafische Variante ist dabei einfacher, da nach einer Anpassung der virtuellen Instanz und der Installation der *Gast Erweiterungen* (Guest Additions) einem Packaging nichts im Weg steht.

Lade das neueste (weekly-build) *Debian Testing Netinst* Image [debian-netinst] herunter und installiere es in der Virtualbox. Wähle dabei entweder einen beliebigen Benutzer und füge im Anschluss den Benutzer `vagrant` hinzu, oder gebe gleich den Vagrant-Benutzer bei der Installation als Standardbenutzer an.

Nach einem Reboot müssen die aktuellen `VBoxLinuxAdditions` installiert und die virtuelle Maschine heruntergefahren werden. Jetzt soll aus der erstellten und angepassten VM eine Vagrant-Box erstellt werden.

Beachte auch die Einstellungen und Schritte für eine erfolgreiche `ssh` Konfiguration aus der Anleitung [createbox]. Vergesse auch nicht darauf den Benutzer `vagrant` in die Datei `/etc/sudoers` einzutragen!

### Öffentliche Bereitstellung
Erstelle einen Account in der **Vagrant Cloud** um die angepasste virtuelle Instanz nun öffentlich verfügbar zu machen [account]. Bedenke, dass der Gratisaccount keine private Boxes beinhaltet und die konfigurierten Boxes allen zugänglich sind.

**ACHTUNG:** *Die erstellte `package.box` hat eine unhandliche Größe entwickelt und ist daher nicht unbedingt online bereit zu stellen! Folgende Arbeitsaufträge müssen nur entsprechend dokumentiert aber nicht ausgeführt werden!*

Mit dem erstellten Account ist es nun möglich die Box öffentlich bereit zu stellen. Wie kann man dies per Konsole aber auch über die Webkonfiguration durchführen? Was müsste nun ein Mitarbeiter oder Kunde als Vagrantfile angeben, damit er die erstellte Box nutzen könnte? Was müsste sichergestellt werden, wenn die Box privat wäre?

### Automatische Erstellung einer Box über ein Image
Es gibt die Möglichkeit aus bestehenden ISO-Images automatisch Vagrant-Boxes zu erstellen und in die Cloud zu laden. Dabei sind die grafischen Desktop-Versionen bei der automatischen Installation ohne Hilfstools nicht sehr einfach zu handhaben. Recherchiere welche Möglichkeiten es gibt mit z.B. `package` ISO Files in Vagrant-Boxes zu verwandeln.

Wie wird dabei die Integrität der online verwendeten Images garantiert? Und welche Konfigurationsschritte sind notwendig?

Um den *unattended* Installationsprozess zu vereinfachen kann der **DebianInstaller** `d-i` verwendet werden. Hier ist ein `preseed.cfg` zu erstellen. Damit das `packer` auch ladet, ist ein Boot-Kommando notwendig, hier ein mögliches Beispiel:

```json
      "boot_command": [
        "<esc><wait>",
        "auto net.ifnames=0 preseed/url=http://{{ .HTTPIP }}:{{ .HTTPPort }}/preseed.cfg<wait>",
        "<enter>",
        "<enter>"
      ] 
```

## Fragestellungen
* Welche Möglichkeiten gibt es bei der Bereitstellung von Skripten mit `vagrant.vm.provision :shell` und wo liegen hier mögliche Vor- und Nachteile?
* Wie oft wird das Skript automatisch ausgeführt? Wie kann man das Ausführen manuell triggern?
* Wie wird ein Update des Systems ausgeführt ohne der Bestätigung des Benutzers?
* Wie kann der Ordner des Hostsystems innerhalb von virtuellen Maschinen mittels `vagrant` genutzt werden?
* Wo liegt das Default-Verzeichnis von `apache2` und `nginx`?
* Welche Elemente sind für eine eigene Box in `vagrant` unabdingbar?
* Wie funktionert das Packaging?
* Wie kann man die VMAdditions installieren? Und wieso braucht `vagrant` diese?
* Welche anderen Provider gibt es bei Vagrant noch?
* Wie kann man normalen Benutzer Root-Rechte automatisch zuweisen?
* Wohin und wie könnte man erstellte virtuelle Maschinen noch deployen (Stichwort Cloud-Anbieter)?
* Welche wichtigen Elemente sind in der `packer` Konfiguration im `json` File abzubilden?
* Wie können nach der Initialisierung der virtuellen Maschine automatisch Pakete installiert werden? Wo kann dies konfiguriert werden?

## Bewertung
Gruppengröße: 1 Person

### Anforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen
- [ ] Implementierung und Dokumentation der grundlegenden, funktionalen Anforderungen

### Anforderungen **zur Gänze erfüllt**
- [ ] Anpassung und Dokumentation der (möglichen) Bereitstellung einer Vagrant-Box
- [ ] Dokumentation von `package` und der automatischen Erstellung von Vagrant-Boxen
- [ ] Erläuterung der Nutzung von Vagrant Cloud

## Quellen

* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* "Discover Vagrant Boxes" [online](https://app.vagrantup.com/boxes/search)
* [account] "Vagrant Cloud - Create an Account"; zuletzt besucht 2020-04-28; [online](https://app.vagrantup.com/account/new) 
* [shell-provision] "Shell Provisioner"; zuletzt besucht 2020-04-28; [online](https://www.vagrantup.com/docs/provisioning/shell.html)
* [provisioning] "Provisioning example"; zuletzt besucht 2020-04-28; [online](https://www.vagrantup.com/intro/getting-started/provisioning.html)
* [createbox] "Creating a Base Box"; zuletzt besucht 2020-04-28; [online](https://www.vagrantup.com/docs/boxes/base.html)
* [packer] "Packer Documentation"; zuletzt besucht 2020-04-28; [online](https://www.packer.io/docs/index.html)
* [debian-netinst] "Debian Testing netinst - Weekly snapshots" [online](http://cdimage.debian.org/cdimage/weekly-builds/amd64/iso-cd/)
* "Vagrant Builder"; zuletzt besucht 2020-04-29; [online](https://www.packer.io/docs/builders/vagrant.html)
* "Packer Templates mainly for the Vagrant libvirt and VirtualBox" Petr Ruzicka; zuletzt besucht 2020-04-29; [online](https://github.com/ruzickap/packer-templates)
* "Bento - Packer templates for building Vagrant base boxes"; zuletzt besucht 2020-04-29; [online](https://github.com/chef/bento)
* "Example preseed" [online](https://www.debian.org/releases/buster/example-preseed.txt)
* "Unattended Installation for Debian" Packer [online](https://www.packer.io/guides/automatic-operating-system-installs/preseed_ubuntu.html)

---

**Version** *20230406v1*
