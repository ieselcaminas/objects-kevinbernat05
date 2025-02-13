package Ejercicios_POO.MaquinaExpendedora;

import java.util.ArrayList;
import java.util.List;

public class MaquinaExpendedora {
    private int id;
    private List<Ticket> tickets;

    public MaquinaExpendedora(int id) {
        this.id = id;
        this.tickets = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<Ticket> getTickets() {
        return tickets;
    }
    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
}
