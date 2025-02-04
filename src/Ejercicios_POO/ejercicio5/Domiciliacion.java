package Ejercicios_POO.ejercicio5;

public class Domiciliacion {
    private int n_cc;
    private String concepto;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int n_cc, String concepto, CuentaCorriente cuentaCorriente) {
        this.n_cc = n_cc;
        this.concepto = concepto;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return this.concepto;
    }
}
