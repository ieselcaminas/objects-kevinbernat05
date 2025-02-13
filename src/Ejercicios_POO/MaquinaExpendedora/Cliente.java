package Ejercicios_POO.MaquinaExpendedora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private double dinero;
    private Cajon cajon;
    private List<Ticket> tickets;

    public Cliente(String nombre,double dinero, Cajon cajon) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.cajon = cajon;
        tickets = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Cajon getCajon() {
        return cajon;
    }

    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }
    public List<Ticket> getTickets() {
        return tickets;
    }
    public void addTicket(Ticket ticket) {
        if (this.dinero >= ticket.getImporte()) {
            this.tickets.add(ticket);
            this.dinero -= ticket.getImporte();
        } else {
            System.out.println("Dinero insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Saldo: " + this.dinero;
    }
}
