package Classe;

public class Circulo {
    private double raio;
    private static final double PI = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double calculaArea() {
        return PI*raio*raio;
    }
    public double calculaPerimetro() {
        return 2*PI*raio;
    }
    public boolean ehMaior(final Circulo c){
        final int numero;
        return true;
    }
}
