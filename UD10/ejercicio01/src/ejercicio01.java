import java.util.ArrayList;

public class ejercicio01 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> compañerosClase = new ArrayList<String>();
        compañerosClase.add("Paco");
        compañerosClase.add("Jose");
        compañerosClase.add("Miguel");
        compañerosClase.add("Dani");
        compañerosClase.add("Adri");
        compañerosClase.add("Juanma");
        compañerosClase.add("Marcos");

        for (int i = 0; i < compañerosClase.size(); i++) {
            System.out.println(compañerosClase.get(i));
        }
    }
}
