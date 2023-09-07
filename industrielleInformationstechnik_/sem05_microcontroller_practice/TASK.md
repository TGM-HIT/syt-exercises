# Embedded Devices "Mikrocontroller Vertiefung" - Taskdescription

## Einführung
Diese Aufgabe soll den Einsatz von Mikrocontrollern zum einfachen Ansteuern und Ansprechen von Elektronikbauteilen ermöglichen.

## Ziele
Um den Umgang mit Microcontrollern zu üben sollen eine Anzahl an Aufgaben im Zusammenhang mit weiteren Bauteilen erfüllt werden.

## Voraussetzungen
* Grundkenntnisse über die sichere Verwendung von Elektronikbauteilen
* Grundverständnis von digitalen Systemen
* GK *Einführung Microcontroller* abgeschlossen

## Detaillierte Aufgabenbeschreibung
Verwende deinen Microcontroller um folgende Aufgaben zu lösen.

1. Blink LED: lasse eine LED blinken, ohne *delay* zu verwenden. (Tipp: verwende *millis()* stattdessen)
2. LED dimmen: versuche die Helligkeit eine LED welche an einem GPIO Pin angeschlossen ist zu steuern.
3.  Serielle Kommunikation: sende dem Microcontroller Befehle über die Serielle Schnittstelle um die Helligkeit der LED zu kontrollieren.
4. Potentiometer: schließe ein Potentiometer am Microcontroller an und lese seine Stellung aus.
5. Serial Monitor: gib den Wert des Potentiometers über den seriellen Monitor aus.
6. Serial Plotter: lasse dir eine Kurve der Potentiometerwerte über den Serial Plotter anzeigen.
7. LED und Potentiometer: kontrolliere die Helligkeit der LED mit dem Potentiometer.
8. Button: schließe einen Button an den Microcontroller an, lasse die LED leuchten wenn der Button gedrückt ist.
9. LED und Button: überlege dir eine Methode die Helligkeit der LED mit einem Button zu steuern.

Die Schaltung soll vor dem physischen Aufbau in einer Simulationsumgebung getestet und entsprechend dokumentiert werden. Dabei bietet sich die Umgebung von [Tinkercad](https://www.tinkercad.com) an.

### Fragestellungen
* Wieso sollte man die *delay*-Funktion vermeiden?
* Was für eine Art von Signal wird verwendet um eine LED zu dimmen? Was ist der Duty Cycle?
* Wofür stehen RX/TX bei der seriellen Schnittstelle? Was ist eine Baud-Rate?
* Erkläre die Funktionsweise des Potentiometers. Wieso hat dieser 3 Pins?
* Wenn ein Button verwendet werden soll, wird ein Widerstand benötigt. Warum? Welche zwei Konfigurationen sind möglich?

Die Fragen sollen soweit erläutert und mit Quellen versehen werden, sodass ein leichter Einstieg und eine mühelose Verwendung der einzelnen Tools und der Hardware sichergestellt ist.

## Abgabe
Die Abgabe wird elektronisch als generiertes PDF-Dokument erwartet. Dabei sollen die einzelnen Arbeitsschritte beschrieben und die Fragen entsprechend ausgearbeitet werden. Mache gegebenenfalls Fotos der Übungen. Bei dem obligatorischen Abgabegespräch wird die Dokumentation und die praktische Durchführung überprüft.

## Bewertung
Gruppengröße: 1 Person

### Anforderungen **überwiegend erfüllt**
- [ ]  Simulation der Übungen
- [ ]  Dokumentation aller Schritte
- [ ]  Beantwortung aller Fragen
### Anforderungen **zur Gänze erfüllt**
- [ ] Aufbau und Dokumentation der Aufgaben

## Quellen
[1] "Mikrocontroller und Mikroprozessoren", T. Ungerer und U. Brinkschulte, 3. Auflage Berlin Heidelberg New York: Springer-Verlag, 2010.  
[2] "What is a Microcontroller?" Core Electronics Video, 2017-02-17; zuletzt besucht am 2019-10-17 [online](https://core-electronics.com.au/tutorials/arduino-workshop-for-beginners.html)  
[3] "Arduino Web Editor Plugin" Arduino Create; zuletzt besucht am 2019-10-17 [online](https://create.arduino.cc/getting-started/plugin)  

---
**Version** *20211106v1*
