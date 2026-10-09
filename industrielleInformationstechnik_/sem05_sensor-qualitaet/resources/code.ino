#include <CapacitiveSensor.h>

CapacitiveSensor   sensor = CapacitiveSensor(8,11);        // zwsichen bin 8 und 11 befinden sich vier in reihe geschaltene 1M widerstände, an pin 11 und dem widerstand wird ein stück alufolie mit einer krokodilklemme befestigt

int raw;

void setup(){
   sensor.set_CS_AutocaL_Millis(0xFFFFFFFF);    
   Serial.begin(115200);
   Serial.println("raw smooth");
}

void loop(){
  raw = sensor.capacitiveSensor(10);   

  int smooth = raw;
  Serial.print(raw);
  Serial.print(" ");
  Serial.println(smooth);
  delay(1);
}
