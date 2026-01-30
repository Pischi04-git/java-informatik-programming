import java.util.Scanner;

public class aufgabe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
