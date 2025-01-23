package Herencia.Trabajadores;

public final class tecnico extends operario{
    tecnico(String nombre){super(nombre);}

    @Override
    public String toString() {
        return super.getNombre();
    }
    @Override
    public void puesto() {
        System.out.println("Soy tecnico");
    }
}
