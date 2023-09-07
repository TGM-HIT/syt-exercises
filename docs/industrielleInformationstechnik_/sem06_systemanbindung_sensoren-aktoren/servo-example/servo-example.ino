#include <Servo.h>

#define PIN_HC_TRIG   4
#define PIN_HC_ECHO   3
#define PIN_SERVO_SIG 5

Servo servo;
int zielDistanz;

void setup() {
  Serial.begin(19200);
  Serial.print("Geben Sie die einzunehmende Distanz in Zentimetern ein: ");
  while (!Serial.available());
  zielDistanz = Serial.parseInt();
  Serial.println(zielDistanz);

  pinMode(PIN_HC_TRIG, OUTPUT);
  pinMode(PIN_HC_ECHO, INPUT);
  pinMode(PIN_SERVO_SIG, OUTPUT);
  servo.attach(PIN_SERVO_SIG);
}

float letzteEntfernung = 0.0f;
float servoPos = 0.0f;

void loop()
{
  float entfernungsSumme = 0.0f;
  constexpr int anzahlMessungen = 10;
  for(int i = 0; i < anzahlMessungen; i++)
  {
    delay(10);
    digitalWrite(PIN_HC_TRIG, HIGH);
    delayMicroseconds(10);
    digitalWrite(PIN_HC_TRIG, LOW);
    long echoDauer = pulseIn(PIN_HC_ECHO, HIGH);

    constexpr float v = (343.2f)/10000.0f;
    float entfernung = echoDauer * v/2.0f;

    entfernungsSumme += entfernung;
  }

  float entfernung = entfernungsSumme/anzahlMessungen;
  if(entfernung < 2.0f || entfernung > 400.0f) {
    Serial.println("Gemessene Entfernung außerhalb des gültigen Bereichs.");
    return;
  }

  if(abs(letzteEntfernung - entfernung) >= 0.5f)
  {
    if(entfernung < zielDistanz) servoPos -= 5;
    if(entfernung > zielDistanz) servoPos += 5;
    if(servoPos < 0) servoPos = 0;
    if(servoPos > 90) servoPos = 90;
    Serial.print("Entfernung: ");
    Serial.print(entfernung);
    Serial.print("cm | Servostellung: ");
    Serial.print(servoPos);
    Serial.println(" Grad");

    servo.write(servoPos);
    letzteEntfernung = entfernung;

    delay(25);
  }
}
