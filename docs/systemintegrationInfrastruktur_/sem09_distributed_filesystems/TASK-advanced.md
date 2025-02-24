# Verteilte Dateisysteme "Network Storage und Dateisysteme"

## Einführung
Diese Aufgabe soll die Möglichkeit von gemeinsam genutzten Speicher in Cloud und Cluster Umgebungen näher bringen. Dabei sollen die verschiedenen Technologien im Bereich verteilte Dateisysteme gegenübergestellt und auf ihre Einsetzbarkeit überprüft werden.

## Ziele
- Einsatz von Objektspeichern in verteilten Workflows

## Kompetenzzuordnung

#### GK SYT9 Systemintegration und Infrastruktur | Verteilte Dateisysteme | Network Storage
* "die Unterschiede von netzwerkbasierten Speicherlösungen charakterisieren sowie die verschiedenen Technologien erklären und entsprechende Systeme in Betriebssysteme einbinden"

#### GK SYT9 Systemintegration und Infrastruktur | Verteilte Dateisysteme | Dateisysteme
* "replizierte und verteilte Dateisysteme vergleichen und für ein Szenario ein geeignetes System auswählen, konfigurieren und betreiben"

#### EK SYT9 Systemintegration und Infrastruktur | Verteilte Dateisysteme | Dateisysteme
* "die in verteilten Datensystemen eingesetzten Protokolle und Algorithmen erklären"


## Aufgabenstellung

### MinIO
Zeigen Sie an einem Beispiel-Workflow den performanten Einsatz von MinIO in verteilten Systemen. Sie können dabei den Use-Case "Image-Resizing" oder aber den Benchmark zum HDFS-Vergleich heranziehen.

Verwenden Sie dabei eine leicht verfügbare Installation der Implementation und dokumentieren Sie die notwendigen Schritte. Finden Sie geeignete Methoden zur Perfomance-Messung und dokumentieren Sie Ihre Ergebnisse.

## Bewertung
Gruppengrösse: 1-2 Person(en)

### Erweiterte Anforderungen überwiegend erfüllt
- [ ] MinIO deployen und Kubernetes Umgebung aufsetzen
- [ ] Benchmark oder IO-Anwendung implementiert

### Erweiterte Anforderungen zur Gänze erfüllt
- [ ] Deployment erfolgreich
- [ ] Benchmark Methodiken beschrieben
- [ ] Tests und Dokumentation abgeschlossen

## Classroom Repository
[Hier](https://classroom.github.com/a/lKlOrio3) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Help! "Oh, I need somebody ..."


## Quellen
* "MinIO Quickstart Guide" github [online](https://github.com/minio/minio)
* "MinIO Object Storage for Kubernetes" MinIO [online](https://min.io/docs/minio/kubernetes/upstream/)
* "AI Data Workflows with Kafka and MinIO" [online](https://blog.min.io/complex-workflows-apache-kafka-minio/)
* "Breaking the HDFS Speed Barrier - a First for Object Storage" [online](https://blog.min.io/hdfsbenchmark/)

---
**Version** *20241219v1*
