# Middleware Engineering "Cloud-Datenmanagement" - Taskdescription

## Einführung
Diese Übung zeigt die Anwendung von verteilten Webservices an einer simplen Anforderung.

## Ziele
Das Ziel dieser Übung ist eine Webanbindung zur Benutzeranmeldung umzusetzen. Dabei soll sich ein Benutzer registrieren und am System anmelden können.  
Die Kommunikation zwischen Client und Service soll mit Hilfe einer REST Schnittstelle umgesetzt werden.

## Kompetenzzuordnung
#### GK SYT9 Dezentrale Systeme | Middleware Engineering | Serviceorientiert
* "anhand von bestimmten Anforderungen ein Webservice umsetzen"
#### GK SYT9 Dezentrale Systeme | Datenmanagement | Speicherkonzepte
* "Grundlagen zu zentralen und verteilten Datenspeicher"

## Voraussetzungen
+ Grundlagen einer höheren Programmiersprache
+ Verständnis über relationale Datenbanken und dessen Anbindung mittels ODBC oder ORM-Frameworks
+ Verständnis von Restful Webservices

## Aufgabenstellung
Es ist ein Webservice zu implementieren, welches eine einfache Benutzerverwaltung implementiert. Dabei soll die Webapplikation mit den Endpunkten `/register` und `/login` erreichbar sein.

### Grundanforderungen

#### Registrierung
Diese soll mit einem Namen, einer eMail-Adresse als BenutzerID und einem Passwort erfolgen. Dabei soll noch auf keine besonderen Sicherheitsmerkmale Wert gelegt werden, jedoch ist das Passwort nicht unverschlüsselt abzulegen. Bei einer erfolgreichen Registrierung (alle Elemente entsprechend eingegeben) wird der Benutzer in einen Datastore (z.B. relationale Datenbank) abgelegt.

#### Login
Der Benutzer soll sich mit seiner ID und seinem Passwort entsprechend authentifizieren können. Bei einem erfolgreichen Login soll eine einfache Willkommensnachricht angezeigt werden.

Verwenden Sie auf jeden Fall ein gängiges Build-Management-Tool (z.B. Gradle). Dabei ist zu beachten, dass ein einfaches Deployment möglich ist (auch Datenbank mit z.B. file-based DBMS). Überprüfen Sie die Funktionalität mit einfachen Methoden, die einfach nachvollziehbar sind und dokumentieren Sie diese (z.B. mit `curl` Befehlen).

## Fragestellungen
* Welche grundlegenden Elemente müssen bei einer REST Schnittstelle zur Verfügung gestellt werden?
* Wie stehen diese mit den HTTP-Befehlen in Verbindung?
* Welche Datenbasis bietet sich für einen solchen Use-Case an?
* Welche Erfordernisse bezüglich der Datenbasis sollten hier bedacht werden?
* Verschiedene Frameworks bieten schnelle Umsetzungsmöglichkeiten, welche Eckpunkte müssen jedoch bei einer öffentlichen Bereitstellung (Production) von solchen Services beachtet werden?

## Bewertung
Gruppengrösse: 1-2 Person(en)
### Grundanforderungen **überwiegend erfüllt**
- [ ] Dokumentation und Beschreibung der angewendeten Schnittstelle (Framework oder Plain-Implementierung)
- [ ] Aufsetzen und Deployment einer REST-Schnittstelle
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Registrierung von Benutzern mit entsprechender Persistierung
- [ ] Login und Rückgabe einer Willkommensnachricht

### Classroom Repository
[Hier](https://classroom.github.com/a/3PuAu_nQ) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

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
**Version** *20221006v3*
