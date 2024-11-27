import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        int suma2 = 0;
        boolean ganado = false;

        System.out.print("Que cantidad desea apostar ¿? ");
        int apuesta = mScanner.nextInt();
        mScanner.nextLine();

        int dado = (int) ((Math.random()*6)+1);
        int dados = (int) ((Math.random()*6)+1);
        int suma = dado + dados;
        System.out.println(suma);

        switch (suma) {
            case 7, 11:
                apuesta = apuesta * 2;
                System.out.println("¡HAS GANADO! ");
                System.out.println("El numero ganador es " + suma);
                System.out.println("Toma tu premio " + apuesta);
                break;
            case 2, 3, 12:
                System.out.println("El numero perdedor " + suma);
                System.out.println("Lo siento has perdido =(");
                break;
            default:

                while (ganado == false) {
                    dado = (int) ((Math.random()*6)+1);
                    dados = (int) ((Math.random()*6)+1);
                    suma2 = dado + dados;
                    if (suma2 == suma) {
                        System.out.println("¡HAS GANADO! ");
                        apuesta = apuesta * 2;
                        System.out.println("El numero ganador es " + suma2 );
                        System.out.println("Toma tu premio " + apuesta);
                        ganado = true;
                    } else if (suma == 7) {
                        System.out.println("El numero perdedor " + suma2);
                        System.out.println("Lo siento has perdido =(");
                        ganado = true;
                    }
                }
                break;
        }
        mScanner.close();
    }
}
