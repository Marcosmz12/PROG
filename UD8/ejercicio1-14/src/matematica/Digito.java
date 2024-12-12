package matematica;

public class Digito {
    public static int contadornumeros(long x) {
        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }
}
