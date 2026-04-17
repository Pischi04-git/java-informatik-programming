/*
Das Programm initialisiert eine Variable und verwendet eine if-else-if-Kette.
Es vergleicht den Wert mit 7.
Es gibt aus, ob die Zahl größer, gleich oder kleiner als 7 ist.
*/

public class dreikontrollstrukturen {
    public static void main(String[] args) {
        int zahl = 5;
        if (zahl > 7) {
            System.out.println("Die Zahl ist größer als 7");
        } else if (zahl == 7) {
            System.out.println("Die Zahl ist gleich 7");
        } else {
            System.out.println("Die Zahl ist kleiner als 7");
        }
    }
}
