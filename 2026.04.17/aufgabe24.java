public class aufgabe24 {
    public static void main(String[] args) {
        System.out.println(root(16)); 
        System.out.println(divide(10, 2)); 
        System.out.println(power(2, 3));  
    }

    public static int root(int a) {
        return (int) Math.sqrt(a);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
