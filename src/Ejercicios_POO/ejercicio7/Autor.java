package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private int dni;
    private List<Llibre> llibres;

    public Autor(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.llibres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }
    public void addLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
