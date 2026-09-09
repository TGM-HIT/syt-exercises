import spidev
spi = spidev.SpiDev()
spi.open(0, 0)
spi.max_speed_hz = 1000000
r = spi.xfer([0x27])
print(r)
