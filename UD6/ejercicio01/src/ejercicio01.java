public class ejercicio01 {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        int tirada;
        for (int i = 1; i < 4; i++) {
            tirada = (int) (Math.random() * 6) + 1;
            System.out.print(tirada + " ");
            suma+=tirada;
        }
        System.out.println("La suma de los tres dados es " + suma);

    }
}
