package Herencia.Network;

public class Usuario {
    private String nombre;
    private int nick;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.nick = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNick() {
        return nick;
    }

    public void setNick(int nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return this.nick + " - " + this.nombre;
    }
}
