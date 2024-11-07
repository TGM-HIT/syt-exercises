---
hide:
  - navigation
---

# "*Netzwerke in virtuellen Umgebungen*" - Taskdescription

## Einführung
Virtuelle Maschinen müssen sich die Hardware des Hostsystems mit eben diesem teilen. Eine wichtige Resource ist dabei die Netzwerkschnittstelle, die unterschiedlich konfiguriert werden kann.

## Ziele
Ziel dieser Aufgabenstellung ist die Recherche von möglichen Netzwerkkonfigurationen der virtuellen Maschine. Es sind die Vor- und Nachteile der jeweiligen Konfiguration zu analysieren und abzuwägen.  
Verwendung von technischen Services unter der Prämisse, dass die Serverinstanzen leicht zum Einsatz kommen - z.B. in verschiedenen Umgebungen (INSY, SYT) die Verwendung  vordefinierten Umgebungen.

**Viele Fragen können grundsätzlich in den Benutzerhandbüchern der jeweiligen Software recherchiert werden. Es bietet sich an, diese zuerst zu konsultieren, bevor man Dr. Google nach Rat fragt. RTFM spart meist Zeit und Nerven!**

## Kompetenzzuordnung
#### GK SYT5 Betriebssysteme | Betriebssystemeinsatz | Virtualisierung
* "Snapshots von virtuellen Maschinen einsetzen"

## Voraussetzungen
* Grundsätzliches Verständnis von Betriebssystemen
* Lesen und Umsetzen von Installationsanleitungen

## Detaillierte Aufgabenbeschreibung
Aufbauend auf der letzten Aufgabe geht es nun an die Konfiguration der virtuellen Maschine.
*VMWare*, *VirtualBox* und ähnliche Vollvirtualisierungsumgebungen verwalten die Hardware-Ressourcen und stellen diese dem Gastsystem zur Verfügung, wie zum Beispiel die Netzwerkkarte.
Je nach Einsatzzweck der virtuellen Maschine gibt es verschiedene Varianten, wie sich die virtuelle Instanz und das Host-System die Netzwerkkarte teilen können.

## Fragestellungen
1. Was sind die Mindestanforderungen an das Host-System für die aktuelle Version von VirtualBox bzw. VMware (Hard- und Software)?
2. Welche Einstellungen am Host-System können die Performance der Virtualisierung erhöhen? Was ist dabei das Kürzel [AMD-V](https://www.amd.com/en/technologies/virtualization-solutions) bzw. [VT-x](https://www.intel.com/content/www/us/en/support/articles/000005486/processors.html)
3. Wieso werden die virtuellen Partitionen gerne auf mehrere Dateien aufgeteilt?
4. Welche zusätzliche(n) Komponente(n) sind zur besseren Integration des Gastbetriebssystems von nöten? Was muss dabei beachtet werden?
5. Was ist der Host-Key und wie kommt dieser zum Einsatz?
6. Wie sind Virtualisierungsumgebungen aufgebaut? Welche Bestandteile sind dabei notwendig? Wieso kann man ein Betriebssystem innerhalb eines anderen Betriebssystems ausführen?
7. Was ist das *Open Virtualization Format Archive*? Welche Eckpunkte müssen beim Importieren und Exportieren von virtuellen Maschinen beachtet werden?
8. Welche drei gängigen Konfigurationsarten gibt es bei der Netzwerkkonfiguration von virtuellen Maschinen?
9. Wann verwende ich welche Netzwerkkonfiguration?
10. Welche Auswirkungen auf die an die VM vergebene IP-Adresse hat der jeweilige Modus?
11. Wie können externe Netzwerkknoten auf die Gast-Instanz zugreifen?
12. Was muss das Host-System starten, damit eine automatische IP-Vergabe in der Gast-Instanz zustande kommen kann? Wie kann man das auch manuell lösen?
13. Wo werden die virtuellen Netzwerkdevices verwaltet?
14. Wie kann ein bestimmtes Netzwerkinterface bei der *Bridged* Variante ausgewählt werden?

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden.

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* "Virtual Networking" User Manual **Virtualbox** [online](https://www.virtualbox.org/manual/UserManual.html#networkingdetails)
* "Understanding Common Networking Configurations" **vmware Docs** [online](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-D9B0A52D-38A2-45D7-A9EB-987ACE77F93C.html)
* "Configuring Virtual Network Adapter Settings" User Manual **VMware** [online](https://docs.vmware.com/en/VMware-Workstation-Player-for-Windows/15.0/com.vmware.player.win.using.doc/GUID-C82DCB68-2EFA-460A-A765-37225883337D.html)
* "Configuring a Virtual Network" Knowledge Base **VMware** [online](https://www.vmware.com/support/ws5/doc/ws_net.html)


---
**Version** *20230904v5*
