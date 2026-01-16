public class Aufgabe4 {
    public static void main(String[] args) {
        int klassenkasse = 0;
        
        klassenkasse = klassenkasse + 27 * 5; // 27 Schüler zahlen 5 Euro
        klassenkasse = klassenkasse + 3 * 6; // 3 Schüler zahlen 6 Euro

        klassenkasse = klassenkasse - 30; // Bastelmaterial
        klassenkasse = klassenkasse - 60; // Schwimmbadkosten

        System.out.println("Jeder Schüler bekommt " + klassenkasse/30 + " Euro zurück");
        System.out.println("Rest in der Kasse: " + klassenkasse%30 + " Euro");
        System.out.println("Genau Auszahlung pro Schüler: " + klassenkasse / 30. + " Euro");
    }
}