package Herencia.Animales;

public class Perro extends Mamifero {
    Perro(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse() {
        System.out.println("Guau");
    }
    public void traerZapatillas() {
        System.out.println("Toma zapatillas.");
    }
}
