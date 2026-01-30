/*
Das Programm verwendet einen Scanner, um zwei Integer-Werte von der Eingabe zu lesen.
Es berechnet ihre Summe.
Die Summe wird auf der Konsole ausgegeben.
*/

import java.util.Scanner;

public class aufgabe8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ersteZahl = s.nextInt();
        int zweiteZahl = s.nextInt();

        System.out.println("Summe: " + (ersteZahl + zweiteZahl));
    }
}
