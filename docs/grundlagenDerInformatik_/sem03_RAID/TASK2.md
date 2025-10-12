---
hide:
  - navigation
---

# "*RAID*" - Taskdescription

## Einführung

Vor allem in Serveranwendungen, wo TB oder sogar PB an Daten anfallen, ist es nicht erwünscht mit einzelnen Festplatten hantieren zu müssen. RAID erlaubt es mehrere Festplatten zu einem Verbund zusammenzufügen und als Einheit zu verwenden. Außerdem ergeben sich noch weitere Besonderheiten.

## Ziele

- Die Funktionsweise und Unterschiede von elektronischen, magnetischen und optischen Speichern erklären

- Den Zweck und die Funktionsweise von RAID-Systemen verstehen

- Ein einfaches RAID-Szenario entwickeln und die Wiederherstellung nach einem Ausfall simulieren

## Kompetenzzuordnung

#### GK SYT3 Grundlagen der Informatik - RAID

* die Prinzipien der Elektronischen (Halbleiter), magnetischen und optischen Speichertechnologien erläutern sowie Backupspeicher (RAID) erklären

## Voraussetzungen

* *GK Speicher* abgeschlossen

## Detaillierte Aufgabenbeschreibung

Bitte versuche alle wichtigen Information kurz und prägnant in einem Grafiz zu verschriftlichen.

### Grundanforderungen

##### **Teil 1: RAID vs. Backup**

Erarbeite:

- Warum RAID kein Ersatz für Backups ist?

- Welche Risiken trotz RAID bestehen?

- Wie RAID und Backup zusammenarbeiten können?

##### Teil 2: Szenarienanalyse

Beantworten Sie für jedes Szenario:

- Ist RAID notwendig? Welcher RAID-Level ist geeignet?

- Welche Risiken bestehen?

- Welche Backup-Strategie sollte zusätzlich eingesetzt werden?

- Wie wird die Wiederherstellung nach einem Ausfall durchgeführt?

<u>Szenario 1: Medienagentur</u>

Eine Agentur speichert große Videodateien, die schnell verarbeitet werden müssen. Datensicherheit ist wichtig, aber Performance steht im Vordergrund.

<u>Szenario 2: Arztpraxis</u>

Patientendaten müssen sicher gespeichert werden. Zugriffsgeschwindigkeit ist weniger kritisch, aber Ausfallsicherheit ist essenziell.

<u>Szenario 3: Gaming-Server</u>

Ein Server hostet Multiplayer-Spiele. Performance ist wichtig, aber Datenverlust wäre nicht katastrophal.

<u>Szenario 4: Kleinunternehmen mit Cloud-Nutzung</u>

Ein kleines Unternehmen speichert Dokumente und Rechnungen hauptsächlich in der Cloud. Lokale Server dienen nur als Zwischenspeicher, und die Internetverbindung ist stabil.

<u>Szenario 5: Forschungslabor</u>

Ein Labor speichert täglich wachsende Messdaten, die langfristig archiviert werden müssen. Zugriffsgeschwindigkeit ist weniger wichtig als Datenintegrität und Speicherplatz.

##### **Teil 3: Konzept für ein ausfallsicheres System**

Du bist IT-Administrator eines mittelständischen Unternehmens, das sensible Kundendaten verarbeitet. Deine Aufgabe ist es, ein System zu entwerfen, das möglichst ausfallsicher ist und auch bei Hardwarefehlern, Stromausfällen oder Datenverlusten funktionsfähig bleibt.

Erarbeite:

- Welche Maßnahmen sind besonders wichtig für die Wiederherstellung nach einem Ausfall?

- Was wäre der „Worst Case“ – und wie würde dein System darauf reagieren?

- Welche Kompromisse musstest du eingehen (z. B. Kosten vs. Sicherheit)?

##### **Teil 4: RAID-Konfiguration mit dem Intel RAID BIOS Simulator**

Benutzeroberfläche eines RAID-Controllers kennenlernen und eine RAID-Konfiguration simulieren – ohne echte Hardware zu verwenden.

