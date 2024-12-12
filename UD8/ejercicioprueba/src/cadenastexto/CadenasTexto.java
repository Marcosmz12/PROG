package cadenastexto;

public class CadenasTexto {
    public static int contadorVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String invertirPalabra(String palabra) {
        String palabrainvert = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabrainvert = palabrainvert + palabra.charAt(i);
        }
        return palabrainvert;
    }

    public static String quitarEspacios(String palabra) {
        String espacio = "";
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter != ' ') {
                espacio = espacio + caracter;
            }
        }
        return espacio;
    }

    public static boolean esPolindromo(String palabra) {
        String palabrainvert = quitarEspacios(palabra);
        if (palabrainvert.equals(invertirPalabra(palabrainvert))) {
            return true;
        }
        return false;
    }

}
