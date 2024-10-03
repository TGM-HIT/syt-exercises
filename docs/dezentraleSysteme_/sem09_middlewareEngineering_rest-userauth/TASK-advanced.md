# EK9.6 Middleware Engineering "Cloud-Datenmanagement" - Taskdescription

## Einführung
Diese Übung zeigt die Anwendung von verteilten Webservices an einer simplen Anforderung.

## Ziele
Das Ziel dieser Übung ist eine Webanbindung zur Benutzeranmeldung umzusetzen. Dabei soll sich ein Benutzer registrieren und am System anmelden können.  
Die Kommunikation zwischen Client und Service soll mit Hilfe einer REST Schnittstelle umgesetzt werden.

## Kompetenzzuordnung

#### EK SYT9 Dezentrale Systeme | Middleware Engineering | Serviceorientiert
* "Sicherheitskonzepte für serviceorientierte Architekturen konzipieren"
* "Konzepte anhand eines Webservices umsetzen"
#### EK SYT9 Dezentrale Systeme | Datenmanagement | Speicherkonzepte
* "Skalierbares und verteiltes Datenmanagement zur Generierung von dynamischen Inhalten einsetzen"

## Voraussetzungen
+ Grundlagen einer höheren Programmiersprache
+ Verständnis über relationale Datenbanken und dessen Anbindung mittels ODBC oder ORM-Frameworks
+ Verständnis von Restful Webservices
+ Grundlagenübung Middleware Engineering "Cloud-Datenmanagement"

## Aufgabenstellung
Es ist ein Webservice zu implementieren, welches eine einfache Benutzerverwaltung implementiert. Dabei soll die Webapplikation mit den Endpunkten `/auth/admin/register`, `/auth/signin` und `/auth/verify` erreichbar sein.

### Erweiterungen

#### Sicherheitsüberlegungen
Die REST-Schnittstelle ist schnell und einfach aufgesetzt und ist meist durch Frameworks auch leicht zu erweitern. Bei der Implementierung von neuen Funktionalitäten vergisst man aber schnell auf die notwendige Absicherung von verbreiteten Angriffsvektoren. Welche sind diese? Wie kann zum Beispiel die funktionale Anforderung der Registrierung und des Logins von der Datenhaltung getrennt und abgesichert werden? Ist dies sinnvoll?

Wie können die Eingabe und Übermittlung einfach und schnell sicherer gestaltet werden? Welche Services kommen hierzu verbreitet zum Einsatz?

#### Regressions-Tests
Die erfolgreiche Implementierung soll mit entsprechenden Testfällen (Acceptance-Tests bez. aller funktionaler Anforderungen mittels Unit-Tests) dokumentiert werden. Testberichte sind auch dazu da, eine fortgehende Implementierung bzw. eine fehlerhafte Implementierung aufzuzeigen. Nutzen Sie diese!

## Abgabe
Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Etwaiger Programmcode ist ebenfalls zu dokumentieren. Implementierungen müssen entsprechend beschrieben und leicht deployable sein!

### Classroom Git-Repository
[Hier](https://github.com/500) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!


## Bewertung
Gruppengrösse: 1-2 Person(en)

### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Umsetzung von erweiterten Sicherheitsrichtlinien
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Überprüfung der funktionalen Anforderungen mittels Regressionstests

### Classroom Repository
[Hier](https://classroom.github.com/a/t8sGFKJz) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Quellen
* Android Restful Webservice Tutorial – Introduction to RESTful webservice – Part 1"; Posted By Android Guru on May 1, 2014; [online](http://programmerguru.com/android-tutorial/android-restful-webservice-tutorial-part-1/)
* Registration and Login Example with Spring Boot, Spring Security, Spring Data JPA, and HSQL"; Giau Ngo; 5.7.2016; [online](https://hellokoding.com/registration-and-login-example-with-spring-security-spring-boot-spring-data-jpa-hsql-jsp/)
* "Getting Started with Couchbase and Spring Data Couchbase"; Posted by Josh Long on March 16, 2015; [online](https://spring.io/blog/2015/03/16/getting-started-with-couchbase-and-spring-data-couchbase)
* "REST with Java (JAX-RS) using Jersey - Tutorial"; Lars Vogel; Version 2.7; 27.09.2017; [online](http://www.vogella.com/tutorials/REST/article.html)
* "Creating a 'hello world' RESTful web service with Spring."; Spring examples; [online](https://github.com/spring-guides/gs-rest-service)
* "Django REST framework"; Tom Christie; [online](http://www.django-rest-framework.org/)
* "Eve. The Simple Way to REST"; Nicola Iarocci; [online](http://python-eve.org/)
* "Heroku makes it easy to deploy and scale Java apps in the cloud"; [online](https://www.heroku.com)

---
**Version** *20241003v2*
