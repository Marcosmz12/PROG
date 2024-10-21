public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        int año;
        int dias = 365;
        int horas = 24;
        int minutos = 60;
        int segundos = 60;
        double luz = 299.792;
        double horasaños = dias * horas;
        double minutosaños = horas * minutos;
        double segundosaños = minutos * segundos;
        

        System.out.println("DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.print("Ingrese el número de años: ");
        String linea = System.console().readLine();
        año = Integer.parseInt(linea);

        double diasaños = año * dias;
        double resultado = diasaños + horasaños + minutosaños + segundosaños * luz;
        System.out.print("La luz recorre aproximadamente "+ resultado + " kilometros en "+ año+ " años");
        
// El codigo hace de calculadora para indicarte lo que recorre la luz en un año.
    }
}
