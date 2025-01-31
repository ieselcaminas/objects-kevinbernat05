package Ejercicios_POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private Banco banco;
    private List<Prestamo> prestamos;
    private List<CuentaCorriente> cuentas;

    public Sucursal(int n_suc, String localizacion, Banco banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = banco;
        this.prestamos = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }
    public int getN_suc() {
        return n_suc;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    public void addPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public List<CuentaCorriente> getCuentas() {
        return cuentas;
    }
    public void addCuentas(CuentaCorriente cuenta) {
        this.cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return this.n_suc + " - " + this.localizacion;
    }
}
