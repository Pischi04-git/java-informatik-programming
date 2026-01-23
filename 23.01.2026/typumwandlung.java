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
