# EK9.8 Distributed Computing "Distributed Task Architecture" - Taskdescription

## Einführung
Komplexe und aufteilbare Tasks müssen mit Parametern ausgestattet werden und von entsprechenden Koordinatoren gestartet bzw. die erhaltenen Daten wieder zusammengefasst werden. Diese Art von verteilter Programmierung findet in vielen Anwendungsgebieten rege Verwendung (AI Daten Analyse, Lastverteilung, etc.). Hierbei kommt das Prinzip des Master/Worker Patterns (Master-Slave oder Map-Reduce Pattern) zum Einsatz.

## Ziele
Finden Sie eine Lösung, die in einer Cloud-Umgebung ausrollbar (deployable) ist. Die einzelnen Worker sollen unabhängig voneinander bestehen können und mit Input-Parametern gestartet werden. Die berechneten Daten müssen an den Master bzw. als Zwischenberechnung an andere Worker weitergegeben werden können. Die einzelnen Worker sollen unabhängig von der Umgebung gestartet werden können (unterschiedliche Servereinheiten).

## Voraussetzungen
* Grundverständnis von Python oder Java
* Lesen und Umsetzen von APIs
* Fähigkeit komplexe Programmier-Aufgaben zu implementieren und zu verteilen

## Detailierte Ausgabenbeschreibung
Recherchieren Sie mögliche Werkzeuge für das "distributed Computing". Vergleichen Sie mögliche Produkte in Bezug auf folgende Parameter:

* Architektur
* einsetzbare Programmiersprachen
* Datenverteilung und gemeinsamer Speicher
* Performance bei Main-Focus
* Notifikation von Master oder anderen Slaves

Nehmen Sie eine komplexe Aufgabenstellung/Berechnung und zeigen Sie anhand von einer Beispiel-Konfiguration, wie die Verteilung der Berechnung und anschließende Zusammenführung der Daten funktioniert. Bei ähnlichen oder gleichen Berechnungen wäre ein direkter Vergleich (Benchmark) der gewählten Tools/Technologien von Vorteil.

## Bewertung
Gruppengrösse: 2 Personen
### Erweiterte Anforderungen **überwiegend erfüllt**
* Vergleich von Technologien
* Einsatz eines Beispiels zur Veranschaulichung der Funktionsweise
### Erweiterte Anforderungen **zur Gänze erfüllt**
* Benchmark von zwei verschiedenen Technologien

## Quellen
* [Getting started with JavaSpaces](https://www.oracle.com/technetwork/articles/java/javaspaces-140665.html)
* [Master-Worker Pattern](https://docs.gigaspaces.com/sbp/master-worker-pattern.html)
* [GigaSpaces](https://www.gigaspaces.com/download-center)

* [Spark Quickstart](http://spark.apache.org/docs/latest/quick-start.html)
* [Spark Github repository with examples](https://github.com/apache/spark)
* [Getting started Apache Spark with Java](https://www.geekmj.org/apache-spark/java-getting-started-725/)
* [Hello World with Spark](https://vitalflux.com/hello-world-with-apache-spark-standalone-cluster-on-docker/)
* [Apache Spark Dockerimage](https://github.com/gettyimages/docker-spark)

* [Apache Hadoop](https://hadoop.apache.org/)
* [Apache Zookeeper](https://zookeeper.apache.org/doc/current/)

* [Differences between Hadoop, Spark and Storm](https://www.cognixia.com/blog/understanding-hadoop-vs-spark-vs-storm)
* [Comparison Storm and Spark](https://www.whizlabs.com/blog/apache-storm-vs-apache-spark/)

* [Akka Quickstart](https://developer.lightbend.com/guides/akka-quickstart-java/index.html)
* [Concurrency with Akka](https://dzone.com/articles/concurrency-with-akka)
