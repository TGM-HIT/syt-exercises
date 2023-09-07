# "Virtualisierungsumgebung installieren und nutzen" - Taskdescription

## Einführung
Verwendung von virtuellen Maschinen soll die gemeinsame Arbeit als auch die Anpassung von Deployments z.B. Kunden deutlich vereinfachen.

## Ziele
Das Ziel dieser Übung ist die Installation und Verwendung von text-basierten Virtualisierungsumgebungen um einfache Verteilung von Gast-Maschinen zu realisieren.

## Kompetenzzuordnung
**GK SYT6 Betriebssysteme | Virtualisierung | virtuelle Umgebung**  
* "Cloud-basierte virtuelle Maschinen erstellen"  
* "Serverdienste installieren"

**EK SYT6 Betriebssysteme | Virtualisierung | virtuelle Umgebung**  
* "Skalierungsfeatures von cloud-basierten Virtualisierungsplattformen verwenden"

## Voraussetzungen
* Grundverständnis von Netzwerk und Betriebssystemkonfiguration
* Grundverständnis von virtuellen Maschinen und dem Einsatz eines Hypervisors

## Detaillierte Aufgabenbeschreibung

**Anforderungen**

### Installation von Vagrant

Vagrant ist eine praktische Anwendung zum Installieren und Verwalten von virtuellen Maschinen mittels text-basierten Konfigurationsdateien. Im Hintergrund wird zum Hypervisor wie zB VirtualBox, VMWare oder HyperV verwendet, im Optimalfall bleibt der Hypervisor selbst aber vollkommen im Hintergrund - Per default wird hier VirtualBox verwendet, das du aus dem Wintersemester noch haben solltest.

Lade zunächst Vagrant [1] herunter und installiere es. Generell gibt es zur ersten Installation unter [2] ein gutes Tutorial; speziell unter Windows ist [3] sehr hilfreich.

### Anlegen eines Projektes

Erstelle ein leeres Verzeichnis, wechsle in dieses und führe das folgende Kommando aus: ``$ vagrant init debian/stretch64``

Hiermit wird eine VM initialisiert, die auf Debian 9 (Stretch) basiert. Bei ersten Starten wird zunäachst ein fertiges Debian 9 (Stretch) - Image heruntergeladen werden. Dieser Vorgang kann (im TGM (-; ) einige Zeit dauern, der Download ist ca. 352MB groß. Bei der Initialisierung einer weiteren VM ist dieser Vorgang nicht nötig. Du siehst in deinem Ordner eine Datei namens "Vagrantanfile", die die Konfigurationsdaten  deiner VM enthält.

### Start der VM
Fuehre nun folgendes Kommando aus. Das laedt das Image selbst herunter und startet die VM: `$ vagrant up`

Verbinde dich nun zur VM: Unter Linux am Host kannst du das mittels `vagrant ssh` erreichen, unter Windows folge zB dem Tutorial [2] und verwende Putty [4]. Wenn das funktioniert, Gratulation, du kannst Vagrant nun verwenden.

Lass die mittels `vagrant help` die Hilfe anzeigen. Wie kannst du die VM nach erledigter Arbeit wieder herunterfahren?

### Installieren von Softwarepaketen

Software-Pakete werden unter Debian (wie auch Ubuntu) üblicherweise mit dem Tool apt aus den Debian-Paketrepositories heruntergeladen und installiert. 

Die Seite [5] liefert einen sehr guten Überblick über dessen Verwendung - die offizielle Dokumentation findet sich unter [6]. (Anmerkung: Für ältere Debian-Versionen wirst du online oft auch Beschreibungen der Tools `apt-get` oder `apt-search` finden - Diese sind mittlerweile veraltet und deren Funktionalität wurde in apt zusammengeführt.) Installiere das Paket **cowsay** und verwende es.

Genau genommen werden unter Pakete unter Debian mit dem Tool `dpkg` installiert. Recherchiere dessen Unterschied zu `apt` und erkläre, für welche Anwendungszwecke man `dpkg` direkt verwendet.

Installiere den Webserver **nginx** mit php in deiner VM nach folgendem Tutorial [7]. Konfiguriere deine VM so, dass du von deinem Hostsystem den Webserver aufrufen kannst.

## Fragestellungen
* Unter welcher Option ist das Betriebssystem (also das Basisimage) vermerkt?
* Wie lässt sich ein Port vom Hostsystem in die VM weiterleiten (forwarden)?
* Wie lässt sich ein privates (Host-Only) Netzwerk einrichten oder der VM eine öffentliche IP-Adresse zuweisen?
* Was bewirkt die Option `config.vm.provision`? (In eigenen Worten)
* Was bewirkt `apt update`?
* Welches Paket enthält in debian den php-Interpreter? In welcher Version liegt es in Debian Stretch vor?
* Wie kannst du dir mittels `apt` die Versionsnummern von Paketen anzeigen lassen?
* Was ist der Unterschied zwischen den Kommandos `apt update` und `apt upgrade`?
* Welche Möglichkeiten gibt es, mittels `apt` Pakete wieder zu löschen?

## Bewertung
Gruppengröße: 1 Person
### Anforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen
### Anforderungen **zur Gänze erfüllt**
- [ ] Implementierung der grundlegenden, funktionalen Anforderungen
## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* [1] https://www.vagrantup.com/
* [2] https://www.vagrantup.com/intro/getting-started/
* [3] https://www.sitepoint.com/getting-started-vagrant-windows/
* [4] https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html
* [5] https://itsfoss.com/apt-command-guide/
* [6] https://wiki.debian.org/DebianPackageManagement
* [7] https://www.digitalocean.com/community/tutorials/how-to-install-linux-nginx-mysql-php-lemp-stack-on-debian-9

---
*Version 20230406v1*