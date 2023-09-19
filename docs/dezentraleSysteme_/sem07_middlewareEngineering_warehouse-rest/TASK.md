# DEZSYS_GK771_WAREHOUSE_REST

## Einfuehrung

Der Lagerstandort Linz der grossen Handelskette KONSUM lagert alle Lebensmittel, Haushaltswaren und Hygieneartikel fuer die Filialen in Wien, Niederoesterreich und Burgenland. Das Lagerprogramm vor Ort soll um eine Schnittstelle erweitert werden, damit die Konzernzentrale alle Lagerdaten tagesaktuell abrufen kann.
Um die Moeglichkeiten der Anbindung moeglichsts flexibel zu gestalten, sollen die Datenformate JSON und XML unterstuetzt werden.

## Voraussetzungen

*   Java Programmierkenntnisse
*   Verwendung von Gradle und Git
*   Grundlagen Dezentrale Systeme
*   Grundlagen XML (siehe [T7.3.4 Dokumentformat XML](https://elearning.tgm.ac.at/mod/resource/view.php?id=75247&redirect=1))
*   Grundlagen JSON & REST (siehe [T7.3.5 Dokumentformat JSON / REST Architektur](https://elearning.tgm.ac.at/mod/resource/view.php?id=75246&redirect=1))

## Daten des Lagerstandorts Linz (Beispiel)

```
<warehouseData>
  <warehouseID>001</warehouseID>
  <warehouseName>Linz Bahnhof</warehouseName>
  <warehouseAddress>Bahnhofsstrasse 27/9</warehouseAddress>
  <warehousePostalCode>Linz</warehousePostalCode>
  <warehouseCity>Linz</warehouseCity>
  <warehouseCountry>Austria</warehouseCountry>
  <timestamp>2021-09-12 08:52:39.077</timestamp>
  <productData>
    <product>
      <productID>00-443175</productID>
      <productName>Bio Orangensaft Sonne</productName>
      <productCategory>Getraenk</productCategory>
      <productQuantity>2500</productQuantity>
      <productUnit>Packung 1L</productUnit>
    </product>
    <product>
      <productID>00-871895</productID>
      <productName>Bio Apfelsaft Gold</productName>
      <productCategory>Getraenk</productCategory>
      <productQuantity>3420</productQuantity>
      <productUnit>Packung 1L</productUnit>
    </product>
    <product>
      <productID>01-926885</productID>
      <productName>Ariel Waschmittel Color</productName>
      <productCategory>Waschmittel</productCategory>
      <productQuantity>478</productQuantity>
      <productUnit>Packung 3KG</productUnit>
    </product>
    <product>
      <productID>00-316253</productID>
      <productName>Persil Discs Color</productName>
      <productCategory>Waschmittel</productCategory>
      <productQuantity>1430</productQuantity>
      <productUnit>Packung 700G</productUnit>
    </product>
  </productData>
</warehouseData>
```


## Aufgabenstellung

Entwickeln Sie einen Simulator, der die Daten eines Lagerstandortes (WHx) generiert. Es ist dabei zu achten, dass die Daten realistisch sind und im Zusammenhang mit entsprechenden Einheiten erzeugt werden.

Diese Daten sollen gemeinsam mit einigen Details zum dem Standort ueber eine REST Schnittstelle veroeffentlicht werden. Die Schnittstelle verwendet standardmaessig das JSON Format und kann optional auf XML umgestellt werden. 

## Aufbau der Applikation

*   Daten-Generierung beim Lagerstandort (inkl. Standortdaten)
*   Entwicklung einer REST Schnittstelle
*   Empfangen der Daten bei einem Controller mittels HTTP Request
*   Controller veroeffentlich Daten (Wareninformation, Standortdaten) per Client Request

## Technologien

*   Springboot
*   Gradle
*   REST/XML Datenformat
*   JSON
*   jQuery

## Dokumente und Links

* XML Daten - Warehouse (Example)
[warehouse.xml](warehouse.xml)

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

  - Implementierung eines Generator zur Erzeugung der Standort- und Warendaten

  - Implementierung der REST Schnittstelle

  - Daten im JSON und XML Format zur Verfuegung stellen

* Anforderungen "zur Gaenze erfüllt"

  - Implementation eines "Consumer" und Darstellung der Daten in einer Tabelle (HTML)

  - Daten koennen nach folgenden Kriterien gefiltert werden:

