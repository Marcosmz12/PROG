public class PruebaCaballo {
    public static void main(String[] args) throws Exception {
        Caballo espiri = new Caballo("Spirit", "Mustang", "Marron");
        System.out.println("El nombre del caballo es " + espiri.nombre + " ,la raza del caballo " + espiri.raza
                + " ,el color del caballo " + espiri.color);
            
        Caballo rayo = new Caballo("Rayo", "Castellano", "Perla");
        System.out.println("El nombre del caballo es " + rayo.nombre + " ,la raza del caballo " + rayo.raza
                + " ,el color del caballo " + rayo.color);
    }
}
