---
hide:
  - navigation
---

# "*Server Installation*" - Taskdescription

## Einführung

Installation eines Betriebssystems und erstellen einer Virtuellen Maschine sind täglich Brot eines Informatikers. Virtualisierung ist ein wichtiges Thema und nicht mehr wegzudenken. Auf allen wichtigen Serverstrukturen laufen in irgendeiner weise eine virtuelle Maschine.

## Ziele

Erstellen einer virtuellen Maschine und Installation eines Betriebssystems.


## Kompetenzzuordnung

#### SYT3 Grundlagen der Informatik - Virtualisierung

* Virtualisierungstechnologien anwenden

## Voraussetzungen

* Lesen und Umsetzen von Arbeitsanweisungen

## Detaillierte Aufgabenbeschreibung
Bitte versuche alle wichtigen Information kurz und prägnant in einem Grafiz zu verschriftlichen.

Diese VM wird in den kommenden Semester (SYT4-6) für Übungen benötigt.

#### Alternatives Terminal

In dieser Übung wird viel im Terminal gearbeitet. Hierfür gibt es u.a. folgende alternativen zum Standart Terminals:

- [Windows Terminal](https://apps.microsoft.com/detail/9n0dx20hk701?hl=en-us&gl=US)
- [Warp](https://www.warp.dev/)
- [MobaXterm](https://mobaxterm.mobatek.net/)
- [Tabby](https://tabby.sh/)
- [xpipe](https://xpipe.io/)

Grundsätzlich gilt die Windows Powershell der Windows Eingabeaufforderung (CMD) zu bevorzugen.

#### VM Installation

Installiere [Ubuntu Server](https://ubuntu.com/download/server) in [VMware](https://www.mikeroysoft.com/post/download-fusion-ws/). Stelle sicher, dass der SSH Server mitinstalliert wird.

Dokumentiere während der Installation den Entscheidungsprozess und erkläre diesen kurz mit eigenen Worten.

Es soll ein Snapshot erstellt werden. Teste die Internet Verbindung.

Verwende SSH um auf die VM zuzugreifen (am Host Terminal einzugeben):

```bash
ssh vm_username@vm_ip
```

(`ifconfig` oder `ip a` um die IP Adresse der VM herauszufinden.)

#### SSH Key Installation

Für eine sicherere Verwendung von SSH soll der lokale SSH Key installiert werden.

[Anleitung](https://www.howtogeek.com/424510/how-to-create-and-install-ssh-keys-from-the-linux-shell/)

Folgende Befehle müssen auf dem Client ausgeführt werden (in diesem Fall der Host, und nicht in der VM).

##### Windows
``` bash title="Wichtigsten Befehle"
ssh-keygen # ssh Key erzeugen 3x Enter für Standartwerte
# kopiert den Key in die VM: (fragt nach Passwort)
type $env:USERPROFILE\.ssh\id_rsa.pub | ssh vm_username@vm_ip "cat >> .ssh/authorized_keys" # ersetzte nur vm_username@vm_ip
```

##### Linux/MacOS
``` bash title="Wichtigsten Befehle"
ssh-keygen # ssh Key erzeugen 3x Enter für Standartwerte
# kopiert den Key in die VM: (fragt nach Passwort)
ssh-copy-id vm_username@vm_ip
```

Dann sollte die Anmeldung über SSH ohne Passwort Eingabe möglich sein.

#### SSH Client

Verwende [VS Code](https://code.visualstudio.com/) und die [Remote SSH Erweiterung](https://code.visualstudio.com/docs/remote/ssh) zur Verbindung zum Server.

Klicke auf das Open Remote Window Symbol unten links. Folge dem Dialog.

Vorteil von VS Code als SSH Client ist das einfache Navigieren und Bearbeiten von Dateien und Verzeichnissen

#### Samba Share

Richte ein [Samba Share](https://wiki.ubuntuusers.de/Samba_Server/) in der VM ein ([Anleitung](https://ubuntu.com/tutorials/install-and-configure-samba#1-overview)) 

#### [Btop](https://github.com/aristocratos/btop)

Installiere Btop

```bash
sudo snap install btop
```

Starte Btop

```bash
btop
```

Konfiguriere es nach deinen Vorstellungen.

#### [Cockpit](https://cockpit-project.org/)

Installiere Cockpit

```bash
sudo apt install cockpit
```

Öffne das Webinterface

```
https://vm_ip:9090
```

Login mit VM Credentials. Welche Features hat Cockpit?

#### Optional: [Server Box App](https://github.com/LollipopKit/flutter_server_box)

Zur Überwachung des Servers per Smartphone App kann [Server Box App](https://github.com/LollipopKit/flutter_server_box) verwendet werden.


## Abgabe
Die durchgeführten Tätigkeiten und gewünschten Elemente müssen auf einem Grafiz zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Vor diesem Gespräch ist das Grafiz eingescannt als ein **PDF** File auf moodle abzugeben. (Microsoft Office Lens [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app/microsoft-office-lens-pdf-scan/id975925059); Online PDF Editor [pdffiller](https://www.pdffiller.com/de/))

## Bewertung
Gruppengröße: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] erfolgreicher Abschluss des Moodle Tests
- [ ] Abgabe des Grafiz über Aufgabenstellung
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Abgabegespräch über die Aufgabenstellung
## Quellen
* "Microsoft Office Lens";  [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app/microsoft-office-lens-pdf-scan/id975925059)
* "Online PDF Editor"; zuletzt besucht 2021-08-06; [pdffiller](https://www.pdffiller.com/de/)
* „Developing on Remote Machines using SSH and Visual Studio Code“. Zugegriffen: 19. Februar 2024. [Online]. Verfügbar unter: https://code.visualstudio.com/docs/remote/ssh
* D. McKay, „How to Create and Install SSH Keys From the Linux Shell“, How-To Geek. Zugegriffen: 19. Februar 2024. [Online]. Verfügbar unter: https://www.howtogeek.com/424510/how-to-create-and-install-ssh-keys-from-the-linux-shell/
* „Visual Studio Code - Code Editing. Redefined“. Zugegriffen: 19. Februar 2024. [Online]. Verfügbar unter: https://code.visualstudio.com/
* „Windows 10 OpenSSH Equivalent of ssh-copy-id“, Christopher Hart. Zugegriffen: 19. Februar 2024. [Online]. Verfügbar unter: https://www.chrisjhart.com/Windows-10-ssh-copy-id/



---
**Version** *20250202v4*
