---
hide:
  - navigation
---

# "*WSL Windows Subsystem for Linux*" - Taskdescription

## Einführung

Unterschiedliche Betriebssysteme haben ihre Stärken und Schwächen, sind aber meist untereinander nicht kompatibel. Ein mächtiges Tool unter Windows ist WSL, welches erlaubt Linux Programme auszuführen.

## Ziele

WSL Windows Subsystem for Linux kennenlernen


## Kompetenzzuordnung

#### SYT4 Betriebssysteme - Aufgaben des Betriebssystems

* Systemaufrufe, Speicher- und Prozessverwaltung - aktuelle Betriebssysteme unterscheiden und deren Eigenschaften erklären
* Virtualisierung - Betriebssysteme in virtuellen Maschinen installieren, Snapshots von virtuellen Maschinen einsetzen, diese klonen, importieren und exportieren

## Voraussetzungen

* Lesen und Umsetzen von Arbeitsanweisungen

## Detaillierte Aufgabenbeschreibung
Bitte versuche alle wichtigen Information kurz und prägnant in einem Grafiz zu verschriftlichen.

### Installation
1. Windows Features --> Subsystem für Linux aktivieren (Reboot)
2. Windows Store --> Install Ubuntu
3. `wsl`
4. Create User+PW (Passwordmanager)
### Using WSL
### Example Task `du sort grep`

1. Wie lässt sich der Festplattenverbrauch von Dateien anzeigen?
2. Wie lässt sich die Ausgabe nach Größe sortieren?
3. What the [grep](https://manpages.org/grep/1)? Schränke die Ausgabe auf Systemtechnik relevante Dateien ein. 
4. [Grep in Windows?](https://www.shellhacks.com/windows-grep-equivalent-cmd-powershell/)

### pdfgrep
1. `sudo apt-get update`
2. `sudo apt-get upgrade`
3. `sudo apt install pdfgrep`
4. `man pdfgrep`
5. Lade folgende PDFs über Sensorik aus dem SYT Theorie Kurs herunter und speichere sie im selben Ordner: [Sensornetzwerke](https://elearning.tgm.ac.at/pluginfile.php/9777/mod_resource/content/0/SensornetzwerkeInTheorieUndPraxis_2018.pdf), [Sensoren](https://elearning.tgm.ac.at/pluginfile.php/9776/mod_resource/content/0/SensorenProzessFarbikautomation_2018.pdf), [Sensoren und Sensorschnittstellen](https://elearning.tgm.ac.at/pluginfile.php/9775/mod_resource/content/0/SensorenSensorschnittstellen_2016.pdf)
6. Navigiere in der Console zu diesem Ordner (deine Windows Festplatten findest du unter "/mnt/")
7. Durchsuche nun mittels `pdfgrep` diese PDFs nach dem Kapazitiven Effekt (Suchbegriff "kapazitiv"). Verwende Optionen um die PDFs zu cachen, die Casesensitivität auszuschalten,  sowie Dateinamen und Seitennummer anzuzeigen. Wie lassen sich alle PDFs in einem Ordner durchsuchen?
8. Suche weiters nach `ultraschall, microcontroller, arduino, piezo,...`

### [Remote Desktop GUI](https://kskroyal.com/run-ubuntu-24-04-on-windows-11-with-gui-using-wsl/)

Manches mal ist eine GUI von Vorteil. Führe folgende Befehle einzeln in WSL aus:

```bash
sudo apt update && sudo apt full-upgrade
sudo apt install xfce4 xfce4-goodies
sudo apt install xrdp
sudo cp /etc/xrdp/xrdp.ini /etc/xrdp/xrdp.ini.bak
sudo sed -i 's/3389/3390/g' /etc/xrdp/xrdp.ini
sudo sed -i 's/max_bpp=32/#max_bpp=32\nmax_bpp=128/g' /etc/xrdp/xrdp.ini
sudo sed -i 's/xserverbpp=24/#xserverbpp=24\nxserverbpp=128/g' /etc/xrdp/xrdp.ini
sudo /etc/init.d/xrdp start
```
Folgender Befehl öffnet einen Editor im Terminal
```bash
sudo nano /etc/xrdp/startwm.sh
```

![Nano startwm.sh](https://kskroyal.com/wp-content/uploads/2024/05/WM--800x333.jpg)

Kommentiere die letzten beiden Zeilen aus mit einem '#' und füge `startxfce4` am Ende ein.
Speichere mit STRG + O und schließe Nano mit STRG + X.

Öffne **Remote Desktop Connection** in Windows mit **localhost:3389** bzw. **3390**.

## Fragestellungen

* Was sind die Befehle um in Linux zu navigieren? Wie sind diese anders als in Windows?
* Wie ist das Filesystem in WSL aufgebaut? Was ist der Unterschied zu Windows?
* Welche Vorteile hat WLS? Nenne mindestens drei.

## Abgabe
Die durchgeführten Tätigkeiten und gewünschten Elemente müssen auf einem Grafiz zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Vor diesem Gespräch ist das Grafiz eingescannt als ein **PDF** File auf moodle abzugeben. (Microsoft Office Lens [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app/microsoft-office-lens-pdf-scan/id975925059); Online PDF Editor [pdffiller](https://www.pdffiller.com/de/))

## Bewertung
Gruppengröße: 1 Person
### Anforderungen **überwiegend erfüllt**
- [ ] WSL installiert
- [ ] grep in WSL verwendet
- [ ] Fragestellungen beantwortet
### Anforderungen **zur Gänze erfüllt**
- [ ] pdfgrep in WSL verwendet
## Quellen
[1] „Grep Command Cheat Sheet With Examples [Free PDF Download]“, Linux Handbook, 2. Februar 2022. https://linuxhandbook.com/grep-command-cheatsheet/ (zugegriffen 27. März 2023).  
[2] „man grep (1): search a file for a pattern“. https://manpages.org/grep/1 (zugegriffen 27. März 2023).  
[3] „pdfgrep: Use Grep Like Search on PDF Files in Linux Command Line“, It’s FOSS, 24. Mai 2022. https://itsfoss.com/pdfgrep/ (zugegriffen 27. März 2023).  
[4] craigloewen-msft, „Windows Subsystem for Linux Documentation“, 27. Juni 2022. https://learn.microsoft.com/en-us/windows/wsl/ (zugegriffen 27. März 2023).  
[5] admin, „Windows: `Grep` Equivalent - CMD & PowerShell“, ShellHacks, 2. Juli 2019. https://www.shellhacks.com/windows-grep-equivalent-cmd-powershell/ (zugegriffen 27. März 2023).  

---
**Version**  *20230726v1*