import java.util.Scanner;

public class aufgabe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int zahl = s.nextInt();
        s.close();
        
        for (int i = 0; i < zahl; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isprime(int zahl) {
        if (zahl <= 1) {
            return false;
        }
        for (int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
