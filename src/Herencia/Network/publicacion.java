package Herencia.Network;
import java.util.ArrayList;
import java.util.Date;

public abstract class publicacion {
    private String usuario;
    private int ID;
    private Date fecha;
    private int Likes;

    public publicacion(String usuario, int ID) {
        this.usuario = usuario;
        this.ID = ID;
        this.fecha = new Date();
        this.Likes = 0;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public int getID() {
        return ID;
    }
    public int getLikes() {
        return Likes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void darLike(){
        this.Likes++;
    }
    public void disLike(){
        this.Likes--;
    }

    public void comentarios(){
        ArrayList<String> comentarios = new ArrayList<>();
        comentarios.add("Flipas con los frikis");
        comentarios.add("Buena foto broder.");
    }
}

