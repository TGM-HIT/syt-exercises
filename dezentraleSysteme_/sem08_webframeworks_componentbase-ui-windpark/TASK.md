# Middleware Engineering "Componentbase UI with Spring React" - Taskdescription

## Einführung

Diese Übung soll helfen die Funktionsweise und Einsatzmöglichkeiten von komponentenbasierten Benutzerschnittstellen zu verstehen.
Anhand eines Tutorials soll ein React UserInterface implementiert werden, das in weiterer Folge als Erweiterung zur Übung GK8.3.1 Middleware Engineering "Document Oriented Middleware using MongoDB" eingesetzt werden kann.

Die Daten der Zentrale, die in einem NoSQL Repository gespeichert werden, sollen mit Hilfe von React dargestellt werden. Als Erweiterung soll eine Filter-Funktion entwickelt werden.


## Ziele

Das Ziel dieser Übung ist die Implementierung einer React-basierten Benutzerschnittstelle. React ist eine JavaScript Bibliothek zur Erstellung von UserInterfaces. Spring React stellt eine mögliche Form der Implementierung da.

## Voraussetzungen

* [GK8.3.1 Middleware Engineering "Document Oriented Middleware using MongoDB"](https://elearning.tgm.ac.at/mod/assign/view.php?id=56851)
* Grundlagen Maven oder Gradle
* [Grundlagen Spring Cloud](https://spring.io/)
* [Grundlagen React](https://reactjs.org/tutorial/tutorial.html)
* [Tutorial React.js and Spring Data REST](https://spring.io/guides/tutorials/react-and-spring-data-rest/)


## Aufgabenstellung

Lesen Sie sich in das Thema React [hier](https://reactjs.org) ein.
Führen Sie die einzelnen Schritte des Tutorials [React.js and Spring Data REST](https://spring.io/guides/tutorials/react-and-spring-data-rest/#react-and-spring-data-rest-part-3) durch und implementieren Sie das UserInterface zur Abfrage von Windkraftanlagendaten. Sie werden nicht alle Teile "Parts" des Tutorials benötigen. Bewerten Sie selbst, welche Teile für die Weiterentwicklung von Bedeutung sind.

Die Daten liegen in einem NoSQL Repository in der Zentrale vor.

Als Erweiterung **zur Gänze erfüllt** sollen die Daten über das UserInterface gefilter werden können. So können die Daten nach
- Windpark
- WindengineID
- Zeit und
- Leistung "Power"

gefiltert werden.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Durchlesen des Tutorials "React.js and Spring Data REST"
- [ ] Implementieren des Beispiels "Employee Overview"
- [ ] Einzelne Schritte und Komponenten des Beispiels verstehen und im Protokoll dokumentieren
- [ ] Adaptierung des React Beispiels zur Darstellung der Winddaten aus Übung GK8.3.1 Middleware Engineering "Document Oriented Middleware using MongoDB"
- [ ] Beantwortung der Fragestellungen
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementieren eines Filters in Spring React zur Abfrage der Daten aus dem NoSQL Repository


## Fragestellung für Protokoll

+ Was ist React?
+ React untertützt eine komponentenbasierte Entwicklung. Beschreiben Sie den Begriff "Component" im Zusammenhang mit React.
+ Wozu wird die Klasse React.Component verwendet?
+ Welche Teile der Applikation werden in der Funktion render() implementiert?
+ Vervollständigen Sie die angeführten Sätze:
  +   React is a .................. - one of the most popular ones, with over 100,000 stars on GitHub.
  + React is / is not a framework (unlike Angular, which is more opinionated).
  + React is an .......... project created by .......... .
  + React is used to build .......... on the front end.
  + React is the .......... layer of an MVC application (Model View Controller)


## Links und Dokumente
* [React.js and Spring Data REST](https://spring.io/guides/tutorials/react-and-spring-data-rest/#react-and-spring-data-rest-part-3)
* [Tutorial: Intro to React](https://reactjs.org/tutorial/tutorial.html)
