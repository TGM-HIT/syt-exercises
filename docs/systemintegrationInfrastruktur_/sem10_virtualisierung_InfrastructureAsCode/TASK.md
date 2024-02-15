# Cloud und Cluster Computing "Infrastructure as Code"

## Einführung
In dieser Übung sollen 3 virtuelle Maschinen: 2 Webserver sowie ein Load-Balancer mittels Ansible konfiguriert werden.

## Ziele
- Ziel dieser Übung ist es virtuelle Maschinen automatisiert provisionieren zu können.
- Ansible hat mehrere Use Cases, die analysiert und entsprechend für aktuelle Projekte umgesetzt werden sollen

## Kompetenzzuordnung

#### GK SYT10 Systemintegration und Infrastruktur | Virtualisierung | Cloud Computing
- "in einer Cloud angebotene Dienste überwachen, Dienste automatisch deployen und skalieren"

## Voraussetzung
* Grundlagen Linux und Virtualisierung
* Virtualisierungsumgebung

## Aufgabenstellung

Konfiguriere mittels Ansible zumindest 3 virtuelle Maschinen: 2 Webserver sowie einen Load-Balancer [Getting started with Ansible](https://docs.ansible.com/ansible/latest/getting_started/index.html). 

## Bewertung

Gruppengröße: 1-2 Person(en)

### Grundanforderungen überwiegend erfüllt

 - [ ] Automatische Provisionierung der drei virtuellen Maschinen

### Grundanforderungen zur Gänze erfüllt

 - [ ] Funktionierender Load Balancer
 - [ ] angepasstes Playbook für persönlichen Nutzen

## Classroom Repository

[Hier](https://classroom.github.com/a/1Ds9Zdnv) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Help! "Oh, I need somebody ..."

### SSH-Keys löschen
`ssh-keygen -R <IP-Address> # e.g. ssh-keygen -R 192.168.84.130`
Ansible benutzt standardmäßig SSH-Keys und nicht Passwörter, dies kann man aber wie folgt ändern:
`export ANSIBLE_HOST_KEY_CHECKING=False`

### Hosts
Die Konfiguration `/etc/ansible/hosts` für das Beispiel sieht dann so aus:
```
[loadbalancer]
192.168.84.128
[webservers]
192.168.84.130
192.168.84.131
# Password vault
[all:vars]
ansible_connection=ssh
ansible_user=test
ansible_ssh_pass=1234
ansible_sudo_pass=1234
```
Verbindungstest mittels: `ansible all -m`

## Quellen
- "Product Documentation for Red Hat Ansible Automation Platform 2.4" [ansible](https://access.redhat.com/documentation/en-us/red_hat_ansible_automation_platform/2.4)
- "Ansible Use Cases" [ansible](https://www.redhat.com/en/technologies/management/ansible/use-cases)
- "Ansible Tutorial: Installation, Playbook, Roles, Commands" [online](https://www.guru99.com/ansible-tutorial.html)
- "A step by step guide to Ansible (Tutorial)" [online](https://www.ssdnodes.com/blog/step-by-step-ansible-guide/)
- "Ansible Tutorial: Multi Tier Deployment mit Ansible" [online](https://entwickler.de/devops/ansible-tutorial-multi-tier-deployment-mit-ansible/)

---
**Version** *20240215v2*

