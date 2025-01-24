package Herencia.Network;

public class fotografia extends publicacion {
    private String titulo;
    private String fotografia;
    public fotografia(String usuario,int ID) {super(usuario,ID);}

    public fotografia(String usuario ,int ID, String titulo, String fotografia) {
        super(usuario,ID);
        this.titulo = titulo;
        this.fotografia = fotografia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    @Override
    public String toString() {
        return this.getFecha() + " - " + this.getID()+ " - " + this.getUsuario()
                + " ha subido: "+ this.getTitulo()+ " - Archivo: "+ this.getFotografia();
    }
}
