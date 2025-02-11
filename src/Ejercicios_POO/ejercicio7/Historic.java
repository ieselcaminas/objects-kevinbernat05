package Ejercicios_POO.ejercicio7;

public class Historic {
    private String data_p;
    private String data_t;
    private Exemplar exemplar;
    private Lector lector;

    public Historic(String data_p, String data_t, Exemplar exemplar, Lector lector) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.exemplar = exemplar;
        this.lector = lector;
    }

    public String getData_p() {
        return data_p;
    }

    public String getData_t() {
        return data_t;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public Lector getLector() {
        return lector;
    }

    @Override
    public String toString() {
        return this.data_p + this.data_t;
    }
}
