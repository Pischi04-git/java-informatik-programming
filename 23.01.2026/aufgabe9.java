import java.util.Scanner;

public class aufgabe9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean input1 = s.nextBoolean();
        boolean input2 = s.nextBoolean();

        System.out.println("------------------------");

        System.out.println(!(input1 & input2));
        System.out.println((!input1) | (!input2));

    }
}
