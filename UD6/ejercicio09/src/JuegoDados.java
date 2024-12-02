import java.util.Random;
import java.util.Scanner;

public class JuegoDados {
    private static final int RONDAS = 11;
    private static final int JUGADORES = 3;
    private static final int PUNTUACION_INICIAL = 2;

    public static void main(String[] args) {
        int[] puntuaciones = new int[JUGADORES];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Jugar 11 rondas
        for (int ronda = 0; ronda < RONDAS; ronda++) {
            int puntuacionObjetivo = PUNTUACION_INICIAL + ronda;
            System.out.println("Ronda " + (ronda + 1) + " - Puntuación objetivo: " + puntuacionObjetivo);

            // Cada jugador tira los dados
            for (int jugador = 0; jugador < JUGADORES; jugador++) {
                System.out.println("Turno del Jugador " + (jugador + 1));
                int dado1 = random.nextInt(6) + 1; // Dado 1 (1-6)
                int dado2 = random.nextInt(6) + 1; // Dado 2 (1-6)
                int suma = dado1 + dado2;

                System.out.println("Tiraste: " + dado1 + " y " + dado2 + " (Suma: " + suma + ")");

                // Comprobar si el jugador anota
                if (suma >= puntuacionObjetivo) {
                    puntuaciones[jugador] += suma;
                    System.out.println("¡Anotas " + suma + " puntos!");
                } else {
                    System.out.println("No anotas puntos.");
                }
                System.out.println();
            }
        }

        // Mostrar puntuaciones finales
        System.out.println("Puntuaciones finales:");
        for (int jugador = 0; jugador < JUGADORES; jugador++) {
            System.out.println("Jugador " + (jugador + 1) + ": " + puntuaciones[jugador] + " puntos");
        }

        // Determinar el ganador
        int maxPuntos = 0;
        int ganador = -1;
        for (int jugador = 0; jugador < JUGADORES; jugador++) {
            if (puntuaciones[jugador] > maxPuntos) {
                maxPuntos = puntuaciones[jugador];
                ganador = jugador;
            }
        }

        System.out.println("El ganador es el Jugador " + (ganador + 1) + " con " + maxPuntos + " puntos.");
        scanner.close();
    }
}