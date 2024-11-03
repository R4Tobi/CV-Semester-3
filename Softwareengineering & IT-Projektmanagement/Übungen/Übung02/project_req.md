# Übung 2 - Aufgabe 4

## Anforderungen

- Funktional
  - geignete Datenstruktur für Funktionen
  - umsetzung des Tokenizer (Base64?)
  - Berechnung der Auf und Ableitungen
- nicht-Funktional
  - Ästethik der Darstellung
  - Benutzerfreundlichkeit

## Use Case

| **Use-Case-Name**       | Funktion zum Plotten einer Funktion mit Extrema, Nullstellen und Ableitungen |
|-------------------------|---------------------------------------------------------------------------|
| **Akteur**              | Benutzer (z. B. ein Informatik-Student)                                   |
| **Ziel**                | Der Benutzer möchte eine mathematische Funktion im gegebenen Intervall plotten und automatisch Werte wie Extrema, Nullstellen sowie die Ableitungen anzeigen lassen. |
| **Voraussetzungen**     | Der Benutzer hat JPlotSE geöffnet und eine gültige Funktion sowie einen Intervallbereich eingegeben. |
| **Ereignisauslöser**    | Der Benutzer klickt auf "Plotten" oder bestätigt seine Eingabe.           |
| **Beschreibung**        | 1. Der Benutzer gibt eine mathematische Funktion (z. B. `f(x) = x^3 - 4x`) und ein Intervall (z. B. `[-10, 10]`) ein.<br> 2. Der Benutzer wählt optional aus, ob Extrema, Nullstellen und/oder Ableitungen angezeigt werden sollen.<br> 3. Der Benutzer klickt auf "Plotten".<br> 4. JPlotSE berechnet die Werte im angegebenen Intervall.<br> 5. JPlotSE zeigt den Plot der Funktion an und hebt die Extrema und Nullstellen hervor.<br> 6. Optional: Die Ableitungen (erste und/oder zweite) werden ebenfalls geplottet. |
| **Ergebnis**            | Der Benutzer sieht den Plot der Funktion im angegebenen Bereich mit hervorgehobenen Extrema, Nullstellen und (falls ausgewählt) Ableitungen. |
| **Fehlerfälle**         | 1. Ungültige Funktionseingabe: Der Benutzer erhält eine Fehlermeldung.<br> 2. Ungültiger Intervallbereich: Der Benutzer wird aufgefordert, einen korrekten Bereich einzugeben.<br> 3. Keine Nullstellen oder Extrema im Bereich: Eine Meldung informiert den Benutzer, dass keine gefunden wurden. |
