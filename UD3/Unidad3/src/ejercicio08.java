public class ejercicio08 {
    public static void main(String[] args) throws Exception {
        String diadelasemana;
        double horas;
        double multi;
        String linea;

        System.out.print("Dime el dia trabajado: ");
        diadelasemana = System.console().readLine();
        System.out.print("Dime el numero de horas que has trabajado: ");
        linea = System.console().readLine();
        horas = Double.parseDouble(linea);

        multi = horas * 12;
        System.out.println("El "+ diadelasemana + " te van ha pagar : "+ multi + "\u8364");
    }
}