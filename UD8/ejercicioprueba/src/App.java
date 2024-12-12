import cadenastexto.CadenasTexto;

public class App {
    public static void main(String[] args) throws Exception {
        String palabra = "holaaaaa";
        String palindromo = "hola caracola";
        System.out.println(CadenasTexto.contadorVocales(palabra));
        System.out.println(CadenasTexto.invertirPalabra(palabra));
        System.out.println(CadenasTexto.esPolindromo(palindromo));
    }
}
