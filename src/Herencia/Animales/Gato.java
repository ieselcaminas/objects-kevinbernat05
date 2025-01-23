package Herencia.Animales;

public class Gato extends Mamifero {
    Gato(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse() {
        System.out.println("Miau");
    }
    public void jugarOvillo() {
        System.out.println("Jugando con ovillo");
    }
}
