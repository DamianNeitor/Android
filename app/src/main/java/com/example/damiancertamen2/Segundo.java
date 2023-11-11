package com.example.damiancertamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Segundo extends AppCompatActivity {

    private TextView correoD,asunto,cuerpo,copia,notificaciones,archivo_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Intent i = getIntent();

        correoD = findViewById(R.id.txtdestinatarioR);
        asunto = findViewById(R.id.txtBlanco1);
        cuerpo = findViewById(R.id.txtBlanco2);
        copia = findViewById(R.id.txtBlanco3);
        notificaciones = findViewById(R.id.txtBlanco4);
        archivo_ = findViewById(R.id.txtAdjuntoo);

        String msjCorreo = i.getStringExtra("1");
        String msjAsunto =i.getStringExtra("2");
        String msjCuerpo = i.getStringExtra("3");
        String msjCopia = i.getStringExtra("4");
        String msjnotificaciones = i.getStringExtra("5");
        String msjArchivo = i.getStringExtra("6");

        correoD.setText(msjCorreo);
        asunto.setText(msjAsunto);
        cuerpo.setText(msjCuerpo);
        copia.setText(msjCopia);
        notificaciones.setText(msjnotificaciones);
        archivo_.setText(msjArchivo);
    }
}