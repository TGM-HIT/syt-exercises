# Exercises for **Systemtechnik**
Hier sind die Beispiele der Übungen aus allen Jahrgängen implementiert.
Um die einzelnen Verzeichnisse im Classroom einsetzen zu können, muss das entsprechende Verzeichnis als eigenes Repository angelegt werden und die Beispielimplementierung auf das Notwendigste reduziert werden. Als Beispiel hierfür ist meist ein src-INIT Verzeichnis dem jeweiligen Beispiel beigefügt (siehe [src-INIT](test-driven-development/src-INIT)).  

## Angabenübersicht
Die jeweiligen Semester haben eine eigene Übersicht der Beispiele (siehe z.B. [Semester10](semester10/README.md)). Diese enthält eine kurze Beschreibung und den Link auf die jeweilige Angabe. Dafür einfach in das gewünschte Semester wechseln und dort nach den entsprechenden Beispielen suchen.

## Initialisierung von neuen Projekten
### Python
Durch das Kopieren des Template-Directories erhällt man alle wichtigen Konfigurationen und Einstellungen für eine neue Aufgabenstellung. Das [setup.py](templates/python/setup.py) muss dabei an die neuen Informationen angepasst werden.  
Die Tox Umgebung ist grundsätzlich so definiert, dass alle Source-Files nach Sphinx-Dokumentationen durchsucht und im docs Ordner als html-Output erstellt werden. Bei zusätzlichen Abhängigkeiten müssten entsprechend neue Test-Environments erstellt werden (siehe z.B. die Qt5 Dependencies in der [tox.ini](floating-points/tox.ini) der Floating-Points Aufgabenstellung).  

### Java
Durch das Kopieren des Template-Directories erhällt man alle wichtigen Konfigurationen und Einstellungen für eine neue Aufgabenstellung. Das [setup.py](templates/java/build.gradle) muss dabei an die neuen Informationen angepasst werden.  

## Quellen
+ [LaTeX template](https://github.com/TGM-HIT/latex-protocol)
+ [Tox tricks and patterns](https://blog.ionelmc.ro/2015/04/14/tox-tricks-and-patterns/)
+ [Packaging Python Projects](https://packaging.python.org/tutorials/packaging-projects/)
+ [The Hitchhiker’s Guide to Packaging](https://the-hitchhikers-guide-to-packaging.readthedocs.io/en/latest/quickstart.html)
+ [Writing the Setup Script](https://docs.python.org/3/distutils/setupscript.html)
