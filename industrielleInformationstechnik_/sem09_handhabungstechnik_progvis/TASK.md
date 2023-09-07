# Programmierung und Visualisierung eines Industrieprozesses

## Einführung
Die Programmierung einer Industrieanlage oder Steuerungen von Industrieprozessen unterscheidet sich von der klassischen Anwendungsentwicklung. Der Fokus liegt hier auf Einfachheit des Codes, Nachvollziehbarkeit und Sicherheit, mit Programmierfehlern keine Maschinenausfälle und damit hohe Kosten zu verursachen. Die Verknüpfung der Programme mit externen Signalen (Sensoren, Aktoren) und Verteilung der Aufgaben auf verschiedene, mit Netzwerken verbundene Rechnenknoten zählt ebenso zu Grundtechniken dieses Bereichs.

## Ziele
Du kannst einfache Steuerungsaufgaben in einer Industrieprogrammiersprache nach ISO 61131-3 umsetzen. Du kannst die Steuerungsprogramme simulieren und auf Fehler testen (debuggen). Der Zusammenhang von POUs, Funktionsblöcken, Tasks ist bekannt. Du kannst eine einfache Visualisierung für eine Steuerung erstellen.

## Kompetenzzuordnung
#### GK SYT9 Industrielle Programmierung und Handhabungssysteme | Programmierung
* Unterschiede zwischen Hochsprachenprogrammierung und industrieller Programmierung kennen.
* Industrielle Programmiermethoden kennen und für einfache Aufgaben einsetzen können

#### GK SYT9 Industrielle Programmierung und Handhabungssysteme | Prozessdatenverarbeitung
* Prozessdaten informationstechnisch aufbereiten und für Handhabungssysteme nutzbar machen
* Visualisierungen für Prozessdaten erstellen und diese zur Anlagensteuerung einsetzen

## Voraussetzungen
* Grundverständnis von Logikverknüpfungen (UND, ODER, ...)
* Lesen und Umsetzen von APIs
* CodeSys 3.5 muss einsatzbereit mitgebracht werden (eigene Installation oder Citrix nutzen)

## Detaillierte Aufgabenbeschreibung

### Grundanforderungen
1. Erstelle in CodeSys 3.5 ein neues „Standardprojekt“ mit einem Gerät „Codesys WinControl V3“

2. Implementiere mittels Funktionsblöcken (FUP) eine Steuerung für folgende Anlagenbeschreibung. Achte auf sinnvolle Variablenbezeichnungen (siehe auch Abschnitt "Abgabe").
    *Der Tank einer Mischanlage soll über zwei Taster entleert werden können (in der Angabe S1, S2 genannt) entleert werden können. Das Auslassventil (V1) zum Entleeren soll dabei mit Taster S1 geöffnet werden. Das Ventil bleibt offen, auch wenn der Taster S1 wieder losgelassen wird (Selbsthaltung). Taster S2 schließt V1. Werden beide Taster gleichzeitig betätigt, so bleibt das Ventil geschlossen.*

    *Zusätzlich soll es einen Nothalt-Taster geben. Ist dieser betätigt, wir das Ventil jedenfalls geschlossen und lässt sich auch nicht mit S1 öffnen. Beim Lösen des Nothalt-Tasters darf das Ventil nicht automatisch geöffnet werden, auch wenn es vor der Betätigung des Nothalt-Tasters geöffnet war*

    Das Programm soll in einen zyklischen Task mit einer Zykluszeit von 200ms eingebettet werden. Führe das Programm auf der SoftSPS Win Control V3 aus.

3. Erweitere das Projekt mittels einer zweiten POU mit Strukturiertem Text (ST) um folgende Funktion:
    *Der Tank erhält nun auch ein Einlassventil V2 mit zwei Tastern (S3, S4) mit der gleichen Funktionalität wie S1, S2. Auch hier muss der Nothalt-Taster ein weiteres Befüllen im Notfall wirksam unterbinden.*
    *Zwecks Überlaufschutz wird ein digitaler Sensor S5 im Ruhestromprinzip verbaut, dessen Signal bei einer bestimmte Füllhöhe „Level_Full“ des Tanks abfällt (d.h. auf 0 fällt = negative Logik). Dann muss das Auslassventil V1 umgehend geöffnet und das Einlassventil V2 geschlossen werden. Ist der Flüssigkeitspegel unter den Füllstand „Level_Full“ gefallen, so liefert das Signal S5 wieder 1 und das Auslassventil soll wieder geschlossen werden (Einlassventil V2 bleibt geschlossen)*

    Vermeide dabei mögliche Kollisionen mit der Funktion aus Aufgabe 2.

    Teste dein Programm ausführlich, v.a. wie reagiert es bei Betätigung des Nothalt-Tasters während einer Überlaufsituation.

