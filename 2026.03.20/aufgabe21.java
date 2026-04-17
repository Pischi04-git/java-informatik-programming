import java.util.ArrayList;
import java.util.Scanner;

public class aufgabe21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<Integer>();

        System.out.println("Gebe die Länge der Liste an: ");
        int arrayLength = s.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            liste.add((int) (Math.random() * 100)); // 0 - 99
        }

        int sum = 0;
        for (int i = 0; i < liste.size(); i++) {
            sum += liste.get(i);
        }

        System.out.println(liste.toString());
        System.out.println("Die Summe der Werte in der Liste ist: " + sum);
        s.close();
    }
    
}
