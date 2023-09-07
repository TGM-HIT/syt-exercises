# GK9.7 Distributed Computing "High Availability" - Taskdescription
## Einführung
Als Lastverteilung (englisch Load Balancing) bezeichnet man in der Informatik der Verteilung von umfangreiche Berechnungen oder große Mengen von Anfragen auf mehrere parallel arbeitende Systeme. Dies kann sehr unterschiedliche Ausprägungen haben. Eine einfache Lastverteilung findet zum Beispiel auf Rechnern mit mehreren Prozessoren statt. Jeder Prozess kann auf einem eigenen Prozessor ausgeführt werden. Man unterscheidet eine Reihe von Algorithmen, genannt Load Balancing Methoden, um diese Verteilung durchzuführen.


## Ziele
Diese Übung soll helfen die Funktionsweise eines Load Balancers kennenzulernen und anwenden zu koennen. Dabei sollen die SchülerInnen die verschiedenen Methoden kennenlernen und anhand eines Beispiels umgesetzt werden.


## Voraussetzungen
* Grundlagen zu Load Balancing
* Java Programmierkenntnisse


## Aufgabenstellung
Es soll ein Load Balancer mit mindestens 2 unterschiedlichen Load-Balancing Methoden implementiert werden. Eine Kombination von mehreren Methoden ist möglich. Die Berechnung bzw. das Service ist frei wählbar!

Folgende Load Balancing Methoden stehen zur Auswahl:

+ Weighted Round-Round
+ Least Connection
+ Weighted Least Connection
+ Agent Based Adaptive Balancing / Server Probes

Es sollen die einzelnen Server-Instanzen in folgenden Punkten belastet werden können:

+ Memory (RAM)
+ CPU Cycles

Bedenken Sie dabei, dass die einzelnen Load Balancing Methoden unterschiedlich auf diese Auslastung reagieren werden. Dokumentieren Sie dabei aufkommenden Probleme ausführlich.


## Abnahme/Tests
Für die Abnahme wird empfohlen, dass jeder Server eine Ausgabe mit entsprechenden Informationen ausgibt, damit die Verteilung der Anfragen demonstriert werden kann. Sie sollen auch eine sinnvolle Darstellung wählen, um die Resultate der Belastungstests zu dokumentieren.

Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Etwaiger Programmcode ist ebenfalls zu dokumentieren. Implementierungen müssen entsprechend beschrieben und leicht deployable sein!

### Classroom Git-Repository
[Hier](https://github.com/500) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Fragestellung für die Dokumentation
Verlgeichen Sie die verwendeten Load Balancing Methoden und stellen Sie diese gegenüber.

+ Was kann als Gewichtung bei Weighted Round Robin verwendet werden?
+ Warum stellt die "Hochverfügbarkeit" von IT Systemen in der heutigen Zeit eine sehr wichtige Eigenschaft dar?
+ Welche anderen Massnahmen neben einer Lastverteilung müssen getroffen werden, um die "Hochverfügbarkeit" sicher zu stellen?
+ Was versteht man unter "Session Persistenz" und welche Schwierigkeiten ergeben sich damit?
+ Nennen Sie jeweils ein Beispiel, wo Session Persistenz notwendig bzw. nicht notwendig ist.
+ Welcher Unterschied besteht zwischen einer "server-side" bzw "client-side" Lastverteilungslösung?
+ Was versteht man unter dem "Mega-Proxy-Problem"?


## Bewertung
Gruppengrösse: 1-2 Person(en)
### Anforderungen "überwiegend erfüllt"
- [ ] Dokumentation und Beschreibung der angewendeten Load Balancing Methode
- [ ] Implementieren & dokumentieren einer Load Balancing Methode
### Anforderungen "zur Gänze erfüllt"
- [ ] Implementieren & dokumentieren einer weiteren Load Balancing Methode
- [ ] Gegenüberstellung der angewendeten Load Balancing Methoden
- [ ] Durchführen & dokumentieren der Belastungstests (RAM/CPU)


## Quellen
* [Comparing Load Balancing Algorithms](https://www.jscape.com/blog/load-balancing-algorithms)
* [Java RMI Tutorial - PI Calculation](https://docs.oracle.com/javase/tutorial/rmi/overview.html)
