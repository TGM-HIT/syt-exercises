# Datenmanagement "Distributed Data Structures" - Taskdescription

## Einführung
Komplexe und aufteilbare Tasks müssen mit Parametern ausgestattet werden und von entsprechenden Koordinatoren gestartet bzw. die erhaltenen Daten wieder zusammengefasst werden. Diese Art von verteilter Programmierung findet in vielen Anwendungsgebieten rege Verwendung (AI Daten Analyse, Lastverteilung, etc.). Hierbei kommt das Prinzip des Master/Worker Patterns (Master-Slave oder Map-Reduce Pattern) zum Einsatz.

## Ziele
Finden Sie eine Lösung, die in einer Cloud-Umgebung ausrollbar (deployable) ist. Die einzelnen Worker sollen unabhängig voneinander bestehen können und mit Input-Parametern gestartet werden. Die berechneten Daten müssen an den Master bzw. als Zwischenberechnung an andere Worker weitergegeben werden können. Die einzelnen Worker sollen unabhängig von der Umgebung gestartet werden können (unterschiedliche Servereinheiten).

## Kompetenzzuordnung
**GK SYT10 Dezentrale Systeme | Datenmanagement | Replikation**

* "ausfallsichere, replizierte und dezentrale Systeme entwerfen, installieren und warten"


## Voraussetzungen
* Grundverständnis von Python oder Java
* Lesen und Umsetzen von APIs
* Fähigkeit komplexe Programmier-Aufgaben zu implementieren und zu verteilen

## Detailierte Aufgabenbeschreibung
Recherchieren Sie mögliche Werkzeuge für das "distributed Computing". Vergleichen Sie mögliche Produkte in Bezug auf folgende Parameter:

* Architektur
* einsetzbare Programmiersprachen
* Datenverteilung und gemeinsamer Speicher
* Performance bei Main-Focus
* Notifikation von Master oder anderen Workern

Um Technologien auch entsprechend im Einsatz vergleichen zu können, ist die Beschreibung der Schnittstellen ein wichtiger Punkt. Hierfür bietet sich auch eine kurze Sourcecode Gegenüberstellung an, damit die Komplexität des Systems bzw. Frameworks auch veranschaulicht werden kann.

Nehmen Sie eine geeignete Aufgabenstellung/Berechnung (Aufteilung von Daten) und zeigen Sie anhand von einer Beispiel-Konfiguration, wie die Verteilung der Berechnung und anschließende Zusammenführung der Daten funktioniert. Bei ähnlichen oder gleichen Berechnungen wäre ein direkter Vergleich (Benchmark) der gewählten Tools/Technologien von Vorteil.

## Abgabe
Die entsprechenden Konfigurationsdateien und Deployment-Anweisungen sind im **README.md** festzuhalten. Implementierungen müssen entsprechend beschrieben und leicht deployable sein!

### Classroom Git-Repository
[Hier](https://classroom.github.com/a/OpRMoNZk) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung. Sollte der Server durch einen unerwarteten Umstand daran gehindert worden sein, die an ihn gesendete Anfrage zu erfüllen, muss der Link zu Beginn des Labors persönlich beantragt werden!

## Fragenstellungen
1. Was ist Apache Kafka und welche Use-Cases zeigen dessen charakteristischen Verwendungsmöglichkeiten?
2. Wie implementiert Kafka seit Version 3.3 das Raft-Protokoll zur Meta-Datenverwaltung im Vergleich zu früherem ZooKeeper?
3. Welche Trade-offs entstehen bei der Migration vom Quorum-Controller zu KRaft für hochfrequente Streams?
4. Wo und wie können sich Apache Spark und Apache Kafka ergänzen?

## Bewertung
Gruppengrösse: 1-2 Person(en)
### Grundanforderungen **überwiegend erfüllt**
- [ ] Vergleich von Technologien
	* Architektur
	* einsetzbare Programmiersprachen
	* Datenverteilung und gemeinsamer Speicher
	* Performance bei Main-Focus
	* Notifikation von Master oder anderen Workern
- [ ] Beschreibung der gewählten Systeme bzw. Frameworks
- [ ] Dokumentation der gewählten Schnittstellen

### Grundanforderungen **zur Gänze erfüllt**
- [ ] Implementierung der gewählten Umgebung auf lokalem System
- [ ] Einsatz eines Beispiels zur Veranschaulichung der Funktionsweise
- [ ] Verteilung der Berechnung und anschließende Zusammenführung der Daten


## Quellen
* "A reactive Java framework for building fault-tolerant distributed systems" Atomix [github](https://github.com/atomix/atomix)
* "What is Atomix?" [atomix.io](https://atomix.io/user-guide/architecture/)
* "Introduction to Atomix" [baeldung](https://www.baeldung.com/atomix)
* "The Raft Consensus Algorithm" [online](https://raft.github.io/)
* "In Search of an Understandable Consensus Algorithm" Raft-Paper; Stanford University; [online](https://raft.github.io/raft.pdf)
* "Getting started with Kafka" [kafka](https://kafka.apache.org/documentation/#gettingStarted)
* "How to Set up Kafka and Stream Data to MinIO in Kubernetes" [online](https://blog.min.io/stream-data-to-minio-using-kafka-kubernetes/)
* "Spark Structured Streaming With Kafka and MinIO" [online](https://blog.min.io/spark-structured-streaming-with-kafka-and-minio/)
* "The Difference Between Kafka and Spark" [aws](https://aws.amazon.com/compare/the-difference-between-kafka-and-spark/)
* "Spark Quickstart" [online](http://spark.apache.org/docs/latest/quick-start.html)  
* "Spark Github repository with examples" [online](https://github.com/apache/spark)
* "Spark Tutorial: Real Time Cluster Computing Framework" [online](https://www.edureka.co/blog/spark-tutorial/)
* "Open-source software for reliable, scalable, distributed computing" [Apache Hadoop](https://hadoop.apache.org/)  
* "High-performance coordination service for distributed applications" [Apache Zookeeper](https://zookeeper.apache.org/doc/current/)  
* "Distributed data store" [wikipedia](https://en.wikipedia.org/wiki/Distributed_data_store)
* "etcd - A distributed, reliable key-value store" [online](https://etcd.io/)
* "KRaft: Apache Kafka Without ZooKeeper" [online](https://developer.confluent.io/learn/kraft/)
* "The Evolution of Kafka Architecture: From ZooKeeper to KRaft" [online](https://romanglushach.medium.com/the-evolution-of-kafka-architecture-from-zookeeper-to-kraft-f42d511ba242)

### Beispiele
* "Reddit-Realtime-Streaming-Pipeline" [github](https://github.com/Hungreeee/Reddit-Realtime-Streaming-Pipeline?tab=readme-ov-file)
* "Realtime Voting System - Kafka & Spark Example" [github](https://github.com/rajuranjan00/Real-time-voting-system)
* "Kafka: A Complete Tutorial" [online](https://medium.com/@Shamimw/kafka-a-complete-tutorial-part-1-installing-kafka-server-without-zookeeper-kraft-mode-using-6fc60272457f)

---
**Version** *20250213v5*
