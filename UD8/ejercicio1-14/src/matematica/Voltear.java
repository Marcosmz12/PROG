package matematica;

public class Voltear {
    public static long voltea(long x) {
        long volte = 0;
        while (x != 0) {
            long num = x % 10;
            volte = volte * 10 + num;
            x /= 10;
        }
        return volte;
    }
    
}
