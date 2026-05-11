import java.io.*;
import java.util.*;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class MyCircle {
    private float radius;

    public MyCircle(float radius) {
        this.radius = radius;
        createPoints();
    }

    private void createPoints() {
        record Point(float x, float y) {
            void output(PrintWriter pw) {
                pw.println(x + " " + y);
            }
        }

        ArrayList<Point> punkteListe = new ArrayList<>();

        for (int i = 0; i < 360; i++) {
            double bogen = Math.toRadians(i);
            float x = (float) (radius * Math.cos(bogen));
            float y = (float) (radius * Math.sin(bogen));
            punkteListe.add(new Point(x, y));
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("kreis.txt"))) {
            punkteListe.forEach(p -> p.output(writer));
            
            // Katschok-Tipp: Pfad anzeigen
            File file = new File("kreis.txt");
            System.out.println("Erfolg! Datei erstellt unter: " + file.getAbsolutePath());
            
        } catch (IOException e) {
            System.out.println("Fehler beim Erstellen der Datei.");
        }
    }
}
    

