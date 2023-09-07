# DEZSYS_GK771_MARATHON_REST

## Einfuehrung

Ein Zeitmessungsstandort (Timing Station, TSx) vom Vienna City Marathon erfasst Zeitmessungen der Teilnehmer und liefert aktuelle Wetterdaten. Die gesammelten Daten der Zeitstation sollen in einer standardisierten Form zur weiteren Verarbeitung zur Verfügung gestellt werden. Das Format der Darstellung kann je nach Zielsystem variieren und soll die Datenformate JSON und XML anbieten.

## Voraussetzungen

*   Java Programmierkenntnisse
*   Verwendung von Gradle und Git
*   Grundlagen Dezentrale Systeme
*   Grundlagen XML (siehe [T7.3.4 Dokumentformat XML](https://elearning.tgm.ac.at/mod/resource/view.php?id=75247&redirect=1))
*   Grundlagen JSON & REST (siehe [T7.3.5 Dokumentformat JSON / REST Architektur](https://elearning.tgm.ac.at/mod/resource/view.php?id=75246&redirect=1))

## Daten einer Zeitmessungsanlage/Timing Station (Beispiel)

```
 <timingstationData>
   <timingstationID>001</timingstationID>
   <timestamp>2021-09-12 08:52:39.077</timestamp>
   <distance>1</distance>
   <unitDistance>km</unitDistance>
   <altitude>177</altitude>
   <unitAltitude>m</unitAltitude>
   <weatherData>
    <windspeed>5.46</windspeed>
    <unitWindspeed>kmH</unitWindspeed>
    <temperature>25.78</temperature>
    <unitTemperature>C</unitTemperature>
    <precipitation>0</precipitation>
    <unitPrecipitation>ml</unitPrecipitation>
    <atmosphericPressure>999.0</atmosphericPressure>
    <unitAtmosphericPressure>hPa</unitAtmosphericPressure>
   </weatherData>
   <competitionData>
     <unitTiming>hh:mm:ss</unitTiming>
     <party>
       <partyID>1587</partyID>
       <timing>00:25:33</timing>
     </party>
     <party>
       <partyID>1437</partyID>
       <timing>00:27:01</timing>
     </party>
     <party>
       <partyID>1222</partyID>
       <timing>00:28:59</timing>
     </party>
   </competitionData>
 </timingstationData>
```


## Aufgabenstellung

Entwickeln Sie einen Simulator, der die Daten der Zeitmessungsanlage (TSx) generiert. Es ist dabei zu achten, dass die Daten realistisch sind und im Zusammenhang mit entsprechenden Einheiten erzeugt werden.

Die Daten der Zeitmessung sollen gemeinsam mit den Wetterdaten ueber eine REST Schnittstelle veroeffentlicht werden. Die Schnittstelle verwendet standardmaessig das JSON Format und kann optional auf XML umgestellt werden.

Die Schnittstelle soll mit einer einfachen Applikation getestet werden. Dabei sollen die Daten mit Hilfe von HTML und JQuery "konsumiert" und in einer Tabelle dargestellt werden.

## Aufbau der Applikation

*   Daten-Generierung bei der Zeitmessungsanlage (inkl. Wetterdaten)
*   Entwicklung einer REST Schnittstelle
*   Empfangen der Daten bei einem Controller mittels HTTP Request
*   Controller veroeffentlich Daten (Zeitmessungen, Wetterdaten) per Client Request
*   Client empfaengt Daten und stellt diese in einem uebersichtlichen Format dar

## Technologien

*   Springboot
*   Gradle
*   REST/XML Datenformat
*   JSON
*   jQuery

## Dokumente und Links

* Architektur - Timing Stations and Section Parks
[marathon_map.pdf](marathon_map.pdf)

* XML Daten - Timing Station (Example)
[timestation.xml](timestation.xml)

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

* Anforderungen "ueberwiegend erfuellt"

  - Implementierung eines Generator zur Erzeugung der Zeitmessungs- und Wetterdaten

  - Implementation der REST Schnittstelle

  - Daten im JSON und XML Format zur Verfuegung stellen

  - Implementation eines "Consumer" und Darstellung der Daten in einer Tabelle

* Anforderungen "zur Gaenze erfüllt"

  - Daten koennen nach folgenden Kriterien gefiltert werden:
    - Zeitmessungsstation
    - Datum/Zeit (nach oder von/bis)
