import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("TEST DE LA FIDELIDAD");
        System.out.println("Contesta con V de verdadero o F de falso");
        System.out.println("--------------------");

        String respuesta;
        int nota = 0;

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("2. Ha aumentado sus gastos de vestuario. ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print(
                "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("5. No te deja que mires la agenda de su teléfono móvil ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("9. Has notado que últimamente se perfuma más ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }

        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
        respuesta = miScanner.nextLine();
        switch (respuesta) {
            case "V":
                nota = nota + 3;
                break;
            case "F":
                nota = 0;
                break;
            default:
                System.out.println("Ese tipo de respuesta no sirve");
                break;
        }
        System.out.println("---------------------------------------------------------");
        if ((nota >= 0) && (nota <= 10)) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if ((nota >= 11) && (nota <= 22)) {
            System.out.println(
                    "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if ((nota >= 22) && (nota <= 30)) {
            System.out.println(
                    "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
        miScanner.close();
    }
}
