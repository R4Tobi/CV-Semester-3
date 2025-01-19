# Blatt 9 - Anti Pattern

## Aufgabe 1 - Was ist ein Anti-Pattern

Beschreibt ein Verhaltensmuster das meist schädlich für den Erfolg eines Projektes ist.
Sie bilden das Gegenstück zu design Patterns, die meist gute und bewährte Ansätze zur Problemlösung bieten.
Anti-Patterns erscheinen auf den ersten Blick sehr Effektiv, für den Verlauf eines Projekts bedeuten sie aber meist mehr negative als positive Konsequenzen.

## Aufabe 2

"Code Metriken" sind quantitative Maße um Quellcode zu bewerten.
Sie dienen dazu die Qualität, Warbarkeit und Effizienz des Codes zu verbessern.
Solche Metriken sind z.B. Zeilenanzahl, Zyklomatische Komplexität und die Abstraktheit.
Mithilfe von Code-Metriken können ANto-Pattern im Code erkannt und anschließen behoben werden.
hohe zyklomatische Komplexität könnte auf zu schweren, unverständlichen Code zurückzuführen sein.

## Aufgabe 3

**God-Object-Anti-Pattern / The Blob**: SokobanGUIManager besitzt Verantworung für alle Unterklassen

Nachteile:

- Schreckliches Testing
  - Komplexe Tests, die Wieder Fehleranfällig sind
- Verlust der Modularität
  - Wiederverwendbarkeit wird eingeschränkt, weil Viele Klassen an die Hauptklasse gebunden sind
- Skalierungsprobleme
  - Die Hauptklasse wird immer KOmplexer, weil Funktionen zentral zusammanlaufen, anstatt sie Saubewr auf neue/andere Komponenten aufzuteilen

Verbesserungsvorschläge

- Aufteilung der Verantwortung in kleinere Klassen
- Implementierungen wie Mediator oder Observer
