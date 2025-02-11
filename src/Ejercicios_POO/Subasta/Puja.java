package Ejercicios_POO.Subasta;

public class Puja implements Comparable<Puja> {
    private Pujador pujador;
    private float puja;
    private Lote lote;

    public Puja(Pujador pujador, float puja, Lote lote) {
        this.pujador = pujador;
        this.puja = puja;
        this.lote = lote;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public float getPuja() {
        return puja;
    }

    public void setPuja(float puja) {
        this.puja = puja;
    }

    @Override
    public String toString() {
        return "El pujador: " + pujador.getNombre() + ", puja: " + puja;
    }

    @Override
    public int compareTo(Puja o) {
        return Float.compare(o.getPuja(), this.getPuja());
    }
}