Voraussetzung: Intel RAID BIOS Simulator (Download und Installation) [RAID BIOS Simulator for Intel 12G Hardware RAID Systems - Stone Computers :: Knowledgebase](https://kb.stonegroup.co.uk/index.php?View=entry&EntryID=530)

- Wähle zwei oder mehr virtuelle Festplatten aus der Liste und weise sie verschiedenen RAID-Verbünden zu.

- Zeige Status, Kapazität und RAID-Level an.

- Welche erweiterten Konfigurationsmöglichkeiten gibt es?

##### Teil 5: Wiederherstellung

Simuliere ein RAID-Ausfallszenario.

Beschreibe den allgemeinen Ablauf einer Wiederherstellung nach einem Festplattenausfall.

Beispielfragen:

- Wie wird der Ausfall erkannt?

- Welche Anforderungen sind an die neue Festplatte zu richten?

##### Teil 6: Wiederherstellung

Recherchiere Alternativen zu RAID, die ebenfalls der Datensicherheit, Redundanz oder Performance-Steigerung dienen.

- ZFS (Zettabyte File System)

- Btrfs (B-tree File System)

- Cloud-Speicher mit Redundanz

- Software-Defined Storage (SDS)

- Hybridlösungen

- Weitere?

Erläutere die Funktion und Einsatzbereiche.

## Fragestellungen

### Grundlegend

Beantworte folgende Fragestellungen nachdem du folgendes PDF durchgearbeitet hast: "RAID"; Baun, C. (2017). Betriebssysteme kompakt (IT kompakt). Berlin, Heidelberg: Springer Berlin Heidelberg; [online](https://elearning.tgm.ac.at/pluginfile.php/11034/mod_folder/content/0/RAID.pdf)

- Was ist ein RAID?

- Welche Vorteile ergeben sich durch die Verwendung von RAID?

- Wo werden RAIDs verwendet?

- Was sind die Vor- und Nachteile von Hardware-, Host-, und Software-RAID?

- Was sind die RAID-Level? Welche gibt es?

- Auf welche Kriterien kann/sollte man die RAID-Level bewerten?

- Was sind die Vor- und Nachteile der einzelnen RAID-Level?

- Was ist *Paritätsinformation*?

- Welche Vorteile haben RAID-Kombinationen?

## Abgabe

Die durchgeführten Tätigkeiten und gewünschten Elemente müssen auf einem Grafiz zusammengefasst werden. Die Fragestellungen sollen mit Quellen ebenfalls in diesem Dokument bearbeitet werden.

Bei einem Abgabegespräch sind die laufende Umgebung sowie kurze Kontrollfragen zwecks Verständnisüberprüfung notwendig. Vor diesem Gespräch ist das Grafiz eingescannt als ein **PDF** File auf moodle abzugeben.

## Bewertung

Gruppengröße: 1 Person

### Grundanforderungen **überwiegend erfüllt**

- [ ] Erfolgreicher Abschluss des Moodle Tests

- [ ] Abgabe des Grafiz über Aufgaben- und Fragestellungen

### Grundanforderungen **zur Gänze erfüllt**

- [ ] Abgabegespräch über die Aufgaben- und Fragestellungen


## Quellen

* "RAID"; Baun, C. (2017). Betriebssysteme kompakt (IT kompakt). Berlin, Heidelberg: Springer Berlin Heidelberg; [online](https://elearning.tgm.ac.at/pluginfile.php/11034/mod_folder/content/0/RAID.pdf)

* "What is RAID 0, 1, 5, & 10?" PowerCert Animated Videos; youtube.com; zuletzt besucht am 2022-11-13; [online](https://www.youtube.com/watch?v=U-OCdTeZLac)

* "RAID SYSTEME einfach erklärt (Übersicht)" IT & Medien einfach erklärt; youtube.com; zuletzt besucht am 2022-11-13; [online](https://www.youtube.com/watch?v=1YoQ-T0wMfE)

* "NAS Server Kaufberatung 2022 | QNAP vs. Synology | Welche NAS für Zuhause?" Pörtner - digitaler Kreativkopf; youtube.com; zuletzt besucht am 2022-11-13; [online](https://www.youtube.com/watch?v=BlYEp1q73FM)

* "Backing Up Your Life is THIS Easy" Linus Tech Tips; youtube.com; zuletzt besucht am 2022-11-13; [online](https://www.youtube.com/watch?v=mpxBmxj5mP0)

---

### Videos

??? note

    <div>
      <div style="position:relative;padding-top:56.25%;">
        <iframe src="https://www.youtube.com/embed/1YoQ-T0wMfE" frameborder="0" allowfullscreen
          style="position:absolute;top:0;left:0;width:100%;height:100%;"></iframe>
      </div>
    </div>


---

**Version** *20251012v1*
