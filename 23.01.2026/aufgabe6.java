public class aufgabe6 {
    public static void main(String[] args) {
        int[] x = {1, 3, 7, 10};
        int[] y = {8, 24, 56, 80};

        int[] PropFaktoen = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            PropFaktoen[i] = y[i] / x[i];
        }
        
        int vorherigerFaktor = PropFaktoen[0];
        boolean propZusammenhang = true;

        for (int faktor = 0; faktor < PropFaktoen.length; faktor++) {
            if (PropFaktoen[faktor] != vorherigerFaktor) {
                propZusammenhang = false;
                break;
            }
        }
        System.out.println(propZusammenhang);
    }
}
