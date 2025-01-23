package Herencia.Trabajadores;

public abstract class empleado {
    private String nombre;

    public empleado(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public abstract String toString();
    public abstract void puesto();
}
