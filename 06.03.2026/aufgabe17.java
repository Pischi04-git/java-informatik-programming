public class aufgabe17 {

    public static int ggt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int kgv(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs((a * b) / ggt(a, b));
    }

    public static void main(String[] args) {
        // Gleichungssystem: 
        // 0: 2x + 1y = 10
        // 1: 1x + 2y = 8
        float[][] gleichungssystem = {
            {2, 3, 10},   
            {1, 2, 12}    
        };

        System.out.println("Altes Gleichungssystem:");
        System.out.printf("%.2fx + %.2fy = %.2f%n", 
            gleichungssystem[0][0], gleichungssystem[0][1], gleichungssystem[0][2]);
        System.out.printf("%.2fx + %.2fy = %.2f%n", 
            gleichungssystem[1][0], gleichungssystem[1][1], gleichungssystem[1][2]);

        int kleinsteGemeinsameVielfache = kgv(
            (int) gleichungssystem[0][0], 
            (int) gleichungssystem[1][0]
        );

        System.out.println("KGV der Koeffizienten von x: " + kleinsteGemeinsameVielfache);

        float multiplikatorGleichung1 = kleinsteGemeinsameVielfache / gleichungssystem[0][0];
        float multiplikatorGleichung2 = kleinsteGemeinsameVielfache / gleichungssystem[1][0];


        float g1_y = gleichungssystem[0][1] * multiplikatorGleichung1;
        float g1_ergebnis = gleichungssystem[0][2] * multiplikatorGleichung1;

        float g2_y = gleichungssystem[1][1] * multiplikatorGleichung2;
        float g2_ergebnis = gleichungssystem[1][2] * multiplikatorGleichung2;

        System.out.println("Gleichungssystem nach Anpassung an KGV:");
        System.out.printf("%.2fx + %.2fy = %.2f%n", (float)kleinsteGemeinsameVielfache, g1_y, g1_ergebnis);
        System.out.printf("%.2fx + %.2fy = %.2f%n", (float)kleinsteGemeinsameVielfache, g2_y, g2_ergebnis);

        float diffKoeffizientenY = g2_y - g1_y;
        float diffErgebnisse = g2_ergebnis - g1_ergebnis;

        float y = diffErgebnisse / diffKoeffizientenY;
        System.out.printf("Lösung: y = %.2f%n", y);

        float x = (gleichungssystem[0][2] - gleichungssystem[0][1] * y) / gleichungssystem[0][0];
        System.out.printf("Lösung: x = %.2f%n", x);
    }
}
