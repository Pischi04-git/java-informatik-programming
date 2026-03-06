public class aufgabe16 {
    public static void main(String[] args) {
        int[][] zahlen = new int[2][3]; // Deklariert ein zweidimensionales Array von Ganzzahlen mit 2 Zeilen und 3 Spalten
        zahlen[0][0] =  2; // Weist der Stelle [0][0] den Wert 2 zu
        zahlen[0][1] = 3; // Weist der Stelle [0][1] den Wert 3 zu
        zahlen[0][2] = 5; // Weist der Stelle [0][2] den Wert 5 zu
        zahlen[1][0] = 7; // Weist der Stelle [1][0] den Wert 7 zu
        zahlen[1][1] = 11; // Weist der Stelle [1][1] den Wert 11 zu
        zahlen[1][2] = 13; // Weist der Stelle [1][2] den Wert 13 zu
        System.out.println(zahlen[0][2]); // Gibt den Wert an der Stelle [0][2] aus
    }    
}
