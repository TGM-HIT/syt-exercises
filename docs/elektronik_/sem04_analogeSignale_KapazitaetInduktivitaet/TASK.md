---
hide:
  - navigation
---

# Analoge Signale - "Kapazität und Induktivität - Prinzip und Anwendung"

## Einführung
In der Signalverarbeitung kommen zwei Bauteile sehr oft zum Einsatz: der Kondensator und die Spule. Welche Eigenschaften haben diese zwei Bauteile?

## Ziele
Diese Übung soll die Grundlagen der Kapazität und Induktivität festigen. Am praktischen Aufbau soll auch der Einsatz verdeutlicht werden.

## Kompetenzzuordnung
###  GK SYT4 Elektrotechnik und Elektronik | Wechselspannung | analoge Signale
* "induktive und kapazitive Widerstände erklären"
## Voraussetzungen
* Grundverständnis von Strom, Spannung und Zeit
* mathematisches Verständnis von Funktionen
* Grundverständnis von sinusförmigen Wechselgrößen

## Detaillierte Aufgabenbeschreibung
#### Grundanforderungen

Ließ dir die Kapitel *4.3, 4.4* Seiten 74-78, sowie Kapitel *5.5, 5.6* Seiten 91-98 aus dem Buch **Fachkunde Elektrotechnik** durch. Versuche mithilfe des Buches und des Internets die Fragestellungen unten zu beantworten. Du kannst auch die Quellen nach weiteren Informationen durchsuchen.

Der Kondensator und die Spule sind in der Informationsverarbeitung von Signalen wichtige Bauteile. Dabei ist die Verwendung dieser Bauteile in der Gleich- und Wechselspannung zu unterscheiden.

Schau dir die Videos zu "Was ist eine Spule?" sowie "Was ist ein Kondensator?" an. Du kannst dir auch die Videos zur Auf- und Entladevorgang des Kondensators gerne ansehen - die sind im selben YouTube-Channel verlinkt.

Welche Kenndaten gibt es bei diesen zwei Bauteilen? Welche Prinzipien stehen hinter diesen beiden Bauteilen? Welche verschiedenen Bauformen gibt es? Wie berechnet man die Auf- und Entladezeit eines Kondensators?

Baue eine Schaltung auf (z.B. mittels Tinkercad), die über einen 100kΩ Widerstand einen 10µF Elektrolytkondensator auflädt. Lege parallel zum Kondensator einen Kreis mit einem Taster oder Schiebeschalter und einer roten LED mit einem Vorwiderstand von 4,7kΩ. Das ganze versorge bitte mit einer Spannung von 30V. Beschreibe deine Beobachtung? Was musst du beim Kondensator beachten? Verwende zur Analyse und Begründung deiner Annahmen das Oszilloskop bzw. das Multimeter!

##### ESP Übung

Nimm die Lade/Entlade Kurve des Kondensators mit dem ESP32 auf. Wähle einen passenden Ladewiderstand, schließe beide seriell an einen digitalen Pin. Messe die Spannung am Kondensator mit einem ADC Pin ([Pinout](https://elearning.tgm.ac.at/pluginfile.php/93820/mod_folder/content/0/ESP32-30PIN-DEVBOARD.png)). Schreibe ein Programm, dass den digitalen Pin HIGH setzt um den Kondensator zu laden. Sobald dieser (fast) voll ist, soll der Pin auf LOW gesetzt werden um den Kondensator zu entladen. Dann soll der Kondensator wieder geladen werden.

## Abgabe
Bitte erstelle ein Grafiz und gebe dieses eingescannt/fotografiert als PDF zum Abgabegespräch hier ab. Es ist auch erlaubt eine elektronische Dokumentation zu erstellen. Beim Abgabegespräch ist auch die Schaltung zu präsentieren.

## Fragestellungen beim Abgabegespräch
### Grundlegend
* Was ist der Kondensator bzw. die Spule bei Gleichspannung?
* Was ist 𝜏 (Tau) und wie kommt dieser Wert zum Einsatz?
* Wie lange braucht ein 10µF Kondensator bei einer Versorgungsspannung von 30V mit einem Widerstand von 100kΩ bis er ca. zu 86% geladen ist?

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=577)
* "Was ist eine Spule? Aufbau, Induktivität, Bauformen"  Elektrotechnik einfach erklärt; [online](https://www.youtube.com/watch?v=tTzkMqCkUf4)
* "Was ist ein Kondensator? Aufbau, Kapazität und Bauformen" Elektrotechnik einfach erklärt; [online](https://www.youtube.com/watch?v=CAEqq7J9Ce4)
* "Spule / Spulen / Induktivität" Elektronik Fibel; zuletzt besucht 2020-03-19; [online](https://www.elektronik-kompendium.de/sites/bau/0207221.htm)
* "Bipolare/Ungepolte Elektrolytkondensatoren" Elektronik Fibel; zuletzt besucht 2020-03-19; [online](https://www.elektronik-kompendium.de/sites/bau/1011301.htm)
* "Elektrolytkondensator für Wechselspannung und inverse Gleichspannung" Elektronik Kompendium; Thomas Schaerer; zuletzt besucht 2020-03-19; [online](https://www.elektronik-kompendium.de/public/schaerer/acelko.htm)
* "Kondensator" Grund-Wissen; Bernhard Grotz; zuletzt besucht 2020-03-19; [online](https://www.grund-wissen.de/elektronik/bauteile/kondensator.html)
* "Kondensator im Gleichstromkreis" Elektronik Fibel; zuletzt besucht 2020-03-19; [online](https://www.elektronik-kompendium.de/sites/grd/0205301.htm)
* "Fachkunde Elektrotechnik" Möslinger, Robert / Asch, Daniel / Tkotz, Klaus; ISBN: 9783758531071; Europa Lehrmittel; Kapitel 4.3, 4.4, 5.5, 5.6

---
**Version** *20231228v2*