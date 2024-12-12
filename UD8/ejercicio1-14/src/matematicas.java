public class matematicas {

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static int contadornumeros(int x) {
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

    public static long voltea(long x) {
        long volte = 0;
        while (x != 0) {
            long num = x % 10;
            volte = volte * 10 + num;
            x /= 10;
        }
        return volte;
    }

    public static int digitoN(long x, int b) {
        x = voltea(x);
        while (b-- > 0) {
            x = x / 10;
        }
        return (int) x % 10;
    }
}
