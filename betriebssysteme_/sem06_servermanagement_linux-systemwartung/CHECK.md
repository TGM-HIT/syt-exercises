# "*Linux Systemwartung*" - Checklist

## Bewertung 
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Installation von `apache2` 
- [ ] Wie werden Dienste bzw. Services aktuell in Linux verwaltet?
- [ ] Welche Administrationsmöglichkeit werden hier angeboten?
- [ ] Wie werden Systemprozesse organisiert und wer kümmert sich um deren Aufruf und Verwaltung?
- [ ] Wo liegt der Unterschied zwischen `ps`, `top` und `htop`?
- [ ] Wie viele Prozesse verwendet der Apache Webserver? Wie kannst du dir zu den Prozessen den Benutzer anzeigen lassen, unter dem sie laufen? Warum zeigt `htop` z.B. für den Apache-Webserver mehr Prozesse an als `ps`?
- [ ] Wie kann man sich einen Prozessbaum vorstellen und welche Abhängigkeiten gibt es hier?
- [ ] Wie kann der Festplattenplatz analysiert werden? Was bewirkt ein Aufruf von `df -h` ohne Angabe eines Verzeichnisses?

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Welche verschiedenen Signale zum Beenden eines Prozesses gibt es? Wo liegen hier die Unterschiede?
- [ ] Wie können die wichtigen Resourcen eines Serversystems administriert werden? Wo legt der Kernel die Informationen dafür ab?

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Wie ist das Logging-System in aktuellen, linuxbasierten Systemen aufgebaut? Welche verschiedene Möglichkeiten gibt es hierfür?
- [ ] Wie können aktuelle Logdaten ausgeben werden? (`journalctl -f`)
- [ ] Wie können Netzwerkverbindungen in Linux-Systemen analysiert werden?

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Wie kann das System automatisiert auf dem neusten Stand gehalten werden? Welche Möglichkeiten gibt es hierzu?
- [ ] Vergleiche die Task-Scheduler cron und systemd timers. Welche Vor- und Nachteile haben die beiden Dienste?
- [ ] Was ist notwendig, um die Informationen per Email zugesendet zu bekommen?

### Kommentare
- sauber gearbeitet
- bitte genauer arbeiten!
- Quellen Richtlinie der IEEE beachten!
- Bitte die Bilder mit Unterschrift ("Caption") versehen und die Quelle referenzieren
- Letzte Frage nicht beantwortet
- Gemeinsam gesucht, Befehle ps, systemctl -status etc
- Kernel Informationen in /etc/systemd zb dann in status printer... config file anschauen

