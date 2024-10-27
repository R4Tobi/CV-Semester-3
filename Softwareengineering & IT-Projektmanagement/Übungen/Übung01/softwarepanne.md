# Übung 1 - Aufgabe 1

## Softwarepannen

Fehlerhaftes Windows-Update

### Einsatz und Verwendung der Software

- Treiber auf Kernel Ebene um Windows Systeme zu schützen (1)
- Verwendung auf jedem Windows-Rechner weltweit (1)
- Erkennung neuer Betrugsmasche und anderer Systemschwachstellen (2)
- KI und ML Algorithmus zur Gefahrenabwehr (3)

### Was ist passiert

- Windows Systeme scheiterten am hochfahren des Systems (1)
- Hochfahren endete immer in einem "Blue-Screen-Of-Death" -> Systeme endeten in einem "Recovery Boot Loop" (1)

### Ursache für das Problem

- Fehlerhaftes Update des Cyber-Sicherheit Anbieters CrowdStrike, welches Systeme komplett lahmlegte (1)
- Sensorinhalte, die den Falcon-Sensor des Unternehmens updaten. Dieser läuft auf Kernel-Ebene
- Das Verhalten des Sensors wird durch de Rapid-Response-Content aktualisiert um neue Betrugsmaschen o.ä. zu erkennen (2)
- Der Sensor empfing problematische Inhalte was zu einem nicht eingefangenen Out-Of:Bounds Fehler führte (2)
  - Sensor erwartete 20-Input Felder, bekam aber 21 (3)

### Folgen

- Sky News UK konnte nicht senden
- Flugverspätungen und Ausfälle bei Ryanair, Delta Airlines, United Airlines, American Airlines (1)
- Notrufzentralen in Alaska waren unerreichbar (1)
- Viele andere Unternehemen waren offline, IT Admins weltweit meldeten Probleme. (1)

### Wie hätte das Problem vermiden werden können

- Ausführliches testen der Software, um Fehler zu identifizieren und noch im Entwicklungsprozess zu beheben (1)
  - Tests seiten CrowdStrike und MIcrosoft hättten das Problem verhindern können (1)
- Kontrollieren von geschriebenen Code durch andere Mitarbeiter, um Fehler zu identifizieren, bevor Sie im Programm landen (1)
- CrowdStrike selbst möchte in ZUkunft auf lokale Entwicklertests, Rollback- und Stresstests und Stabilitätstests zurückgreifen, sowie Updates schrittweise ausrollen um Massenausfälle zu verhindern(2)

## Quellen

(1) Tom Warren, 19.07.2024 9.17 GMT +2, Major Windows BSOD issue hits banks, airlines, and TV broadcasters, veröffentlicht in "The Verge", URL: [https://www.theverge.com/2024/7/19/24201717/windows-bsod-crowdstrike-outage-issue], letzter Zugriff: 27.10.2024 10.20 MET

(2) Kay Nordenbrock, 24.07.2024, 15.49 MEST, Crowdstrike erklärt Update-Problem: Dieser Fehler führte zum Ausfall von 8,5 Millionen Windows-Rechnern, veröffentlicht in "t3n", URL: [https://t3n.de/news/crowdstrike-panne-ausfall-85-millionen-rechnern-1637309/], letzter Zugriff: 27.10.2024 10.46 MET

(3) CrowdStrike, 06.08.2024 21.19 UTC, Remediation and Guidance Hub: Channel File 291 Incident, veröffentlicht auf der Website von Crowdstrike, URL: [https://www.crowdstrike.com/falcon-content-update-remediation-and-guidance-hub/], letzter Zugriff: 27.10.2024 10.51 MET
