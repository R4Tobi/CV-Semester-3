/*
 * Aufgabe 1
 * =========
 * Die Funktion sucht in einem zweidimensionalem Array nach der Zahl 4.
 * 
 * Aufgabe 2
 * =========
 * Spaghetti Code
 * Logik des Codes ist nachvollziehbar, aber schlecht strukturiert.
 * Code ist schwer verständlich und schlecht wartbar.
 * sehr hohe Fehlerwahrscheinlichkeit und Erkennung
 * 
 */

public class AntiPattern {
    public static void main(String[] args) {
        int[][] arBig = new int[3][3];
        arBig[0][0] = 1;
        arBig[0][1] = 2;
        arBig[0][2] = 3;
        arBig[1][0] = 4;
        arBig[1][1] = 5;
        arBig[1][2] = 6;
        arBig[2][0] = 7;
        arBig[2][1] = 8;
        arBig[2][2] = 9;
        System.out.println(f(arBig) ? "4 gefunden" : "4 nicht gefunden");
    }

    public static boolean f(int[][] arBig) {
        for (int r = 0; r < arBig.length; r++) {
            for (int c = 0; c < arBig[r].length; c++) {
                if (arBig[r][c] == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}