# Middleware Engineering "Microservices" - Taskdescription  

Join GIT repository:   
Video Stream:  


## 1. Einführung

Diese Übung soll helfen die Funktionsweise und Einsatzmöglichkeiten von Microservices in dezentralen Systemen zu verstehen. Anhand eines Tutorials wird ein Microservice implementiert, das in weiterer Folge als Erweiterung zur Übung "GK851 Middleware Engineering Marathon - DOM (MICT)" eingesetzt werden soll.

Das Demo-Beispiel zu Microservices soll um ein weiteres Microservice "Marathon" erweitert werden.


## 2. Ziele

Das Ziel dieser Übung ist die Implementierung eines Microservices und die Einbindung in ein bestehendes Middleware-System.

## 3. Voraussetzungen

* Grundlagen Maven oder Gradle
* [Grundlagen Spring Cloud](https://spring.io/)
* [Grundlagen zu Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-static/Greenwich.SR1/multi/multi__spring_cloud_netflix.html)
* [Grundlagen Microservices](https://www.edureka.co/blog/what-is-microservices/)
* [Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring)
* [Grundlagen Eureka Service](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Service Registration with Eureka](https://www.tutorialspoint.com/spring_boot/spring_boot_service_registration_with_eureka.htm)
* [Service Registration and Discovery](https://spring.io/guides/gs/service-registration-and-discovery/)


## 4. Aufgabenstellung

Führen Sie die einzelnen Schritte des Tutorials ["Microservices with Spring"](https://spring.io/blog/2015/07/14/microservices-with-spring) durch und implementieren Sie das Beispiel zu Account Service.

Wenn das Account Service funktionsfähig ist, dann probieren Sie das Account Service um ein Marathon Service zu erweitern. Es wird empfohlen das Account Service samt Attribute zu kopieren. Es werden hier nur die Daten der Embedded-Datenquelle ausgelesen. Wenn dieser Schritt funktioniert, dann erweitern Sie das Beispiel und verbinden Sie das Marathon Service mit dem MongoDB Repository von der Marathon-Zentrale und lesen Sie einen beliebgen Wert einer Timingstation aus.

## 5. Demo Applikation

* Erstellen der Applikation (JAR) mit Maven oder Gradle  
  `mvn clean package`  
  oder  
  `gradle clean assemble`  

* Starten der Microservice Registrierung   
  `java -jar target/DEZSYS_GK_MARATHON_MICROSERVICE-2.1.0.RELEASE.jar registration`

* Starten des Microservice Accounts  
  `java -jar target/DEZSYS_GK_MARATHON_MICROSERVICE-2.1.0.RELEASE.jar accounts`

* Starten des Microservice Web  
  `java -jar target/DEZSYS_GK_MARATHON_MICROSERVICE-2.1.0.RELEASE.jar web`

## 6. Bewertung
Gruppengrösse: 1 Person  

### 6.1 Erweiterte Anforderungen **überwiegend erfüllt**
- Durchlesen des Tutorials "[Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring)"
- Implementieren des Beispiels "Account Service"
- **Einzelne Schritte und Komponenten des Beispiels verstehen und im Protokoll dokumentieren**
- Entwickeln Sie aus der Kopie des "Marathon Service" ein neues "Marathon Service" (Port 4444)
- Erweiterung des Marathon Service zur Abfrage eines Datensatzes aus dem NoSQL Repository zu "GEK851 Marathon Document Oriented Middleware (MICT)"
- **Alle Erweiterungen im Protokoll erklaeren und dokumentieren**
- Beantwortung der Fragestellungen  

### 6.3 Erweiterte Anforderungen **zur Gänze erfüllt**
- Erweiterung des Marathon Service um folgende Funktionalitaet  
 - Selektion von Datensatzes durch Angabe von TimingStationID oder SectionParkID oder PartyID
 - **Alle Erweiterungen im Protokoll erklaeren und dokumentieren**
- Definition des Begriffs "**Service Mesh**"
- Was sind die **Funktionalitaeten** eines "Service Mesh"?
- Recherchieren nach **2 bekannten Herstellern** eines "Service Mesh" und beschreiben kurz deren Funktionsumfang
- **Stellen Sie die 2 Produkte gegenueber und vergleichen Sie diese**

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