4. Erstelle einen Funktionsbaustein „Ventil“ mit drei Eingängen (einer pro Taster, einer für Nothalt/Verriegelung) und einem Ausgang, der die Funktion der Ventilsteuerung mit Nothalt aus Aufgabe 2 kapselt. Teste den Funktionsbaustein, indem Aufgabe 1 in einem **neuen** Programm innerhalb des Projektes damit umgesetzt wird (der ursprüngliche Code von Aufgabe 2 muss erhalten bleiben, also wirklich eine neue POU erstellen!)

5. Erstelle eine funktionierende Visualisierung mit folgenden Eigenschaften:
    Die Taster S1,S2,S3,S4 und der Nothalt-Taster können bedient werden.

    Der Zustand der Signale V1, V2 und S5 wird über Lampen dargestellt

    Der Wert von „Level_Full“ kann über ein numerisches Eingabefeld festgelegt werden.

    Um einen Signalwechsel von S5 auslösen zu können, soll über einen vertikalen Slider ein fiktiver Tank-Füllstand eingestellt werden können. Der eingegebene Wert von „Level_Full“ muss dabei sowohl über- als auch unterschritten werden können.

6. Teste die Visualisierung und das Zusammenspiel mit deinem Programmen auf der SoftSPS.

## Fragestellungen
* Was ist eine Selbsthaltung und wie kann diese in FUP und ST umgesetzt werden?
* Wie kann eine Verriegelungsfunktion in eine Steuerung integriert werden?
* Wie können Codeteile der Steuerung zusammengefasst und wiederverwendet werden?
* Wie funktioniert die Verbindung von Programmvariablen und der Visualisierung?

## Abgabe
1. ein Anlagenschema als saubere **Handskizze** der zu steuernden Anlage inklusive eingezeichneter Schalter und Sensoren. Dabei sollen (wo möglich) **standardisierte Symbole** und **Symbolbezeichnungen** bzw. Nummerierungen verwendet werden. Diese sollen sich auch in den Programmen wiederfinden (siehe auch Abschnitt "Weitere Informationen und Ressourcen"). Füge die Handskizze als Foto/Scan in das Protokoll ein.
2. alle erstellten, in eigenen Worten gut dokumentierten Quelltexte (Screenshots möglich)
3. Eine Beschreibung der Vorgehensweise beim Upload und Ausführen der Programme und Möglichkeiten der Fehlersuche/Debugging.
4. ein Verzeichnis aller verwendeten Quellen (Links aus dem Internet etc.)

### Abgabedateien
* Protokoll als PDF
* Codesys-Projekt (**nur** .project-Datei)

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Steuerungsprogramme erfüllen die verlangte Funktion zum größten Teil, 
- [ ] eine rudimentäre Visualisierung ist vorhanden
- [ ] die Anlage ist im Protokoll mittels lesbarer Handskizze dokumentiert.
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Steuerungslogik ist zur Gänze inklusive Aufteilung auf Funktionsblöcke umgesetzt. 
- [ ] Die Visualisierung ermöglicht die vollständige Steuerung des Prozesses und ist optisch wie funktional sinnvoll umgesetzt.
- [ ] im Protokoll, Programmen und Visualisierung werden standardisierte Symbole und Bezeichnungen verwendet. 

## Weitere Informationen und Ressourcen
* [Präsentation Einführung](./resources/IndustrielleProgrammierungIntro.pdf)
* [Hilfestellung zur Programmierung mit Strukturiertem Text](https://de.wikipedia.org/wiki/Strukturierter_Text)
* [Kennbuchstaben für Sensoren und Aktoren nach EN 62424](https://de.wikipedia.org/wiki/R%26I-Flie%C3%9Fschema#Erstbuchstabe_%E2%80%93_PCE-Kategorie) (hier finden sich auch Symbole für Tanks, Ventile, ...)
* [Liste von Schaltzeichen](https://de.wikipedia.org/wiki/Liste_der_Schaltzeichen_(Elektrik/Elektronik))
* Videos zur Einführung in Codesys [Projekt anlegen](https://www.youtube.com/watch?v=ESDGI_GaSkM&t=49s), [Programme erstellen und simulieren](https://www.youtube.com/watch?v=6klf4F5iolw), [Visualisierung erstellen](https://www.youtube.com/watch?v=FHJ6SJ98h7s), [Programme ändern und erweitern](https://www.youtube.com/watch?v=9sg_xLHvkXA)

---
**Version** *20210927v1*
