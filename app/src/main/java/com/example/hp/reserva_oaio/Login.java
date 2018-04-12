package com.example.hp.reserva_oaio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity{

    Button btn;
    EditText Nombre,PSW;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Nombre =  findViewById(R.id.Nombre);
        PSW = findViewById(R.id.psw);
        btn = findViewById(R.id.btn);
        mensaje = findViewById(R.id.textView);
    }

    public void validar(View view) {
        if(Nombre.getText().toString().equals("Obed")&&PSW.getText().toString().equals("hola")){
            Intent intento = new Intent(this,MainActivity.class);
            intento.putExtra("nombre","Obed");
            startActivity(intento);
        }else{
            mensaje.setText("Nombre o Contraseña incorrectos");
        }
    }
}
