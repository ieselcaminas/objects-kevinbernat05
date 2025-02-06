package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Exemplar {
    private int n_reg;
    private Llibre llibre;
    private Lector lector;
    private List<Lector> lectores;

    public Exemplar(Llibre llibre, int n_reg, Lector lector) {
        this.llibre = llibre;
        this.n_reg = n_reg;
        this.lectores = new ArrayList<>();
        this.lector = lector;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }
    public List<Lector> getLectores() {
        return lectores;
    }
    public void addLectores(Lector lector) {
        this.lectores.add(lector);
    }

    @Override
    public String toString() {
        return llibre.toString();
    }
}
