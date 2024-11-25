public class Ejercicio03 {
    public static void main(String[] args) throws Exception {
        int baraja = ((int) (Math.random() * 4) + 1);
        switch (baraja) {
            case 1:
                System.out.println("Oro");
                break;
            case 2:
                System.out.println("Copa");
                break;
            case 3:
                System.out.println("Basto");
                break;
            case 4:
                System.out.println("Espada");
                break;
            default:
                break;
        }
        int numerobaraja = ((int) (Math.random() * 12) + 1);
        switch (numerobaraja) {
            case 1:
            String as = "AS";
            System.out.println("Tu numero es el "+ as);
                break;
            case 2, 3, 4, 5, 6, 7:
                System.out.println("Tu numero es el " + numerobaraja);
                break;
            case 10:
                String numero10 ="Sota";
                System.out.println("Tu numero es la " + numero10);
                break;
            case 11:
                String numero11 = "Caballo";
                System.out.println("Tu numero es el  " + numero11);
                break;
            case 12:
                String numero12 = "Rey";
                System.out.println("Tu numero es el " + numero12);
                break;
            default:
            System.out.println("Este numero no esta en la baraja española " + numerobaraja);
                break;
        }
    }
}
