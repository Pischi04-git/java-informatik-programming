/*
Das Programm liest zwei boolean-Werte ein.
Es demonstriert die Negation von UND und die Anwendung von De Morgans Gesetz.
Die Ergebnisse !(a & b) und (!a) | (!b) werden ausgegeben.
*/

import java.util.Scanner;

public class aufgabe9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean a = s.nextBoolean();
        boolean b = s.nextBoolean();

        System.out.println("-----------------------");

        System.out.println(!(a & b));
        System.out.println((!a) | (!b));

    }
}
