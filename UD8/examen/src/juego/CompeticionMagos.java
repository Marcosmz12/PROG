package juego;

import java.util.Scanner;
import utilidades.ImpresoraResultados;

public class CompeticionMagos {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        System.out.println("\033[0;93mBienvenido quiere jugar pulsa ENTER\033[0m ");
        String inicio = mScanner.nextLine();

        System.out.println(ImpresoraResultados.imprimirResultados(0, 0));

        mScanner.close();
    }
}
