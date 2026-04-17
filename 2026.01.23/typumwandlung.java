/*
Das Programm demonstriert implizite und explizite Typumwandlungen in Java.
Es wandelt int zu double implizit und double zu int explizit.
Die Werte werden jeweils auf der Konsole ausgegeben.
*/

public class typumwandlung {
    public static void main(String[] args) {

        // Implizite Typumwandlung
        int zahl = 10;
        System.out.println(zahl);
        double zahl2 = zahl;
        System.out.println(zahl2);

        // Explizite Typumwandlung
        double zahl3 = 7.9;
        int zahl4 = (int) zahl3;
        System.out.println(zahl4);
    }
}
