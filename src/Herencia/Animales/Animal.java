/**
 * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
 */
package Herencia.Animales;
public abstract class Animal
{
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void moverse();
    public abstract void respirar();
    public abstract void comunicarse();

    public String toString() {
        return "Animal: " + nombre;
    }
}
