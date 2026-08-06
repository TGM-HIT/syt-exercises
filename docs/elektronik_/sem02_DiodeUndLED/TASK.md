---
hide:
  - navigation
---

# "*Diode und LED*" - Taskdescription

## Einführung
Dioden und LEDs zählen zu den grundlegendsten Halbleiterbauteilen der Elektronik. Sie bilden die Basis für Gleichrichter, Schutzschaltungen und optische Anzeigen und sind damit ein wichtiger erster Schritt zum Verständnis von Halbleitern.

## Ziele
Die grundlegende Funktionsweise von Halbleitern, Dioden und LEDs verstehen, die Dimensionierung eines Vorwiderstandes beherrschen und einfache Diodenschaltungen (Gleichrichter, Entkoppelschaltung, RGB-LED) planen, simulieren und aufbauen können.

## Kompetenzzuordnung

#### GK SYT2 Elektronik - Halbleiterbauelemente
* "den Aufbau und die Funktionsweise von Dioden und LEDs erklären"
* "einen Vorwiderstand für eine LED dimensionieren"
* "einfache Diodenschaltungen aufbauen und deren Funktion erklären"

## Voraussetzungen
* Grundsätzliches Verständnis von Elektrotechnik (Strom, Spannung, Widerstand, Ohmsches Gesetz)
* Lesen und Umsetzen von Arbeitsanweisungen
* Umgang mit dem Steckbrett

## Detaillierte Aufgabenbeschreibung
Diese Übung wird als **Stationenbetrieb** durchgeführt. An jeder Station findest du eine kurze Einführung sowie Aufgaben bzw. Fragen, die du bearbeiten sollst. Dokumentiere jede Station kurz und prägnant in deinem Grafiz.

### Grundanforderungen

#### Station 1 - Kreuzworträtsel (Theoretische Grundlagen)
Löse das Kreuzworträtsel zu den theoretischen Grundlagen der Dioden.

#### Station 2 - Tinkercad (Planung und Entwicklung)

**RGB-LED**

