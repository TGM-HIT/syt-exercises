# Verteilte Dateisysteme "Network Storage und Dateisysteme"

## Einführung
Diese Aufgabe soll die Möglichkeit von gemeinsam genutzten Speicher in Cloud und Cluster Umgebungen näher bringen. Dabei sollen die verschiedenen Technologien im Bereich verteilte Dateisysteme gegenübergestellt und auf ihre Einsetzbarkeit überprüft werden.

## Ziele
- Einsatz von Objektspeichern
- Vergleich von verteilten Dateisystemen

## Kompetenzzuordnung

#### GK SYT9 Systemintegration und Infrastruktur | Verteilte Dateisysteme | Network Storage
* "die Unterschiede von netzwerkbasierten Speicherlösungen charakterisieren sowie die verschiedenen Technologien erklären und entsprechende Systeme in Betriebssysteme einbinden"

#### GK SYT9 Systemintegration und Infrastruktur | Verteilte Dateisysteme | Dateisysteme
* "replizierte und verteilte Dateisysteme vergleichen und für ein Szenario ein geeignetes System auswählen, konfigurieren und betreiben"

#### EK SYT9 Systemintegration und Infrastruktur | Verteilte Dateisysteme | Dateisysteme
* "die in verteilten Datensystemen eingesetzten Protokolle und Algorithmen erklären"


## Aufgabenstellung

### MinIO

*"Minio ist ein in Go geschriebener Open-Source-Server zur verteilten Objektspeicherung, der für die private Cloud-Infrastruktur entwickelt wurde und S3-Speicherfunktionalität bietet. Minio ist der beste Server, der sich zum Speichern unstrukturierter Daten wie Fotos, Videos, Protokolldateien, Backups und Container eignet. Die Größe eines Objekts kann zwischen 1 KB und maximal 5 TB liegen."* [MinIO Distributed Object Storage](https://xenonstack.medium.com/minio-distributed-object-storage-architecture-performance-xenonstack-fe9dfc125c17)

Um große Datenfiles (Images, große binäre Files) einfach bereit stellen zu können, soll eine CRUD Schnitttelle in einer selbstgewählten Sprachumgebung (Java, Python, JS, etc.) implementiert werden, die diese Dateien speichert und als URL-Endpunkt zur Verfügung stellt.

Dabei soll MinIO mit Kubernetes deployed werden und so einfach erweiterbar sein, um erhöhte Anfragen und Datenmengen leicht zu managen.


### HDFS vs. GFS
Verteilte Dateisysteme sind eine weitere Möglichkeit hohe Datenmengn einfach zur Verfügung zu stellen. Es sollen die Unterschiede zwischen *Google File System* (GFS) und *HaDoop File System* (HDFS) ausgearbeitet und Einsatzgebiete identifiziert werden.

## Fragestellungen

1. Welche verschiedenen Einsatzgebiete bieten *distributed Object Storages* an?
2. Was sind die Kernkomponenten von MinIO und wie spielen diese zusammen?

## Bewertung
Gruppengrösse: 1-2 Person(en)

### Grundanforderungen überwiegend erfüllt
- [ ] MinIO deployen und Kubernetes Umgebung aufsetzen
- [ ] Einsatzgebiete von Object Storage dokumentieren

### Grundanforderungen zur Gänze erfüllt
- [ ] HDFS vs. GFS ausarbeiten

## Classroom Repository
[Hier](https://classroom.github.com/a/N38h4thg) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Help! "Oh, I need somebody ..."


## Quellen
* "Simplifying Multi-Tenant Object Storage as a Service with Kubernetes and MinIO Operator" Daniel Valdivia, Kubernetes, last edited 2022-01-11 [online](https://blog.min.io/object_storage_as_a_service_on_minio/)
* "Best Practices for Kubernetes Object Storage" Ugur Tigli, Kubernetes, last edited 2021-10-25 [online](https://blog.min.io/best-practices-for-kubernetes-object-storage/)
* "MinIO Quickstart Guide" github [online](https://github.com/minio/minio)
* "MinIO Object Storage for Kubernetes" MinIO [online](https://min.io/docs/minio/kubernetes/upstream/)
* "Object Management" MinIO [online](https://min.io/docs/minio/kubernetes/upstream/administration/object-management.html)
* "HDFS Architecture Guide" Hadoop [online](https://hadoop.apache.org/docs/r1.2.1/hdfs_design.html)
* "The Google File System" Sanjay Ghemawat Howard Gobioff Shun-Tak Leung; Proceedings of the 19th ACM Symposium on Operating Systems Principles, ACM, Bolton Landing, NY (2003), pp. 20-43 [online](https://storage.googleapis.com/pub-tools-public-publication-data/pdf/035fc972c796d33122033a0614bc94cff1527999.pdf)
* "Comparative Analysis of GFS and HDFS: Technology and Architectural landscape," C. Verma and R. Pandey; 2018 10th International Conference on Computational Intelligence and Communication Networks (CICN), Esbjerg, Denmark, 2018, pp. 54-58 [online](https://ieeexplore.ieee.org/document/8864934)
* "An overview of Google File System" Roshan Munjal, Medium, last edited 2022-03-22 [online](https://medium.com/@roshan3munjal/google-file-system-gfs-overview-eed15f3e6f6e)
* "Upload and Retrieve Images by Integrating MinIO With NestJS" [online](https://betterprogramming.pub/upload-and-retrieve-images-by-integrating-minio-with-nestjs-419e4e629b5d)
* "Introduction to MinIO" [online](https://www.baeldung.com/minio)
* "Upload files in MinIO using Python" [online](https://medium.com/featurepreneur/upload-files-in-minio-using-python-4f987f9020769)
