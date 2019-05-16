package com.example.aplicacionlibros.Entidades;

public class LibroDigital extends Libro {
    private  String paginaWeb;

    public LibroDigital(String titulo, String autor, String editorial, String genero, String paginaWeb) {
        super(titulo, autor, editorial, genero);
        this.paginaWeb = paginaWeb;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
}
