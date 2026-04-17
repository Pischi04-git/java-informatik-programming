import java.util.Scanner;

public class aufgabe24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        System.out.println(sqrt(a)); 
        System.out.println(divide(a, b)); 
        System.out.println(power(a, b));  
    }

    public static float sqrt(int a) {
        return (float) Math.sqrt(a);
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static float power(int a, int b) {
        return (float) Math.pow(a, b);
    }
}