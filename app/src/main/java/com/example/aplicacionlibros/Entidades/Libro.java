package com.example.aplicacionlibros.Entidades;

import android.os.Build;
import android.support.annotation.RequiresApi;
import java.util.concurrent.ThreadLocalRandom;

public class Libro {
    private String titulo,autor,editorial,genero,msg;

    public Libro(String titulo, String autor, String editorial, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
    }

    private String GenNom(){
        return titulo.substring(0,2);
    }

    private String GenAu(){
        return autor.substring(0,2);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private int GenCodigo(){
        return ThreadLocalRandom.current().nextInt(99,999);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String Info(){
        return msg= codigo()+GenNom()+GenAu()+GenCodigo()+
                    titulo()+titulo+
                    autor()+autor+
                    editorial()+editorial+
                    genero()+genero;
    }


    private String codigo(){

        return"Codigo : ";
    }

    private String titulo(){

        return "\nTitulo : ";
    }

    private String autor(){

        return "\nAutor : ";
    }

    private String editorial(){

        return "\nEditorial : ";
    }

    private String genero(){

        return "\nGenero : ";
    }


}
