# "*Backupstrategien*" - Taskdescription

## Einführung
Der plötzliche Verlust einer Festplatte oder auch ein Hardwareschaden dieser kann ein großen Schaden verursachen, der sich durch Back-ups vermeiden lässt. Die richtigen Back-up-Strategien sind daher notwendig und das regelmäßige Durchführen von Back-ups ist absolut erforderlich.

## Ziele
Ziel dieser Aufgabenstellung ist das Durchführen von verschiedenen Back-up-Strategien und die Erklärung dieser. Dabei ist ein Verständnis für die unterschiedlichen Zugänge notwendig und auch eine eigene Lösung für die persönliche IT-Infrastruktur gefragt!

**Viele Fragen können grundsätzlich in den Benutzerhandbüchern der jeweiligen Software recherchiert werden. Es bietet sich an, diese zuerst zu konsultieren, bevor man Dr. Google nach Rat fragt. RTFM spart meist Zeit und Nerven!**

## Kompetenzzuordnung
#### GK SYT5 Betriebssysteme | Betriebssystemeinsatz | Backups
* "Sicherungspunkte setzen und Backups automatisieren"

#### EK SYT5 Betriebssysteme | Betriebssystemeinsatz | Backups
* "verschiedene Backupstrategien erklären"

## Voraussetzungen
* Grundsätzliches Verständnis von Betriebssystemen
* Linux Betriebssystem in einer VM 
* Grundsätzliche Basics in der Kommandozeile 
* Erfolgreich abgeschlossene Übungen GEK531 udn GEK532 

## Detaillierte Aufgabenbeschreibung
Aufbauend auf den Aufgaben aus Virtualisierungen ist das Ziel dieser Aufgabe, verschiedene Werkzeuge und Methoden für Back-ups von deiner VM kennenzulernen und diese anzuwenden.

