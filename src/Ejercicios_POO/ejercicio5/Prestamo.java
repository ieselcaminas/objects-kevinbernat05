package Ejercicios_POO.ejercicio5;

public class Prestamo {
    private int n_prestamo;
    private int cantidad;
    private Cliente cliente;

    public Prestamo(int n_prestamo, int cantidad, Cliente cliente) {
        this.n_prestamo = n_prestamo;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public int getN_prestamo() {
        return n_prestamo;
    }

    public void setN_prestamo(int n_prestamo) {
        this.n_prestamo = n_prestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.n_prestamo + " " + this.cantidad;
    }
}
