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
import com.example.aplicacionlibros.Entidades.LibroDigital;
import com.example.aplicacionlibros.R;

public class MainActivity_LibroDigital extends AppCompatActivity {

    private TextView txtdigital;
    private EditText titulo,autor,editorial,genero,web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__libro_digital);

        txtdigital=findViewById(R.id.resultadodigital);
        titulo=findViewById(R.id.titulodigital);
        autor=findViewById(R.id.autordigital);
        editorial=findViewById(R.id.editorialdigital);
        genero=findViewById(R.id.generodigital);
        web=findViewById(R.id.webdigital);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void digital(View view){

        if(titulo.length()>0 && autor.length()>0 && editorial.length()>0 && genero.length()>0   &&  web.length()>0){
            LibroDigital librodigital=new LibroDigital(titulo.getText().toString(),autor.getText().toString(),editorial.getText().toString(),genero.getText().toString(),web.getText().toString());

            txtdigital.setText(librodigital.Info()+Web()+librodigital.getPaginaWeb());
            borrar();

        }else {
            Toast.makeText(this, msg(), Toast.LENGTH_SHORT).show();
        }
    }
    public void atras(View view){
        retroceder();
    }


    private void borrar(){
        titulo.setText("");
        autor.setText("");
        editorial.setText("");
        genero.setText("");
        web.setText("");
    }

    private String msg(){

        return "COMPLETE LOS ESPACIOS EN BLANCO";
    }

    private void retroceder(){
        Intent digital = new Intent(MainActivity_LibroDigital.this, MainActivity.class);
        startActivity(digital);
    }

    private String Web(){

        return "\nPagina Web : ";
    }
}
