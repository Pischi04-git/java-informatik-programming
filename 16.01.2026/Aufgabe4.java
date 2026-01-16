public class Aufgabe4 {
    public static void main(String[] args) {
        int Klassenkasse = 0;
        
        Klassenkasse = Klassenkasse + 27 * 5; // 27 Schüler zahlen 5 Euro
        Klassenkasse = Klassenkasse + 3 * 6; // 3 Schüler zahlen 6 Euro

        Klassenkasse = Klassenkasse - 30; // Bastelmaterial
        Klassenkasse = Klassenkasse - 60; // Schwimmbadkosten

        System.out.println("Jeder Schüler bekommt " + Klassenkasse/30 + " Euro zurück");
        System.out.println("Rest in der Kasse: " + Klassenkasse%30 + " Euro");
        System.out.println("Genau Auszahlung pro Schüler: " + Klassenkasse / 30. + " Euro");
    }
}