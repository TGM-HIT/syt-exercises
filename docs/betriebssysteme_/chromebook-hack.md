# Chromebook Hack

[MrChromebox.tech](https://docs.mrchromebox.tech/)

Acer Chromebook 11 (CB3-111/131, C730, C730E, C735) Codename GNAWTY
[Supported Devices | MrChromebox.tech](https://docs.mrchromebox.tech/docs/supported-devices.html)

1. Hardware WP (Write Protection) Schraube entfernen:
Rücksteite aufschrauben, Schraube laut [Bild](https://docs.mrchromebox.tech/images/wp/gnawty_wp.jpg) entfernen, wieder zuschrauben 
https://docs.mrchromebox.tech/images/wp/gnawty_wp.jpg

2. Boot in Recovery Mode
[Recovery Mode | MrChromebox.tech](https://docs.mrchromebox.tech/docs/boot-modes/recovery.html)
Press `ESC` + `Refresh` (arrow icon), + `Power` at the same time

3. Enable Developer Mode
	1. Press `[CTRL+D]`. This should bring up a warning asking for confirmation for either "Turn OS Verification OFF" or "Enable Developer Mode".
	2. Press `[ENTER]`. The system should reboot and bring you to the "You are in Developer Mode" or "OS Verification is OFF" screen.
	3. Press `[CTRL+D]` to boot from internal disk.
	4. Connect to a network as usual, but **do not enable debugging features**.
[Developer Mode | MrChromebox.tech](https://docs.mrchromebox.tech/docs/boot-modes/developer.html#enabling-developer-mode)

4. Enter Root Shell
[Developer Mode | MrChromebox.tech](https://docs.mrchromebox.tech/docs/boot-modes/developer.html#getting-a-root-capable-shell)
On the login screen, press `[CTRL+ALT+F2]` (F2 is right-arrow on most ChromeOS keyboards), then login with user `chronos` (no password is required, nor should one be set). This gives you a VT2 shell.

5. Run Firmware Scrip
To download and run this script under ChromeOS or Linux, from a terminal/shell type: `cd; curl -LO mrchromebox.tech/firmware-util.sh && sudo bash firmware-util.sh` and press `[ENTER]`.
[Firmware Utility Script | MrChromebox.tech](https://docs.mrchromebox.tech/docs/fwscript.html)

6. Install UEFI (Full ROM) Firmware

7. Boot Stick erstellen und Linux wie gewohnt installieren
Getestet: [Home - Linux Mint](https://www.linuxmint.com/) (Recommended); [GalliumOS – A fast and lightweight Linux distro for ChromeOS devices](https://galliumos.org/) (keine Updates mehr)
