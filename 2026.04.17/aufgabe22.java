public class aufgabe22 {
    public static void main(String[] args) {
        summe(3);
        summe(10);
        summe(100);   
    }

    private static void summe(int n) {
        int ergebnis = 0;
        for (int zaehler = 1; zaehler <= n; zaehler++) {
            ergebnis += zaehler*ergebnis;
        }
        System.out.println("Die Summe der ersten " + n + " natürlichen Zahlen ist: " + ergebnis);
    }
}
