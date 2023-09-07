# Middleware Engineering "Microservices" - Taskdescription  

Join GIT repository:   
Video Stream:  


## 1. Einführung

Diese Übung soll helfen die Funktionsweise und Einsatzmöglichkeiten von Microservices in dezentralen Systemen zu verstehen. Anhand eines Tutorials wird ein Microservice implementiert, das in weiterer Folge als Erweiterung zur Übung "GEK851 Windpark Document Oriented Middleware (MICT)" eingesetzt werden soll.

Das Demo-Beispiel zu Microservices soll um ein weiteres Microservice "Windpark" erweitert werden.


## 2. Ziele

Das Ziel dieser Übung ist die Implementierung eines Microservices und die Einbindung in ein bestehendes Middleware-System.

## 3. Voraussetzungen

* [GEK851 Windpark Document Oriented Middleware (MICT)](https://elearning.tgm.ac.at/mod/assign/view.php?id=168719)
* Grundlagen Maven oder Gradle
* [Grundlagen Spring Cloud](https://spring.io/)
* [Grundlagen zu Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-static/Greenwich.SR1/multi/multi__spring_cloud_netflix.html)
* [Grundlagen Microservices](https://www.edureka.co/blog/what-is-microservices/)
* [Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring)
* [Grundlagen Eureka Service](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Service Registration with Eureka](https://www.tutorialspoint.com/spring_boot/spring_boot_service_registration_with_eureka.htm)


## 4. Aufgabenstellung

Führen Sie die einzelnen Schritte des Tutorials ["Microservices with Spring"](https://spring.io/blog/2015/07/14/microservices-with-spring) durch und implementieren Sie das Beispiel zu Account Service.

Wenn das Account Service funktionsfähig ist, dann probieren Sie das Account Service um ein Windpark Service zu erweitern. Es wird empfohlen das Account Service samt Attribute zu kopieren. Es werden hier nur die Daten der Embedded-Datenquelle ausgelesen. Wenn dieser Schritt funktioniert, dann erweitern Sie das Beispiel und verbinden Sie das Windpark Service mit dem MongoDB Repository von der Windpark-Zentrale und lesen Sie einen beliebgen Wert einer Windengine aus.

## 5. Demo Applikation

* Installation aller erforderlichen Pakete (einmalig)  
  `mvn clean install`

* Erstellen der Applikation (JAR)  
  `mvn package`

* Starten der Microservice Registrierung   
  `java -jar target/microservices-demo-2.1.0.RELEASE.jar registration`

* Starten des Microservice Accounts  
  `java -jar target/microservices-demo-2.1.0.RELEASE.jar accounts`

* Starten des Microservice Web  
  `java -jar target/microservices-demo-2.1.0.RELEASE.jar web`

## 6. Bewertung
Gruppengrösse: 2 Person  

### 6.1 Grundanforderungen **überwiegend erfüllt**
- Durchlesen des Tutorials "[Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring)"
- Implementieren des Beispiels "Account Service"
- **Einzelne Schritte und Komponenten des Beispiels verstehen und im Protokoll dokumentieren**
- Entwickeln Sie aus der Kopie des "Account Service" ein neues "Windpark Service" (Port 4444)
- **Alle Erweiterungen im Protokoll erklaeren und dokumentieren**
- Beantwortung der Fragestellungen  
- Loesungsansatz finden Sie im Branch "windpark-server-embedded-db" unter [https://github.com/ThomasMicheler/DEZSYS_GK852_WINDPARK_MICROSERVICE.git](https://github.com/ThomasMicheler/DEZSYS_GK852_WINDPARK_MICROSERVICE.git)

### 6.2 Grundanforderungen **zur Gänze erfüllt**
- Erweiterung des Windpark Service zur Abfrage eines Datensatzes aus dem NoSQL Repository zu "GEK851 Windpark Document Oriented Middleware (MICT)"
- **Alle Erweiterungen im Protokoll erklaeren und dokumentieren**
- Loesungsansatz finden Sie im Branch "windpark-server-mongodb" unter [https://github.com/ThomasMicheler/DEZSYS_GK852_WINDPARK_MICROSERVICE.git](https://github.com/ThomasMicheler/DEZSYS_GK852_WINDPARK_MICROSERVICE.git)

### 6.3 Erweiterte Anforderungen **überwiegend erfüllt**
- Erweiterung des Windpark Service um folgende Funktionalitaet  
 - Selektion eines Datensatzes durch Angabe von WindparkID, WindengineID und Zeit
 - **Alle Erweiterungen im Protokoll erklaeren und dokumentieren**
- Definition des Begriffs "**Service Mesh**"
- Was sind die **Funktionalitaeten** eines "Service Mesh"?
- Recherchieren nach **2 bekannten Herstellern** eines "Service Mesh" und beschreiben kurz deren Funktionsumfang
- **Stellen Sie die 2 Produkte gegenueber und vergleichen Sie diese**

### 6.4 Erweiterte Anforderungen **zur Gänze erfüllt**
- Erweiterung des Windpark Service (nach der Selektion siehe "Erweiterte Anforderungen überwiegend erfüllt") um folgende Funktionalitaet
 - Bieten Sie eine Moeglichkeit an, um alle Felder des Datensatzes aendern zu koennen (ausgenommen WindparkID, WindengineID)
 - Fuehren Sie die Aenderungen im NoSQL Repository durch
 - **Alle Erweiterungen im Protokoll erklaeren und dokumentieren**

## 7. Fragestellung für Protokoll

+ Was versteht man unter Microservices?
+ Stellen Sie anhand eines Beispiels den Einsatz von Microservices dar.
+ Wie kann man Spring Cloud nutzen und welche Tools werden dabei unterstützt?
+ Beschreiben Sie das Spring Cloud Netflix Projekt. Aus welchen Bestandteilen setzt sich dieses Projekt zusammen?
+ Wofür werden die Annotations @EnableEurekaServer und @EnableDiscoveryClient verwendet?
+ Wie werden in dem Account Service die Properties gesetzt und welche Parameter werden hier verwendet?
+ Wie funktioniert das Logging bei diesem Beispiel? Ist es möglich das Logging zu erhöhen bzw. komplett abzudrehen?
  Wenn ja, wie?

## 8. Links und Dokumente
* [Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring)
* [Microservices with Spring Boot](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3)
* [Eureka – Microservice-Registry mit Spring Cloud](https://www.heise.de/developer/artikel/Eureka-Microservice-Registry-mit-Spring-Cloud-2848238.html?seite=all)
* [Spring Boot Tutorial: In 10 Schritten zur Microservices-Architektur](https://jaxenter.de/spring-boot-tutorial-microservices-cloud-foundry-kubernetes-58695)
* [Introducing Spring Cloud](https://spring.io/blog/2014/06/03/introducing-spring-cloud)
