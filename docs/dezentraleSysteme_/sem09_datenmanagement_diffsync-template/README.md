# Differentialsynchronisation mit diffsync

Jeweils `client` und `server` sind mit node.js/npm konfiguriert. Vorraussetzung für diese Aufgabe ist Node.js 6 oder höher.

Um alle Abhängigkeiten zu installieren muss `npm install` auf dem jeweiligen Subprojekt ausgeführt werden.

* `server` - Beinhaltet den diffsync-server. Kann mit `npm start` gestartet werden.
* `client` - Beinhaltet den diffsync-client. Die HTML-Website ist in `dist/index.html` vorzufinden. Damit NPM-Packages mit dem Webbrowser funktionieren wurde `webpack` verwendet. Um index.html aufzurufen müssen die JavaScript-Dateien im `src`-Ordner vom webpack transpiliert werden. Dazu muss `npm start` ausgeführt werden. Danach kann man die Website `dist/index.html` aufrufen.

## Testen
* Sicherstellen das bei beiden Subprojekten `npm install` aufgerufen wurde
* Konsole öffnen und im Ordner `server` `npm start` ausführen.
* Eine weitere Konsole öffnen und im Ornder `client` `npm start` ausführen. Warten bis das Transpilieren fertig ist.
* `dist/index.html` aufrufen und die Browser-Konsole öffnen. 
* Konsole sollte nun `starting sync service` und `Verbunden!` anzeigen.

## Aufgabe
Baue auf `client` auf und implementiere die Synchronisation vom Formular. Bei Textveränderung bei einer der Textboxen soll die Synchronisation durchgeführt werden. Teste die Implementation in dem die Website zweimal geöffnet wird.

### Weitere Resourcen

* [diffsync](https://github.com/janmonschke/diffsync)
* [EventTarget.addEventListener](https://developer.mozilla.org/de/docs/Web/API/EventTarget/addEventListener)