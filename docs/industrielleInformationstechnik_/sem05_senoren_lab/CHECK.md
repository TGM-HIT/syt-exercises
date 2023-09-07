# Embedded Devices "Sensoren und Datenerfassung" - Checklist

## Bewertung 
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Wie nimmt der Mikrocontroller analoge Signale auf?
    * ADC
    * Bitrate / Referenzspannung sind wichtig
- [ ] Was ist unter Abtastrate zu verstehen?
    * Wie oft Input pro Zeit gesampelt wird
    * hängt von Frequenz ab
- [ ] Welche Probleme können bei der Verarbeitung von analogen Signalen aufkommen?
- [ ] Wie funktioniert ein Fotowiderstand und ein Potentiometer?
- [ ] Einsatz der Simulationsumgebung mit funktionierendem Code

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger Code auf Arduino Board upgeloadet und richtig beschaltet
- [ ] Wieviele analoge Werte kann der benutzte Mikrocontroller unterscheiden?
- [ ] Wie können die Probleme der AD-Konvertierung gelöst werden?
- [ ] Recherche aller Fragen dokumentiert und entsprechend zitiert


### Kommentare
- sauber gearbeitet
- bitte genauer arbeiten!
- leider kein Schaltungsaufbau
- Abgabefragen 81.7%
- Quellen Richtlinie der IEEE beachten!
- INPUT Definition bitte in Setup nicht vernachlässigen, auch wenn Default
- Code fehlt, INPUT in Setup festgelegt?
- Quantisierungsfehler?
- Was ist die Baudrate bei Serial.begin()?
- Aufarbeitung der AusgabeInformationen überdenken; Delay?


### Beispielcode
```C
int potentiometer = 0;
int fotoWiderstand = 0;

void setup()
{
  pinMode(A0, INPUT);
  pinMode(A1, INPUT);
  Serial.begin(9600);
}

void loop()
{
  // read the input on analog pin 0:
  potentiometer = analogRead(A0);
  fotoWiderstand = analogRead(A1);
  // print out the value you read:
  Serial.print(potentiometer);
  Serial.print(" ");
  Serial.println(fotoWiderstand);
  delay(10); // Delay a little bit to improve simulation performance
}
```
