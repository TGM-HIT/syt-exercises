---
hide:
  - navigation
---

# "LLM Tools Anwendung" - Taskdescription

## Einführung

LLMs (Large Language Models) können beim Programmieren, Recherchieren und Dokumentieren helfen. In dieser Aufgabe lernst du drei Tool-Kategorien kennen:

1. ein Cloud-basiertes Entwickler-Tool (GitHub Copilot CLI)
2. ein lokales LLM-Setup (Ollama, Open WebUI, Opencode)
3. das Konzept "MCP" (Model Context Protocol), um Tools/Quellen strukturiert an ein LLM anzubinden

Wichtig: Du sollst die Tools nicht nur „klicken“, sondern ihre Grenzen (Halluzinationen, Kontextfenster, Tokens, Temperature) bewusst beobachten und dokumentieren.

## Ziele

- GitHub Copilot CLI installieren und sinnvoll einsetzen (inkl. Beispiele mit Skills und Slash Commands)
- Ein lokales LLM mit Ollama betreiben und über Open WebUI benutzen
- Grundidee von MCP verstehen und ein minimales MCP-Beispiel nachvollziehen
- Zentrale Begriffe aus der Theorie anhand eigener Beobachtungen erklären

## Kompetenzzuordnung

#### SYT4 Betriebssysteme - Anwendung

- Bedienung von Betriebssystemen - einfache Befehle mit den wichtigsten Optionen verwenden sowie Berechtigungen auf Dateisystemebene erklären und administrieren
- Werkzeuge installieren, konfigurieren und mit Terminal-Befehlen sicher bedienen

## Voraussetzungen

- [Github Account](https://github.com/)
- [Markdown Kenntnisse](https://docs.github.com/de/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)

## Detaillierte Aufgabenbeschreibung

Bitte versuche alle wichtigen Informationen kurz und prägnant in einer Dokumentation zu verschriftlichen.

### Theorie

Siehe dir [Effektive Prompting](Effektive-Prompting.md) an.

#### Fragestellungen

1. **AGI vs. LLM (narrow AI)**

   Welche deiner Aufgaben wirkten „allgemein intelligent“, welche eher wie Muster-Vervollständigung?

1. **System Prompt**

   Was ist ein System Prompt? Wo „spürst“ du ihn (z.B. Regeln/Sicherheitsgrenzen/Format)?

1. **Token**

   Was sind Tokens grob? Warum ist Token-Länge für Kosten/Performance/Limit wichtig?

1. **Context Window**

   Gib ein Beispiel, wann ein Modell Kontext „vergisst“ oder nicht mehr alles berücksichtigen kann.

1. **Memory**

   Was ist der Unterschied zwischen „Chatverlauf im Kontext“ und „persistenter Memory“?

1. **Zero-shot vs. Few-shot**

   Formuliere 1 Zero-shot Prompt und 1 Few-shot Prompt zur selben Mini-Aufgabe .

1. **Hallucination**

   Zeige 1 Beispiel aus deinen Experimenten, wo die Antwort plausibel klang, aber unsicher/falsch war. Wie hast du das erkannt?

1. **Jailbreaking**

   Was bedeutet Jailbreaking? Warum ist es in der Praxis problematisch? Teste das Jailbreaking-Game auf https://gandalf.lakera.ai.

## Aufgaben

### Student Account & Github Copilot activation

TODO

### Übung 1: GitHub Copilot CLI

#### Installation

##### Windows: WinGet

```powershell
winget install GitHub.Copilot
```

##### macOS & Linux: Homebrew

```bash
brew install copilot-cli
```

#### Authentifizierung

Beim ersten Start wirst du, falls du noch nicht eingeloggt bist, dazu aufgefordert den Slash-Command `/login` auszuführen und den Anweisungen zu folgen.

#### Check

```bash
copilot --help
```

#### Anwendung Wochenendplaner

```bash
git clone https://github.com/dominikhoebert/wochenendplaner-prompt
cd wochenendplaner-prompt
copilot
"Plane das Wochenende für mich"
```

### Übung 2: Local LLM

```bash
git clone https://github.com/dominikhoebert/docker-projects
cd docker-projects/ollama-openwebui
docker-compose up -d
```

### Übung 3: Open WebUI

- Öffne Weboberfläche unter: [http://localhost:3000](http://localhost:3000)

- Admin User erstellen (Email muss nicht echt sein zb. `admin@tgm.at`)

Verfügbare [Ollama Modelle](https://ollama.com/search) (Immer die Größe mit RAM/VRAM vergleichen)

Installieren über

Open-WebUI: Neuer Chat → Model → `llama3.2` von Ollama.com beziehen

### Übung 4: Opencode

```bash
npm install -g opencode-ai
```

Verschiebe [opencode.json](opencode.json) nach `~/.config/opencode/opencode.json`

```bash
opencode
/models
ollama3.2
```

Da in dieser config schon der MCP mit konfiguriert ist, fragt Notion nach der Berechtigung.

### Übung 5: MCP (Model Context Protocol)

#### Opencode

Sollte bei opencode.json schon konfiguriert sein.

#### Open-WebUI

Benutzername unten links → Administration → Einstellungen → Externe Werkzeuge → `+`→ Importieren [openweb.json](openweb.json)

Tool muss in Chat aktiviert werden!

#### Copilot CLI

```bash
copilot
/mcp add
```

Server Name: `Notion`
Server Type: `Local`
Command: `npx -y mcp-remote https://mcp.notion.com/mcp`

`Ctrl+S`

### Tool-Reflexion

11. GitHub Copilot CLI vs. lokales LLM: Wo liegen Stärken/Schwächen (Qualität, Datenschutz, Geschwindigkeit, Kosten, Offline)?
12. Welche Aufgaben würdest du _nie_ einem LLM geben (z.B. Passwörter, personenbezogene Daten, Prüfungsfragen), und warum?
13. MCP: Warum ist „Tools anbinden“ besser als „alles in den Prompt kopieren“?

## Abgabe

Die durchgeführten Tätigkeiten und gewünschten Elemente müssen in einer Dokumentation zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Vor diesem Gespräch ist die Dokumentation als ein **PDF** File auf moodle abzugeben. (Microsoft Office Lens [Android](https://play.google.com/store/apps/details?id=com.microsoft.office.officelens&hl=de_AT&gl=US), [iPhone](https://apps.apple.com/at/app=microsoft-office-lens-pdf-scan/id975925059); Online PDF Editor [pdffiller](https://www.pdffiller.com/de/))

## Bewertung

Gruppengröße: 1 Person

## [Disclaimer](https://tgm-hit.github.io/syt-exercises/ki-disclaimer/)

🤖 Diese Aufgabe wurde mit Hilfe von KI generiert.

## Quellen

- [LLM Begriffe](Theorie.md); Dominik Höbert; 2026-01-03
- [LLM Tools](Links.md); Dominik Höbert; 2026-01-03
- GitHub CLI: https://cli.github.com/
- GitHub Copilot CLI Extension: https://github.com/github/gh-copilot
- Ollama: https://ollama.com/
- Open WebUI: https://github.com/open-webui/open-webui
- MCP (Model Context Protocol): https://modelcontextprotocol.io/
- Jailbreak Baseline: https://gandalf.lakera.ai/baseline

---

**Version** _20260105v1_
