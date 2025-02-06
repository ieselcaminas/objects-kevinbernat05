package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Lector> lectores = new ArrayList<>();
        List<Editorial> editorials = new ArrayList<Editorial>();
        List<Tema> temas = new ArrayList();

        Tema Terror = new Tema("Terror", 1);
        temas.add(Terror);

        Tema Fantasia = new Tema("Fantasia", 2);
        temas.add(Fantasia);

        Editorial Alba = new Editorial(1, "Alba");
        editorials.add(Alba);

        Llibre Quijote = new Llibre("Quijote", 123456, Alba, Fantasia);
        Alba.addLlibre(Quijote);
        Fantasia.addLlibre(Quijote);

        Autor Cervantes = new Autor("Cervantes", 12314);
        Quijote.addAutor(Cervantes);
        Cervantes.addLlibre(Quijote);

        Lector Kevin = new Lector("Kevin", "11421412");
        lectores.add(Kevin);

        Exemplar primero = new Exemplar(Quijote, 1, Kevin );
        Quijote.addExemplar(primero);
        Kevin.addExemplar(primero);
        primero.addLectores(Kevin);

        for (Editorial editorial : editorials) {
            System.out.println(editorial.getNombre());

            for (Llibre l: editorial.getLlibres()) {
                System.out.println("\t" + l.getNombre() + l.getAutores() + l.getTema());
            }
        }


        System.out.println("---------");

        for (Lector lector : lectores) {
            System.out.println(lector.getNombre() + " - Dni: " + lector.getDni());

            for (Exemplar e: lector.getExemplars()){
                System.out.println("\t" + e.getLlibre().getNombre() + " - Tema: " + e.getLlibre().getTema().getNombre());
                }
        }

    }
}
