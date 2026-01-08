# EK9.7 Distributed Computing "High Availability" - Taskdescription
## Einführung
Als Lastverteilung (englisch Load Balancing) bezeichnet man in der Informatik der Verteilung von umfangreiche Berechnungen oder große Mengen von Anfragen auf mehrere parallel arbeitende Systeme. Dies kann sehr unterschiedliche Ausprägungen haben. Eine einfache Lastverteilung findet zum Beispiel auf Rechnern mit mehreren Prozessoren statt. Jeder Prozess kann auf einem eigenen Prozessor ausgeführt werden. Man unterscheidet eine Reihe von Algorithmen, genannt Load Balancing Methoden, um diese Verteilung durchzuführen.

## Ziele
Diese Übung soll helfen die Funktionsweise eines Load Balancers kennenzulernen und anwenden zu koennen. Dabei sollen die SchülerInnen die verschiedenen Methoden kennenlernen und anhand eines Beispiels umgesetzt werden.

## Voraussetzungen
* Grundlagen zu Load Balancing
* Java Programmierkenntnisse

## Aufgabenstellung
Es soll ein Load Balancer mit mindestens 3 unterschiedlichen Load-Balancing Methoden implementiert werden. Eine Kombination von mehreren Methoden ist möglich. Die Berechnung bzw. das Service ist frei wählbar!

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

## Abgabe
Im Repository soll das `README.md` die notwendigen Schritte beschreiben. Bitte die Binaries und Class-Files in das `.gitignore` eintragen, sodass keine irrtümliche Abgabe erfolgt.

Bei der Verwendung von KI-Tools müssen die Prompts im Verzeichnis `prompts/` als Markdown-Files exportiert werden. Hier soll darauf geachtet werden, dass die Anfrage als auch die Quellen der Antworten ersichtlich sind.

### Classroom Git-Repository
[Hier](https://classroom.github.com/a/nlvLQrYD) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Bewertung
Gruppengrösse: 1-2 Person(en)
### Erweiterte Anforderungen "überwiegend erfüllt"
- [ ] Implementieren & dokumentieren (Gegenüberstellung) der drei Load-Balancing Methoden
- [ ] Verwendung von mindestens zwei Hardware-Einheiten (Netzwerkverbindung)
- [ ] Durchführen & dokumentieren der Belastungstests (RAM/CPU)
### Erweiterte Anforderungen "zur Gänze erfüllt"
- [ ] Implementierung einer weiteren, rechenintensiven Berechnung mittels generischem Task (z.B. Primzahlberechnung)
- [ ] Gegenüberstellung einer möglichen gRPC Portierung der durchgeführten RMI-Implementierung


## Quellen
* [Comparing Load Balancing Algorithms](https://www.jscape.com/blog/load-balancing-algorithms)
* [Java RMI Tutorial - PI Calculation](https://docs.oracle.com/javase/tutorial/rmi/overview.html)
* [LoadBalancing RMI Example](https://github.com/mborko/code-examples/tree/master/java/rmiLoadBalancing)

--
**Version** *20260108v3*

