package Classe;

public class Retangulo {
    private int base;
    private int altura;

   public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int calculaArea(){
        return multiplicar();
    }
    private int multiplicar() {
        return this.base*this.altura;
    }
}
