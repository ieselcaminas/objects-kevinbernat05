package Herencia.Trabajadores;

public class main {
    public static void main(String[] args) {
        directivo directivo = new directivo("Paquito");
        directivo.puesto();
        System.out.println(directivo.getNombre());
        System.out.println("--------------");

        oficial oficial = new oficial("Ramon");
        oficial.puesto();
        System.out.println(oficial.getNombre());
        System.out.println("--------------");

        tecnico tecnico = new tecnico("Sofia");
        tecnico.puesto();
        System.out.println(tecnico.getNombre());
    }
}
