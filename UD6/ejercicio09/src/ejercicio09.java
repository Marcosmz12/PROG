public class ejercicio09 {
    public static void main(String[] args) throws Exception {
        int numeros =0;
        int sumanumeros = 0;
        int contador = 0;
        while (numeros != 24) {
            numeros = (int)(Math.random()*51)*2;
            System.out.println(numeros+ " ");
            sumanumeros++;
            contador++;
        }
        System.out.println("Ha iprimido "+ contador);
    }
}
