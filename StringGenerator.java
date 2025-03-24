import java.util.Random;

public class StringGenerator {
    private static final Random rand = new Random();

    public static String generateValidString() {
        int n = rand.nextInt(8);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append('a');
        for (int i = 0; i < n; i++) sb.append('b');

        return sb.toString();
    }

    public static String generateInvalidString() {
        int type = rand.nextInt(3);

        switch (type) {
            case 0:
                int n = rand.nextInt(7) + 1;
                int m = rand.nextInt(7) + 1;
                while (n == m) m = rand.nextInt(7) + 1;

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) sb.append('a');
                for (int i = 0; i < m; i++) sb.append('b');
                if (sb.length() < 2) {
                    sb.append('a');
                    sb.append('b');
                }

                return sb.toString();

            case 1:
                n = rand.nextInt(7) + 1;
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < n; i++) sb2.append('b');
                for (int i = 0; i < n; i++) sb2.append('a');
                if (sb2.length() < 2) {
                    sb2.append('b');
                    sb2.append('a');
                }

                return sb2.toString();

            case 2:
                n = rand.nextInt(7) + 1;
                StringBuilder sb3 = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb3.append('a');
                    sb3.append('b');
                }
                return sb3.toString();

            default:
                return "ab"; 
        }
    }
}