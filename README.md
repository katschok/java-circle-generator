# java-circle-generator
Java-Tool zur Generierung von Kreiskoordinaten für die Visualisierung mit Gnuplot.

## Quick Start
1. Starte das Programm über die `main`-Methode im Hauptprogramm.
2. Die Datei `kreis.txt` wird im Projektordner erstellt.

## Visualisierung mit Gnuplot
Um das Ergebnis zu sehen, öffne Gnuplot und gib folgende Befehle ein:

```gnuplot
set style line 1 pt 7
set size square
plot "kreis.txt" linestyle 1
