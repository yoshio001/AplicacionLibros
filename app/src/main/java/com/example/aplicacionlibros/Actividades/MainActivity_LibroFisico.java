package com.example.aplicacionlibros.Actividades;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.aplicacionlibros.Entidades.LibroFisico;
import com.example.aplicacionlibros.R;

public class MainActivity_LibroFisico extends AppCompatActivity {
    private TextView txtFisico;
    private EditText titulo,autor,editorial,genero,biblioteca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__libro_fisico);
        txtFisico = findViewById(R.id.resultadofisico);
        titulo = findViewById(R.id.titulofisico);
        autor = findViewById(R.id.autorfisico);
        editorial = findViewById(R.id.editorialfisico);
        genero = findViewById(R.id.generofisico);
        biblioteca = findViewById(R.id.bibliotecafisico);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void fisico(View view) {

        if (titulo.getText().toString().isEmpty() || autor.getText().toString().isEmpty() ||
                editorial.getText().toString().isEmpty() || genero.getText().toString().isEmpty() ||
                biblioteca.getText().toString().isEmpty()) {

            Toast.makeText(this, msg(), Toast.LENGTH_LONG).show();
        }else{

            LibroFisico librofisico = new LibroFisico(titulo.getText().toString(), autor.getText().toString(),
                    editorial.getText().toString(), genero.getText().toString(), biblioteca.getText().toString());

            txtFisico.setText(librofisico.Info() + biblioteca() + librofisico.getBiblioteca());

            borrar();
        }
    }

    public void atras(View view){
        retroceder();
    }


    private void retroceder(){
        Intent digital = new Intent(MainActivity_LibroFisico.this, MainActivity.class);
        startActivity(digital);
    }
    private void borrar(){
        titulo.setText("");
        autor.setText("");
        editorial.setText("");
        genero.setText("");
        biblioteca.setText("");
    }
    private String msg(){

        return "COMPLETE LOS ESPACIOS EN BLANCO";
    }

    private String biblioteca(){

        return "\nBiblioteca : ";
    }
}
