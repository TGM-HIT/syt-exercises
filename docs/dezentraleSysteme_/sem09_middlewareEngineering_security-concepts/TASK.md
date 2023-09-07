# EK9.6 Middleware Engineering "Security Concepts" - Taskdescription

## Einführung 
Diese Übung soll helfen die Funktionsweise eines Authentication Services zu verstehen und anwenden zu können. Dabei sollen die Technologien Single Sign On (SSO), Ticket Granting Ticket Service (TGT), Central Authentication Service (CAS), Open Authorization (OAuth), Security Assertion Markup Language (SAML) und Kerberos näher betrachtet werden. Es soll folgende Architektur verstanden und mindestens eine Schiene davon implementiert werden: ![CAS Architektur](https://apereo.github.io/cas/5.3.x/images/cas_architecture.png)

## Ziele
Ein Überblick gängiger Authentifizierungsmethoden soll zur Grundlage für die Entscheidung und Wahl von Zugangskontrollen bei Webapplikationen herangezogen werden.

## Voraussetzungen
Es wird eine Java Laufzeitumgebung mit Git vorausgesetzt. Von Vorteil ist eine Gradle- bzw. Maven-Unterstützung, um vorgefertigte Repositories leicht ausführen zu können.

## Detailierte Ausgabenbeschreibung
### Recherche
Als Junior-Developer erhalten Sie von Ihrem technischen Architekten die Aufgabe, eine Gegenüberstellung von gängigen Authentifikationssystemen zu erstellen. Beachten Sie bei der Auflistung von Vor- und Nachteilen die notwendigen funktionalen Anforderungen:

+ Anbindung an ein bestehende Authentifikations-Services
+ Token-Authentifizierung, um ein andauerndes Login bei mehreren Services gering zu halten bzw. auf ein einmaliges Authentifizieren zu beschränken
+ Verwendung auf verschiedenen Implementierungen und Devices

Diese Gegenüberstellung soll kurz und bündig auf die gängigen Systeme und Technologien verweisen. Es sollen keine Informationen kopiert sondern nur kurz zusammengefasst werden.

### Implementierung
Um das in Entwicklung befindliche Online-Portal zur Bereitstellung von Informationen des Windparks entsprechend einer breiten Community schmackhaft zu machen, und trotzdem eine Authentifizierung anzubieten, werden Sie beauftragt einen Prototypen für Spring-Boot zu entwickeln, der sich über Sozialen-Netzwerken authentifizieren kann (Facebook, Google+, etc.).

Es soll ebenfalls eine Implementierung bereitgestellt werden, die sich an einen aktiven AD-Service verbinden und entsprechend die Rollen von bestimmten Gruppen unterscheiden kann. Dabei sollen zwei Bereiche festgelegt werden, die nur von einer bestimmten Gruppe betreten werden kann.

Die Prototypen sollen klar und einfach gehalten werden und mit entsprechender Dokumentation versehen sein, um eine einfache Integrierung in das bestehende Spring-Boot Projekt zu ermöglichen.


## Bewertung
Gruppengrösse: 1-2 Person(en)
### Anforderungen **überwiegend erfüllt**
+ Aufzählung und Quellenrecherche der in der Einführung erwähnter Technologien (30/200)
+ Vergleich der Technologien auf mögliche Einsatzgebiete (30/200)
+ Erstellung eines Prototypen zur Authentifikation mittels sozialer Dienste (30/200)
+ Verwendung von Deployment-Tool und entsprechende Dokumentation der notwendigen Schritte (20/200)
+ Testen der Webapplikation und Dokumentation der einzelnen Testfälle und deren Ergebnisse (20/200)

### Anforderungen **zur Gänze erfüllt**
+ Erstellung eines Prototypen zur Authentifikation mittels Active-Directory (30/200)
+ Authentifikation mittels externen Active-Directory mit bestehender User-Datenbank (z.B. dc-01.tgm.ac.at) (20/200)
+ Verwendung von Deployment-Tool und entsprechende Dokumentation der notwendigen Schritte (10/200)
+ Testen der Webapplikation und Dokumentation der einzelnen Testfälle und deren Ergebnisse (10/200)

## Quellenverzeichnis
* [Kerberos Dokumentation](http://www.kerberos.org/docs/index.html)
* [Authentication Protocols](https://www.getkisi.com/blog/authentication-protocols-overview)
* [Singel Sign-On im Vergleich](https://dafrk-blog.com/de/sso-kerberos-saml-oauth-sap/)
