public class SistemaGestionEstudiantes {

    public static void main(String[] args) throws Exception {
        Estudiante e1 = new Estudiante("2024MArcos", "Marcos", 21, 5);
        System.out.println(e1);
        e1.setEdad(124);
        e1.setPromedio(12);
        System.out.println(e1);

    }
}
