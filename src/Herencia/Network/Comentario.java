package Herencia.Network;

public class Comentario {
    private String texto;
    private Usuario usuario;
    private Publicacion publicacion;

    public Comentario(String texto, Usuario usuario, Publicacion publicacion) {
        this.texto = texto;
        this.usuario = usuario;
        this.publicacion = publicacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return usuario.getNombre() + " - " + publicacion.getID() + " - " + texto;
    }
}
