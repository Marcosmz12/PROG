public abstract class Vehiculos {
    static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;

    private int kilometrosRecorridos;

    public Vehiculos() {
        this.kilometrosRecorridos = 0;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void recorre(int k){
        this.kilometrosRecorridos += k;
        Vehiculos.kilometrosTotales += k;
    }

    @Override
    public String toString() {
        return "Nº vehiculos creados: " + vehiculosCreados + "nº kilometros: " + kilometrosTotales;
    }

}
