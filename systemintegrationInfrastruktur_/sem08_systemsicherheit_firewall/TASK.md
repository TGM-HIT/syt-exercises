# GEK8.2 Systemsicherheit "Firewall" - Taskdescription

## Einführung
Diese Übung zeigt die Absicherung eines Netzwerks bzw. eines Servers mittels einer Firewall.


## Ziele
Das Ziel dieser Übung ist die Absicherung eines Servers sowie eines Netzwerk-Segments mit einer stateful Firewall.


## Kompetenzzuordnung

**GK SYT8 Systemintegration und Infrastruktur | Systemsicherheit | Firewall**
* "verschiedene Firewalltypen beschreiben und geeignete Systeme in einer Topologie an geeigneter Stelle einsetzen, konfigurieren und betreiben"


## Voraussetzungen
* Netzwerkkonfiguration und Netzwerk-Grundbefehle unter Linux
* statisches Routing unter Linux
* 2 virtuelle Maschinen mit Linux (GUI nicht notwendig, Distribution wahlweise) - Server und Router


## Aufgabenstellung

Konfigurieren Sie die beiden virtuellen Maschinen wie folgt:

**Server**
Eine Netzwerkschnittstelle:
* (`eth0`, Internes Netzwerk), IP-Adresse `192.168.KatNr.10/24`

**Router**
Zwei Netzwerkschnittstellen:
* (`eth0`, Internes Netzwerk), IP-Adresse `192.168.KatNr.1/24`
* (`eth1`, Netzwerkbrücke), IP-Adresse über DHCP


### Taks 1 - Absicherung des Servers

a) Installieren Sie auf dem System einen SSH-Server sowie einen Webserver (`nginx`, `apache`, ...).

b) Konfigurieren Sie eine *stateful* Firewall auf dem System (`iptables`, `nft`, ...) so, dass
   -) externer Zugriff nur auf SSH, HTTP und HTTPS erlaubt ist,
   -) der Server Netzwerk-Troubleshooting (`ping`, `traceroute`, `nslookup`, ...) durchführen kann,
   -) der Server Software-Updates durchführen kann.


### Task 2 - Routing, Port-Forwarding und NAT

a) Aktivieren Sie *ip-forwarding* auf dem Router und testen Sie die Funktion.

b) Konfigurieren die Port-Weiterleitung (DNAT) wie folgt:
   -) `eth1:80` -> `192.168.KatNr.10:80`
   -) `eth1:443` -> `192.168.KatNr.10:443`
   -) `eth1:2222` -> `192.168.KatNr.10:22`

c) Konfigurieren Sie NAT (SNAT, Masquerading) so, dass Pakete die von `eth0` empfangen werden mit der IP-Adresse von `eth1` weitergeschickt werden.


### Task 3 - Absicherung DMZ

Entwerfen Sie für das in der Abbildung dargestellte Szenario sinnvolle Firewall-Regeln. Argumentieren und Begründen Sie ihre Auswahl.



## Fragestellungen
* Welche Funktionalität kennzeichnet eine *stateful* Firewall? Für welche Arten von Kommunikation (welche Protokolle) kann diese eingesetzt werden?
* Was wird als *Firewall Policy* bezeichnet? Für welche Szenarien würden Sie welche Policy verwenden?
* Welche *Firewall Chains* gibt es unter Linux? Wann werden diese ausgeführt?
* Welchen Zusammenhang gibt es zwischen *PREROUTING* und *POSTROUTING* in Bezug auf NAT?


## Abgabe
Die Fragestellungen sollen im File **research.md** abgehandelt werden. Die entsprechenden Konfigurationen und Deployment-Anweisungen sind dort ebenfalls festzuhalten. Dokumentieren Sie die vollständigen Regeln (z.B. mittels `iptables-save`).


## Bewertung
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Ausarbeitung der Fragestellungen
- [ ] Task 1 - Absicherung des Servers
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Task 2 - Routing, Port-Forwarding und NAT
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Task 3 - Absicherung DMZ (Ausarbeitung)
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Task 3 - Absicherung DMZ (Implementierung)


## Quellen

### Grundlagen
* "Stateless Vs. Stateful Packet Filtering Firewalls: Which is Better?"; last visited 2020-02-26; [online](https://www.lanner-america.com/blog/stateless-vs-stateful-packet-filtering-firewalls-better/)

### `iptables`
* "iptables-Tutorial: So konfigurieren Sie die Filtertabellen des Linux-Kernels"; last visited 2020-02-26; [online](https://www.ionos.at/digitalguide/server/tools/iptables-tutorial-regelwerk-fuer-datenpakete-erstellen/)
* "Linux-Firewall einrichten: Iptables erklärt"; last visited 2020-02-26; [online](https://www.pcwelt.de/ratgeber/Ratgeber-Firewall-Linux-Firewall-fuer-Profis-mit-iptables-472858.html)
* "NAT mit Linux und iptables - Tutorial"; last visited 2020-02-26; [online](https://www.karlrupp.net/de/computer/nat_tutorial)

### `nft` (netfilter)
* "Performing Network Address Translation (NAT)"; last visited 2020-02-26; [online](https://wiki.nftables.org/wiki-nftables/index.php/Performing_Network_Address_Translation_(NAT))
* "Netzfiltertabellen mit nftables verwalten"; last visited 2020-02-26; [online](https://www.heise.de/select/ix/2018/1/1514658860742410)
* "Packet Filtering mit NFtables"; last visited 2020-02-26; [online](https://www.linux-magazin.de/ausgaben/2014/01/nftables/)

---
**Version** *2020-02-16-v1*