package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String nombre;
    private int cod_t;
    private List<Llibre> llibres;

    public Tema(String nombre, int cod_t) {
        this.nombre = nombre;
        this.cod_t = cod_t;
        this.llibres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
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
