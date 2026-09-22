---
hide:
  - navigation
---

# Server-Übung: Linux-Server einrichten und administrieren

## Lernziele
Nach dieser Übung könnt ihr:
- eine virtuelle Maschine mit einer Linux-Server-Distribution aufsetzen
- eine sichere SSH-Verbindung inkl. Key-Authentifizierung einrichten
- Snapshots zur Sicherung von Systemzuständen nutzen
- grundlegende Serverdienste (Samba, Docker, Tailscale) installieren und konfigurieren
- Container mit einer WebUI betreiben

## Voraussetzungen
- Virtualisierungssoftware (z. B. VirtualBox, VMware, Proxmox, Hyper-V)
- VS Code mit Remote-SSH-Extension
- Grundkenntnisse Linux-Kommandozeile

## Aufgabenstellung

1. **VM erstellen** – Ubuntu Server (oder eine andere Linux-Distribution) in einer VM installieren
2. **SSH-Server** – OpenSSH-Server installieren und den Zugriff testen
3. **Snapshot #1** – direkt nach der Grundinstallation einen Snapshot erstellen
4. **SSH-Config** – lokale `~/.ssh/config` anlegen (Host-Alias, User, IP, Port)
5. **SSH-Key** – Schlüsselpaar erzeugen und für die Authentifizierung einrichten (Passwort-Login danach deaktivieren)
6. **VS Code SSH-Client** – per Remote-SSH mit dem Server verbinden
7. **Update** – System mit `apt update && apt upgrade` aktualisieren
8. **btop** – installieren und Systemressourcen überwachen
9. **Samba-Share** – Freigabe einrichten und vom eigenen Rechner aus mounten
10. **Tailscale** – installieren, einrichten und Erreichbarkeit im Tailnet testen
11. **Docker** – installieren
12. **Docker-Gruppe** – eigenen User zur `docker`-Gruppe hinzufügen, sodass `docker ps` ohne `sudo` funktioniert
13. **Container mit WebUI** – einen beliebigen Container mit Web-Oberfläche betreiben (**nicht** erlaubt: Ghost, Uptime Kuma, Homepage), vom eigenen Rechner (Host) aus aufrufen und testen
    - Inspiration: [github.com/dominikhoebert/docker-projects](https://github.com/dominikhoebert/docker-projects)
14. **Erweiterung** – eine Erweiterungen (siehe unten) umsetzen
15. **Snapshot #2** – nach abgeschlossener Konfiguration einen zweiten Snapshot erstellen

## Erweiterung

Katalognr % (modulo 9) = ID

| ID  | Bereich           | Möglichkeit                                                                         |
| --- | ----------------- | ----------------------------------------------------------------------------------- |
| 0   | Sicherheit        | UFW-Firewall konfigurieren, root-Login deaktivieren, fail2ban einrichten            |
| 1   | Reverse Proxy     | Traefik oder Nginx Proxy Manager vor die Container schalten, SSL via Let's Encrypt  |
| 2   | Automatisierung   | Setup mit einem Bash-Script oder Ansible-Playbook wiederholbar machen               |
| 3   | Monitoring        | Prometheus + Grafana statt/zusätzlich zu btop                                       |
| 4   | Backup            | Cronjob für automatische Backups/Snapshots einrichten und Restore testen            |
| 5   | Netzwerk          | Tailscale-Funktionen vertiefen (Subnet Router, ACLs) oder mit WireGuard vergleichen |
| 6   | Mehrere Container | docker-compose-Stack mit mehreren zusammenhängenden Diensten aufsetzen              |
| 7   | DNS/Werbeblocker  | Pi-hole/AdGuard als weiteren Container-Use-Case einbauen                            |
| 8   | Logging           | journalctl / Log-Rotation als eigenen Aufgabenblock ergänzen                        |

## Abgabe
- Screenshot(s) jedes abgeschlossenen Schritts
- Kurze Dokumentation (Befehle + Beobachtungen), z. B. als Markdown- oder PDF-Datei
- Beide Snapshot-Namen/-Zeitpunkte angeben
- Lehrperson vorzeigen

_Version 20260922v1_