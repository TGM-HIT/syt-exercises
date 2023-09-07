#include <ESP32Servo.h>
#include <DHT.h>

#define DHTPIN 5
#define DHTTYPE DHT11

const int Trigger = 19;
const int Echo = 18;
const int servopin = 21;
const int led = 2;

int minVal = 10000;
int maxVal = 0;


Servo servo;
DHT dht(DHTPIN, DHTTYPE);

void setup() {
  Serial.begin(9600);
  pinMode(Trigger, OUTPUT);
  pinMode(Echo, INPUT);
  pinMode(led, OUTPUT);
  digitalWrite(Trigger, LOW);
  //servo.attach(servopin);
  dht.begin();
}

void loop() {
  digitalWrite(Trigger, HIGH);
  delayMicroseconds(10);
  digitalWrite(Trigger, LOW);

  long pulse = pulseIn(Echo, HIGH);  // in cm
  long cm = pulse / 58;

  if (millis() < 5000) {
    digitalWrite(led, HIGH);
    if (cm < minVal)
      minVal = cm;
    if (cm > maxVal)
      maxVal = cm;
    Serial.print("Min:");
    Serial.print(minVal);
    Serial.print("\tMax:");
    Serial.print(maxVal);
    Serial.print("\t");
  } else {
    digitalWrite(led, LOW);
    cm = constrain(cm, minVal, maxVal);
    servo.write(constrain(cm, 0, 180));

    float celsius = dht.readTemperature();
    float speedofsound = 331.3 + (0.606 * celsius);  // Calculate speed of sound by using the given formula in m/s
    int cm2 = pulse * (speedofsound / 10000) / 2;

    float x1 = 5, y1 = 7, x2 = 300, y2 = 295;
    float k = (y2 - y1) / (x2 - x1);
    float d = y1 / k / x1;
    float cm3 = k * cm + d;

    Serial.print("Temp:");
    Serial.print(celsius);
    Serial.print("\t");
    Serial.print("KaliDist:");
    Serial.print(cm2);
    Serial.print("\t");
    Serial.print("CalcDist:");
    Serial.print(cm3);
    Serial.print("\t");
    Serial.print("Err:");
    Serial.print(cm / float(cm2));  //Teil4
    Serial.print("\t");
  }

  Serial.print("Dist:");
  Serial.print(cm);
  Serial.println();

  //servo.write(map(cm, 0, 325, 0, 180));

  delay(2000);
}
