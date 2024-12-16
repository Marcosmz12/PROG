public class Fraccion {
    private int numerador;
    private int denominador;

    Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    int getNumerador() {
        return this.numerador;
    }

    int getDenominador() {
        return this.denominador;
    }

    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion multiplica(int x) {
        return new Fraccion(numerador * x, denominador * x);
    }

    public Fraccion divide (int x){
        return new Fraccion(numerador / x, denominador / x);
    }
}