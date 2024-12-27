---
hide:
  - navigation

---

# "*Boolesche Algebra*" - Taskdescription

## Einführung
Wie du vielleicht schon mitbekommen hast, wurde die Boolesche Algebra schon als ein Erweitertes Kapitel in S01A Zahlen und Maße behandelt. In SYTI wollen wir diesen Inhalt nun nochmals wiederholen und vertiefen. Hierzu wird es sinnvoll sein den Online-Kurs von S01A zu verwenden. Zusätzlich findest du im Kurs Anleitungsvideos die dir helfen können die Inhalte anzulernen.

Gleich vorweg, in S01A werden für falsche bzw. wahre Aussagen die Abkürzung f bzw. w verwendet, wir in der Informatik verwenden 0 (falsche Aussage) bzw 1 (wahre Aussage). Wir gewöhnen uns auch eine strukturierte Schreibweise für Wahrheitstabellen an, siehe dir hierzu das Anleitungsvideo [Variablenbelegungen von Wahrheitstabellen](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Variablenbelegung%20Wahrheitstabelle.mp4) an. 

Ich wünsche viel Erfolg beim Durcharbeiten!

## Ziele
Ziel ist es den Umgang mit der Boolesche Algebra zu erlernen. Dazu gehören Erstellen von Wahrheitstabellen, verwenden von Junktoren und den Begriff Tautologie und Kontradiktion kennen lernen. Zusätzlich noch die Normalformen beschreiben und anwenden.

## Kompetenzzuordnung

#### GK SYT2 Grundlagen der Informatik - Boolesche Algebra

* "Wahrheitstafeln für mindestens 3 Eingänge erstellen, logische Operatoren „UND“, „ODER“, „NICHT“, „Implikation“ und "Äquivalenz" erklären und die Verknüpfungen anzuwenden"
* "boolesche Ausdrücke beweisen und die Begriffe Tautologie und Kontradiktion erklären"
* "Normalformen beschreiben und anwenden"


## Voraussetzungen

* Lesen und Umsetzen von Arbeitsanweisungen

## Detaillierte Aufgabenbeschreibung
Bitte versuche alle wichtigen Information kurz und prägnant in einem Grafiz zu verschriftlichen.

### Grundanforderungen

Wie in der Einführung besprochen, siehe dir zuerst das Video [Variablenbelegungen von Wahrheitstabellen](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Variablenbelegung%20Wahrheitstabelle.mp4) an. Mach dir auch gleich wichtige Notizen in deiner Mitschrift du dann auch hochladen sollst.

Siehe dir danach das Video [Verknüpfung von Aussagen](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Verkn%C3%BCpfung%20von%20Aussagen.mp4) an und schreibe deine Mitschrift weiter. Notiere dir die Operatoren und,oder, usw. sowie auch ihre Fachbegriffe Konjunktion,Disjunktion, ... .

Siehe dir als letztes das Video [Wahrheitstabelle von einem logischen Ausdrück erstellen](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Wahrheitstabelle%20erstellen.mp4) an und versuche zu verstehen wie du eine Wahrheitstabelle von einem logischen Ausdruck erstellst. Notiere dir wichtige Erkentnisse in deiner Mitschrift und füge auch die Reihenfolge der Operatoren auf, welche zuerst auszuführen sind. Herzliche Gratulation du hast nun erlernt wie du Wahrheitstabellen von logischen Ausdrücken erstellen kannst. 

Rechne dir nun den Modulo (also den ganzzahligen Rest bei einer Division) von deiner Katalognummer dividiert durch 6 aus. 
Tipp: Solltest du Probleme bei der Modulo Rechnung haben frage deinen Nachbarn, das Internet oder deine Lehrkraft. Dies sollte auch in deiner Mitschrift vorkommen.  

* 0 -> A  
* 1 -> B  
* 2 -> C  
* 3 -> D  
* 4 -> E  
* 5 -> F  

