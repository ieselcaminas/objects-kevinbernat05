package Herencia.Trabajadores;

public class directivo extends empleado{
    directivo(String nombre){ super (nombre);}

    @Override
    public String toString() {
        return super.getNombre();
    }
    @Override
    public void puesto() {
        System.out.println("Soy directivo");
    }
}
