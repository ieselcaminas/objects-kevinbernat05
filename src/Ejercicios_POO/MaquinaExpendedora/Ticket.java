package Ejercicios_POO.MaquinaExpendedora;

public class Ticket {
    private String nombre;
    private double importe;
    private Cliente cliente;
    private MaquinaExpendedora maquina;

    public Ticket(String nombre, double importe, Cliente cliente, MaquinaExpendedora maquina) {
        this.nombre = nombre;
        this.importe = importe;
        this.cliente = cliente;
        this.maquina = maquina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MaquinaExpendedora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }
}
