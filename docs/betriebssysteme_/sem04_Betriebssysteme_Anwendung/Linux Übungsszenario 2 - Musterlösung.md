# Musterlösung: Linux Command Line Basics (Szenario 2 – Log-Auswertung)

## Aufgabe 1 – Verzeichnis & Dateien (2 Punkte)

```bash
cd ~
mkdir htl_log_analysis
cd htl_log_analysis
touch access.log error.log summary.txt "backup data.log"
```

**Erklärung:**
- `cd ~` wechselt ins Home-Verzeichnis, `mkdir` legt das Arbeitsverzeichnis an.
- `touch` erstellt mehrere leere Dateien in einem Befehl.
- `"backup data.log"` enthält ein Leerzeichen und muss deshalb gequotet werden, damit die Shell es als **einen** Dateinamen und nicht als zwei separate Argumente (`backup` und `data.log`) interpretiert.

---

## Aufgabe 2 – Testdaten erzeugen (2 Punkte)

```bash
echo -e "user1 OK\nuser2 ERROR\nadmin OK\nguest ERROR\n$(whoami) OK" >> access.log
```

**Erklärung:**
- `echo -e` interpretiert `\n` als Zeilenumbruch, wodurch mehrere Zeilen mit einem einzigen Befehl geschrieben werden.
- `$(whoami)` ist Command Substitution: Der Befehl `whoami` wird ausgeführt und sein Ergebnis (der aktuelle Benutzername) direkt in den Text eingesetzt.
- `>>` statt `>` wird verwendet, um an die Datei anzuhängen, falls sie bereits Inhalt hat (bzw. `>` beim ersten Schreiben, falls die Datei noch leer ist – beides ist hier gültig, da die Datei zuvor leer war).

---

## Aufgabe 3 – Filtern (1 Punkt)

```bash
grep ERROR access.log | sort > error.log
```

**Erklärung:**
- `grep ERROR access.log` filtert nur Zeilen, die den Text `ERROR` enthalten.
- Das Ergebnis wird per Pipe an `sort` weitergereicht, das die Zeilen alphabetisch sortiert.
- `>` schreibt (überschreibt) das sortierte Ergebnis in `error.log`.

---

## Aufgabe 4 – Auswerten (1 Punkt)

```bash
count=$(grep -c ERROR access.log)
echo "Gefundene Fehler: $count"
```

**Erklärung:**
- `grep -c ERROR access.log` zählt direkt die Anzahl der Zeilen mit `ERROR` (alternativ: `wc -l < error.log`, falls man auf die bereits gefilterte Datei zugreift).
- Mittels Command Substitution `$(...)` wird das Ergebnis in die Variable `count` geschrieben.
- `echo "Gefundene Fehler: $count"` gibt das Ergebnis im geforderten Format aus.

---

## Aufgabe 5 – Erweiterte Analyse (2 Punkte)

```bash
less error.log
```
(Seitenweise Anzeige, mit `q` beenden.)

```bash
nl error.log
```
(Zeigt den Inhalt mit Zeilennummern.)

```bash
head -n 1 error.log
```
(Zeigt nur die erste Zeile der Datei.)

**Erklärung:**
- `less` ermöglicht scrollbares, seitenweises Anzeigen langer Dateien.
- `nl` nummeriert jede Zeile fortlaufend – nützlich zur Referenzierung einzelner Log-Einträge.
- `head -n 1` gibt exakt die erste Zeile aus (Standard bei `head` ohne `-n` wären die ersten 10 Zeilen).

---

## Aufgabe 6 – Verständnisfragen (2 Punkte)

### Frage 1 – Effizienz von Shell-Befehlen

Der gezeigte Ablauf

```bash
cat access.log > temp.txt
grep ERROR temp.txt > result.txt
sort result.txt > sorted.txt
wc -l sorted.txt
```

ist ineffizient, weil bei jedem Schritt eine neue Datei auf die Festplatte geschrieben und beim nächsten Schritt wieder gelesen wird, obwohl nur ein einziges Endergebnis benötigt wird.

- **Unnötige Zwischendateien:** `temp.txt`, `result.txt` und `sorted.txt` haben keinen eigenständigen Nutzen, sie dienen nur als Zwischenspeicher und müssten am Ende aufgeräumt (gelöscht) werden.
- **Performance & Übersichtlichkeit:** Jeder Schreib-/Lesevorgang auf die Festplatte kostet Zeit (I/O-Overhead), besonders bei großen Dateien. Zudem ist der Ablauf über vier Zeilen mit drei Dateinamen weniger übersichtlich als ein einzelner kombinierter Befehl.
- **Vorteil des direkten Datenstroms:** Mit Pipes wird die Ausgabe eines Befehls direkt (im Arbeitsspeicher, als Datenstrom) an den nächsten Befehl übergeben, ohne Umweg über die Festplatte:

```bash
cat access.log | grep ERROR | sort | wc -l
```

Das ist kürzer, schneller und erzeugt keinen "Dateimüll".

### Frage 2 – Variablen

Variablen sind in der Bash hilfreich, weil:

- **Wiederverwendbarkeit:** Ein Wert (z. B. ein Dateiname, Pfad oder Projektname) muss nur einmal definiert werden und kann danach beliebig oft im Skript/Workflow verwendet werden. Ändert sich der Wert, muss er nur an einer Stelle angepasst werden statt an jeder Verwendung im Befehl.
- **Vorteil bei langen/komplexen Dateinamen:** Statt einen langen oder mit Leerzeichen versehenen Dateinamen (z. B. `"backup data.log"`) jedes Mal auszuschreiben und korrekt zu quoten, kann er einer kurzen Variable zugewiesen werden (z. B. `LOGFILE="backup data.log"`). Danach genügt `"$LOGFILE"`, was Tippfehler reduziert und den Code lesbarer macht.

---

## Zusammenfassung typischer Fehler (aus dem Angebot vermieden)

| Fehler | Lösung in dieser Musterlösung |
|---|---|
| Quotes bei Dateien mit Leerzeichen vergessen | `"backup data.log"` konsequent gequotet |
| `grep` ohne korrektes Pattern | `grep ERROR access.log` bzw. `grep -c ERROR` gezielt eingesetzt |
| Unnötige Zwischendateien statt Pipes | `grep \| sort` als direkter Datenstrom (Aufgabe 3, Frage 1) |
| Überschreiben von Dateien durch `>` | `>>` zum Anhängen (Aufgabe 2), `>` bewusst nur für neue Zieldateien |
