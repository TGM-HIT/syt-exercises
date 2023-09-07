# DEZSYS_GK771_WINDPARK_REST

## Einfuehrung

Eine Windkraftanlage erzeugt Daten zur Stromerzeugung und deren Umgebungsbedingungen in regelmaessigen Zeitabstaenden. Die gesammelten Daten der Windkraftanlage sollen in einer standardisierten Form zur weiteren Verarbeitung zur Verfügung gestellt werden. Das Format der Darstellung kann je nach Zielsystem variieren und soll die Datenformate JSON und XML anbieten.

## Voraussetzungen

*   Java Programmierkenntnisse
*   Verwendung von Gradle/Maven und Git
*   Grundlagen Dezentrale Systeme
*   Grundlagen XML (siehe [T7.3.4 Dokumentformat XML](https://elearning.tgm.ac.at/mod/resource/view.php?id=75247&redirect=1))
*   Grundlagen JSON & REST (siehe [T7.3.5 Dokumentformat JSON / REST Architektur](https://elearning.tgm.ac.at/mod/resource/view.php?id=75246&redirect=1))
*   Optional: GK733 DezSys/Middleware Engineering "Message Oriented Middleware"

## Aufgabenstellung

Entwickeln Sie einen Simulator der die Daten der Windkraftanlage generiert. Es ist dabei zu achten, dass die Daten realistisch sind und im Zusammenhang mit einer entsprechenden Einheit erzeugt werden.  

Die Daten der Windkraftanalage sollen ueber einer REST Schnittstelle veroeffentlicht werden. Die Schnittstelle verwendet standardmaessig das JSON Format und kann optional auf XML umgestellt werden.

Die Schnittstelle soll mit einer einfachen Applikation getestet werden. Dabei sollen die Daten mit Hilfe von HTML und JQuery "konsumiert" und in einer Tabelle dargestellt werden.

## Erweiterung

Die Daten sollen vor einem nicht autorisierten Zugriff geschützt werden. Entwerfen Sie und implementieren Sie ein Konzept, um die Datensicherheit zu gewährleisten.

## Aufbau der Applikation

*   Data acquisition at the windengine
*   Implement REST Inteface 
*   Controller receive HTTP requests
*   Service contains business logic
*   Controller publish windengine data requested by client
*   Client consumes windengine data

## Technologien

*   Springboot
*   Maven
*   REST
*   JSON
*   jQuery

## Dokumente und Links

* Spring Boot 
[https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)

* Building an Application with Spring Boot
[https://spring.io/guides/gs/spring-boot/](https://spring.io/guides/gs/spring-boot/)

* Spring Initializr
[https://start.spring.io/](https://start.spring.io/)

* Building a RESTful Web Service
[https://spring.io/guides/gs/rest-service/](https://spring.io/guides/gs/rest-service/)

* Consuming a RESTful Web Service
[https://spring.io/guides/gs/consuming-rest/](https://spring.io/guides/gs/consuming-rest/)

* Consuming a RESTful Web Service with jQuery
[https://spring.io/guides/gs/consuming-rest-jquery/](https://spring.io/guides/gs/consuming-rest-jquery/)

## Bewertung

Gruppengroesse: 1 Person 

**Anforderungen "ueberwiegend erfuellt"**

*   Implementierung eines Generator zur Erzeugung der Winddaten
*   Implementation der REST Schnittstelle
*   Daten im JSON und XML Format zur Verfuegung stellen
*   Implementation eines "Consumer" und Darstellung der Daten in einer Tabelle

**Anforderungen "zur Gaenze erfüllt"**

*   Daten koennen nach folgenden Kriterien gefiltert werden:
    - Windpark / Windkraftanlage
    - Datum/Zeit (nach oder von/bis)
