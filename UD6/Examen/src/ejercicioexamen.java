import java.util.Scanner;

public class ejercicioexamen {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.println("\033[0;93mCHICAGO\033[0m");

        int Rondas = 12;
        int objetivo = 2;
        int jugador = 4;
        int suma = 0;
        int puntos = 0;
        int primerdado = 0;
        int segundodado = 0;
        int acumulador = 0;

        for (int ronda = 1; ronda < Rondas; ronda++) {
            System.out.println("\033[0;91mRonda " + ronda + "; Puntuacion del objetivo " + objetivo + "\033[0m");
            objetivo++;

            for (int jugadores = 1; jugadores < jugador; jugadores++) {
                primerdado = (int) ((Math.random() * 6) + 1);
                segundodado = (int) ((Math.random() * 6) + 1);
                suma = primerdado + segundodado;
                if ((jugadores == 1) && (suma == objetivo)) {
                    puntos++;
                    acumulador++;
                } else {
                    puntos = 0;
                    acumulador = 0;
                }
                if ((jugadores == 2) && (suma == objetivo)) {
                    puntos++;
                    acumulador++;
                } else {
                    puntos = 0;
                    acumulador = 0;
                }
                if ((jugadores == 3) && (suma == objetivo)) {
                    puntos++;
                    acumulador++;
                } else {
                    puntos = 0;
                    acumulador = 0;
                }
                System.out.println("Tirada del jugador " + jugadores + ": " + primerdado + "-" + segundodado + " ; "
                        + puntos + " puntos");
            }
            System.out.println("Puntuaciones generales: Jugador 1 - " + acumulador + " ; Jugador 2 - " + acumulador
                    + " ; Jugador 3 - " + acumulador);
            System.out.println("Pulse INTRO para la siguiente ronda ");
            String salto = mScanner.nextLine();
        }
        // Mi codigo utiliza una variable para las rondas otra para los jugadores y las
        // tiradas y con los if comprueba si han acertado y si es asi puntuaan y se le
        // suma a la puntuacion final
        mScanner.close();
    }
}
