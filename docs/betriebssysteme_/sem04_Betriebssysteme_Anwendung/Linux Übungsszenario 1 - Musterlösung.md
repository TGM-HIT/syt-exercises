# Musterlösung: Linux Command Line Basics (Szenario 1)

## Aufgabe 1 – Vorbereitung & Struktur (2 Punkte)

```bash
cd ~
mkdir htl_shell_training
cd htl_shell_training
touch users.txt commands.log report.txt "temp data.txt"
```

**Erklärung:**
- `cd ~` wechselt ins Home-Verzeichnis.
- `mkdir` legt das Verzeichnis an, `cd` wechselt hinein.
- `touch` kann mehrere Dateien gleichzeitig anlegen.
- Der Dateiname `temp data.txt` enthält ein Leerzeichen und **muss** deshalb in Anführungszeichen gesetzt werden (`"temp data.txt"`), sonst interpretiert die Shell `temp` und `data.txt` als zwei separate Argumente (= zwei Dateien).

---

## Aufgabe 2 – Variablen gezielt einsetzen (2 Punkte)

```bash
PROJECT="Linux Shell Basics HTL"
OUTFILE="final report.txt"

echo -e "$PROJECT\n$(pwd)" > "$OUTFILE"
```

**Erklärung:**
- Variablenzuweisungen erfolgen ohne Leerzeichen um das `=`. Da die Werte selbst Leerzeichen enthalten, müssen sie in Double Quotes gesetzt werden.
- `$(pwd)` ist eine **Command Substitution**: Der Befehl `pwd` wird ausgeführt und sein Ergebnis (das aktuelle Verzeichnis) an dieser Stelle eingesetzt.
- `echo -e` interpretiert `\n` als Zeilenumbruch, wodurch `$PROJECT` und das Arbeitsverzeichnis in zwei Zeilen geschrieben werden.
- `"$OUTFILE"` muss gequotet werden, da der Dateiname (`final report.txt`) ein Leerzeichen enthält – sonst würde `>` das erste Wort (`final`) als Zieldatei interpretieren und `report.txt` als zusätzliches (fehlerhaftes) Argument an `echo` übergeben.

---

## Aufgabe 3 – Pipes & Filter (2 Punkte)

```bash
ls | grep '\.txt$' | sort > txt_files.txt

count=$(wc -l < txt_files.txt)
echo "Anzahl TXT-Dateien: $count"
```

**Erklärung:**
- `ls` listet den Verzeichnisinhalt, per Pipe (`|`) an `grep` weitergereicht.
- `grep '\.txt$'` filtert nur Zeilen, die exakt auf `.txt` enden (der Punkt wird escaped, `$` steht für Zeilenende – nicht zu verwechseln mit der Variablenauswertung).
- `sort` sortiert die gefilterte Liste alphabetisch, das Ergebnis wird via `>` in `txt_files.txt` geschrieben.
- `wc -l < txt_files.txt` zählt die Zeilen der Datei (die `<` Umleitung vermeidet, dass der Dateiname mit ausgegeben wird).
- Mit Command Substitution `$(...)` wird das Ergebnis in der `count`-Variable gespeichert und anschließend formatiert ausgegeben.

---

## Aufgabe 4 – Analyse & Anzeige (2 Punkte)

```bash
less txt_files.txt
```
(Mit `q` wieder verlassen.)

```bash
grep report txt_files.txt
```

**Erklärung:**
- `less` zeigt Dateien seitenweise an (scrollbar, mit `q` beendbar) – im Gegensatz zu `cat`, das alles auf einmal ausgibt.
- `grep report txt_files.txt` durchsucht die Datei direkt nach Zeilen, die das Wort `report` enthalten. Da die Eingabe direkt aus einer Datei kommt, ist keine Pipe nötig.

---

## Aufgabe 5 – Verständnisfragen (2 Punkte)

### Verständnisfrage 1 – Pipes und Workflow-Denken

Pipes (`|`) verbinden die Standardausgabe eines Befehls direkt mit der Standardeingabe des nächsten, ohne dass Zwischenergebnisse auf der Festplatte gespeichert werden müssen. Vorteile gegenüber temporären Dateien:

1. **Effizienz/Performance:** Daten werden im Arbeitsspeicher weitergereicht statt auf die Festplatte geschrieben und wieder gelesen zu werden – das spart I/O-Operationen und ist schneller.
2. **Übersichtlichkeit & Wartbarkeit:** Ein Pipe-Befehl ist als ein zusammenhängender Workflow lesbar, statt mehrerer Einzelschritte mit vielen Zwischendateien, die man am Ende wieder aufräumen müsste.
3. **Keine Namenskollisionen/Datenmüll:** Es entstehen keine überflüssigen Dateien (`temp.txt`, `result.txt` etc.), die versehentlich überschrieben werden oder Speicherplatz belegen können.

### Verständnisfrage 2 – Quoting und Variablenersetzung

- **Single Quotes (`'...'`):** Alles innerhalb wird **wörtlich** (literal) behandelt. Variablen werden **nicht** ausgewertet (`'$PROJECT'` bleibt der Text `$PROJECT`), und Leerzeichen im eingeschlossenen String werden als ein zusammenhängendes Argument behandelt.
- **Double Quotes (`"..."`):** Leerzeichen werden ebenfalls als ein Argument geschützt (wichtig z. B. bei Dateinamen mit Leerzeichen wie `"temp data.txt"`), aber Variablen und Command Substitutions **werden ausgewertet** (`"$PROJECT"` wird zu `Linux Shell Basics HTL`, `"$(pwd)"` zum aktuellen Pfad).
- **Praktische Konsequenz:** Für Dateinamen mit Leerzeichen sind beide Quote-Arten geeignet, solange keine Variable expandiert werden soll; sobald aber Variableninhalte eingesetzt werden sollen, müssen zwingend Double Quotes verwendet werden.

---

## Zusammenfassung typischer Fehler (aus dem Angebot vermieden)

| Fehler | Lösung in dieser Musterlösung |
|---|---|
| Leerzeichen ohne Quotes | `"temp data.txt"`, `"$OUTFILE"` konsequent gequotet |
| Variablen ohne `$` | `$PROJECT`, `$(pwd)`, `$count` korrekt referenziert |
| Einzelbefehle statt Pipes | `ls \| grep \| sort` als ein Workflow |
| Falsche Weiterleitung/Überschreiben | `>` gezielt nur für neue Zieldateien verwendet |
