# Embedded Devices "Einführung in Mikrocontroller" - Checklist

## Bewertung 
Gruppengrösse: 1 Person

### Grundanforderungen **überwiegend erfüllt**
- [ ] Was ist ein Mikrocontroller und wie ist dieser aufgebaut?
	* Blockschaltbild oder Auflistung von Modulen eines Mikrocontrollers
- [ ] Was sind *Timer, EEPROM, Flash, SRAM, A/D Converter und Oscillator* im Blockschaltdiagramm und welche Aufgaben haben sie?
- [ ] Wo sind die grundsätzlichen Unterschiede zwischen einem PC und einem Mikrocontroller?
	* Taktfrequenz
	* Peripherie ist eingeschränkt
	* uC hat meist nur eine dezidierte Aufgabe
- [ ] Wie können Elektronikbauteile an den Mikrocontroller angeschlossen werden? Was ist dabei zu beachten?
- [ ] Was machen die Methoden ``setup()`` und ``loop()`` in der Arduino Entwicklungsumgebung? 
- [ ] Wie spricht man den digitalen Pin 8 an? Was bedeutet dabei das *HIGH* und *LOW*?
- [ ] funktionierender Code simuliert (z.B. mit Tinkercad)
- [ ] Delay-Zeit auf 250 ms (2 Hz sind 0,5 T damit muss eine halbe Periode 250 ms lang sein)

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Funktionstüchtiger Code auf Arduino Board upgeloadet und richtig beschaltet
- [ ] Welche Unterschiede gibt es bei den einzelnen Ports und Pins? Welche Leistung kann ich hier erwarten? Sind immer alle Funktionalitäten gleichzeitig aktiv?
- [ ] Welche Besonderheiten gibt es in Bezug auf das Betriebssystem?
- [ ] Zitate und Quellen sauber dokumentiert

### Beispielcode
```C
int BLINK_LED = 8;
float frequency = 2;
float half_period_ms = (( 1 / frequency ) / 2 ) * 1000;

void setup()
{
  pinMode(BLINK_LED, OUTPUT);
  pinMode(LED_BUILTIN, OUTPUT);
  digitalWrite(LED_BUILTIN, HIGH);
}

void loop()
{
  digitalWrite(BLINK_LED, HIGH);
  delay(half_period_ms);
  digitalWrite(BLINK_LED, LOW);
  delay(half_period_ms);
}
```

### Kommentare
- Bitte IEEE Zitierrichtlinien beachten
- Bitte etwas genauer arbeiten!
- Periodendauer / Pin Nummer im Code festlegen
- HIGH / LOW Spannungswerte?

