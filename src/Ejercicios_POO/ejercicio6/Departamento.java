package Ejercicios_POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private int n_dep;
    private List<Catedra> catedras;
    private List<Profesor> profesores;

    public Departamento(int n_dep, String nombre) {
        this.nombre = nombre;
        this.n_dep = n_dep;
        this.catedras = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_dep() {
        return n_dep;
    }

    public void setN_dep(int n_dep) {
        this.n_dep = n_dep;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return this.n_dep + " " + this.nombre;
    }
}
