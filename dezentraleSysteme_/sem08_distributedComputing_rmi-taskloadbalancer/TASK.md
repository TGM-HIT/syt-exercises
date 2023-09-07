# Distributed Computing "*RMI Task Loadbalancer*" - Taskdescription

## Einführung
Verteilte Objekte haben bestimmte Grunderfordernisse, die mittels implementierten Middlewares leicht verwendet werden können. Das Verständnis hinter diesen Mechanismen ist aber notwendig, um funktionale Anforderungen entsprechend sicher und stabil implementieren zu können.

## Ziele
Diese Übung gibt eine einfache Einführung in die Verwendung von verteilten Objekten mittels Java RMI. Es wird speziell Augenmerk auf die Referenzverwaltung sowie Serialisierung von Objekten gelegt. Es soll dabei eine einfache verteilte Applikation in Java implementiert werden.

## Kompetenzzuordnung
**GK SYT8 Dezentrale Systeme | Distributed Computing | Low-Level
Implementierung von verteilten Objekten und Methoden**  

* "Programmiertechniken in verteilten Systemen zur Realisierung von entfernten Prozeduren, Methoden und Objekten anwenden"

**EK SYT8 Dezentrale Systeme | Distributed Computing | Low-Level
Implementierung von verteilten Objekten und Methoden**  

* "synchronisierte, mobile Applikationen entwerfen"

## Voraussetzungen
* Grundlagen Java
* Grundlagen zu verteilten Systemen und Netzwerkverbindungen
* Grundlegendes Verständnis von nebenläufigen Prozessen

## Detailierte Ausgabenbeschreibung
Folgen Sie dem offiziellen Java-RMI Tutorial, um eine einfache Implementierung des PI-Calculators zu realisieren. Beachten Sie dabei die notwendigen Schritte der Sicherheitseinstellungen (SecurityManager) sowie die Verwendung des RemoteInterfaces und der RemoteException.

Implementieren Sie einen weiteren Task nach dem Command-Pattern [2] mittels RMI und übertragen Sie die Berechnung an den Server. Erweitern Sie die Implementierung des Tutorials ohne große Anpassungen. Erstellen Sie zum Beispiel einen Task zur berechnung der Fibonacci-Folge [3] und führen Sie diesen nebst der Pi-Berechnung aus.

Die Erweiterung dieser Aufgabe wäre ein Loadbalancer-Interface auf der Server-Seite, die Anfragen an eine Compute-Instanz an weitere Server weiterleitet. Der Client soll dabei gar nicht geändert werden. Es soll möglich sein, dass mehrere Server sich beim Loadbalancer registrieren können und für Berechnungen (computeTask) zur Verfügung stehen. Der Loadbalancer hat dabei nur eine verwaltende Tätigkeit zu übernehmen und erscheint für den Client weiterhin als Implementierung des Compute-Interfaces. Es bleibt Ihnen überlassen, wie die Verwaltung der Server-Stubs beim Loadbalancer umgesetzt wird. Es ist eine einfache Round-Robin-Verteilung zu implementieren.

Die Implementierung soll grundsätzlich auch über die Systemgrenzen funktionstüchtig sein (Achtung wegen RMI-Registry und Verwendung der RMI-Stubs).

## Fragestellungen
* Was ist RMI und welches Prinzip der verteilten Programmierung kommt dabei zur Anwendung?
* Was sind Stubs? Welche Aufgabe hat dabei das Proxy-Objekt?
* Was wird in der Registry gespeichert?
* Wie kommt das `Remote`-Interface zum Einsatz? Was ist bei der Definition von Methoden zu beachten?
* Was ist bei der Weitergabe von Objekten unabdingbar?
* Welche Methoden des `UnicastRemoteObject` kommen bei der Server-Implementierung zum Einsatz?
* Wie kann der Server ein sauberes Schließen ermöglichen? Was muss mit dem exportierten Objekt geschehen?

