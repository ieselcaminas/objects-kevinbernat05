package Herencia.Network;

import java.util.Scanner;

public class Mensaje extends Publicacion {
    private String texto;
    public Mensaje(Usuario usuario, int ID) {super(usuario,ID);}

    public Mensaje(Usuario usuario, String texto, int ID) {
        super(usuario, ID);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.getFecha() + " - " + this.getID() + " - " + this.getUsuario()
                + ": " + this.getTexto()+ " - " + " Likes: " + this.getLikes();
    }
}
