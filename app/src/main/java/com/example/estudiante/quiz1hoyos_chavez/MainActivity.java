package com.example.estudiante.quiz1hoyos_chavez;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnMainLogin;
    private TextView tvBienvenido;
    private EditText edtUserFormName;
    private EditText edtUserFormPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBienvenido = findViewById(R.id.tv_Bienvenido);
        edtUserFormName =findViewById(R.id.edt_username);
        edtUserFormPassword = findViewById(R.id.edt_password);
        btnMainLogin= findViewById(R.id.btn_login);

        btnMainLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String admin1=  edtUserFormName.getText().toString() ;
                String pass1= edtUserFormPassword.getText().toString() ;
String admin = "Administrador";
String pass= "123456";
               // int password = Integer.parseInt(edtUserFormPassword.getText().toString());

                if(pass1.equals(pass) && admin1.equals(admin)){

                    Intent ingreso=
                            new Intent(getApplicationContext(),Login.class);

                    startActivityForResult(ingreso,Constants.REQ_NEW_LOGIN);

                }else{
                    Toast.makeText(MainActivity.this,"Datos incorrectos",Toast.LENGTH_SHORT).show();
                }



            }
        });



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
