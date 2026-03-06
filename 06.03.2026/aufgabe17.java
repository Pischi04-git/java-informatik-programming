public class aufgabe17 {

    public static float ggt(float a, float b) {
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static float kgv(float a, float b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / ggt(a, b);
    }


    public static void main(String[] args) {

        float[][] gleichungssystem = { {2, 1, 10}, {-1, 2, 8},  {0, 0, 0}}; 

        // 2x + 1y = 10
        // -1x + 2y = 8

        float gkv = kgv(gleichungssystem[0][0], gleichungssystem[1][0]);

        gleichungssystem[2][0] = gleichungssystem[0][0] / gkv;
        gleichungssystem[2][1] = gleichungssystem[0][1] / gkv;
        gleichungssystem[2][2] = gleichungssystem[0][2] / gkv;

        System.out.println("Neues Gleichungssystem:");
        System.out.println(gleichungssystem[2][0] + "x + " + gleichungssystem[2][1] + "y = " + gleichungssystem[2][2]);
        System.out.println(gleichungssystem[1][0] + "x + " + gleichungssystem[1][1] + "y = " + gleichungssystem[1][2]);

        float t = gleichungssystem[2][1] + gleichungssystem[1][1];
        float s = gleichungssystem[2][2] + gleichungssystem[1][2];
        float y = s / t;

        System.out.println("Lösung: y = " + y);

        float x = (gleichungssystem[0][2] - gleichungssystem[0][1] * y) / (float) gleichungssystem[0][0];

        System.out.println("Lösung: x = " + x);

    }
}

