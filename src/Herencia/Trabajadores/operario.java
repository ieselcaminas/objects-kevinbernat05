package Herencia.Trabajadores;

public abstract class operario extends empleado {
    operario(String nombre) { super(nombre);}

    @Override
    public String toString() {
        return this.getNombre();
    }
}
