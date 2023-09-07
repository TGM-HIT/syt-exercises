## Einführung

Diese Übung soll die Verwendung von Namensdiensten in JAVA und auf OS-Ebene (Linux) vertiefen.

## 1.1 Ziele

Das Ziel dieser Übung ist die Funktionsweise eines Namens/Verzeichnisdienstes zu verstehen und Erfahrungen mit der Administration zu sammeln.  
Ebenso soll die Verwendung des Dienstes aus einer Anwendung heraus mit Hilfe der JNDI geübt werden und auch ein CLI zur Administration angewendet werden.

## 1.2 Voraussetzungen

* Grundlagen Namensdienst/Verzeichnisdienst
* Administration eines LDAP Dienstes
* Verwendung von Commandline Werkzeugen fuer LDAP (LDAPSEARCH)
* Grundlagen der JNDI API für eine JAVA Implementierung
* Verwendung einer virtuellen Instanz für den Betrieb des Verzeichnisdienstes

## 1.3 Aufgabenstellung

Der Verzeichnisdienst aus der SYT Übung soll um folgende Eintraege erweitert werden.  
Das verwendete Namensschema (eg. group.service1 oder vorname.nachname) soll fuer alle Eintraege verwendet werden.

* 2 Posix Groups (beliebe Zuweisung von UserIDs)
* 5 User Accounts


Mit Hilfe des LINUX CLI "LDAPSEARCH" sollen 3 Suchanfragen durchgefuehrt und das Ergebnis dokumentiert werden. Hier ein Beispiel dazu: 

```
ldapsearch -h 192.168.0.8 -p 389  
  -D "cn=max.mustermann,dc=nodomain,dc=com" -W  
  -b "cn=group.service2,dc=nodomain,dc=com" memberUid
````

Weiters soll eine Java-Applikationen zur Anbindung an das LDAP-Verzeichnis entwickelt werden.  

Folgende Fragestellungen stehen dabei im Mittelpunkt:
* Gibt es einen Eintrag mit dem DN: cn=max.mustermann,dc=nodomain,dc=com
* Wie lautet der GivenName dieses Eintrages?
* Implementieren Sie eine Authentisierung Anfrage (bind) an das LDAP-Verzeichnis und protokollieren Sie das Ergebnis.


Gruppengrösse: 1 Person

Bewertung: 8 Punkte
- Dokumentation der einzelnen Arbeitsschritte im Protokoll (1 Punkte)
- Anlegen von 2 Gruppen und 5 User Accounts (1 Punkte)
- Dokumentation von 3 LDAPSEARCH Befehlen (2 Punkte)
- JNDI Implementierung (4 Punkte)

## 1.4 Bewertung  

 *   Gruppengrösse: 1 Person  
 *   Anforderungen **"überwiegend erfüllt"**
	 *   Dokumentation der einzelnen Arbeitsschritte im Protokoll 
	 *   Anlegen von 2 Gruppen und 5 User Accounts
	 *   Dokumentation von 3 LDAPSEARCH Befehlen

 *   Anforderungen **"zur Gänze erfüllt"**
	 *   JNDI Implementierung

## 1.5 Fragestellung für Protokoll

*   ...

## 1.6 Links & Dokumente

*   https://docs.oracle.com/javase/tutorial/jndi/ldap/ldap.html  
*   https://spring.io/guides/gs/authenticating-ldap  
*   https://docs.spring.io/spring-ldap/docs/current/reference  
*   https://www.baeldung.com/spring-data-ldap   

 
