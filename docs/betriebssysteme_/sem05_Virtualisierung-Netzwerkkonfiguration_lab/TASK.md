---
hide:
  - navigation
---

# "*Netzwerkkonfiguration*" - Taskdescription

## Einführung
Virtuelle Maschinen müssen sich die Hardware des Hostsystems mit eben diesem teilen. Eine wichtige Resource ist dabei die Netzwerkschnittstelle, die unterschiedlich konfiguriert werden kann.

## Ziele
Ziel dieser Aufgabenstellung ist die Recherche von möglichen Netzwerkkonfigurationen der virtuellen Maschine. Es sind die Vor- und Nachteile der jeweiligen Konfiguration zu analysieren und abzuwägen.  
Verwendung von technischen Services unter der Prämisse, dass die Serverinstanzen leicht zum Einsatz kommen - z.B. in verschiedenen Umgebungen (INSY, SYT) die Verwendung  vordefinierten Umgebungen.

**Viele Fragen können grundsätzlich in den Benutzerhandbüchern der jeweiligen Software recherchiert werden. Es bietet sich an, diese zuerst zu konsultieren, bevor man Dr. Google nach Rat fragt. RTFM spart meist Zeit und Nerven!**

## Kompetenzzuordnung
#### GK SYT5 Betriebssysteme | Betriebssystemeinsatz | Virtualisierung
* "Betriebssysteme in virtuellen Maschinen installieren, diese klonen, importieren und exportieren"
* "Snapshots von virtuellen Maschinen einsetzen"

## Voraussetzungen
* Grundsätzliches Verständnis von Betriebssystemen
* Lesen und Umsetzen von Installationsanleitungen
* Linux VM ohne Desktop

## Detaillierte Aufgabenbeschreibung
Aufbauend auf der letzten Aufgabe geht es nun an die Konfiguration der virtuellen Maschine.
*VMWare*, *VirtualBox* und ähnliche Vollvirtualisierungsumgebungen verwalten die Hardware-Ressourcen und stellen diese dem Gastsystem zur Verfügung, wie zum Beispiel die Netzwerkkarte.
Je nach Einsatzzweck der virtuellen Maschine gibt es verschiedene Varianten, wie sich die virtuelle Instanz und das Host-System die Netzwerkkarte teilen können.

### Grundanforderungen

#### VM Installation

Installiere die neueste *"VMware Workstation Professional"* (nicht den *Player*) bzw. *"VMware Fusion Pro"* für Mac (Lizenz bekommst du als Email zugesandt) ([Anleitung](https://www.mikeroysoft.com/post/download-fusion-ws/)). Beachte dabei die notwendigen Voraussetzungen! Dokumentiere die wichtigsten Schritte deiner durchgeführten Tätigkeiten (Tipp: Markdown is your friend).

Installiere nun [Ubuntu Server](https://ubuntu.com/download/server) als Gastbetriebssystem (siehe Voraussetzungen). Finde einen Ort auf deiner Festplatte, wo du ausreichend Speicherplatz zur Verfügung hast (ca. 12 GB). Die Default-Werte, die du bei der Installation auswählen kannst sind für den Moment vollkommen ausreichend. Installiere auch den SSH Server Protokolliere die getätigten Entscheidung trotzdem.

Überlege dir dabei, dass diese neu erstellte, virtuelle Maschine deine Arbeitsumgebung im Fach "Systemtechnik" sein wird. Wie sieht deine Backupstrategie aus? Was wenn dein Rechner nicht mehr funktioniert?

Die installierte Umgebung ist ein vollwertiges Desktop-Betriebssystem. Wie kannst du nun aus deiner Host-Umgebung diese am besten nutzen? Es sind dazu weitere Schritte notwendig. Aktiviere die grafische Unterstützung, damit du den Vollbildmodus auch nutzen kannst. Gib im Gastbetriebssystem ein Verzeichnis deiner Host-Umgebung frei, damit du einfach Dateien austauschen kannst. Dokumentiere die notwendigen Schritte und deine getätigten Konfigurationen.

Nach der erfolgreichen Installation des Gastsystems und allen weiteren, notwendigen Komponenten ist eine Sicherung vorzunehmen. Beschreibe den Nutzen der Snapshots und den Unterschied einer pausierten im Gegensatz zu einer heruntergefahrenen virtuellen Maschine.

Der Nutzen von virtuellen Umgebungen ist in der IT nicht von der Hand zu weisen. Verschiedene Systeme, neueste Versionen - man kann schnell und einfach Umgebungen ausprobieren. Lade die neueste *Kali Linux 64Bit-Version* als Image herunter (ca. 3.3GB) und importiere diese in deinem Virtualisierungstool. Wie kannst du sicher gehen, dass beim Download du auch wirklich das gewünschte File erhalten hast? Überprüfe dazu den beigefügten *SHA256Sum* Hash. Dokumentiere die notwendigen Schritte!

#### Netzwerke

Recherchiere in welchen grundlegenden Eckpunkten sich die möglichen Netzwerkkonfigurationen unterscheiden. Gib auch zumindest jeweils ein Einsatzgebiet an, wo der jeweilige Modus Sinn macht. Dokumentiere auch mithilfe von Netzwerkdiagrammen bzw. Bildern und versuche nicht nur eine Quelle zu finden! Welche Standard-Einstellung ist bei deiner Virtualisierungsumgebung gesetzt?

Konfiguriere nun deine virtuelle Maschine so, dass du sie von deinem Host-System per ping-Befehl erreichen kannst, allerdings andere Geräte im Netzwerk von der virtuellen Maschine nichts sehen. Welche Einstellung bewährt sich für diese Art der Netzwerkkommunikation?

Ändere nun die Einstellungen der virtuellen Netzwerkkarte auf *bridged* und versuche nun mit deinem Gast-System eine externe Adresse zu pingen (z.B. `ping ipv4.icanhazip.com`). Welche IP-Adresse hat nun dein Gast-System erhalten?

Sobald du dich mit deiner virtuellen Instanz ins Internet verbinden kannst, mache ein Systemupdate deiner Linux Installation mittels `sudo apt update; sudo apt upgrade`. Was geschieht bei diesen zwei Befehlen?

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig.

## Bewertung im Labor
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] VM Installation und Konfiguration
- [ ] Konfiguration von Host-Only und Test aus dem Host-System
- [ ] Konfiguration von NAT und Test aus dem Host-System
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Konfiguration von Bridged Networking
- [ ] Update der virtuellen Instanz durchgeführt

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* "Virtual Networking" User Manual **Virtualbox** [online](https://www.virtualbox.org/manual/UserManual.html#networkingdetails)
* "Understanding Common Networking Configurations" **vmware Docs** [online](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-D9B0A52D-38A2-45D7-A9EB-987ACE77F93C.html)
* "Configuring Virtual Network Adapter Settings" User Manual **VMware** [online](https://docs.vmware.com/en/VMware-Workstation-Player-for-Windows/15.0/com.vmware.player.win.using.doc/GUID-C82DCB68-2EFA-460A-A765-37225883337D.html)
* "Configuring a Virtual Network" Knowledge Base **VMware** [online](https://www.vmware.com/support/ws5/doc/ws_net.html)


---
**Version** *20240916v6*
