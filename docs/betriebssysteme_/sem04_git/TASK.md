---
hide:
  - navigation
---

# "GIT Einführung" - Taskdescription

## Einführung

Cloudspeicher eignen sich gut für Backups kleinerer Daten und um Daten zwischen Geräten zu synchronisieren. Beim Kollaborativen Arbeiten stoßen diese aber bald an ihre Grenzen, vor allem wenn es sich um Code handelt.

## Ziele

Versionsverwaltung mit Git kennenlernen


## Kompetenzzuordnung

#### SYT4 Betriebssysteme - Anwendung

* Bedienung von Betriebssystemen - einfache Befehle mit den wichtigsten Optionen verwenden sowie Berechtigungen auf Datei-systemebene erklären und administrieren

## Voraussetzungen

* Github Account

## Detaillierte Aufgabenbeschreibung

Bitte versuche alle wichtigen Information kurz und prägnant in einem Grafiz zu verschriftlichen.

### Installation

Installiere [Git](https://git-scm.com/), z.B. nach folgender [Schritt-für-Schritt Anleitung](https://phoenixnap.com/kb/how-to-install-git-windows).

### Theorie

Mache folgendes [Tutorial](https://www.w3schools.com/git/default.asp?remote=github) durch.

### Übungen

#### Übung 1

1. Initialisiere ein lokales Repository
1. Erstelle 2 Markdown-Dateien in dem Repository-Ordner und befülle sie mit Text
1. Führe `git status` aus
1. Füge die Erste der beiden Dateien zu Git hinzu (`git add Dateiname.md`)
1. Führe `git status`, `git diff` aus
1. Commite die Datei mit der Nachricht "Erster Commit"
1. Führe `git log` aus
1. Füge die zweite Datei hinzu
1. Ändere etwas an der ersten Datei (mindestens je eine: Zeile hinzufügen, Zeile entfernen, Zeile abändern)
1. Führe `git status` und `git diff` aus
1. Commite die Datei mit der Nachricht "Zweiter Commit"
1. Führe `git status` und `git log` aus

#### Übung 2

1. Initialisiere ein lokales Git-Repository
1. Füge folgende Dateitypen (mit Inhalt) hinzu: Markdown, Java, Word, Bild
1. Commite die hinzugefügten Dateien
1. Mach Änderungen an allen Dateien
1. Commite erneut alle Dateien
1. Schau dir an, wie gut/schlecht Git mit den jeweiligen Dateitypen umgehen kann

#### Übung 3

Finde dich mit ein paar Kollegen zusammen und macht zusammen eine Zusammenfassung eines Stoffinhaltes und nutzt als Werkzeug für die Zusammenarbeit Git.

1. Einer erstellt auf einem Git Server Dienst (Github, Bitbucket, Gitlab, etc.) ein Repository
1. Alle clonen sich das Repository
1. Arbeitet gleichzeitig an der Zusammenfassung (eine Datei) und commited, pulled und pushed regelmäßig. Die Ausarbeitungsbereiche sollen sich bewusst überschneiden, damit ihr austesten könnt, wie gut Git mit Konflikten umgehen kann.

##### Zeitlicher Ablauf

1. Schüler 1 erstellt die Datei, added, commited und pushed die Datei
1. Schüler 2 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 3 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 1 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 2 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 3 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 1 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 2 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen
1. Schüler 3 pulled, ergänzt/ändert/löscht was bei der Datei, added, commited und pushed die Änderungen

##### Mindestanforderung

* Mindestens 3 Personen tragen pro Repository bei
* Jeder macht mindestens 3 Commits mit Änderungen und pushed die auf den Server
* Jeder pulled die Commits der anderen Personen (d.h. ich muss im bei jedem die Änderungen der anderen Personen sehen)

Online-Abgabe des gezippten Ordner (der den Letztstand aller Dateien **und den .git Ordner** enthält)

## Fragestellungen

* Was ist der Unterschied zwischen einem Cloudspeicher Service wie Dropbox oder Google Drive und einem Version Verwaltung Service wie Github oder Gitlab?

Fasse in eigenen Worten zusammen was folgende Befehle machen:

* `git init`
* `git add`
* `git status`
* `git diff`
* `git log`
* `git commit`
* `git clone`
* `git push`
* `git pull`

## Abgabe

Die durchgeführten Tätigkeiten und gewünschten Elemente müssen auf einem Grafiz zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Vor diesem Gespräch ist das Grafiz eingescannt als ein **PDF** File auf moodle abzugeben. (Microsoft Office Lens [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app/microsoft-office-lens-pdf-scan/id975925059); Online PDF Editor [pdffiller](https://www.pdffiller.com/de/))

## Bewertung

Gruppengröße: 1 Person

### Anforderungen **überwiegend erfüllt**

- [ ] Übungen 1 und 2 durchgeführt
- [ ] Fragestellungen beantwortet

### Anforderungen **zur Gänze erfüllt**

- [ ] Übung 3 durchgeführt

## Quellen

- [Git-Cheatsheet](http://ndpsoftware.com/git-cheatsheet.html#loc=workspace;)   
- [How to write Git-Commit-Messages](https://elearning.tgm.ac.at/mod/page/view.php?id=3508)   
- [AWESOME-AWESOME-README](https://github.com/leogdion/AWESOME-AWESOME-README)   
- "Mastering Markdown" Github Guides; [online](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
- [Learn Git Branching](https://learngitbranching.js.org/)

---

**Version**  *20230726v1*