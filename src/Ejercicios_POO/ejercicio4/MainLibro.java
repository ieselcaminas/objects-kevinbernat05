package Ejercicios_POO.ejercicio4;

public class MainLibro {
    public static void main(String[] args) {
        Autor kevin = new Autor("Kevin","05/01/2000");
        Tema Terror = new Tema("Terror");
        Libro asdasd = new Libro("Miedito", kevin, 200, Terror);

        System.out.println(asdasd);
    }
}
