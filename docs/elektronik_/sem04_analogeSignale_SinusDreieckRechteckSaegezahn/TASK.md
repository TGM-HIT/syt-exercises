# Analoge Signale - Sinus, Dreieck, Rechteck und Sägezahn

## Einführung

Nicht alles kann mit Gleichstrom gelöst werden. Information und deren Weitergabe hängt eng mit der Änderung von Zuständen zusammen. Wie kann dies in verschiedenen Umgebungen umgesetzt werden?

## Ziele
Diese Übung soll die Grundlagen von Signalen und deren elektrischen Eigenschaften verstehen helfen. Welche Möglichkeiten gibt es Information zu generieren und diese zu beschreiben?

## Kompetenzzuordnung
**GK SYT4 Elektrotechnik und Elektronik | Wechselspannung | analoge Signale**

* "analoge und digitale Signale unterscheiden und erklären"

* "sinusförmige Wechselgrößen und deren mathematische Zusammenhänge erklären"

## Voraussetzungen
* Grundverständnis von Strom, Spannung und Zeit
* mathematisches Verständnis von Funktionen

## Detaillierte Aufgabenbeschreibung
**Grundanforderungen**

Ließ dir die Kapitel *7.1.1 - 7.2.6* Seite 126 - 132 aus dem Buch **Fachkunde Elektrotechnik** durch. Versuche mithilfe des Buches und des Internets die Fragestellungen unten zu beantworten. Du kannst auch die Quellen nach weiteren Informationen durchsuchen.

Die Idee der Informationsweitergabe beruht auf der zeitlichen Änderung von Spannungswerten. Erkläre kurz, welche verschiedenen Arten von Informationen du im Alltag häufig benutzt. Wie können diese elektrisch verarbeitet werden?

Schau dir die Videos zu "analogen und digitalen Daten" sowie "Klassifikation von Signale" an. Welche Unterschiede sind dabei beschrieben worden? Erläutere an mindestens zwei Beispielen die Verwendung der Signalübertragung.

Lies dir die "Charakterisierung elektrischer Signale" durch. Welche Unterschiede sind dabei beschreiben worden?

Welche Kenndaten gibt es bei periodischen Signalen? Erkläre kurz den Unterschied und zeichne die vier Signalformen aus dem Titel der Übung. Analysiere dabei den Sinus genauer! Welche Zeiteinheit wird dabei gewählt?

#### dacWrite

