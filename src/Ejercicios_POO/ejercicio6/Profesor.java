package Ejercicios_POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private int dni;
    private Departamento departamento;
    private List<Catedra> catedras;

    public Profesor(String nombre, int dni, Departamento departamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.departamento = departamento;
        this.catedras = new ArrayList<>();
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

    public Departamento getDepartament() {
        return departamento;
    }

    public void setDepartament(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Catedra> getCatedras() {
        return catedras;
    }
    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.dni;
    }
}
