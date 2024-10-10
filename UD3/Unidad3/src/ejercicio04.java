public class ejercicio04 {
    public static void main(String[] args) throws Exception {
        double x;
        double y;
        double multi;
        double suma;
        double resta;
        double divi;
        String linea;
        System.out.print("Dime un numero : ");
        linea = System.console().readLine();
        x = Double.parseDouble(linea);

        System.out.print("Dime otro numero : ");
        linea = System.console().readLine();
        y =  Double.parseDouble(linea);

        suma = x + y ;
        resta = x - y ;
        multi = x * y ;
        divi = x / y ;

        System.out.printf("Este es le resultado de los numeros sumados = %10.5f \n", suma);
        System.out.printf("Este es le resultado de los numeros restados = %10.5f \n", resta);
        System.out.printf("Este es le resultado de los numeros multiplicados %10.5f \n", multi);
        System.out.printf("Este es le resultado de los numeros divididos = %10.5f \n", divi );
    }
}