Ein DAC (Digital-Analog-Converter) kann aus einem digitalen Signal ein Analoges erzeugen. Der DAC des ESP32 erzeugt einen Spannungswert von 0 bis 3,3V. Schließe eine LED an einen DAC Pin ([Pinout](https://elearning.tgm.ac.at/pluginfile.php/93820/mod_folder/content/0/ESP32-30PIN-DEVBOARD.png)) an (verwende einen adäquaten Vorwiderstand) und lasse diese LED nur so schwach wie möglich leuchten.

```c++
// PIN ist die Pinnummer an dem die LED angeschlossen ist; HELLIGKEIT ein Wert von 0 bis 255 für den Spannungspegel
dacWrite(PIN, HELLIGKEIT);
```

Bei welchem HELLIGKEITSWERT ist die LED gerade noch so an?

Verwende eine FOR-Schleife um die Helligkeit langsam zu steigern.

```c++
for(int i=0; i<=255; i++)
{
    //dac herausschreiben
    //delay
}
```

#### analogRead

Mit einem ADC (Analog-Digital-Converter) lässt sich das Gegenteil erreichen. Dieser wird gerne verwendet um Analoge Sensoren einzulesen.

Schließe ein Potentiometer (veränderlicher Widerstand) an einen ADC Pin ([Pinout](https://elearning.tgm.ac.at/pluginfile.php/93820/mod_folder/content/0/ESP32-30PIN-DEVBOARD.png)) am ESP32 an.

```c++
int sensorWert = analogRead(PIN);  // gibt einen Wert von 0 bis 4096 zurück
```

Gib den Sensorwert über den Seriellen Monitor aus.

```c++
Serial.begin(9600);  // dieser Befehl im Setup
Serial.println(sensorWert);
```

Steuere jetzt die Helligkeit der LED aus der letzten Übung mit dem Potentiometer.

```c++
int helligkeit = map(sensorWert, 0, 4096, 0, 255);  // map kann den Sensorwert zum Helligkeitswert umwandeln
```

#### analogWrite

Die Helligkeit der LED lässt sich auch mit einem PWM (Pulsweitenmodulation) Signal steuern. Schließe dazu die LED an einen PWM Pin ([Pinout](https://elearning.tgm.ac.at/pluginfile.php/93820/mod_folder/content/0/ESP32-30PIN-DEVBOARD.png)) an.

```c++
analogWrite(PIN, HELLIGKEIT);  // kann dacWrite ersetzen
```

## Fragestellungen

* Was ist der Unterschied zwischen Gleich- und Wechselspannung?
* Was ist ein Signal? Welche Arten von Signalen gibt es?
* Was bedeutet der Begriff Effektivwert?
* Was ist der Unterschied zwischen einem analogen und einem digitalen Signal?
* Wie kann der ESP32 digitale Signale aussenden und einlesen?
* Wie kann der ESP32 analoge Signale aussenden und einlesen?
* Was für analoge Signale kann der ESP32 erzeugen?
* Was ist PWM?

## Quellen
* "Systemtechnik Theorie Unterlagen" elearning; zuletzt besucht 2020-02-15; [online](https://elearning.tgm.ac.at/course/view.php?id=199)
* "Was ist der Unterschied zwischen analogen und digitalen Daten?" Digi4all - youtube; zuletzt besucht 2020-02-15; [online](https://www.youtube.com/watch?v=IZUcqFCsKnA)
* "Elektrotechnik in 5 Minuten - Klassifikation von Signalen" Alexander Stöger; zuletzt besucht 2020-02-21; [online](https://www.youtube.com/watch?v=mjKiolpkjjI)
* "Charakterisierung elektrischer Signale" elektroniktutor.de; zuletzt besucht 2020-02-15; [online](https://elektroniktutor.de/signalkunde/signdef.html)
* "Kenndaten periodischer Signale" elektroniktutor.de; zuletzt besucht 2020-02-15; [online](https://elektroniktutor.de/signalkunde/signdat.html)
* "Digitale und analoge Signale – ein Vergleich" elektroniktutor.de; zuletzt besucht 2020-02-15; [online](https://www.elektroniktutor.de/digitaltechnik/ad_vergl.html)
* "Effektivwert" studyflix.de; zuletzt besucht 2020-02-15; [online](https://studyflix.de/elektrotechnik/effektivwert-1592)
* "Fachkunde Elektrotechnik" Möslinger, Robert / Asch, Daniel / Tkotz, Klaus; ISBN: 9783758531071; Europa Lehrmittel; Kapitel 7.1.1-7.2.6

[1] „Arduino Tutorial - Pulsweitenmodulation (PWM)“, EXP Tech. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://exp-tech.de/blogs/blog/arduino-tutorial-pulsweitenmodulation-pwm
[2] „DAC — Arduino-ESP32 2.0.14 documentation“. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://docs.espressif.com/projects/arduino-esp32/en/latest/api/dac.html
[3] „Digital To Analog Converter (DAC) - ESP32 - — ESP-IDF Programming Guide latest documentation“. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://docs.espressif.com/projects/esp-idf/en/latest/esp32/api-reference/peripherals/dac.html
[4] „ESP32 - Potentiometer“, ESP32 Tutorial. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://esp32io.com/tutorials/esp32-potentiometer
[5] K. Magdy, „ESP32 DAC Audio Analog Output With Examples (Arduino IDE)“, DeepBlue. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://deepbluembedded.com/esp32-dac-audio-arduino-examples/
[6] „ESP32-30PIN-DEVBOARD.png (PNG-Grafik, 2466 × 1341 Pixel)“. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://elearning.tgm.ac.at/pluginfile.php/93820/mod_folder/content/0/ESP32-30PIN-DEVBOARD.png
[7] „map() - Arduino Reference“. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://www.arduino.cc/reference/en/language/functions/math/map/
[8] „SYT xHIT Theorie: ESP32 Installation“. Zugegriffen: 28. Dezember 2023. [Online]. Verfügbar unter: https://elearning.tgm.ac.at/mod/page/view.php?id=90535


---
**Version** *20231218v2*