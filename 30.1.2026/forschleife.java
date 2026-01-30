/*
Das Programm liest eine Integer-Zahl n von der Eingabe ein.
Es berechnet die Summe der ersten n natürlichen Zahlen mithilfe einer for-Schleife.
Zusätzlich misst es die Berechnungszeit und gibt Summe sowie Dauer in Millisekunden aus.
*/

import java.util.Scanner;

public class forschleife {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int zahl = 0;

        long startzeit = System.currentTimeMillis();

        for (int i = 1; i <= n; i++) {
            zahl = zahl + i;
        }

        long endzeit = System.currentTimeMillis();
        long dauer = endzeit - startzeit;

        System.out.println("Die Summe der ersten " + n + " Zahlen ist: " + zahl);
        System.out.println("Die Berechnung dauerte " + dauer + " Millisekunden.");
    }
}
