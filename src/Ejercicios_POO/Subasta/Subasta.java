package Ejercicios_POO.Subasta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subasta {
    private String fecha;
    private List<Lote> lotes;

    public Subasta(String fecha) {
        this.fecha = fecha;
        this.lotes = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Lote> getLotes() {
        return this.lotes;
    }

    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }

    @Override
    public String toString() {
        return "La subasta se realizara: " + this.fecha;
    }

    public void cerrarSubasta() {
        for (Lote lote : this.lotes) {
            List<Puja> pujas = lote.getPujas();

            if (pujas.isEmpty()) {
                System.out.println("No adjudicado");
            } else {
                Puja pujaGanadora = Collections.max(pujas); // Encuentra la mejor puja
                System.out.println("Lote " + lote.getNumero() + " adjudicado a " +
                        pujaGanadora.getPujador().getNombre() + " por " + pujaGanadora.getPuja() + "€");
            }
            }
        }
    }

