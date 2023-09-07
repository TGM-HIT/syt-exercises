# "*Virtuelle Maschine installieren*" - Taskdescription

## Einführung
Im Laufe dieses und der nächsten Schuljahre werden wir immer wieder virtuelle Maschinen verwenden. Diese ermöglichen einen einfachen Wechsel von verschiedenen Arbeitsumgebungen zur Entwicklung und Testung von Systemen und Software.

## Ziele
Ziel dieser Aufgabenstellung ist daher zunächst die Installation der entsprechenden Software sowie eines Linux-Systemes als Gastbetriebssystem. Dabei ist das Verständnis von einer Vollvirtualisierung im eigenen Hostsystem notwendig. Das installierte Linux System ist für die zukünftigen Aufgaben von Nutzen.

**Viele Fragen können grundsätzlich in den Benutzerhandbüchern der jeweiligen Software recherchiert werden. Es bietet sich an, diese zuerst zu konsultieren, bevor man Dr. Google nach Rat fragt. RTFM spart meist Zeit und Nerven!**

## Kompetenzzuordnung
#### GK SYT5 Betriebssysteme | Betriebssystemeinsatz | Virtualisierung
* "Betriebssysteme in virtuellen Maschinen installieren, diese klonen, importieren und exportieren"
* "Snapshots von virtuellen Maschinen einsetzen"

#### EK SYT5 Betriebssysteme | Betriebssystemeinsatz | Virtualisierung
* "weitere Virtualisierungsumgebung anwenden und Container erklären"

## Voraussetzungen
* Grundsätzliches Verständnis von Betriebssystemen
* Lesen und Umsetzen von Installationsanleitungen
* Download von VirtualBox
* Download von Xubuntu 20.04 Desktop AMD64 ISO-Image (ca. 1,5 GB)

## Detaillierte Aufgabenbeschreibung

