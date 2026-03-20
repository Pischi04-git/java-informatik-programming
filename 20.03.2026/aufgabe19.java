import java.util.ArrayList;

public class aufgabe19 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add(0, "Theo"); // Fügt den Wert "Theo" an der Stelle 0 hinzu
        liste.add(1, "Clara"); // Fügt den Wert "Clara" an der Stelle 1 hinzu
        liste.add(2, "Ina"); // Fügt den Wert "Ina" an der Stelle 2 hinzu
        liste.add(3, "Markus"); // Fügt den Wert "Markus" an der Stelle 3 hinzu
        liste.set(2, "Klaus"); // Ändert den Wert an der Stelle 2 auf "Luca"
        liste.remove("Clara"); // Entfernt den Wert an der Stelle 3
        System.out.println(liste.size()); // Gibt die Größe der Liste aus
        System.out.println(liste.get(1)); // Gibt den Wert an der Stelle 1 aus
        System.out.println(liste.toString()); // Gibt die Liste als String aus
        System.out.println(liste.indexOf("Markus")); // Gibt den Index von "Markus" in der Liste aus
    }
}