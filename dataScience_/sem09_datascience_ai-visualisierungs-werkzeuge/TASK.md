# GK941 Data Science "Werkzeuge zur Visualisierung" - Taskdescription

## Einführung
Diese Übung gibt eine Einführung in die Verwendung von Jupyter zur Visualisierung von Daten. "Data visualization is an essential tool for data science at every step of analysis, from data cleaning to EDA to communicating conclusions and predictions. Because human minds are highly developed for visual perception, a well-chosen plot can often reveal trends and anomalies in the data much more efficiently than a textual description." [1]

## Ziele
Das Ziel ist es Werkzeuge zur Datenexploration und Visualisierung zu verstehen, einsetzen und interpretieren zu können.

## Voraussetzungen
+ Kenntnis von LaTeX und Grundkenntnisse in R oder einer anderen Programmiersprache
+ Kenntnis von Variablentypen
+ Kenntnis von Möglichkeiten zur Visualisierung unterschiedlicher Datentypen

## Detailierte Aufgabenbeschreibung
Es soll das Kapitel "Data Visualization" im Buch "Principles and Techniques of Data Science" [1] als Jupyter-Notebook umgesetzt werden und entsprechend erläutert werden. Dabei soll zwischen Python und R unterschieden werden.

Die verschiedenen Visualisierungstechniken aus dem Unterricht [2] sollen weiters untersucht und gegenübergestellt werden. Folgende Punkte sollen umgesetzt werden:

1. Lade den Datensatz **Titanic** in R. Beschreibe die Daten anhand der internen Hilfe (hilfreiche R Befehle: ``?``, ``help()`` )
2. Untersuche den **Titanic** Datensatz mithilfe von Tabellen von absoluten und relativen Häufigkeiten der Ränder heruntergebrochen auf je 2 oder 3 Dimensionen von Variablen. (hilfreiche R Befehle: ``table(), ftable(), colSums, rowSums(), apply(), xtable()``)
3. Stelle die Daten in geeigneter Weise graphisch dar (hilfreiche R Befehle: ``barplot(), mosaicplot(), assocplot()``)
4. Begründe anhand der quantitativen Ergebnisse, ob Frauen und Kinder zuerst bei der Seenotrettung berücksichtigt wurden.
5. Erkläre, wo sich Anzeichen für Simpson's Paradoxon finden lassen.
6. Lade den Datensatz 'state.x77' in R. Beschreibe die Daten anhand der internen Hilfe.
7. Ermittle mithilfe geeigneter Schätzer für die Lage und Streuung der ersten 5 Variablen, Population, Income, Illiteracy, Life Exp(ectancy) und Murder.
8. Stelle die Daten der ersten 5 Variablen, Population, Income, Illiteracy, Life Exp(ectancy) und Murder in geeigneter Weise graphisch dar. Verwende dafür wenigstens 2 unterschiedliche graphische Darstellungen.
9. Begründe anhand der graphischen Darstellung, ob es sich symmetrische oder schiefe Datenverteilungen handelt. Begründe anhand der graphischen Darstellungen, ob schwere oder leichte Ränder vorliegen (und auf welcher Seite).
10. Bestimme anhand graphischen Darstellungen aus Punkt 8. und der Erkenntnisse aus 9., ob Ausreißer vorliegen und welche Punkte dies sind.

## Fragestellungen
* Wann ist ein Boxsplot sinnvoll?
* ...

## Bewertung
Gruppengrösse: 1 Person  
Protokoll  
### Anforderungen **überwiegend erfüllt**
- [ ] Visualisierungsmöglichkeiten anführen und erläutern 
- [ ] grundlegende Beschreibung und Verwendung der im Unterricht angeführten Informationen
- [ ] Codebeispiele referenziert

### Anforderungen **zur Gänze erfüllt**
- [ ] vertiefende Aufgabenstellungen zu den einzelnen Kapitel durchgeführt
- [ ] Vergleich und Diskussion mindestens zweier unterschiedlicher Schätzer oder graphischer Darstellungen
- [ ] ausführliche Codebeispiele und Visualisierungen dokumentiert

## Quellen
[1] "Principles and Techniques of Data Science - Chapter6 Data Visualization" Sam Lau, Joey Gonzalez, and Deb Nolan; [online](https://www.textbook.ds100.org/ch/06/viz_intro.html)  
[2] "Folien zu Skalen und Visualisierung" A.Posekany; [online](https://elearning.tgm.ac.at/mod/resource/view.php?id=75262)  
[3] "Online Jupyter Lab" [online](https://mybinder.org/v2/gh/jupyterlab/jupyterlab-demo/try.jupyter.org?urlpath=lab)  
