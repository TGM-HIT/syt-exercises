# "Praxisbeispiel Firmennetzwerk" - Taskdescription

## Einführung
In dieser Aufgabe soll der Domain Controller für ein hypothetisches Firmennetzwerk konfiguriert werden.
***Achtung: Mache einen Snapshot des Servers bevor du mit dieser Aufgabe beginnst.*** Außerdem soll ein Konzept für die Expansion dieser hypothetischen Firma erstellt werden.

## Ziele
Ziel dieser Übung ist es, ein besseres Gefühl für den administrativen Mehrwert von Windows-Domänen zu bekommen.

## Kompetenzzuordnung
#### EK SYT6 Betriebssysteme | Serverinstallation | Verzeichnisdienst
* erweiterte Services einrichten und konfigurieren

## Voraussetzungen
* GK Übung GK632 muss erfolgreich abgeschlossen sein

## Detaillierte Aufgabenbeschreibung

**Erweiterter Inhalt**

Du bist Administrator eines Firmennetzwerkes. Du hast bereits grundlegende Vorarbeiten für die künftige Netzwerkinfrastruktur deines Unternehmens geleistet (Konfiguration des Microsoft Server 2019). Nun sollen noch folgende Ergänzungen realisiert werden:

***Achtung: Mache einen Snapshot des Servers bevor du mit den Aufgaben beginnst.***

- Je ein Fileshare für die Abteilungen R&D sowie Marketing. Mitarbeiter der jeweils anderen Abteilung sollen keinen Zugriff auf den Fileshare der Abteilung haben.
- Lege je einen Benutzeraccount für einen Mitarbeiter aus R&D sowie Marketing an (freie Namenswahl).
- Lege Gruppen für die verschiedenen Abteilungen (R&D, Marketing, Admin) an. Organisiere die Benutzer und Gruppen sinnvoll in Organisationseinheiten
- Gib deinem Benutzer (der im Praxisteil bereits angelegt wurde) die notwendigen Berechtigungen um die Domäne administrieren zu können.
- Der Fileshare "Allgemein" soll jedem Benutzer nach dem Anmelden automatisch als Netzlaufwerk verbunden werden (Gruppenrichtlinie).

## Fragestellungen

**Erweiterter Inhalt**

- In naher Zukunft soll dein Unternehmen expandieren. Es werden in den nächsten 6 Monaten 200 neue Mitarbeiter am Standort Wien ihren Dienst antreten. Jeder dieser Mitarbeiter soll ein von dir konfiguriertes Notebook (Windows 10 inklusive Office 365, eingebunden in die Domäne) sowie einen Benutzeraccount bekommen. Du hast bei der Methodenwahl alle Freiheiten. Wie würdest du diese Aufgabe effektiv lösen?

## Abgabe
Die Abgabe wird elektronisch als PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden. Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengrösse: 1 Person
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Vollständige Bearbeitung der Aufgabenstellungen

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=1939)

---
**Version** *20210214v1*
