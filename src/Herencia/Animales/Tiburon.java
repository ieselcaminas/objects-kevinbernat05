package Herencia.Animales;

public class Tiburon extends Pez {
    public Tiburon(String nombre) {
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Me comunico por las aletas");
    }

}
