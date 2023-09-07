# RaspberryPi

## Installation
Download the newest [Raspbian](https://www.raspberrypi.org/downloads/raspbian/) and unpack it. You will get an image file.  

### Mounting Image File
With the following command it is possible to get the necessary start points for [mounting the image file](https://www.linuxquestions.org/questions/linux-general-1/how-to-mount-img-file-882386/):

```bash
fdisk -l /home/mike/Downloads/raspbian/2018-06-27-raspbian-stretch-lite.img
	
Disk /home/mike/Downloads/raspbian/2018-06-27-raspbian-stretch-lite.img: 1.8 GiB, 1862270976 bytes, 3637248 sectors
Units: sectors of 1 * 512 = 512 bytes
Sector size (logical/physical): 512 bytes / 512 bytes
I/O size (minimum/optimal): 512 bytes / 512 bytes
Disklabel type: dos
Disk identifier: 0x4d3ee428
	
Device                                                              Boot Start     End Sectors  Size Id Type
/home/mike/Downloads/raspbian/2018-06-27-raspbian-stretch-lite.img1       8192   96663   88472 43.2M  c W95 FAT32 (LBA)
/home/mike/Downloads/raspbian/2018-06-27-raspbian-stretch-lite.img2      98304 3637247 3538944  1.7G 83 Linux
```

To be able mounting the two partitions it is necessary to calc the offset for mounting. The /boot partion starts at 8192*512=4194304

```bash
sudo mount -o loop,offset=4194304 2018-06-27-raspbian-stretch-lite.img boot/
```

Unfortunately it is possible to mount both partitions at once. So, after unmounting boot the following command is mounting the root partition:

```bash
sudo mount -o loop,offset=50331648 2018-06-27-raspbian-stretch-lite.img root/
```

## Configuring the RaspberryPi
[Here](https://www.raspberrypi.org/documentation/configuration/) you will find a lot of configuration guides. Extracting the necessary informations, the nex steps are a summary of those guides.

### Setting up wired networking
You need to ensure that your ethernet port is activated. Therefore edit the `/etc/network/interfaces` config file and add those lines:

```bash
auto eth0
allow-hotplug eth0

iface eth0 inet dhcp

```
Connecting the RaspberryPi to your wired network, you can check with `nmap` your network to discover the IP-Address, e.g.:

```bash
nmap -sn 10.0.100.0/24
```


### Setting up wireless networking
You will need to define a wpa_supplicant.conf file for your particular wireless network. Put this file in the boot folder, and when the Pi first boots, it will copy that file into the correct location in the Linux root file system and use those settings to start up wireless networking.  

```bash
network={
	ssid="meschareth"
	psk="grid4canada-react"
	id_str="meschmobile"
}
	
network={
	ssid="TGM1x"
	key_mgmt=WPA-EAP
	eap=PEAP
	identity="tgmusername"
	#
	# To generate the hash use the following commands:
	# echo -n plaintext_password_here | iconv -t utf16le | openssl md4
	#
	# resource: https://unix.stackexchange.com/questions/278946/hiding-passwords-in-wpa-supplicant-conf-with-wpa-eap-and-mschap-v2/278948
	#
	password=hash:abcd01c9d82753f62945dfec9cb4b6c3c91
	phase2="auth=MSCHAPV2"
}
```

More information on the wpa_supplicant.conf file can be found [here](https://www.raspberrypi.org/documentation/configuration/wireless/wireless-cli.md) or [here](https://w1.fi/wpa_supplicant/).

It is also necessary to set the /etc/network/interfaces file:

```bash
source-directory /etc/network/interfaces.d
	
auto wlan0
allow-hotplug wlan0

iface wlan0 inet dhcp
  wpa-conf /etc/wpa_supplicant/wpa_supplicant.conf
  post-up /etc/network/if-up.d/sendIP.py
	
iface default inet dhcp
```

This information is based on [this](https://weworkweplay.com/play/automatically-connect-a-raspberry-pi-to-a-wifi-network/).

To get always the newest IP-Address the python script /etc/network/if-up.d/sendIP.py was created:

```python
#!/usr/bin/python3
import smtplib
import datetime
import subprocess

passwd = "PASSWORD"
user = "USERNAME@gmail.com"

sender = user
recipients = "mborko@tgm.ac.at office@microgreen.co.at".split()
subject = "RaspberryPi is now up ..."

now = datetime.datetime.now()

msg = ("From: %s\r\nTo: %s\r\nSubject: %s\r\n"
        % (sender, ", ".join(recipients), subject))

msg = msg + "Testmail generated @" + str(now) + "\r\n\r\n"
msg = msg + subprocess.check_output('ip address', shell=True).decode()

def sendmail():
    try:
        server = smtplib.SMTP_SSL('smtp.gmail.com', 465)
        server.set_debuglevel(0)
        server.ehlo()
        server.login(user, passwd)
        server.sendmail(sender, recipients, msg)
        server.quit()
        print("Email sent successfully!")
    except smtplib.SMTPAuthenticationError as e:
        print("Username and Password not accepted.")
        return False
    except:
        print("Unable to send the email!")
        return False
    return True

while sendmail() != True:
    try:
        print("Trying ... ")
    except KeyboardInterrupt as e:
        print("\nUser interrupt detected ...")
        print("Email was not sent. Please check your connectivity!")
        break
```



### Enabling SSH
SSH can be enabled by placing a file called **ssh** in to the boot folder. This flags the Pi to enable the SSH system on the next boot.


## Copying the image to the SD card
In a terminal window, write the image to the card with the command below, making sure you replace the input file argument.

```bash
sudo dd bs=4M if=2018-06-27-raspbian-stretch-lite.img of=/dev/mmcblk0 conv=fsync
```

## Check RaspberryPi
If you want to check your RaspberryPi you can switch on the green led: ["Can we control the on-board leds"](https://www.raspberrypi.org/forums/viewtopic.php?t=12530). Here are the commands:

```bash
echo none >/sys/class/leds/led0/trigger
echo 1 >/sys/class/leds/led0/brightness

# Switch off the green LED
echo 0 >/sys/class/leds/led0/brightness

# Reenable the proper function of this LED
echo mmc0 >/sys/class/leds/led0/trigger
```
