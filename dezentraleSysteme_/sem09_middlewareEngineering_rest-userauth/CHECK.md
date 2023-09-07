# Middleware Engineering "Cloud-Datenmanagement" - Checkliste

## Bewertung
Gruppengrösse: 1 Person
### Grundlegende Anforderungen "überwiegend erfüllt"
- [ ] Welche grundlegenden Elemente müssen bei einer REST Schnittstelle zur Verfügung gestellt werden?
- [ ] Wie stehen diese mit den HTTP-Befehlen in Verbindung?
- [ ] Welche Datenbasis bietet sich für einen solchen Use-Case an?
- [ ] Welche Erfordernisse sollten hier bedacht werden?
- [ ] Verschiedene Frameworks bieten schnelle Umsetzungsmöglichkeiten, welche Eckpunkte müssen jedoch bei einer öffentlichen Bereitstellung von solchen Services beachtet werden?
- [ ] Dokumentation und Beschreibung der angewendeten Schnittstelle
- [ ] Aufsetzen einer Webservice-Schnittstelle
- [ ] ReST POST auf `/register` und `/login` funktionstüchtig

### Grundlegende Anforderungen "zur Gänze erfüllt"
- [ ] Registrierung von Benutzern mit entsprechender Persistierung über Email
- [ ] Login und Rückgabe einer Willkommensnachricht
- [ ] kein Plaintext Passwort verwenden

## Kommentare
* Commit-Message aussagekräftiger gestalten!
* Keine gesamten Listings ins README/Protokoll - besser eine Verlinkung und nur auf die wichtigen Aspekte hinweisen!
* Wo ist der Datastore definiert?
* requirements.txt überladen! Bitte nur notwendige Pakete installieren lassen!
* Curl Tests fehlen!
* Passwort wird nur mit hash gespeichert!?
* Passwort wird plaintext übertragen! Sicherungsmöglichkeit?
* salt fehlt
* email check fehlt / Regexp?
* Dokumentation stellenweise sehr oberflächlich
* Verwendete Umgebung ist nicht beschrieben
* Bilder bitte mit relativen Pfad einbinden (und auch commiten)
* `/register` und `/login` beachten, bitte an Vorgaben halten!
* Deployment-Beschreibung genauer definieren!
* Quellen fehlen bei der Dokumentation!
* Quellen nach IEEE referenzieren


### Erweiterte Anforderungen "überwiegend erfüllt"
- [ ] Welche Angriffsvektoren?
- [ ] funktionale Anforderung der Registrierung und des Logins von der Datenhaltung getrennt und abgesichert werden?
- [ ] Wie können die Eingabe und Übermittlung einfach und schnell sicherer gestaltet werden?
- [ ] Welche Services kommen hierzu verbreitet zum Einsatz?
- [ ] Umsetzung von erweiterten Sicherheitsrichtlinien

### Erweiterte Anforderungen "zur Gänze erfüllt"
- [ ] Überprüfung der funktionalen Anforderungen mittels Regressionstests

