# Aufgabe - Testing Grundlagen

## Testarten

1. dynamische Tests
    - Fehler über dynamische Laufzeitparameter:
      - falsche Nutzereingaben
      - variierende Eingabeparameter
      - Laufzeitumgebung
2. statische Tests
    - Prüfung von Code ohne Auführung
    - Einhaltung von Coing-Conventions
    - Code-Analyse und Review
3. Debugging
    - Fehler im Programm (statisch oder dynamisch) diagnostizieren und beheben
    - Fehleranalyse durch
      - print-Debugging
      - Datenflussdiagramme
      - Unittests
      - Analyse von Speicherdumps (RAM)
4. Standards, Normen und Erfahrung

## Testphasen im V-Modell

1. Unit Test
    - testen einzelner Komponenten
    - Quelle des Fehlers kann klar ermittelt werden
    - systematisches Testen
2. Integration Test
    - "Big Bang" unter allen Phasen
    - Testen von Kommunikation zwischen den Komponenten
    - Komponenten werden in Subsysteme integriert
3. Systemtest
    - Testen aus Nutzersicht
    - Ess ind nocch nicht alle Features implmentiert
4. Akzeptanztest
    - Sicht und Meinung des Kunden
    - Implemetierungstest beim Kunden
    - Kunde wird mit eingebunden
