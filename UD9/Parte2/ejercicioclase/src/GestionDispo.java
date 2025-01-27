public class GestionDispo {
    public static final int MAX = 10;

    public static void main(String[] args) throws Exception {
        Dispositivo[] misDispo = new Dispositivo[MAX];
        misDispo[0] = new Computadora(16, 1, 124, "Hp");
        misDispo[1] = new Computadora(8, 2, 40, "Apple");
        misDispo[2] = new Televisor("LG", 124, "Led", "4K");

        for (int i = 0; i < Dispositivo.getContadorDispo(); i++) {
            System.out.println(misDispo[i]);
            //((Encendible) misDispo[i]).encender();
        }
    }
}
