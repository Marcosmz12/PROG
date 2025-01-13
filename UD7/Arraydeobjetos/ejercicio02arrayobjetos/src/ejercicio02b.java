
public class ejercicio02b {
    public static void main(String[] args) throws Exception {
        Perro[] Perro = new Perro[4];

        Perro[0] = new Perro("Marcos", "Marron", "Mestizo");
        Perro[1] = new Perro("Paco", "Azul", "Anagora");
        Perro[2] = new Perro("Daniel", "Verde", "Manx");
        Perro[3] = new Perro("Jose", "Rojo", "Persa");

        System.out.println("Datos de los perros: ");
        System.out.println("--------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println("Perro nº " + (i + 1));
            System.out.println("Nombre: " + Perro[i].getNombre());
            System.out.println("Color: " + Perro[i].getColor());
            System.out.println("Raza : " + Perro[i].getRaza());
            System.out.println("---------------------------");
        }
    }
}
