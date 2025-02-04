package Ejercicios_POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private List<Profesor> profesores;

    public Catedra(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void addProfesore(Profesor profesor) {
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
