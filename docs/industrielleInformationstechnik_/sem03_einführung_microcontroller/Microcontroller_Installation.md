---
hide:
  - navigation
---

# ESP32 Installation

## Arduino IDE Installation

* Installiere die [Arduino IDE 2.2](https://www.arduino.cc/en/software) oder höher

## ESP32 Board Installation

* In der IDE wechsle in die Settings und füge folgende URL bei Additional boads manager URLs ein: 

```
https://raw.githubusercontent.com/espressif/arduino-esp32/gh-pages/package_esp32_index.json
```

* Bestätige mit OK.
* Tools -> Board -> Boards Manager... -> Suche nach "esp32".
* Installiere esp32 by Espressif Systems 2.0.14 oder höher

## Treiber Installation (falls Board nicht erkannt)

Falls das Board in der Arduino IDE nicht erscheint und im Windows Device Manager mit einem gelben Dreieck markiert ist, fehlt wahrscheinlich der entsprechende Treiber.

Lade den entsprechenden [Treiber](https://www.silabs.com/developers/usb-to-uart-bridge-vcp-drivers?tab=downloads) (oder hier: ESP32 Treiber (Windows)) herunter und entpacke den Ordner. Im Device Manager wähle das entsprechende Geräte aus -> Rechtsklick -> update Driver -> Auf diesem Gerät suchen -> Entpackten Ordner auswählen.

## Upload Blink

Überprüfe welchen ESP32 du hast: ESP-WROOM-32 oder ESP32-C3. (Schuljahr 24/25: 2xHIT ESP32-C3; 3xHIT ESP-WROOM-32)

* Kopieren folgenden Code in ein neues Sketch:

??? info "ESP-WROOM-32"

    ```c
    // the setup function runs once when you press reset or power the board
    void setup() {
      pinMode(2, OUTPUT);  // initialize digital pin LED_BUILTIN as an output.
    }
    
    // the loop function runs over and over again forever
    void loop() {
      digitalWrite(2, HIGH);  // turn the LED on (HIGH is the voltage level)
      delay(1000);                      // wait for a second
      digitalWrite(2, LOW);   // turn the LED off by making the voltage LOW
      delay(1000);                      // wait for a second
    }
    ```

??? example "ESP32-C3"

    ```c
    #include <Adafruit_NeoPixel.h>
    
    #define PIN 8
    #define NUMPIXELS 1
    Adafruit_NeoPixel pixels(NUMPIXELS, PIN, NEO_GRB + NEO_KHZ800);
    
    void setup() {
      pixels.begin();
      pixels.clear();
    }
    
    void loop() {
      pixels.setPixelColor(0, pixels.Color(0, 150, 0));
      pixels.show();
    }
    ```

* Klicke oben auf das Dropdown für die Board und Port Wahl -> Select other board and port... -> suche bei Boards "ESP32 Dev Module" bzw. "ESP32C3 Dev Module" und wähle den entsprechenden Port (spätestens jetzt muss der μC angeschlossen sein). Solltest du dir unsicher sein welcher Port der richtige ist, kontrolliere welcher Port verschwindet/erscheint beim aus/anstecken. Oder suche im Device Manager nach den COM Ports. Sollte kein Port erscheinen und im Device Manager ein Warnsymbol erscheinen installiere den Treiber im Schritt oben.
* Wähle OK.
* Upload. Die blaue LED am μC sollte nun blinken/Die RGB LED sollte grün leuchten.

#### Weiterführend

##### PINOUT

??? info "ESP-WROOM-32"

    ![Pinout WROOM](https://raw.githubusercontent.com/AchimPieters/esp32-homekit-camera/master/Images/ESP32-30PIN-DEVBOARD.png)

??? example "ESP32-C3"

    ![Pinout C3](https://docs.espressif.com/projects/arduino-esp32/en/latest/_images/esp32-c3_devkitM-1_pinlayout.png)

- [Simulation mit Tinkercad](https://www.tinkercad.com/)
- [Wokwi Simulator](https://wokwi.com/)
- [ESP32 Troubleshooting Guide | Random Nerd Tutorials](https://randomnerdtutorials.com/esp32-troubleshooting-guide/)

## Quellen

[1] „Arduino - NeoPixel LED Strip | Arduino Tutorial“, Arduino Getting Started. Zugegriffen: 16. Oktober 2024. [Online]. Verfügbar unter: [https://arduinogetstarted.com/tutorials/arduino-neopixel-led-strip](https://arduinogetstarted.com/tutorials/arduino-neopixel-led-strip)   
[2] „Blink | Arduino Documentation“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://docs.arduino.cc/built-in-examples/basics/Blink](https://docs.arduino.cc/built-in-examples/basics/Blink)
[3] „CP210x USB to UART Bridge VCP Drivers - Silicon Labs“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://www.silabs.com/developers/usb-to-uart-bridge-vcp-drivers](https://www.silabs.com/developers/usb-to-uart-bridge-vcp-drivers)   
[4] A. Pieters, „ESP32 – PinOut -“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://www.studiopieters.nl/esp32-pinout/](https://www.studiopieters.nl/esp32-pinout/)
[5] „ESP32 Troubleshooting Guide | Random Nerd Tutorials“. Zugegriffen: 16. Oktober 2024. [Online]. Verfügbar unter: [https://randomnerdtutorials.com/esp32-troubleshooting-guide/](https://randomnerdtutorials.com/esp32-troubleshooting-guide/)   
[6] „ESP32-C3-DevKitM-1 - - — esp-dev-kits latest documentation“. Zugegriffen: 16. Oktober 2024. [Online]. Verfügbar unter: [https://docs.espressif.com/projects/esp-dev-kits/en/latest/esp32c3/esp32-c3-devkitm-1/user_guide.html](https://docs.espressif.com/projects/esp-dev-kits/en/latest/esp32c3/esp32-c3-devkitm-1/user_guide.html)   
[7] „Installing ESP32 in Arduino IDE (Windows, Mac OS X, Linux) | Random Nerd Tutorials“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://randomnerdtutorials.com/installing-the-esp32-board-in-arduino-ide-windows-instructions/](https://randomnerdtutorials.com/installing-the-esp32-board-in-arduino-ide-windows-instructions/)   
[8] „NodeMCU ESP32 | Joy-IT“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://joy-it.net/en/products/SBC-NodeMCU-ESP32](https://joy-it.net/en/products/SBC-NodeMCU-ESP32)   
[9] „Software“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://www.arduino.cc/en/software](https://www.arduino.cc/en/softwarehttps://www.arduino.cc/en/software)   
[10] „Tinkercad | From mind to design in minutes“, Tinkercad. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://www.tinkercad.com/](https://www.tinkercad.com/)   
[11] „Wokwi - Online ESP32, STM32, Arduino Simulator“. Zugegriffen: 4. Dezember 2023. [Online]. Verfügbar unter: [https://wokwi.com/](https://wokwi.com/)   


---
**Version** *20241017v2*