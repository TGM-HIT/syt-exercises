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
