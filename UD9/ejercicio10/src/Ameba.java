public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public void come(int pesoParticula) {
        this.peso += pesoParticula - 1;
    }

    public void come(Ameba otrAmeba) {
        this.peso += otrAmeba.getPeso() - 1;
        otrAmeba.setPeso(0);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int nuevoPeso) {
        peso = nuevoPeso;
    }

    public String toString(){
        return "Soy una ameba y peso " + peso + " microgramos.";
    }
}