Mit diesem errechneten Module kannst du nun deine Fertigkeiten bei einer Wahrheitstabelle unter Beweis stellen. Wähle die entsprechende Wahrheitstabelle von deinem errechneten Modulo [Hier](https://github.com/TGM-HIT/syt-exercises/blob/main/docs/grundlagenDerInformatik_/sem02_BoolescheAlgebra/Wahrheitstabellen.pdf) aus. Dies ist der letzte Teil deiner praktischen Mitschrift. Arbeite nun die Fragestellungen aus.

### Erweitert

Siehe dir die beiden Videos [DNF](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/3/DNF.mp4) und [KNF](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/3/KNF.mp4) an und erstelle eine Mitschrift dazu. Versuche danach das Skriptum [online](https://github.com/TGM-HIT/syt-exercises/blob/main/docs/grundlagenDerInformatik_/sem02_BoolescheAlgebra/BoolscheAlgebra(KNF,DNF).pdf) zu verstehen und die wichtigsten Punkte herauszuschreiben. Arbeite nun die Fragestellungen aus.


## Fragestellungen

### Grundlegend

* Unter welchem Datentyp kann in einer Programmiersprache ein boolescher Wert abgespeichert werden? Suche hierzu im Internet.
* Gib den erforderlichen Java-Code an, um die Variable is_checked mit dem Wert wahr zu belegen. 
* Welche Junktoren stehen in der Programmiersprache Java zur Verfügung und wie werden diese dargestellt? Suche hierzu im Internet.
* Gegeben ist die Funktion 𝑓(𝑎, 𝑏, 𝑐) = (¬𝑐 ⇒ 𝑏) ∧ (𝑎 ⇔ 𝑐). Wie viele Zeilen muss die Wahrheitstabelle bei der Anzahl an Variablen aufweisen? Begründe deine Antwort.
* Was bedeuten die Begriffe Tautologie und Kontradiktion? Suche hierzu im Internet.
* Prüfe, ob es sich bei 𝑓(𝑎, 𝑏) = (𝑎 ∧ 𝑏) ⇒ 𝑎 um eine Tautologie handelt.
* Beweise mittels Wahrheitstabelle: 𝑎 ⇔ 𝑏 = (𝑎 ⇒ 𝑏) ∧ (𝑏 ⇒ 𝑎). Tipp: Um zu beweisen musst du die Wahrheitstabelle von 𝑎 ⇔ 𝑏 aufstellen und mit der Wahrheitstabelle von (𝑎 ⇒ 𝑏) ∧ (𝑏 ⇒ 𝑎) vergleichen. Ist die Endwahrheitstabelle in jeder Zeile gleich ist der Beweis erbracht worden.
* Handelt es sich beim Satz [(𝑎 ∧ ¬𝑏) ⇒ (𝑎 ∨ 𝑐)] ∨ (𝑏 ⇔ 𝑐) um eine Tautologie, Kontradiktion oder keines von beidem?
* Wozu dienen konjunktive und disjunktive Normalform (kurz: KNF und DNF)? Suche hierzu im Internet.
* In welcher Normalform ist der Ausdruck 𝑓(𝑎, 𝑏, 𝑐) = (𝑎 ∧ ¬𝑏 ∧ ¬𝑐) ∨ (𝑎 ∧ 𝑏 ∧ 𝑐) ∨ (𝑎 ∧ 𝑏 ∧ ¬𝑐) gegeben? Gib an, woran du die Normalform erkennst.

### Erweitert

* Gib eine mögliche Form eines KV-Diagrammes für 3 Variablen an.
* Gegeben ist die Funktion 𝑓(𝑎, 𝑏, 𝑐) = (¬𝑐 ⇒ 𝑏) ∧ (𝑎 ⇔ 𝑐). Erstelle eine Wahrheitstabelle.
* Erstelle die KNF und DNF von der vorherigen Frage.
* Zeichne ein KV-Diagramm für die vorherige Funktion und lies daraus die minimale DNF ab.

## Bewertung
Gruppengrösse: 1 Person
### Grundanforderungen **überwiegend erfüllt**
- [ ] Abgabe der Mitschrift über das Modul
- [ ] Richtige Modulorechnung durchgeführt und Wahrheitstabelle erstellt
- [ ] Ausgewählte Grundlegende Fragestellung beantworten können
- [ ] Abgabegespräch gemacht
### Grundanforderungen **zur Gänze erfüllt**
- [ ] Alle Fragestellungen beantwortet
- [ ] Keine Fehler bei Wahrheitstabellenerstellung
### Erweiterte Anforderungen überwiegend erfüllt
- [ ] DNF und KNF erstellen können
- [ ] Fragestellungen ausgearbeitet
### Erweiterte Anforderungen zur Gänze erfüllt
- [ ] minimale DNF mittels KV-Diagramm erstellen
- [ ] vollständige Ausarbeitung des Moduls

## Quellen
* "Microsoft Office Lens";  [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app/microsoft-office-lens-pdf-scan/id975925059)
* "Online PDF Editor"; zuletzt besucht 2021-08-06; [pdffiller](https://www.pdffiller.com/de/)
* "Variablenbelegungen von Wahrheitstabellen"; Alexander Poszvek; [online](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Variablenbelegung%20Wahrheitstabelle.mp4)
* "Verknüpfung von Aussagen"; Alexander Poszvek; [online](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Verkn%C3%BCpfung%20von%20Aussagen.mp4)
* "Wahrheitstabelle von einem logischen Ausdrück erstellen"; Alexander Poszvek; [online](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/2/Wahrheitstabelle%20erstellen.mp4)
* "Wahrheitstabellen.pdf"; Alexander Poszvek; [online](https://github.com/TGM-HIT/syt-exercises/blob/main/docs/grundlagenDerInformatik_/sem02_BoolescheAlgebra/Wahrheitstabellen.pdf)
* "Wahrheitstabellen_Lösungen.pdf"; Alexander Poszvek; [online](https://github.com/TGM-HIT/syt-exercises/blob/main/docs/grundlagenDerInformatik_/sem02_BoolscheAlgebra/Wahrheitstabellen_Lösung.pdf)
* "DNF - Disjunktive Normalform (EI)"; Alexander Poszvek; [online](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/3/DNF.mp4)
* "KNF - Konjunktive Normalform (EI)"; Alexander Poszvek; [online](https://elearning.tgm.ac.at/pluginfile.php/67773/mod_page/content/3/KNF.mp4)
* "Boolesche Algebra (KNF, DNF).pdf"; Kerstin Kollitsch; [online](https://github.com/TGM-HIT/syt-exercises/blob/main/docs/grundlagenDerInformatik_/sem02_BoolescheAlgebra/BoolscheAlgebra(KNF,DNF).pdf)

---
**Version** *20230131v1*
