package Herencia.Animales;

public class PezPayaso extends Pez {
    public PezPayaso(String nombre) {
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Me comunico mediante burbujas");
    }
}
