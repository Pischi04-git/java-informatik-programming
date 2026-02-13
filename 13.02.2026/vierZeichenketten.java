public class vierZeichenketten {
    public static void main(String[] args) {
        String vorname = "Fritz";
        String nachname = "Müller";
        
        System.out.println(vorname); // Gibt den Vornamen aus
        System.out.println(nachname); // Gibt den Nachnamen aus
        System.out.println(vorname + " " + nachname); // Gibt den vollständigen Namen aus
        System.out.println(vorname.length()); // Gibt die Länge des Vornamens aus / Anzahl an Zeichen
        System.out.println(vorname.charAt(2)); // Gibt das Zeichen an der Position 2 des Vornamens aus
        System.out.println(nachname.substring(1, 3)); // Gibt die Zeichen von Position 1 bis 2 des Nachnamens aus
    }
}
