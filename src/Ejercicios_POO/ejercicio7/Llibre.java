package Ejercicios_POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Llibre {
    private String nombre;
    private int ISBN;
    private Editorial editorial;
    private Tema tema;
    private List<Autor> autores;
    private List<Exemplar> exemplars;

    public Llibre(String nombre, int ISBN, Editorial editorial, Tema tema) {
        this.nombre = nombre;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.tema = tema;
        this.autores = new ArrayList<>();
        this.exemplars = new ArrayList<>();

    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }
    public List<Exemplar> getExemplars() {
        return exemplars;
    }
    public void addExemplar(Exemplar exemplar) {
        this.exemplars.add(exemplar);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