### Grundanforderungen
Die Bibliothek von Alexandria war in der Antike einer der wichtigsten Sammelpunkte für ein enormes Wissen, das auf verschiedene Schriftrollen festgehalten wurde. Eine Legende, sagt die Bibliothek, ist einem großen Brand zum Opfer gefallen. Am 11. März 2021 kam es bei dem Cloud-Anbieter OVH in Straßburg zu einem großen Feuer und mehrere Kunden ohne Back-ups haben ihre Daten verloren. [1](https://www.computerbase.de/2021-03/brand-ovh-feuer-rechenzentrum/)

Im Jahr 1888 erstelle der Büchersammler William Blades in seinem Buch "The Enemies of Books" eine große Liste, wie Bücher zerstört oder verloren gehen können.[2](https://archive.org/details/enemiesbooks01bladgoog) Stelle Überlegungen an, wie Daten auf einem Computer verloren gehen können oder wie die Hardware zerstört werden kann?

Diese historischen und aktuellen Beispiele zeigen, warum regelmäßige Sicherungen und die richtigen Strategien notwendig sind, um keine Daten zu verlieren. Der einfachste Weg für eine Sicherung deiner Daten wäre, diese zu kopieren (STRG+C) und auf einem anderen Laufwerk einzufügen (STRG+V). Dennoch wurde für regelmäßige und automatisierte Back-ups verschiedene Methoden und Werkzeuge entwickelt. Für Sicherungen von Daten wird in volle, differentielle und inkrementelle Sicherungen unterschieden. Versuche mit einer kleinen Internetrecherche den Unterschied zwischen voller, differentieller und inkrementelle Sicherung zu erklären! Was sind die Vorteile und Nachteile der unterschiedlichen Methoden?

Rsync[3](https://rsync.samba.org/) ist der Klassiker für Datensicherunge("Rsync  is a fast and extraordinarily versatile file copying tool."). Boote deine VM und versuche den Home-Ordner("/home/$USER") und die Konfigurationsdateien("/etc") von deinem System auf einen USB-Stick mit der Kommandozeile zu sichern. Zur Recherche des Befehls verwende die Manual-Page("man rsync") und weitere Dokumentation zu Rsync. [4](https://wiki.ubuntuusers.de/rsync/) Dokumentiere den Befehl den du zur Datensicherung verwendet hast in deiner Abgabe! Und vergiss nicht die Dokumentation des Befehls zur Wiederherstellung deiner gesicherten Daten.

### Erweiterungen* 
Ein relatives neues Tool für Datensicherung ist Borgbackup[5](https://www.borgbackup.org/) und findet bereits jetzt sehr viel Verwendung. Borgbackup muss aus offiziellen Paketquellen deines Betriebssystems installiert werden ("sudo apt install borgbackup") und es gibt eine umfassende Dokumentation.[6](https://borgbackup.readthedocs.io) Bei der Verwendung von Borgbackup muss am Datensicherungsort zuerst eine Repository initialisiert werden ("borg init /PFAD_ZU_DEINEM_USB_STICK"). Versuche nun mit der Borgbackup-Dokumentation ein Back-up vom Home-Ordner und der Konfigurationsdatei deiner VM am USB-Stick anzulegen. Weiters sollst du das angelegte Back-up in deiner VM wiederherstellen. Dokumentiere und erkläre die Befehle in deiner Abgabe!

## Fragestellungen
* Wie oft sollte eine Datensicherung durchgeführt werden?
* Wohin sollte ein erstelltes Backup abgespeichert werden? 
* Welche Daten von deinem System sollten bei einem Backup abgespeichert werden?
* Was ist deine persönliche Backupstrategie für deinen eigenen Computer? 
* Wie kann mit Rsync die Datensicherung automatisiert werden?

### Erweiterte Kompetenzen
* Welche Backupstrategie würdest du der Bibliothek von Alexandria empfehlen? 
* Was muss bei der Datensicherung auf einem entfernten Rechner/Server/Cloud beachten werden?
* Wie kann Rsync mit ssh verwendet werden?
* Wie wirken sich unterschidliche Kompression auf Datensicherungen aus? 

## Abgabe
Die durchgeführten Tätigkeiten sollen kurz und prägnant in einem Dokument zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden. Die Abgabe ist als PDF in moodle zu tätigen.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig.

## Bewertung
Gruppengrösse: 1 Person
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Durchführung eines Backups mit Rsync auf einem externen USB-Stick
- [ ] Ausarbeitung der Aufgabenstellung aus dem Teil Grundanforderungen
- [ ] Erklärung der unterschiedlichen Datensicherungsmethoden
- [ ] Ordentliche Dokumentation und Quellen in der Abgabe
- [ ] Widerherstellung der Datensicherung
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Durchfürhung der Aufgabenstellung aus dem Teil Erweitertungen
- [ ] Ausarbeitung aller Fragestellungen aus dem Teil erweiterte Kompetenzen
- [ ] Ordenliche Dokumentation/Erklärung aller verwendeten Befehle

## Quellen
1. "Brand bei OVH: Kunden ohne Backups blicken auf Bilder verbrannter Server" ComputerBase; zuletzt besucht am 2021-12-07; [online](https://www.computerbase.de/2021-03/brand-ovh-feuer-rechenzentrum/)
2. "The enemy of books" William Blades 1888; [online](https://archive.org/details/enemiesbooks01bladgoog)
3. "Welcome to the rsync web pages"; zuletzt besucht am 2021-12-07; [online ](https://rsync.samba.org/)
4. "rsync" ubuntuusers.de; zuletzt besucht am 2021-12-07; [online](https://wiki.ubuntuusers.de/rsync/)
5. "Borgbackup"; zuletzt besucht am 2021-12-07; [online](https://www.borgbackup.org/) 
6. "Borg Documentation"; zuletzt besucht am 2021-12-07; [online](https://borgbackup.readthedocs.io/en/stable/)


---
**Version** *20211207v1*
