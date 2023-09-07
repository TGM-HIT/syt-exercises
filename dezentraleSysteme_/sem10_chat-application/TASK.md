# Distributed Computing *Chat Application* - Taskdescription

## Einführung
Diese Übung soll eine Vertiefung des Wissens für mobile Anwendungen darstellen.

## Ziele
Das Ziel dieser Übung ist die Entwicklung eines serverbasierten Gruppenchats. Die Applikation soll auf den Entwicklungen der Grundkompetenzübung "Cloud-Datenmanagement" aufbauen und diese um folgende Funktionalität erweitern:

* Anbindung mit Hilfe eines RESTful Webservice
* Zur Teilnahme beim Gruppenchat ist eine Anmeldung erforderlich (Username/Passwort)
* Abmeldung des Users am Ende der Chatsession
* Verwendung des Observer-Pattern

## Voraussetzungen

* Grundlagen zur höheren Programmiersprache und JSON
* Grundlegendes Verständnis über Entwicklungs- und Simulationsumgebungen
* Verständnis von RESTful Webservices
* Grundlegendes Wissen zum Design Pattern "Observer" und dessen Umsetzung

## Aufgabenstellung

Es ist eine Anwendung zu implementieren, die sich mit Hilfe der Übung GK9.3 "Cloud-Datenmanagement" bei einem RESTful Service anmeldet. Nach erfolgreicher Anmeldung bekommt der Benutzer alle Meldungen, die in diesem Chat eingehen. Der Benutzer hat ebenso die Moeglichkeit Nachrichten in diesem Chat zu erstellen. Diese Nachricht wird in weiterer Folge an alle Teilnehmer versendet und in der mobilen Anwendung angezeigt. Am Ende muss sich der Benutzer vom Gruppenchat abmelden.

Es ist freigestellt, welche mobile Implementierungsumgebung dafür gewählt wird.


## Bewertung
Gruppengrösse: 1 Person
### Erweiterte Anforderungen **überwiegend erfüllt**
- [ ] Registrierung und Login von Benutzern
- [ ] Anmeldung/Abmeldung Gruppenchat
- [ ] Empfangen von Nachrichten des Gruppenchats
- [ ] Erstellen von Nachrichten im Gruppenchat
### Erweiterte Anforderungen **zur Gänze erfüllt**
- [ ] Korrekte Umsetzung des Observer Patterns
- [ ] Simulation bzw. Deployment auf einem öffentlichen System
- [ ] Überprüfung der funktionalen Anforderungen mittels Regressionstests

## Quellen
* "Android Restful Webservice Tutorial – How to call RESTful webservice in Android – Part 3"; Posted By Android Guru on May 27, 2014; [online](http://programmerguru.com/android-tutorial/android-restful-webservice-tutorial-how-to-call-restful-webservice-in-android-part-3/)
* "Referenzimplementierung von DezSys09"; Paul Kalauner; [online](https://github.com/pkalauner-tgm/dezsys09-java-webservices)
* "Android Asynchronous Http Client"; James Smith; [online](http://loopj.com/android-async-http/)
* "Android Asynchronous Networking and Image Loading"; Koushik Dutta; [online](https://github.com/koush/ion)
* "AndroidAsync"; Koushik Dutta; [online](https://github.com/koush/AndroidAsync)

