package Herencia.Network;

import java.util.Scanner;

public class mensaje extends publicacion {
    private String texto;
    public mensaje(String usuario, int ID) {super(usuario,ID);}

    public mensaje(String usuario, String texto, int ID) {
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
        return this.getFecha() + this.getUsuario() + ": " + this.getTexto() + " Likes: " + this.getLikes();
    }
    public void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario: ");
        this.setUsuario(sc.nextLine());
        System.out.println("Texto: ");
        this.setTexto(sc.nextLine());
        System.out.println("Introduzca ID: ");
        this.setID(sc.nextInt());
        mensaje mensaje = new mensaje(this.getUsuario(),this.getTexto(), this.getID());

    }
}
