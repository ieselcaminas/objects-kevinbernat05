package Ejercicios_POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String nombre;
    List<Departamento> departamentos;

    public Area(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }
}
