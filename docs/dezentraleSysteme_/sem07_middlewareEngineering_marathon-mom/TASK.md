# DEZSYS_GK772_MARATHON_MOM
Join GIT repository:

## Einführung

Diese Übung soll die Funktionsweise und Implementierung von eine Message Oriented Middleware (MOM) mit Hilfe des **Frameworks Apache Active MQ** demonstrieren. **Message Oriented Middleware (MOM)** ist neben InterProcessCommunication (IPC), Remote Objects (RMI) und Remote Procedure Call (RPC) eine weitere Möglichkeit um eine Kommunikation zwischen mehreren Rechnern umzusetzen.

Die Umsetzung basiert auf einem praxisnahen Beispiel eines Zeiterfassungssystem fuer Wettbewerbe. Eine Zeitmessungsanlage/Timing Station ist immer Teil eines Verbunds, genannt Timing Section Park (TSP). Jede Timing Station hat einen Rechner, der die Zeitmessung der Teilnehmer aufzeichnet und ebenso die aktuellen Wetterdaten speichert. Die Daten werden als REST Schnittstelle in XML oder JSON zur Verfügung gestellt. Die Daten aller Zeitmessungsanlagen eines Timing Section Parks werden von einem Parkrechner gesammelt und abgespeichert. Der Parkrechner kommuniziert mit dem Kontrollzentrum / Control Center. In einer weiteren Ausbaustufe besteht die Moeglichkeit, dass ein Control Center Anweisungen an den Timing Section Park bzw. an einzelne Timing Stations weitergibt.

[Architektur - Timing Stations and Section Parks](marathon_map.pdf)


## 1.1 Ziele  

Das Ziel dieser Übung ist die **Implementierung einer Kommunikationsplattform für Zeitmessungen. Dabei erfolgt ein Datenaustausch von mehreren Zeitmessungsanlagen mit dem Parkrechner unter Verwendung einer Message Oriented Middleware (MOM)**. Die einzelnen Daten der Zeitmessungsanlagen sollen an den Parkrechner uebertragen werden. Es sollen **nachrichtenbasierten Protokolle mit Message Queues** verwendet werden. Durch diese lose Kopplung kann gewaehrleistet werden, dass in Zukunft weitere Anlagen hinzugefuegt bzw. Kooperationspartner eingebunden werden koennen.

In regelmaessigen Abstaenden liest der Parkrechner die Daten der einzelnen Zeitmessungsanlagen seines Parks aus und speichert diese in einer entsprechenden
Message Queue.
Um die Datenintegrität zu garantieren, sollen jene Daten, die mit der Middleware übertragen werden in einer LOG-Datei abgespeichert werden.

## 1.2 Voraussetzungen

*   Grundlagen Architektur von verteilten Systemen
*   Grundlagen zur nachrichtenbasierten Systemen / Message Oriented Middleware  
*   Verwendung des Message Brokers Apache ActiveMQ
*   Verwendung der XML- oder JSON Datenstruktur der Zeitmessungsanlage
*   Verwendung der Demo-Applikation MOMApplication (inklusive MOMReceiver und MOMSender) (siehe Repo)
*   Verwendung von

## 1.3 Aufgabenstellung

