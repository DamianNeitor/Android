package com.example.damiancertamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText correo,asunto,tex;
    private String correo_;
    private RadioButton rb1,rb2,rb3;
    private CheckBox ch;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText) findViewById(R.id.lblCorreo);
        asunto = (EditText) findViewById(R.id.lblAsunto);
        tex = (EditText) findViewById(R.id.lblTextoAnterior);
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
        correo_ = correo.getText().toString();
        String asunto_ = asunto.getText().toString();
        String tex_ = tex.getText().toString();


        Intent intent = new Intent(this, Segundo.class);
        if(!validacionDecorreoElectronico()){
            correo.setError("Correo Invalido");
        }else {
            intent.putExtra("1", correo_);
            intent.putExtra("2", asunto_);
            intent.putExtra("3", tex_);
            intent.putExtra("4", radioButtons());
            intent.putExtra("5", notificacion());
            intent.putExtra("6", sp.getSelectedItem().toString());
            correo.setTextColor(Color.GREEN);
            startActivity(intent);
        }
    }

    public Boolean validacionDecorreoElectronico(){
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(getCorreo_()).matches();
    }

    public String radioButtons(){
        if(rb1.isChecked())
            return "gerencia general";
        else if (rb2.isActivated())
            return "recursos Humanos";
        else if(rb3.isChecked())
            return "administrativo";
        return "";
    }

    public String notificacion(){
        return ch.isChecked() ? "si deseo recibir notificaciones" :"no deseo recibir notificaciones";
    }

    public String getCorreo_(){
        return correo_;
    }
}