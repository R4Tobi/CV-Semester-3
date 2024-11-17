# Blatt 3 - Aufgabe 1

Versionskontrolle - Theorie

## Aufgabe 1 Versionsverwaltung

- Möglichkeit zum Rollback
- Struktur im Projekt
- Code Validierung und testen vor einem release

## Aufgabe 2 - Git und SVN

SVN ist im Gegensatz zu git eine zentrale Versionsverwaltung auf einem Server.
Versionierung erfolgt auf dem Server, d.h. Änderungen werden an einem Repository 
auf dem Server vorgenommen. Bei git bekommt jede Entwicklungsumgebung das gesamte Repository. Alle Entwickler arbeiten unabhängig von einander, an eigenen Branches. Änderugen werden lokal vorgenommen und schließlich "committed". Es gibt also nie eine zentralisierte Kopie aller Änderungen.

## Git Befehle

1. `git init`
2. `git clone <repo-url>`
3. `git add .` und `git commit -m "Commit Beschreibung"`
4. `git push origin main`
5. `git pull origin main`
6. `git checkout -b other`
7. `git checkout main` und `git merge other`
8. `git add <new_file>`
9. `git status`
