---
hide:
  - navigation

---

# Home Server Getting Started

## Install OS

1. Ubuntu Server ISO herunterladen [Get Ubuntu Server | Download | Ubuntu](https://ubuntu.com/download/server) und mit zB. [balenaEtcher - Flash OS images to SD cards & USB drives](https://etcher.balena.io/) auf einen USB-Stick flashen.
2. Während des Installationsprozesses kann auch schon das WLAN ausgewählt werden. (WLAN kann dann später so geändert werden: `sudo nano /etc/netplan/50-cloud-init.yaml` und `sudo netplan apply`)
3. Während des Installationsprozess `Install OpenSSH Server` auswählen.
## Basic Setup
1. Nach der Installation `sudo apt update` und dann `sudo apt upgrade`zum Updaten ausführen.
2. Wie gewohnt SSH config, SSH keys, Samba Share und [Tailscale · Best VPN Service for Secure Networks](https://tailscale.com/) installieren. Anleitung aus dem Kurs: ["Server Installation" - Taskdescription - Systemtechnik Exercises](https://tgm-hit.github.io/syt-exercises/grundlagenDerInformatik_/sem03_server_installation/TASK/#ssh-key-installation)
```bash
ssh-keygen # ssh Key erzeugen, falls noch nicht vohanden; 3x Enter für Standartwerte

# kopiert den Key in die VM: (fragt nach Passwort)
#Windows:
type $env:USERPROFILE\.ssh\id_rsa.pub | ssh vm_username@vm_ip "cat >> .ssh/authorized_keys" # ersetzte nur vm_username@vm_ip
#Linux/macOS:
ssh-copy-id vm_username@vm_ip
```
3. Dateisystem erweitern (optional)
```bash
sudo lvextend -l +100%FREE /dev/mapper/ubuntu--vg-ubuntu--lv
sudo resize2fs /dev/mapper/ubuntu--vg-ubuntu--lv
```
## Containers
1. Docker Installation:
```bash
# Add Docker's official GPG key:
sudo apt update
sudo apt install ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc

# Add the repository to Apt sources:
sudo tee /etc/apt/sources.list.d/docker.sources <<EOF
Types: deb
URIs: https://download.docker.com/linux/ubuntu
Suites: $(. /etc/os-release && echo "${UBUNTU_CODENAME:-$VERSION_CODENAME}")
Components: stable
Signed-By: /etc/apt/keyrings/docker.asc
EOF

sudo apt update
sudo apt install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
sudo usermod -aG docker $USER
#(ausloggen und wieder einloggen: exit)
docker network create --driver bridge proxy
```
Quelle: [Ubuntu | Docker Docs](https://docs.docker.com/engine/install/ubuntu/#install-using-the-repository)
2. `git clone https://github.com/dominikhoebert/docker-projects`

---

**Version** *20251209*