Implementieren Sie die Zeitmessungs-Kommunikationsplattform mit Hilfe des Java Message Service. Verwenden Sie Apache ActiveMQ ([http://activemq.apache.org](http://activemq.apache.org/)) als Message Broker Ihrer Applikation. Das Programm soll folgende Funktionen beinhalten:

 *   Installation von Apache ActiveMQ am Parkrechner.
 *   Jede Timing Station erstellt eine Message Queue mit einer ID am Parkrechner.
 *   Jede Timing Station legt in regelmässigen Abständen die Daten der Anlage in der Message Queue ab.
 *   Bei einer erfolgreichen Übertragung empfängt die Zeitmessungsanlage die Nachricht "SUCCESS".
 *   Der Parkrechner fragt in regelmässigen Abständen alle Message Queues ab.
 *   Der Parkrechner fuegt alle Daten aller Timing Stations zusammen und stellt diese an einer REST Schnittstelle im JSON/XML Format zur Verfügung.

## 1.4 Demo Applikation

*   Starten des Message Broker Apache Activemq  
    `[Installationsverzeichnis Apache Activemq]/bin/activemq start`

*   Administration von Apache Activemq via Webinterface  
		[http://localhost:8161/admin](http://localhost:8161/admin)  
    `Username: admin, Password: admin`   

### 1.4.1 marathon_demo1

Demo 1 beinhaltet eine Implementierung, die alle Einzelschritte zur Implementierung von Java und JMS beinhaltet und uebersichtlich darstellt. Die JMS Teile Sender und Empfaenger werden einzeln aufgerufen.

 *   Starten des Empfaengers MOMReceiver  
     `gradle clean bootRun -Pargs=receiver`

 *   Starten des Sender MOMSender  
     `gradle clean bootRun -Pargs=sender`

### 1.4.2 marathon_demo2

Demo 2 beinhaltet eine Implementierung, die eine Umsetzung von JMS mit Springboot darstellt und aktuelle Bibliotheken und Annotation beinhaltet. Der Sender wird als REST Controller aufgerufen und der Empfaenger wird mittels einem Listener umgesetzt.

*   Starten der Applikation  

    `gradle clean bootRun`

*   Aufruf des Senders mittels Postman  
     Laden Sie in [Postman](https://www.postman.com) die Datei marathon_demo2.postman_collection.json und senden
		 Sie den vorbereiteten HTTP POST Request.

## 1.5 Bewertung  

*   Gruppengrösse: 1 Person
*   Abgabemodus: per Protokoll, bei EK kann ein Abgabegespraech erforderlich sein
*   Anforderungen **"überwiegend erfüllt"**
    *   Implementierung der Kommunikation zwischen **EINER** Zeitstation und dem Parkrechner (JMS Queue)  
    *   Ausgabe der empfangenen Daten am Parkrechner (Konsole oder Log-Datei)
    *   Beantwortung der Fragestellungen   
*   Anforderungen **"zur Gänze erfüllt"**
    *   Temporaeres Speichern der Daten am Parkrechner zur Laufzeit (neue Datensaetze sollten immer angefuegt werden)
    *   Zusammensetzung der Daten aller Timing Stations in eine zentrale JSON/XML-Struktur
    *   Implementierung der REST Schnittstelle am Parkrechner
*  Erweiterte Anforderungen **überwiegend erfüllt**
    *   Implementierung der Kommunikation mit **MEHREREN** Timing Stations und dem Parkrechner
    *   Logging der Daten bei allen Zeitmessungsanlagen und dem Parkrechner   
*  Erweiterte Anforderungen **zur Gänze erfüllt**
    *   Rückmeldung des Ergebnisses der Übertragung vom Parkrechner an die Timing Station (JMS Topic)  

## 1.6 Fragestellung für Protokoll

*   Nennen Sie mindestens 4 Eigenschaften der Message Oriented Middleware?  
*   Was versteht man unter einer transienten und synchronen Kommunikation?
*   Beschreiben Sie die Funktionsweise einer JMS Queue?
*   JMS Overview - Beschreiben Sie die wichtigsten JMS Klassen und deren Zusammenhang?
*   Beschreiben Sie die Funktionsweise eines JMS Topic?
*   Was versteht man unter einem lose gekoppelten verteilten System? Nennen Sie ein Beispiel dazu. Warum spricht man hier von lose?
`
## 1.6 Links & Dokumente

*   Grundlagen Message Oriented Middleware: [Presentation](https://elearning.tgm.ac.at/pluginfile.php/225789/mod_resource/content/1/dezsys_mom_einfuehrung.pdf)
*   Middleware:  
  [Apache ActiveMQ Installationspaket](http://activemq.apache.org/components/classic/download/)  
*   Apache ActiveMQ & JMS Tutorial:   
  http://activemq.apache.org/components/classic/documentation  
  https://spring.io/guides/gs/messaging-jms/  
  https://medium.com/@mailshine/activemq-getting-started-with-springboot-a0c3c960356e   
  http://www.academictutorials.com/jms/jms-introduction.asp   
  http://docs.oracle.com/javaee/1.4/tutorial/doc/JMS.html#wp84181    
  https://www.oracle.com/java/technologies/java-message-service.html   
  http://www.oracle.com/technetwork/articles/java/introjms-1577110.html  
  https://spring.io/guides/gs/messaging-jms  
  https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-messaging.html  
  https://dzone.com/articles/using-jms-in-spring-boot-1  
