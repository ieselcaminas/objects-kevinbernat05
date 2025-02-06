package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private int cod_ed;
    private String nombre;
    private List<Llibre> llibres;

    public Editorial(int cod_ed, String nombre) {
        this.cod_ed = cod_ed;
        this.nombre = nombre;
        this.llibres = new ArrayList<>();
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Llibre> getLlibres() {
        return llibres;
    }
    public void addLlibre(Llibre l) {
        llibres.add(l);
    }

    @Override
    public String toString() {
        return this.cod_ed + " " + this.nombre;
    }
}
