# Blatt 9 - Continious Integration

## Was ist Continuous Integration

- Codeänderungen werden i ein zentrales Repository gepusht
- Jede Codeänderung wird automatisch getestet und gebaut
- schnelles Feedback zu Codequalität und Stabilität

## Erkläre den Unterschied zwischen “Continuous Delivery” und “Continuous Deployment”

|                 | Continuous Delivery                  | Continuous Deployment         |
|-----------------|--------------------------------------|-------------------------------|
| Kontrolle       | eine manuelle Freigabe               | Automatische Freigabe         |
| Automatisierung | bis zur Freigbabe                    | vollständig                   |
| Releases        | Höhere Sicherheit und mehr Kontrolle | schnellere, ständige Releases |

## Welche Features werden für den Continous Integration-Prozess benötigt?

- Versionskontrolle
- Automatisches Build-System (wie Mave odewr Gradle)
- Automatisierte Test (Unittests, Integrationstests)
- CI-Server (Jenkins, GitHub Actions, GitLab CI)
- Fehler und Feedback Mechanismus
- Code Qualitätssicherung (durch Linter)
- Branch Management
