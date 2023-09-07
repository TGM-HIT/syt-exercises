# Systemtechnik Skriptum

## 5.Semester

### Betriebssysteme

* **Was sind die Mindestanforderungen an das Host-System für die aktuelle Version von VirtualBox bzw. VMware (Hard- und Software)?**

[www.virtualbox.org/wiki/End-user_documentation](http://www.virtualbox.org/wiki/End-user_documentation)

https://www.virtualbox.org/manual/ch01.html#hostossupport

[Windows VM | Workstation Pro | VMware](https://www.vmware.com/products/workstation-pro.html)

* **Welche Einstellungen am Host-System können die Performance der Virtualisierung erhöhen? Was ist dabei das Kürzel [AMD-V](https://www.amd.com/en/technologies/virtualization-solutions) bzw. [VT-x](https://www.intel.com/content/www/us/en/support/articles/000005486/processors.html)**

Man kann die Anzahl der CPU-Kerne erhöhen oder mehr RAM und Grafikspeicher.
[Host Europe, “Wie kann ich die Virtualisierung im Bios Aktivieren?,” *Host Europe Blog*, 22-Mar-2021. [Online]. Available: https://www.hosteurope.de/blog/virtualisierung-aktivieren-unter-windows-macos-und-linux/] Die Performance einer VM kann von der Aktivierung der hardwaregestützten Virtualisierung am Host-System erhöht werden. Die  hardwaregestützte Virtualisierung wird bei neueren AMD CPUs AMD-V  genannt und bei Intel heißt es VT-x. Diese Technologie erlaubt es unter  Verwendung eines Hypervisors, mehrere Betriebssysteme parallel auf einem x86-Prozessor auszuführen und die Ressourcen isoliert und effizient zwischen den parallel ausgeführten Betriebssystemen aufzuteilen. Ebenfalls kann die Performance der VM gesteigert werden wenn unnötig laufende Programme am Host-System gestoppt werden, damit keine unnötigen Ressourcen verbraucht werden.

* **Wieso werden die virtuellen Partitionen gerne auf mehrere Dateien aufgeteilt?**

Kleinere, zusammenhängende .VDMK Dateien erleichtern einige Tätigkeiten, wie das übertragen auf anderes Filesystem, das Erstellen von Backups, der benötigte freie Speicherplatz um die (ganze) Virtuelle Disk zu verkleinern, einen Snapshot aufzurufen, und um die Disk zu defragmentieren. Weiters ist das Backup erstellen über FTP sicherer, da es bei Übertragungsfehlern nicht abgebrochen werden muss. Die größte zu wiederholende Datei ist die Größe der einzelnen Teile. Oder wenn das Host-System ein Filesystem verwendet was nur kleine Dateien unterstützt (bspw. FAT). 

Eine oft gewählte Größe ist 2 GB, jedoch können auch größen gewählt werden. 

Bei großen Dateien kommt es bei manchen Programmen manchmal zu Fehlern. 

* **Welche zusätzliche Komponente sind  zur besseren Integration des Gastbetriebssystems von nöten? Was muss  dabei beachtet werden?**

Zur besseren Integration eines Gast-System ist eine Gasterweiterung von nöten, dadurch lässt sich die VM bspw. im  Vollbild verwenden, eine gemeinsame Zwischenablage, Drag&Drop oder Gemeinsame Order zwischen Gast und Host erstellen. 

* **Was ist der Host-Key und wie kommt dieser zum Einsatz?**

[ “Virtualisierung,” _Virtualisierung | Universität Tübingen_, 20-Apr-2021. [Online]. Available: https://uni-tuebingen.de/fakultaeten/wirtschafts-und-sozialwissenschaftliche-fakultaet/faecher/fachbereich-wirtschaftswissenschaft/wirtschaftswissenschaft/fb-wiwi/einrichtungen-wirtschaftswissenschaft/wiwi-it/tipps/virtualisierung/] Der Host-Key dient der Bedienung der virtuellen Maschine über  Tastenkombinationen, bspw. öffen von Vollbildschirm (HOST + F), VM  pausieren (HOST + P), VM schließen (HOST + Q), VM zurücksetzen (HOST +  R) oder Sicherungspunkterstellen (HOST + T). Definiert wird der Host-Key in den Globalen Einstellungen von VirtualBox (Default: Strg-RECHTS).

* **Wie sind Virtualisierungsumgebungen aufgebaut? Welche Bestandteile sind  dabei notwendig? Wieso kann man ein Betriebssystem innerhalb eines  anderen Betriebssystems ausführen?**

 S. Luber, “Was ist eine Virtuelle Maschine (VM)?,” *Storage*, 28-Jun-2019. [Online]. Available: https://www.storage-insider.de/was-ist-eine-virtuelle-maschine-vm-a-842096/

* **Was ist das *Open Virtualization Format Archive*? Welche Eckpunkte müssen beim Importieren und Exportieren von virtuellen Maschinen beachtet werden?**

Das Open Virtualization Format ist ein Standard um das Verteilen von  virtuellen Maschinen leichter zu machen. Das OVF-Format erlaubt es, VMs  und deren Ressourcen, wie Betriebssystem, Anwendungen und  Netzwerkeinstellungen, in einer einzigen Datei zu speichern. Beim  Importieren und Exportieren von VMs im OVF-Format gibt es einige  wichtige Aspekte zu beachten, wie die Kompatibilität mit der  Zielumgebung, das Management von Ressourcen wie Arbeitsspeicher, CPU und Festplattenspeicher und die Netzwerkeinstellungen der VM.

Virtuelle Betriebssysteme können kopiert werden, wenn es sich um die gleiche Architektur handelt. Quell- und  Zielrechner auf welchem die Virtualisierung läuft müssen dabei nicht die selben Hardwarekomponenten besitzen.

* **Netzwerke in virtuellen Umgebungen**

"Virtual Networking" User Manual **Virtualbox** [online](https://www.virtualbox.org/manual/UserManual.html#networkingdetails)

"Understanding Common Networking Configurations" **vmware Docs** [online](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-D9B0A52D-38A2-45D7-A9EB-987ACE77F93C.html)

"Configuring Virtual Network Adapter Settings" User Manual **VMware** [online](https://docs.vmware.com/en/VMware-Workstation-Player-for-Windows/15.0/com.vmware.player.win.using.doc/GUID-C82DCB68-2EFA-460A-A765-37225883337D.html)

[Configuring Bridged Networking](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-BAFA66C3-81F0-4FCA-84C4-D9F7D258A60A.html#GUID-BAFA66C3-81F0-4FCA-84C4-D9F7D258A60A)

[Configuring Network Address Translation](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-89311E3D-CCA9-4ECC-AF5C-C52BE6A89A95.html#GUID-89311E3D-CCA9-4ECC-AF5C-C52BE6A89A95)

[Configuring Host-Only Networking](https://docs.vmware.com/en/VMware-Workstation-Pro/16.0/com.vmware.ws.using.doc/GUID-93BDF7F1-D2E4-42CE-80EA-4E305337D2FC.html#GUID-93BDF7F1-D2E4-42CE-80EA-4E305337D2FC)

---
**Version** *20221216v1*