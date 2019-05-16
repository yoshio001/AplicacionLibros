package com.example.aplicacionlibros.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.aplicacionlibros.R;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.RadioGroup);
    }

    public void siguiente(View view){

            switch ((radioGroup.getCheckedRadioButtonId())) {
                case R.id.rbfisico:
                    fisico();
                    break;
                case R.id.rbdigital:
                    digital();
                    break;
                default:
                    Toast.makeText(this, msg(), Toast.LENGTH_SHORT).show();
            }
        }

        private String msg(){

        return "COMPLETE LOS ESPACIOS EN BLANCO";
        }

        private void fisico(){
             Intent fisico = new Intent(MainActivity.this, MainActivity_LibroFisico.class);
            startActivity(fisico);
        }

        private void digital(){
            Intent digital = new Intent(MainActivity.this, MainActivity_LibroDigital.class);
            startActivity(digital);
        }
    }
