package Ejercicios_POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {
    private int n_cc;
    private List<Cliente> clientes;

    public CuentaCorriente(int n_cc) {
        this.n_cc = n_cc;
        this.clientes = new ArrayList<>();
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

    @Override
    public String toString() {
        return this.n_cc + " ";
    }
}
