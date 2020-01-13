package ExemploAula;

public class Mamifero extends Animal {
    public boolean mama;

    public Mamifero() {
        super("Mamifero",0);
        mama = false;
    }

    public void mamando() {
        mama = true;
    }
}
