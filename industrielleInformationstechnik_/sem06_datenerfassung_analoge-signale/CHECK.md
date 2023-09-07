# Datenerfassung "Analoge Signale aufnehmen und verarbeiten" - Checklist

## Bewertung 
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Wie funktioniert das "Simple one-wire serial interface"?
- [ ] Wie funktioniert der eingesetzte Sensor? Welche Faktoren sind dabei zu beachten?
- [ ] Wie oft pro Sekunde können Daten vom Sensor abgefragt werden?
- [ ] Was muss bei der Verarbeitung der Sensordaten beachtet werden?
- [ ] Welche Funktion bietet die Hardware-Library an? Was passiert dort im Code?
- [ ] Dokumentation der Beschaltung

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger, grundlegender Code auf Arduino Board upgeloadet und richtig beschaltet
- [ ] Sensordaten richtig ausgelesen und angepasst
- [ ] Zitate und Quellen sauber dokumentiert

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Wie funktioniert der eingesetzte Sensor? Welche Faktoren sind dabei zu beachten?
- [ ] Wie oft pro Sekunde können Daten vom Sensor abgefragt werden?
- [ ] Was muss bei der Verarbeitung der Sensordaten beachtet werden?
- [ ] Welche Funktion bietet die API an? Was passiert dort im Code?

### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger, erweiterter Code auf Arduino Board upgeloadet und richtig beschaltet


### Kommentare
- sauber gearbeitet
- bitte genauer arbeiten!
- Übertragungsgeschwindigkeit / Anzahl an Knoten / Länge der Leitung?
- Datenübertragung nicht beschrieben
- Zeitfenster bez. Sampling nicht erläutert
- Erfassung der nicht-elektrischen Größe nicht erläutert
- leider kein Schaltungsaufbau
- Schaltungsaufbau unübersichtlich bzw. Beschaltung nicht beschrieben
- Quellen Richtlinie der IEEE beachten!
- Bitte die Bilder mit Unterschrift ("Caption") versehen und die Quelle referenzieren
- Library (DHT.h / DHT.cpp) analysieren
- Erläuterung zu PullUp-Widerstand fehlt
- Wieso ist ein delay im Setup notwendig?
- Ausgabe der Sensordaten unübersichtlich
- dht.setup() nicht beschrieben
- Ausgabegeschwindigkeit falsch gesetzt
- Delay bei Sensorabfrage zu gering!

### GK-Beispielcode
```C
#include "DHT.h"

DHT dht;

void setup()
{
  Serial.begin(19200);
  Serial.println();
  Serial.println("Status\tHumidity (%)\tTemperature (C)\t(F)");

  dht.setup(2); // data pin 2
}

void loop()
{
  delay(dht.getMinimumSamplingPeriod());

  float humidity = dht.getHumidity();
  float temperature = dht.getTemperature();

  Serial.print(dht.getStatusString());
  Serial.print("\t");
  Serial.print(humidity, 1);
  Serial.print("\t\t");
  Serial.print(temperature, 1);
  Serial.print("\t\t");
  Serial.println(dht.toFahrenheit(temperature), 1);
}
```

