package Herencia.Animales;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Kala");
        System.out.println(perro);
        perro.comunicarse();
        perro.traerZapatillas();
        perro.respirar();
        perro.moverse();
        System.out.println("-----");

        Gato gato = new Gato("Tom");
        System.out.println(gato);
        gato.comunicarse();
        gato.jugarOvillo();
        gato.respirar();
        gato.moverse();
        System.out.println("-----");

        Tiburon tibu = new Tiburon("Tibu");
        System.out.println(tibu);
        tibu.comunicarse();
        tibu.respirar();
        tibu.moverse();
        System.out.println("-----");

        PezPayaso nemo = new PezPayaso("Nemo");
        System.out.println(nemo);
        nemo.comunicarse();
        nemo.respirar();
        nemo.moverse();


    }
}
