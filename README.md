My Circle Project 🔵

Das ist ein kleines Java-Projekt aus meinem Studium. Das Programm rechnet 360 Koordinaten für einen Kreis aus und speichert sie in einer Datei, damit man das Ergebnis später mit Gnuplot "plotten" (anzeigen) kann.

So geht's:
Programm starten: Einfach die Hauptprogramm.java ausführen.

Pfad kopieren: In der Konsole steht nach dem Start direkt, wo die Datei kreis.txt gespeichert wurde. Den Pfad einfach kopieren.

In Gnuplot anzeigen: Gnuplot öffnen und diese Befehle eingeben (beim letzten Befehl deinen Pfad einfügen):
```
set size square
set style line 1 pt 7
plot "DEIN/KOPIERTER/PFAD/kreis.txt" linestyle 1

<img width="628" height="571" alt="Bildschirmfoto 2026-05-11 um 17 51 54" src="https://github.com/user-attachments/assets/f82088fa-d89f-437c-90ce-a2d533c574cb" />
