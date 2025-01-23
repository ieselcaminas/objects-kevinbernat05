package Herencia.Trabajadores;

public final class oficial extends operario{
    oficial(String nombre){super(nombre);}

    @Override
    public String toString() {
        return super.getNombre();
    }
    @Override
    public void puesto() {
        System.out.println("Soy oficial");
    }
}
