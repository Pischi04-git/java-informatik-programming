import java.util.Scanner;

public class aufgabe9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean a = s.nextBoolean();
        boolean b = s.nextBoolean();

        System.out.println("-----------------------");

        System.out.println(!(a & b));
        System.out.println((!a) | (!b));

    }
}
