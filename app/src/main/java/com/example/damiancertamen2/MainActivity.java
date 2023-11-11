package com.example.damiancertamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText correo;
    private EditText asunto;
    private EditText tex;
    private EditText copia;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private CheckBox ch;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = (EditText) findViewById(R.id.lblCorreo);
        asunto = (EditText) findViewById(R.id.lblAsunto);
        tex = (EditText) findViewById(R.id.lblTextoAnterior);
        copia = (EditText) findViewById(R.id.lblCopia);
        rb1 = findViewById(R.id.rbOpc1);
        rb2 = findViewById(R.id.rbRH);
        rb3 = findViewById(R.id.rbAdmin);
        ch = findViewById(R.id.chxDeseo);
        sp = findViewById(R.id.spinner2);
        String arreglo[]= {"cotizacion.pdf", "ordenDeCompra", "Boleta.pdf"};
        ArrayAdapter<String> arreglo1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arreglo);
        sp.setAdapter(arreglo1);
    }

    public void ver(View view){
        Intent intent = new Intent(this, Segundo.class);
    }

}