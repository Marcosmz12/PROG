package utilidades;

import utilidades.GeneradorAleatorio;
import utilidades.ImpresoraResultados;;

public class CalculadorPuntuacion {
    /**
     * @param carta
     * @param dado
     * El parametro carta hace que aleatoriamente salga un numero de 1 al 40
     * El parametro dado hace que aleatoriamente salga un numero de 1 al 6
     * @param puntucion recoge los dos parametros los suma y luego si es par o impar le aplica una bonificacion o no
     */
    public static double calcularPuntuacion(int carta, int dado) {
        carta = GeneradorAleatorio.generarCarta();
        dado = GeneradorAleatorio.generarDado();
        double puntuacion = carta + dado;
        if (carta / 2 == 0) {
            carta = (carta * 110) / 10;
            puntuacion = carta + dado;
        } else {
            carta = (carta * 95) / 10;
            puntuacion = carta + dado;
        }
        return puntuacion;
    }
}
