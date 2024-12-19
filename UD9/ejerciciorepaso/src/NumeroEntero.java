public class NumeroEntero {
    public static int pideEntero (){
        boolean numeroerror = true;
        int miEntero = 0;
        do {
            try {
                miEntero = Integer.parseInt(System.console().readLine());
                numeroerror = false;
            } catch (Exception e) {
                System.out.println("Esto no es numero , prueba otra vez");
            }
        } while (numeroerror);

        return miEntero;
    }

}
