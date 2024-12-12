package matematica;
import matematica.Esprimo;

public class Siguienteprimo {
    public static int siguienteprimo (int x){
        while (!Esprimo.esPrimo(x++)) {
        }
        return x;
    }
}
