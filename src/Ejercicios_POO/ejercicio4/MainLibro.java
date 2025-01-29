package Ejercicios_POO.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        Autor kevin = new Autor("Kevin","05/01/2000");

        Libro asdasd = new Libro("Miedito", kevin, 200);
        asdasd.addTema(new Tema("Terror"));
        asdasd.addTema(new Tema("Accion"));
        libros.add(asdasd);


        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor().getNombre());
            for(Tema tema : libro.getTemas()){
                System.out.println(tema);
            }
        }
    }
}
