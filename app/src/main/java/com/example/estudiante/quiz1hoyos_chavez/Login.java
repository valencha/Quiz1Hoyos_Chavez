package com.example.estudiante.quiz1hoyos_chavez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private TextView tvHola;
    private TextView tvMensaje;
    private Button btnCerrar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnCerrar= findViewById(R.id.btn_cerrar);
        tvHola= findViewById(R.id.tv_hola);
        tvMensaje= findViewById(R.id.tv_mensaje);


        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent respuesta = new Intent();


                setResult(Constants.RESP_NEW_LOGIN,respuesta);
                finish();
            }
        });
    }





}
