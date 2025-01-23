package Herencia.Network;
import java.util.Date;

public abstract class publicacion {
    private String usuario;
    private int ID;
    private Date fecha;

    public publicacion(String usuario, int ID) {
        this.usuario = usuario;
        this.ID = ID;
        this.fecha = new Date();
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}

