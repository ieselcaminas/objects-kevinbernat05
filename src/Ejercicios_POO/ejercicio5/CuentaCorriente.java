package Ejercicios_POO.ejercicio5;

import Ejercicios_POO.ejercicio3.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {
    private int n_cc;
    private List<Cliente> clientes;
    private List<Domiciliacion> domiciliaciones;

    public CuentaCorriente(int n_cc) {
        this.n_cc = n_cc;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public void addDomiciliacion(Domiciliacion domiciliaciones) {
        this.domiciliaciones.add(domiciliaciones);
    }
    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    @Override
    public String toString() {
        return this.n_cc + " ";
    }
}
