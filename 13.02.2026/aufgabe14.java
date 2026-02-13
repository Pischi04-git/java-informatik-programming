import java.util.Scanner;

public class aufgabe14 {
    public static void main(String[] args) {
        System.out.println("Geben Sie den Text ein:");
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();

        int[][] counting_array = new int[text.length()][2];
        
        String lowercase_text = text.toLowerCase();
        for (int i = 0; i < lowercase_text.length(); i++) {
            char c = lowercase_text.charAt(i);

            for (int j = 0; j < counting_array.length; j++) {

                if (counting_array[j][0] == c) {
                    int frequency = counting_array[j][1];
                    frequency++;
                    counting_array[j][1] = frequency;
                    break;
                } else if (counting_array[j][0] == 0) {
                    counting_array[j][0] = c;
                    counting_array[j][1] = 1;
                    break;
                }
            }
            
        }
        System.out.println("Zeichenhäufigkeit:");
        for (int i = 0; i < counting_array.length; i++) {
            if (counting_array[i][0] != 0) {
                System.out.println((char)counting_array[i][0] + ": " + counting_array[i][1]);
            }
        }
    }
}