Mehrfarbige LEDs sind ein Grundbaustein in Geräten wie Monitoren, Smartphones und vielen mehr. Lies im Buch *Fachkunde Industrieelektronik und Informationstechnik* Seite 98 das Kapitel *Mehrfarben-LED* und anschließend *RGB-LED*. Erstelle danach in [Tinkercad](https://www.tinkercad.com/) eine Schaltung mit einer RGB-LED. Die Schaltung soll mit 3 Schaltern unterschiedliche Farben an der RGB-LED anzeigen können.

Benötigte Bauteile:

* 1x RGB-LED
* 3x Widerstände (700Ω)
* 3x Schiebeschalter
* 1x Stromquelle (9V, max. 1A)

Zeichne die elektrischen Verbindungen nur waagrecht und senkrecht (nicht diagonal) und verwende dabei unterschiedliche, normgerechte Farben (+: Rot, -: Schwarz oder Blau, sonstige Verbindungen: freie Wahl).

Beantworte anschließend folgende Fragen:

* Bei welcher Farbe ist der Stromverbrauch durch die RGB-LED am höchsten?
* Welche Pins müssen für die Farbe Violett aktiv sein?
* Welche Pins müssen für die Farbe Türkis aktiv sein?

**Gleichrichter**

Erstelle in Tinkercad eine Schaltung mit Dioden, bei der eine sinusförmige Wechselspannung in eine Gleichspannung umgewandelt wird (siehe Buch *Fachkunde Industrieelektronik und Informationstechnik* S. 18, Tabelle 1).

Benötigte Bauteile:

* 4x Dioden
* zur Visualisierung (Last): 1x Leuchtdiode, 1x Widerstand (ca. 560Ω)
* zur Energieversorgung: 1x Frequenzgenerator (Sinus-, Dreieck- oder Rechteckspannung, Frequenz: 1Hz, Amplitude: 9V, DC-Versatz: 0V)

Skizziere deinen Plan, nachdem er in Tinkercad fertiggestellt wurde.

*Zusatz für ein Sehr gut:* Baue zusätzlich die Schaltung real auf und ein Oszilloskop dazu und vergleiche das eingehende Signal mit dem Signal an der Last. Was kannst du dabei beobachten?

#### Station 3 - Dimensionierung (Vorwiderstand)

Diese Station befasst sich mit der Berechnung und dem Aufbau von Vorwiderständen. Beantworte zuerst folgende Fragen:

* Warum wird ein Vorwiderstand bei einer Diode benötigt?
* Wie lautet die Formel für die Berechnung des Vorwiderstandes?
* Wenn der berechnete Widerstand nicht verfügbar ist, wird ein höherer oder ein kleinerer Widerstandswert verwendet?
* Wie ist das Symbol einer Diode und einer Leuchtdiode?

Berechne anschließend einen Vorwiderstand für eine Leuchtdiode bei einer Spannungsquelle von 9V DC. Zeichne einen Plan und baue die Schaltung am Steckbrett auf.

Berechne danach einen Vorwiderstand für 3 Leuchtdioden bei einer Spannungsquelle von 9V DC. Zeichne einen Plan und baue die Schaltung am Steckbrett auf.

> Anmerkung: Der Spannungsabfall an einer Diode beträgt 2V, der Strom in Durchlassrichtung beträgt 10mA.

**Achtung:** Stecke die Batterie erst an, nachdem sichergestellt wurde, dass kein Kurzschluss besteht - Lehrkraft holen!

#### Station 4 - Praxisanwendung (Entkoppelschaltung)

Schau dir den Schaltplan der Entkoppelschaltung an und überlege dir, was die Schaltung macht. Baue anschließend die Schaltung an deinem Steckbrett auf (verwende anstatt der Taster S1, S2 und S3 Drähte, welche du durch Schließen und Öffnen der Kontakte zu Tastern machst).

Benötigtes Material:

* 2x LED
* 2x Dioden
* R1 = R2 = ca. 700Ω
* Batterie 9V mit Batteriehalter

**Achtung:** Stecke die Batterie erst an, nachdem sichergestellt wurde, dass kein Kurzschluss besteht - Lehrkraft holen!

#### Station 5 - Theoretische Ausarbeitung

Lies im Buch *Fachkunde Industrieelektronik und Informationstechnik* die Seiten 89 bis inklusive 98 durch und beantworte anschließend die Fragen unter [Fragestellungen](#fragestellungen) (gerne auch weiterhin mit dem Buch).

## Fragestellungen
### Grundlegend
* Was sind Halbleiter?
* Erkläre die Halbleiterdiode und den PN-Übergang.
* Wie verhalten sich die Ladungsträger im PN-Übergang in Sperr- bzw. Durchlassrichtung?
* Erläutere kurz die Funktionsweise einer LED.
* Wieso werden Halbleiter für die Umsetzung von logischen Schaltungen eingesetzt?
* Was ist der Unterschied zwischen einer Diode und einer LED?
* Zeichne eine Kennlinie einer Silizium-Diode. Was sagt diese Kennlinie aus?
* Was ist die Aufgabe eines Vorwiderstandes und wie berechnet man diesen?
* Warum wird ein Vorwiderstand bei einer Diode benötigt?
* Wie ist das Symbol einer Diode und einer Leuchtdiode?
* Was macht eine Entkoppelschaltung? Wo wird sie eingesetzt?
* Wie funktioniert ein Brückengleichrichter aus 4 Dioden?

## Abgabe
Die durchgeführten Tätigkeiten und gewünschten Elemente müssen auf einem Grafiz zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Nach diesem Gespräch ist das Grafiz eingescannt als **PDF** File auf moodle abzugeben.

## Bewertung
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**

- [ ]  Kreuzworträtsel gelöst
- [ ]  Fragestellungen mit Quellen beantwortet
- [ ]  Vorwiderstand berechnet und Schaltung am Steckbrett aufgebaut
- [ ]  RGB-LED Schaltung in Tinkercad simuliert

### Grundanforderungen **zur Gänze erfüllt**

- [ ]  Abgabegespräch über die Aufgaben- und Fragestellungen
- [ ]  Gleichrichter-Schaltung in Tinkercad simuliert
- [ ]  Entkoppelschaltung am Steckbrett aufgebaut

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Oszilloskop-Vergleich bei der Gleichrichter-Schaltung durchgeführt

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Beobachtungen am Oszilloskop schlüssig erläutert

*:robot: Diese Aufgabe wurde Mithilfe von KI erstellt.*

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=199#section-2)
* "Franzis Handbuch - Elektronik"; [online](https://elearning.tgm.ac.at/mod/resource/view.php?id=3513)
* "Elektronik-Fibel"; [online](https://elearning.tgm.ac.at/mod/resource/view.php?id=3512)
* "Fachkunde Industrieelektronik und Informationstechnik"; Kapitel S. 18, S. 89-98
* "Learn how to Tinker" Autodesk Tinkercad [online](https://www.tinkercad.com/learn/circuits/lessons)
* "How diodes, LEDs and solar panels work" Steve Mould [online](https://www.youtube.com/watch?v=TGUteH93xNo)
* "LED - Leuchtdioden" elektronik-kompendium; zuletzt besucht 2022-08-16; [online](https://www.elektronik-kompendium.de/sites/bau/0201111.htm)
* "Vorwiderstand für LED berechnen" elektronik-kompendium; zuletzt besucht 2022-08-16; [online](https://www.elektronik-kompendium.de/sites/grd/1006011.htm)

---

**Version**  *20260806v1*
