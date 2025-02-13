package Ejercicios_POO.MaquinaExpendedora;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<MaquinaExpendedora> maquinas = new ArrayList<>();
        MaquinaExpendedora maquina = new MaquinaExpendedora(1);
        maquinas.add(maquina);
        Cajon cajon = new Cajon(1,maquina);

        Cliente kevin = new Cliente("Kevin",4, cajon);
        clientes.add(kevin);

        Ticket ticketbus = new Ticket("Ticket",5,kevin,maquina);
        maquina.addTicket(ticketbus);

        kevin.addTicket(ticketbus);

        double saldo = Math.round(kevin.getDinero() * 100.0) / 100.0;



        System.out.println("Saldo: " + saldo + "€");

    }
}
