package Ejercicios_POO.Subasta;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numero;
    private float precio_salida;
    private Subasta subasta;
    private List<Articulo> articulos;
    private List<Puja> pujas;

    public Lote(int numero, float precio_salida, Subasta subasta) {
        this.numero = numero;
        this.precio_salida = precio_salida;
        this.articulos = new ArrayList<>();
        this.subasta = subasta;
        this.pujas = new ArrayList<>();
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrecio_salida() {
        return precio_salida;
    }

    public void setPrecio_salida(float precio_salida) {
        this.precio_salida = precio_salida;
    }

    public List<Articulo> getArticulos() {
        return this.articulos;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public List<Puja> getPujas() {
        return this.pujas;
    }

    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return "Lote numero: " + this.numero;
    }
}
