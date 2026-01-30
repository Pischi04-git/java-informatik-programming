/*
Das Programm simuliert die Verwaltung einer Klassenkasse.
Es berechnet Einnahmen von Schülern und Ausgaben für Aktivitäten.
Schließlich berechnet es den Rückzahlungsbetrag pro Schüler und den Rest in der Kasse.
*/

public class Aufgabe4 {
    public static void main(String[] args) {
        int Klassenkasse = 0;
        
        Klassenkasse = Klassenkasse + 27 * 5; // 27 Schüler zahlen jeweils 5 Euro
        Klassenkasse = Klassenkasse + 3 * 6; // 3 Schüler zahlen jeweils 6 Euro

        Klassenkasse = Klassenkasse - 30; // Kosten für Bastelmaterial
        Klassenkasse = Klassenkasse - 60; // Kosten für den Schwimmbadbesuch

        System.out.println("Jeder Schüler bekommt " + Klassenkasse/30 + " Euro zurück");
        System.out.println("Rest in der Kasse: " + Klassenkasse%30 + " Euro");
        System.out.println("Genau Auszahlung pro Schüler: " + Klassenkasse / 30. + " Euro");
    }
}