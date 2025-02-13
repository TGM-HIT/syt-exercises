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
Konfiguriere mittels Ansible zumindest 3 virtuelle Maschinen: 2 Webserver sowie einen Load-Balancer [Getting started with Ansible](https://docs.ansible.com/ansible/latest/getting_started/index.html). Das Playbook und die Konfigurationen sollen im Unterordner `load-balancing` abgelegt werden.  

Der zweite Use-Case soll entsprechend persönlicher Vorlieben gewählt werden. Dabei könnte ein Authentifizierungs-Dienst oder das Deployment eines aktuellen Projekts angedacht werden. Das einfache Aktualisieren soll dabei einen Fokus darstellen. Bitte hierfür wieder ein eigenes Verzeichnis im Abgaberepository erstellen und die Konfigurationsdateien dort ablegen.  

Das Abgaberepository soll nur die wichtigsten Informationen (*README.md*, *Research.md*, etc.) enthalten.

## Fragenstellungen
1. Was versteht man unter Infrastructure as Code und welche Vorteile bietet es im Vergleich zur manuellen Infrastrukturkonfiguration?
2. Nennen Sie Beispiele für IaC-Tools und erklären Sie, warum Ansible besonders für Configuration Management geeignet ist.
3. Welche Rolle spielen Idempotenz und Deklarativität in IaC? Wie setzt Ansible diese Konzepte um?
4. Erklären Sie den Aufbau eines Ansible Playbooks anhand eines Beispiels. Welche Schlüsselkomponenten (Tasks, Modules, Handlers) sind essenziell?
5. Wie funktioniert die Inventarisierung in Ansible? Welche Unterschiede gibt es zwischen statischen und dynamischen Inventaren?
6. Was sind Ansible Roles und wie fördern sie die Wiederverwendbarkeit von Code?
7. Welche Vor- und Nachteile hat Ansible gegenüber Terraform bei der Infrastrukturbereitstellung? Kann man diese beiden Tools überhaupt vergleichen?
8. Wie lässt sich Ansible in eine CI/CD-Pipeline (z. B. GitLab CI, Jenkins) integrieren?

## Bewertung
Gruppengröße: 1-2 Person(en)

### Grundanforderungen überwiegend erfüllt
 - [ ] Automatische Provisionierung der drei virtuellen Maschinen
 - [ ] Fragenstellungen und Research ausgearbeitet

### Grundanforderungen zur Gänze erfüllt
 - [ ] Funktionierender Load Balancer
 - [ ] angepasstes Playbook für sinnvollen Use-Case

## Classroom Repository
[Hier](https://classroom.github.com/a/Y3Np2Yby) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

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
- "Product Documentation for Red Hat Ansible Automation Platform" [ansible](https://access.redhat.com/documentation/en-us/red_hat_ansible_automation_platform/)
- "Ansible Use Cases" [ansible](https://www.redhat.com/en/technologies/management/ansible/use-cases)
- "Ansible Tutorial: Installation, Playbook, Roles, Commands" [online](https://www.guru99.com/ansible-tutorial.html)
- "A step by step guide to Ansible (Tutorial)" [online](https://www.ssdnodes.com/blog/step-by-step-ansible-guide/)
- "Ansible Tutorial: Multi Tier Deployment mit Ansible" [online](https://entwickler.de/devops/ansible-tutorial-multi-tier-deployment-mit-ansible/)
- "Terraform vs. Ansible : Key Differences and Comparison of Tools" [online](https://spacelift.io/blog/ansible-vs-terraform)

---
**Version** *20250213v4*

