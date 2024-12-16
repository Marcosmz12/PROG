public class Fraccion {
    int numerador;
    int denominador;

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

    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }
}
