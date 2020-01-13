package ExemploAula;

public class Humano extends Mamifero {
    public boolean fala;

    public Humano () {
        super();
        fala = false;
    }
    public void falando() {
        fala = true;
    }
}