## Troubleshooting
### Unterschiedliche Java Versionen
Nach dem Aufruf von `java -version` und `javac -version` kann man überprüfen, ob die JRE und JDK gleiche Versionen verwenden. Dabei ist zu beachten, dass in der PATH-Variable die entsprechenden Verzeichnisse richtig gesetzt sind. Achtung: Oracle verwendet gerne ganz am Anfang der PATH-Variable gerne eine eigene Definition, die entweder entfernt oder in der Reihung unter die eigene Definition gesetzt werden kann.

Förderlich ist es auch die `JAVA_HOME` Variable zu setzen, dabei bietet sich meist das gewünschte JDK Verzeichnis an. Die `PATH` Variable sollte auf das `bin` Verzeichnis des JDKs zeigen.

Nach dem Öffnen eines neuen Terminals kann man die neu gesetzte Umgebungsvariablen überprüfen.

### Java Security Policy
In den Java SE Dokumentationen ist eine gute Beschreibung der Sicherheitseinstellungen für die Ausführung und Nutzung der Systemresourcen zu finden [4,5,6]. Bitte auf die entsprechende Version achten! Die beste Lokation für eine eigene Policy wäre im eigenen Benutzerverzeichnis `$HOME/.java.policy` (bitte auch in Windows nicht auf den Punkt vergessen)!

Für einen schnellen Test, ob es noch am SecurityManager liegt kann dieser [einfache Code](https://github.com/mborko/code-examples/blob/master/java/TestPermissions.java) ausgeführt werden.

### Speicherort
Da es sich hier um einen sicherheitskritischen Sourcecode handelt, ist auch der Speicher- bzw. Ausführungsort nicht ganz unwichtig. Bitte daher nicht in ein synchronisiertes Verzeichnis (OneDrive, Dropbox, Nextcloud etc.) sondern am besten in einem beliebigen Unterverzeichnis des Benutzers legen (Partition beachten) - der Code ist ja durch das Repository sowieso versioniert.

### Marshalling und Security Exceptions
Die Exceptions bezüglich Umsetzung und Übertragung der Objektdaten beruhen meist auf den obengenannten Fehlern. Nach dem erfolgreichen Umsetzen der oben beschriebenen Tipps ist auf ein `gradle clean` nicht zu vergessen!

### Classroom Git-Repository
[Hier](https://github.com/500) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Dokumentation und Beschreibung anhand der Protokollrichtlinien
- [ ] Java RMI-Tutorial um "sauberes Schließen" erweitern
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung eines neuen Tasks (z.B. Fibonacci)
- [ ] Implementierung eines Loadbalancer-Interfaces (register/unregister)

Gruppengrösse: 1-2 Person(en)
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Client-Loadbalancer-Server-Verbindungen über mehrere Rechner hinweg lauffähig (z.B. mittels Portweiterleitung)
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Überlegungen zum Design und mögliche Implementierung weiterer Loadbalancing-Methoden (Weighted Distribution oder Least Connections)

## Quellen
* [1] "The Java Tutorials - Trail RMI"; [online](http://docs.oracle.com/javase/tutorial/rmi/)
* [2] "Command Pattern"; Vince Huston; [online](http://vincehuston.org/dp/command.html)
* [3] "Fibonacci Number Program"; wikibooks; [online](https://en.wikibooks.org/wiki/Algorithm_Implementation/Mathematics/Fibonacci_Number_Program)
* [4] "Java SE Platform Security Architecture" JavaSE15 Documentation [online](https://docs.oracle.com/en/java/javase/15/security/java-se-platform-security-architecture.html)
* [5] "Default Policy File Locations" JavaSE15 Documentation [online](https://docs.oracle.com/en/java/javase/15/security/permissions-jdk1.html#GUID-BFF84712-05CF-4C1E-926F-411FDF83AE32)
* [6] "Default Policy Implementation and Policy File Syntax" Java SE 8 Documentation [online](https://docs.oracle.com/javase/8/docs/technotes/guides/security/PolicyFiles.html)

---
**Version** *20210323v3*

