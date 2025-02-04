package Ejercicios_POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String ubicacion;
    private int cod_fac;
    private List<Catedra> catedras;

    public Facultad(String ubicacion, int cod_fac) {
        this.ubicacion = ubicacion;
        this.cod_fac = cod_fac;
        this.catedras = new ArrayList<>();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCod_fac() {
        return cod_fac;
    }

    public void setCod_fac(int cod_fac) {
        this.cod_fac = cod_fac;
    }
    public List<Catedra> getCatedras() {
        return catedras;
    }
    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return this.cod_fac + " " + this.ubicacion;
    }
}
