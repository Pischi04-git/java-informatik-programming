import java.util.ArrayList; // Importiert die ArrayList-Klasse

public class aufgabe20 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add(0, "Theo"); // Fügt den Wert "Theo" an der Stelle 0 hinzu
        liste.add(1, "Clara"); // Fügt den Wert "Clara" an der Stelle 1 hinzu
        liste.add(2, "Ina"); // Fügt den Wert "Ina" an der Stelle 2 hinzu
        liste.add(3, "Markus"); // Fügt den Wert "Markus"

        if (liste.contains("Ina")) {
            System.out.println("Ina ist in der Liste enthalten"); // Gibt aus, dass "Ina" in der Liste enthalten ist
        }
    }
}