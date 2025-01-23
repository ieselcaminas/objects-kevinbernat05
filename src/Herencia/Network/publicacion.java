package Herencia.Network;
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

    public void setLikes(int likes) {
        Likes = likes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void darLike(){
        this.Likes++;
    }
}

