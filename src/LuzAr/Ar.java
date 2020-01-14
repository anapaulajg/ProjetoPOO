package LuzAr;

public class Ar implements ICasa {
    boolean estado = false;

    @Override
    public void ligar() {
        estado = true;
    }

    @Override
    public void desligar() {
        estado = false;
    }

    @Override
    public boolean status() {
        return this.estado;
    }
}

