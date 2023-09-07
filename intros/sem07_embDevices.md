### SYT - Systemtechnik
Zur Einführung ist eine Wiederholung von Git und Gradle vorgesehen, sowie ein Vergleich von weiteren Build-Tools. Um den Umgang mit Spring-Boot zu verbessern sind auch kleine Einführungsbeispiele zu erarbeiten. Die Dokumentation mit Markdown und LaTeX sind in der Systemtechnik Standard und werden auch kurz vorgestellt. Im Bereich der Embedded Devices ist ein Einführung in den RaspberryPi und die Programmierung mit C für den STM32 vorgesehen.

##### RaspberryPi
Ein leistungsstarker SoC mit gut ausgestattener Peripherie ist als *RaspberryPi* weit verbreitet. Dieser wird im Unterricht eingesetzt um als IoT-Aggregator zu dienen.
Die beigelegten Files sollen bei der Initialisierung im *head-less* Modus behilflich sein. Da Python eine beliebte Sprache zur Konfiguration und Implementierung auf dem *Raspi* ist, empfiehlt es sich einen [Crashcourse](https://www.codecademy.com/catalog/language/python) zu absolvieren!

##### Hardwareprogrammierung
Um industrielle Hardwareprogrammierung zu erproben, ist ein leistungsstarker Mikrocontroller von Vorteil. Im Unterricht kommt der STM32 zum Einsatz, welcher in zwei Versionen auf zwei verschiedenen Demoboards verbaut ist.

Zur einfachen Umsetzung in einer bereitgestellten Umgebung, bietet sich das Verwenden von folgendem [template](https://github.com/mborko/stm32f3-template) an. Dieses sollte in einer entsprechenden Linux-Umgebung verwendet werden (Windows und Mac-Benutzer sollten dabei eine virtualisierte Maschine benutzen). Da die Programmierung der Hardware über die USB-Schnittstelle vonstatten laufen wird, empfehle ich die Verwendung von VMware-Hypervisor.

##### Zusammenfassung der Aufgabenstellung
* Info über RaspberryPi verstehen und Schritt-für-Schritt durchgehen
* (optional) SD-Karte vorbereiten und ausprobieren
* Automatische Versendung von IP-Adresse durch Skript erproben und dokumentieren
* Clonen und Ausführen des stm32f3-template Repositories in einer Linux-Umgebung
* Analyse der main-Funktion im template Beispiel