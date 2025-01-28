package Ejercicios_POO.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private Tema temas;

    public Libro(String titulo, Autor autor, int paginas, Tema temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Tema getTemas() {
        return temas;
    }

    public void setTemas(Tema temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + " - " + this.autor + " - "
                + "Paginas: " + this.paginas + " - " + this.temas;
    }
}
