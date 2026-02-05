import java.util.Scanner;

public class aufgabe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int zahl = s.nextInt();
        
        System.out.println("Alle Teiler der Zahl " + zahl + " sind:");

        for (int i = 1; i <= zahl; i++) {
            if (zahl % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
