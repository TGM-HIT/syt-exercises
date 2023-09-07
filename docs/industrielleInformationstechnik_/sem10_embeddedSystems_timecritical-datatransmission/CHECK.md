# Embedded Devices "Timecritical Datatransmission" - Abgabecheck

## Check the implementation

```bash
make clean flash 

gedit `find | grep "^./src.*\.c$" & find | grep "^./src.*\.h$"` &
```

## Bewertung
Gruppengrösse: 1/2 Person
Team:

## Grundanforderungen überwiegend erfüllt
- [ ] Was ist ein SPI-Bus und wie ist dieser aufgebaut?
- [ ] Welche Vorteile ergeben sich bei der Verwendung eines Kommunikationsbusses?
- [ ] Welche Möglichkeiten der Beschaltung sind beim SPI-Bus möglich und wie wirkt sich die Clock darauf aus?
- [ ] Wie werden zeitkritische Anwendungen (real-time) eingeteilt?
- [ ] Wie kommt ein Watchdog bei zeitkritischen Anwendungen zum Einsatz?
- [ ] Wie kann man Interrupts priorisieren?
- [ ] Was sind Real-Time Operating-Systems (RTOS) und wie kann man diese auf Mikrokontrollern einsetzen?
- [ ] Verwendung von konsolenbasiertem Deployment

## Grundanforderungen zur Gänze erfüllt
- [ ] Umsetzung der Ampelsteuerung und Ausgabe auf den SPI-Bus
- [ ] Ausführung und Dokumentation der Implementierung
- [ ] Ausgabe der Information des SPI-Busses mittels eines Logic-Analyzers

## EK Anforderungen **überwiegend erfüllt**
- [ ] Ausgabe der Information des SPI-Busses über einen Single-Board-Computer (bzw. einem zweiten uC)

## EK Anforderungen **zur Gänze erfüllt**
- [ ] Reset der Ampelsteuerung mittels Watchdog oder Interrupt-Implementierung

## Kommentare
- Quellen bitte nach IEEE referenzieren!
- SPI Einsatz / Konfig sehr oberflächlich
- Priorisierung wird wie realisiert?
- hard/firm/soft real-time fehlt
- FreeRTOS nicht recherchiert
- Scheduler erklärt aber im Dokument nicht beschrieben
- Watchdog-Vorteil gegenüber Interrupt-Lösung erklärt aber nicht beschrieben
- Konsolenbasiertes Deployment notwendig
- Logic-Analyzer nicht beschrieben
- Fritzing Schaltungsübersicht würde bei Verkabelung helfen

