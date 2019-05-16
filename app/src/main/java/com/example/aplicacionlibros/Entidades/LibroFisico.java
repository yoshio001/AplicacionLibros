package com.example.aplicacionlibros.Entidades;

public class LibroFisico extends Libro {
    private String biblioteca;

    public LibroFisico(String titulo, String autor, String editorial, String genero, String biblioteca) {
        super(titulo, autor, editorial, genero);
        this.biblioteca = biblioteca;
    }

    public String getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }
}
