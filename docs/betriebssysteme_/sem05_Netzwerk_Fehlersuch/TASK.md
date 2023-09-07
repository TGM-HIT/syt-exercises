# "*Netzwerke Fehlersuche*" - Taskdescription

## Einführung
Virtuelle Maschinen müssen sich die Hardware des Hostsystems mit eben diesem teilen. Eine wichtige Resource ist dabei die Netzwerkschnittstelle, die unterschiedlich konfiguriert werden kann.

## Ziele
Ziel dieser Aufgabenstellung ist die Recherche von möglichen Netzwerkkonfigurationen der virtuellen Maschine. Es sind die Vor- und Nachteile der jeweiligen Konfiguration zu analysieren und abzuwägen.  
Verwendung von technischen Services unter der Prämisse, dass die Serverinstanzen leicht zum Einsatz kommen - z.B. in verschiedenen Umgebungen (INSY, SYT) die Verwendung vordefinierten Umgebungen.

## Kompetenzzuordnung
#### EK SYT5 Betriebssysteme | Betriebssystemeinsatz | Virtualisierung
* "weitere Virtualisierungsumgebung anwenden und Container erklären"

## Voraussetzungen
* Grundsätzliches Verständnis von Betriebssystemen
* Lesen und Umsetzen von Installationsanleitungen
* Erfolgreich abgeschlossene Übung *GKL531*

## Detaillierte Aufgabenbeschreibung
Aufbauend auf der letzten Aufgabe geht es nun an die Konfiguration der virtuellen Maschine.
*VMWare*, *VirtualBox* und ähnliche Vollvirtualisierungsumgebungen verwalten die Hardware-Ressourcen und stellen diese dem Gastsystem zur Verfügung, wie zum Beispiel die Netzwerkkarte.
Je nach Einsatzzweck der virtuellen Maschine gibt es verschiedene Varianten, wie sich die virtuelle Instanz und das Host-System die Netzwerkkarte teilen können.

### Erweiterungen
Welche Schritte sind notwendig um bei einem Problem, die Ursache zu finden? Versuche einen Entscheidungsbaum (z.B. mit einem Flussdiagramm oder einem UML-Aktivitätsdiagramm) zu erstellen. Beginne mit dem klassischen Problem *"Das Internet ist nicht erreichbar!"* und versuche dich langsam an die Ursache heran zu tasten.

Installiere in deinem Gastsystem einen Webserver (z.B. mit `sudo apt install nginx`) und zeige mit deinem Default-Browser im Host-System die Willkommensseite. Welche Konfigurationsschritte sind dabei für *NAT* notwendig? Welche Schritte wären notwendig, sodass auch andere im TGM-Netzwerk auf das neu installierten Service zugreifen können (Tipp: Firewall)?

## Fragestellungen
### Erweiterte Kompetenzen
* Welche Vor- und Nachteile haben die unterschiedlichen Konfigurationen in Bezug auf die Verwendung von virtuellen Instanzen?
* Welche gängigen Fehler kommen bei der Netzwerkkonfiguration von virtuellen Maschinen auf? (Tipp: FaQ)
* Welche Quellen können bei der Lösung bei netzwerktechnischen Problemen heran gezogen werden? Wie ist dabei die Qualität zu bewerten?
* Was sind die Aufgaben des Hypervisors?
* Wie unterscheiden sich Container zu vollvirtualisierten Maschinen?
* Ist die Prozessorarchitektur austauschbar? Kann man eine arm-Maschine auf einem x86-Host virtualisiert starten? Warum?

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig.

## Bewertung im Labor
Gruppengrösse: 1 Person
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Fragestellungen beantwortet
- [ ] Konfiguration des DHCP-Servers für die Vergabe von internen IPs

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Konfiguration von NAT für den TCP Port 80 und Aufsetzen eines Webservers
- [ ] Problemlösungs-Chart erstellt

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)
* "Virtual Networking" User Manual **Virtualbox** [online](https://www.virtualbox.org/manual/UserManual.html#networkingdetails)
* "Understanding Common Networking Configurations" **vmware Docs** [online](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-D9B0A52D-38A2-45D7-A9EB-987ACE77F93C.html)
* "Configuring Virtual Network Adapter Settings" User Manual **VMware** [online](https://docs.vmware.com/en/VMware-Workstation-Player-for-Windows/15.0/com.vmware.player.win.using.doc/GUID-C82DCB68-2EFA-460A-A765-37225883337D.html)
* "Configuring a Virtual Network" Knowledge Base **VMware** [online](https://www.vmware.com/support/ws5/doc/ws_net.html)


---
**Version** *20230904v5*
