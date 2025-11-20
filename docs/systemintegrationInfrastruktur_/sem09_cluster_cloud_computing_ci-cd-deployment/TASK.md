# Cloud und Cluster Computing "CI/CD Deployment"

## Einführung
In dieser Übung soll ein bestehendes Projekt mit Github Actions in einen CI/CD Workflow eingebettet werden.

## Ziele
- Ziel dieser Übung ist es CI/CD zu verstehen und einfach umzusetzen.
- Dabei sollen Testcases in unterschiedlicher Ausführung die Code-Qualität sicherstellen und sichtbar machen.
- Es sollen Tools kennengelernt und für folgende Eckpunkte eingesetzt werden: Automation, Transparency, Speed, Resilience, Security, Scalability

Die folgende Pipeline soll verstanden und umgesetzt werden:
![CI/CD Pipeline](https://github.com/resources/articles/ci-cd)

## Kompetenzzuordnung

#### GK SYT09 Systemintegration und Infrastruktur | Cluster & Cloud Computing | Anwendung
- "in einer Cloud-Umgebung eigene Dienste anbieten und betreiben"
-
#### EK SYT09 Systemintegration und Infrastruktur | Cluster & Cloud Computing | Anwendung
- "eine private Cloud Lösung installieren, konfigurieren und darin eigene Dienste anbieten und betreiben"

## Voraussetzung
+ Grundlagen Linux, Github, Source-Code-Management
+ Testerstellung und -wartung

## Detailierte Aufgabenstellung
Es sollen Testcases für die Aufgabe [GK911 Informationssysteme "ReST Backend"](https://tgm-hit.github.io/insy-exercises/informationssysteme_/sem09_rest_backend/TASK). Der nächste Schritt ist die Konfiguration eines Github-Actions Deployments. Dafür ist die Beschreibung in [Building and testing Java with Gradle](https://docs.github.com/en/actions/tutorials/build-and-test-code/java-with-gradle) als Startpunkt sehr nützlich.

## Abgabe
Im Repository soll das `README.md` die notwendigen Schritte beschreiben. Auch das verwendete `docker-compose.yml` soll enthalten sein. Bitte alle Binaries und Class-Files in das `.gitignore` eintragen, sodass keine irrtümliche Abgabe erfolgt. Bitte eine sinnvolle Ordnerstruktur verwenden (z.B. `backend/`, `frontend/` etc.).

Bei der Verwendung von KI-Tools müssen die Prompts im Verzeichnis `prompts/` als Markdown-Files exportiert werden. Hier soll darauf geachtet werden, dass die Anfrage als auch die Quellen der Antworten ersichtlich sind.


## Fragenstellungen
1. Welche Vorteile bietet ein CI/CD Workflow?
2. Wo ist der Unterschied zwischen Continuous delivery und Continuous deployment?


## Bewertung
Gruppengröße: 2-3 Person(en)

### Grundanforderungen überwiegend erfüllt
 - [ ] 

### Grundanforderungen zur Gänze erfüllt
 - [ ] 

### Erweiterte Anforderungen überwiegend erfüllt
 - [ ] 

### Erweiterte Anforderungen zur Gänze erfüllt
 - [ ] 

## Classroom Repository
[Hier](https://classroom.github.com/a/yjYYF1Hr) finden Sie das Abgabe-Repository zum Entwickeln und Commiten Ihrer Lösung.

## Help! "Oh, I need somebody ..."

## Quellen
- "How to build a CI/CD pipeline with GitHub Actions in four simple steps" [github.blog](https://github.blog/enterprise-software/ci-cd/build-ci-cd-pipeline-github-actions-four-steps/)
- "What is CI/CD?" [github.com](https://github.com/resources/articles/ci-cd)

---
**Version** *20251120v2*

