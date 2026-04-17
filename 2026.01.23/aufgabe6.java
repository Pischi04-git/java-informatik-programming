/*
Das Programm arbeitet mit zwei Arrays und prüft, ob zwischen ihnen ein proportionaler Zusammenhang besteht.
Es berechnet die Verhältnisse zwischen entsprechenden Elementen der Arrays.
Das Ergebnis, ob der Zusammenhang proportional ist, wird als boolean ausgegeben.
*/

public class aufgabe6 {
    public static void main(String[] args) {
        int[] x = {1, 3, 7, 10};
        int[] y = {8, 24, 56, 80};

        int[] PropFaktoren = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            PropFaktoren[i] = y[i] / x[i];
        }
        
        int vorherigerFaktor = PropFaktoren[0];
        boolean propZusammenhang = true;

        for (int faktor = 0; faktor < PropFaktoren.length; faktor++) {
            if (PropFaktoren[faktor] != vorherigerFaktor) {
                propZusammenhang = false;
                break;
            }
        }
        System.out.println(propZusammenhang);
    }
}
