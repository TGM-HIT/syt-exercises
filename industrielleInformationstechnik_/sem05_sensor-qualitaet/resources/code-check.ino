#include <CapacitiveSensor.h>

CapacitiveSensor   sensor = CapacitiveSensor(8,11);        // zwsichen bin 8 und 11 befinden sich vier in reihe geschaltene 1M widerstände, an pin 11 und dem widerstand wird ein stück alufolie mit einer krokodilklemme befestigt

#define SIZE 32
int raw;
int values[SIZE];

void setup(){
   sensor.set_CS_AutocaL_Millis(0xFFFFFFFF);    
   Serial.begin(115200);
   Serial.println("raw smooth");
}

void loop(){
  raw = sensor.capacitiveSensor(10);   

  for(int i = 0; i < SIZE-1;i++){
    values[i] = values[i+1];
  }
  values[SIZE-1] = raw;
  int average = 0;
  for(int i = 0; i < SIZE; i++){ 
    average += values[i];
  }
  
  int smooth = average/32;
  Serial.print(raw);
  Serial.print(" ");
  Serial.println(smooth);
  tone(3,smooth);
  delay(1);
}
