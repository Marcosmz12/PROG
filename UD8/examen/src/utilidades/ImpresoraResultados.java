package utilidades;

import utilidades.GeneradorAleatorio;

import java.util.Scanner;

import utilidades.CalculadorPuntuacion;

public class ImpresoraResultados {
    /**
     * @param puntuacionMago1
     * @param puntuacionMago2
     * Con los dos parametros tenemosla puntuacion y segun el resultado de cada uno gan uno o otro
     */
    public static boolean imprimirResultados(double puntuacionMago1, double puntuacionMago2) {
        Scanner mScanner = new Scanner(System.in);
        String ronda = "";
        double resultadomago1 = 0;
        double resultadoMago2 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\033[0;92mRonda " + i +"\033[0m");
            int dado = GeneradorAleatorio.generarDado();
            int carta = GeneradorAleatorio.generarCarta();
            resultadomago1 = CalculadorPuntuacion.calcularPuntuacion(carta, dado);
            resultadoMago2 = CalculadorPuntuacion.calcularPuntuacion(carta, dado);
            System.out.println(
                    "Mago1 " + " dado " + GeneradorAleatorio.generarDado() + " carta "
                            + GeneradorAleatorio.generarCarta());
            System.out.println(
                    "Mago2 " + " dado " + GeneradorAleatorio.generarDado() + " carta "
                            + GeneradorAleatorio.generarCarta());
            System.out.println();
            System.out.println("Resultados del Mago1 " + resultadomago1);
            System.out.println("Resultados del Mago2 " + resultadoMago2);
            System.out.println("Siguiente Ronda Pulsa ENTER ");
            ronda = mScanner.nextLine();
        }
        mScanner.close();
        if (resultadomago1 > resultadoMago2) {
            System.out.println("GANADOR MAGO1");
            return true;
        } else if (resultadoMago2 > resultadomago1) {
            System.out.println("GANADOR MAGO2");
            return true;
        } else if (resultadoMago2 == resultadomago1) {
            System.out.println("EMPATE");
            return true;
        }

        return false;
    }
}
