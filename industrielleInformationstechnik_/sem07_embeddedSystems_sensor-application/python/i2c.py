#!/user/bin/env python
import time
import smbus

bus = smbus.SMBus(1)

data = bus.read_i2c_block_data(0x19, 2)
print(data)
# Daten kommen binaer - [Lowbyte, Highbyte]
TempMSB = data[0]
TempLSB = data[1]
Temp = (((TempMSB << 8) | TempLSB) >>7) * 0.5
# negativ?
if Temp > 125:
    Temp = Temp - 256
print(Temp)