### Grundanforderungen
Installiere die neueste [VirtualBox](https://www.virtualbox.org/) Version für dein Host-Betriebssystem **oder** die neueste *"VMware Workstation Professional"* (nicht den *Player*) bzw. *"VMware Fusion Pro"* für Mac (Lizenz bekommst du als Email zugesandt). Beachte dabei die notwendigen Voraussetzungen! Dokumentiere die wichtigsten Schritte deiner durchgeführten Tätigkeiten (Tipp: Markdown is your friend).

Installiere nun Xubuntu als Gastbetriebssystem in der Desktop-Version (siehe Voraussetzungen). Finde einen Ort auf deiner Festplatte, wo du ausreichend Speicherplatz zur Verfügung hast (ca. 12 GB). Die Default-Werte, die du bei der Installation auswählen kannst sind für den Moment vollkommen ausreichend. Protokolliere die getätigten Entscheidung trotzdem.

Überlege dir dabei, dass diese neu erstellte, virtuelle Maschine deine Arbeitsumgebung im Fach "Systemtechnik" sein wird. Wie sieht deine Backupstrategie aus? Was wenn dein Rechner nicht mehr funktioniert?

Die installierte Umgebung ist ein vollwertiges Desktop-Betriebssystem. Wie kannst du nun aus deiner Host-Umgebung diese am besten nutzen? Es sind dazu weitere Schritte notwendig. Aktiviere die grafische Unterstützung, damit du den Vollbildmodus auch nutzen kannst. Gib im Gastbetriebssystem ein Verzeichnis deiner Host-Umgebung frei, damit du einfach Dateien austauschen kannst. Dokumentiere die notwendigen Schritte und deine getätigten Konfigurationen.

Nach der erfolgreichen Installation des Gastsystems und allen weiteren, notwendigen Komponenten ist eine Sicherung vorzunehmen. Beschreibe den Nutzen der Snapshots und den Unterschied einer pausierten im Gegensatz zu einer heruntergefahrenen virtuellen Maschine.

Der Nutzen von virtuellen Umgebungen ist in der IT nicht von der Hand zu weisen. Verschiedene Systeme, neueste Versionen - man kann schnell und einfach Umgebungen ausprobieren. Lade die neueste *Kali Linux 64Bit-Version* als Image herunter (ca. 3.3GB) und importiere diese in deinem Virtualisierungstool. Wie kannst du sicher gehen, dass beim Download du auch wirklich das gewünschte File erhalten hast? Überprüfe dazu den beigefügten *SHA256Sum* Hash. Dokumentiere die notwendigen Schritte!

### Erweiterungen
Verwende als Vollvirtualisierungstool auf jeden Fall die neueste *"VMware Workstation Professional"* (nicht den *Player*) bzw. *"VMware Fusion Pro"* für Mac.

Importiere eine virtuelle Instanz in *VMware*. Dokumentiere die dazu notwendigen Schritte. Was muss dabei beachtet werden, wenn andere Virtualisierungsumgebungen verwendet werden?

Recherchiere welche grundlegenden Eckpunkte verbreitete Virtualisierungsumgebungen (z.B. *VirtualBox* und *VMware* bzw. *Hyper-V*) unterscheiden. Welche Vor- und Nachteile ergeben sich beim Einsatz (z.B. USB-Geräte) der beiden Lösungen? Dokumentiere und versuche nicht nur eine Quelle zu finden!

Wie schneidet *Hyper-V* beim Vergleich von virtuellen Umgebungen ab? Wieso verwendet man es trotzdem?

## Fragestellungen
* Was sind die Mindestanforderungen an das Host-System für die aktuelle Version von VirtualBox bzw. VMware (Hard- und Software)?
* Welche Einstellungen am Host-System können die Performance der Virtualisierung erhöhen? Was ist dabei das Kürzel [AMD-V](https://www.amd.com/en/technologies/virtualization-solutions) bzw. [VT-x](https://www.intel.com/content/www/us/en/support/articles/000005486/processors.html)
* Wieso werden die virtuellen Partitionen gerne auf mehrere Dateien aufgeteilt?
* Welche zusätzliche(n) Komponente(n) sind zur besseren Integration des Gastbetriebssystems von nöten? Was muss dabei beachtet werden?
* Was ist der Host-Key und wie kommt dieser zum Einsatz?
* Wie sind Virtualisierungsumgebungen aufgebaut? Welche Bestandteile sind dabei notwendig? Wieso kann man ein Betriebssystem innerhalb eines anderen Betriebssystems ausführen?
* Was ist das *Open Virtualization Format Archive*? Welche Eckpunkte müssen beim Importieren und Exportieren von virtuellen Maschinen beachtet werden?

### Erweiterte Kompetenzen
* Was sind die Aufgaben des Hypervisors?
* Wie unterscheiden sich Container zu vollvirtualisierten Maschinen?
* Ist die Prozessorarchitektur austauschbar? Kann man eine arm-Maschine auf einem x86-Host virtualisiert starten? Warum?

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig.

## Bewertung im Labor
Gruppengröße: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Installation von Virtualisierungsumgebung
- [ ] Installation von Gastsystem
- [ ] Snapshot Erstellung und Verwaltung
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Import von virtueller Maschine
- [ ] Einbindung und Nutzung der Gastumgebung im Host-System (Vollbildmodus, Dateiaustausch)

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Export/Import von virtuellen Maschinen unterschiedlicher Umgebungen
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Unterschiede von virtualisierten Umgebungen

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=199#section-4)
* "Betriebssysteme kompakt - Grundlagen, Daten, Speicher, Dateien, Prozesse und Kommunikation" Ch.Baun, Springer-Verlag, 2. Auflage 2020 [online](https://link.springer.com/book/10.1007%2F978-3-662-61411-2)
* "Installing Oracle VM VirtualBox and Extension Packs" User Manual **Virtualbox** [online](https://www.virtualbox.org/manual/UserManual.html#intro-installing)


---
**Version** *20221116v2*
