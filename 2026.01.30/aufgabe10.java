/*
Das Programm liest eine Integer-Zahl ein.
Es verwendet eine if-else-Struktur, um zu prüfen, ob die Zahl gerade oder ungerade ist.
Entsprechend wird eine Nachricht auf der Konsole ausgegeben.
*/

import java.util.Scanner;

public class aufgabe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int zahl = s.nextInt();

        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}