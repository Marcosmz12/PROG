public class matematicas {
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x) {
        while (!esPrimo(x++)) {
        }
        return x;
    }

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

    public static int voltea(int x) {
        for (int i = -1; i < x; i++) {
            i = x;
            x = x * 10;
            i%=10;
        }
        return x;
    }
}
