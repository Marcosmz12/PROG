public class ejercicio02 {
    public static void main(String[] args) throws Exception {
        int baraja = ((int) (Math.random() * 4) + 1);
        switch (baraja) {
            case 1:
                System.out.println("Picas");
                break;
            case 2:
                System.out.println("Corazones");
                break;
            case 3:
                System.out.println("Diamantes");
                break;
            case 4:
                System.out.println("Treboles");
                break;
            default:
                break;
        }
        int numerobaraja = ((int) (Math.random() * 13) + 1);
        switch (numerobaraja) {
            case 1:
            char a = 'A';
                String numero1 = String.valueOf(a);
                System.out.println("Tu numero es el " + numero1);
                break;
            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("Tu numero es el " + numerobaraja);
                break;
            case 11:
                char j = 'J';
                String numero11 = String.valueOf(j);
                System.out.println("Tu numero es el " + numero11);
                break;
            case 12:
                char q = 'Q';
                String numero12 = String.valueOf(q);
                System.out.println("Tu numero es el  " + numero12);
                break;
            case 13:
                char k = 'K';
                String numero13 = String.valueOf(k);
                System.out.println("Tu numero es el " + numero13);
                break;
            default:
                break;
        }
    }
}
