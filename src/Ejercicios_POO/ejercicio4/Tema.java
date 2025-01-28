package Ejercicios_POO.ejercicio4;

public class Tema {
    private String nombre_tema;

    public Tema(String nombre_tema) {
        this.nombre_tema = nombre_tema;
    }

    public String getNombre_tema() {
        return nombre_tema;
    }

    public void setNombre_tema(String nombre_tema) {
        this.nombre_tema = nombre_tema;
    }

    @Override
    public String toString() {
        return "Tema: " + this.nombre_tema;
    }
}
