import java.util.Scanner;

public class Ejercicio05b {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        int N = 100;
        int opcion;
        int i;
        int primeraLibre;
        int stockIntroducido;
        double precioDeCompraIntroducido;
        double precioDeVentaIntroducido;
        String codigo;
        String codigoIntroducido = "";
        String descripcionIntroducida;
        String precioDeCompraIntroducidoString;
        String precioDeVentaIntroducidoString;
        String stockIntroducidoString;
        boolean existeCodigo;
        Articulo[] articulo = new Articulo[N];

        for (i = 0; i < N; i++) {
            articulo[i] = new Articulo();
        }

        do {
            System.out.println("\n\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = mScanner.nextInt();
            mScanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    for (i = 0; i < N; i++) {
                        if (!articulo[i].getCodigo().equals("LIBRE")) {
                            System.out.println(articulo[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nNUEVO ARTÍCULO");
                    System.out.println("==============");
                    primeraLibre = 0;
                    codigo = articulo[primeraLibre].getCodigo();
                    while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
                        primeraLibre++;
                        if (primeraLibre < N) {
                            codigo = articulo[primeraLibre].getCodigo();
                        }
                    }
                    if (primeraLibre == N) {
                        System.out.println("Lo siento, a base de datos está llena.");
                    } else {
                        System.out.println("Por favor, introduzca los datos del artículo.");
                        System.out.print("Código: ");

                        existeCodigo = true;
                        while (existeCodigo) {
                            existeCodigo = false;
                            codigoIntroducido = mScanner.nextLine();

                            for (i = 0; i < N; i++) {
                                if (codigoIntroducido.equals(articulo[i].getCodigo())) {
                                    existeCodigo = true;
                                }
                            }
                            if (existeCodigo) {
                                System.out.println("Ese código ya existe en la base de datos.");
                                System.out.print("Introduzca otro código: ");
                            }
                        }
                        articulo[primeraLibre].setCodigo(codigoIntroducido);
                        
                    }

                    break;

                default:
                    break;
            }
        } while (opcion != 7);

        mScanner.close();
    }
}
