public class NumeroEntero  {

    public static int  pideEntero() {
        boolean contraseñaMala = true;
        int miEntero = 0;
        do {
            try {
                miEntero = Integer.parseInt(System.console().readLine());
                contraseñaMala = false;
            } catch (Exception e) {
                System.out.println("Su numero no es correcto");
            }
        } while (contraseñaMala);
        return miEntero;

    }
}