# Aufgabe ComputeTax

## Testfälle

1. Grenzfälle zwischen den Intervallen (mit double werten)
    - 10.000 bis 10.001 - 9999.54, 10000.34, 10001.01
    - 20.000 bis 20.001 - 19999.86, 20000.26, 20001.04
    - 30.000 - 29999.69, 30000.03

2. richtige Berechnung von Werten
    - unter 10.000 keine Steuern
    - 10.000 < x <= 20.000 - 10% Steuern
    - 20.000 < x <= 30.000 - 20% Steuern
    - über 30.000 30% Steuern

## Ergebnisse

durch die fehlende genauigkeit bei gleitkommazahlen schlägt ein test bei diesen fehl,
weil die erwarteten werte diese toleranz nicht berücksichtigen.

- Man müsste also Runden -> weitere fehlerquelle
