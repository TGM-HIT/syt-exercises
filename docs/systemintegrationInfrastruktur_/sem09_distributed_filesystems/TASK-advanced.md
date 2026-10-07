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
Zeigen Sie an einem Beispiel-Workflow den performanten Einsatz von RustFS in verteilten Systemen. Sie können dabei den Use-Case "Image-Resizing" oder aber den Benchmark zum HDFS-Vergleich heranziehen.

Verwenden Sie dabei eine leicht verfügbare Installation der Implementation und dokumentieren Sie die notwendigen Schritte. Finden Sie geeignete Methoden zur Perfomance-Messung und dokumentieren Sie Ihre Ergebnisse.

## Bewertung
Gruppengrösse: 1-2 Person(en)

### Erweiterte Anforderungen überwiegend erfüllt
- [ ] RustFS deployen und Kubernetes Umgebung aufsetzen
- [ ] Benchmark oder IO-Anwendung implementiert

### Erweiterte Anforderungen zur Gänze erfüllt
- [ ] Deployment erfolgreich
- [ ] Benchmark Methodiken beschrieben
- [ ] Tests und Dokumentation abgeschlossen

## Classroom Repository
[Hier](https://classroom50.org/TGM-HIT/syt5x-2627/assignments/sem09-distributed-filesystems/accept?k=middle7inert7system6intake) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Help! "Oh, I need somebody ..."


## Quellen
* "Quick Start Guide for Linux" RustFS, GitHub [online](https://github.com/rustfs/docs.rustfs.com/blob/main/content/en/installation/linux/quick-start.md)
* "Kubernetes Installation (Helm)" RustFS Documentation [online](https://docs.rustfs.com/en/installation/cloud-native)
* "Event Notifications" RustFS Documentation [online](https://docs.rustfs.com/en/operations/event-notifications)
* "MinIO Stops Accepting Community Changes: Evaluating RustFS as a Viable S3-Compatible Object Storage Backend for Milvus" [online](https://milvus.io/blog/evaluating-rustfs-as-a-viable-s3-compatible-object-storage-backend-for-milvus.md)
* "Benchmark Report: RustFS slightly outperforms MinIO in mixed workloads but falls behind in broader scenarios" [github](https://github.com/rustfs/rustfs/issues/2154)

---
**Version** *20261007v2*
