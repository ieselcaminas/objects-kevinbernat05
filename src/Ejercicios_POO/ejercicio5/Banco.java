package Ejercicios_POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private int numero;
    private List<Sucursal> sucursales;

    public Banco(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.sucursales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public List<Sucursal> getSucursales() {
        return sucursales;
    }
    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.numero;
    }
}
