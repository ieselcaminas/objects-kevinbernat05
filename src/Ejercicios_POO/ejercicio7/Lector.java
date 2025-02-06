package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;
    private String dni;
    private List<Exemplar> exemplars;

    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.exemplars = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public List<Exemplar> getExemplars() {
        return exemplars;
    }
    public void addExemplar(Exemplar exemplar) {
        this.exemplars.add(exemplar);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.dni;
    }
}
