package com.example.gymapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrarCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrar_cuenta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void continuar(View v){
        Toast.makeText(this,"Continuar",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void avanzar(View V){

        EditText campo1=this.findViewById(R.id.nombre);
        String nombre = campo1.getText().toString();

        EditText campo2=this.findViewById(R.id.apellido);
        String apellido = campo2.getText().toString();

        EditText campo3 = this.findViewById(R.id.correo);
        String correo = campo3.getText().toString();

        EditText campo4=this.findViewById(R.id.contrasena);
        String contrasena=campo4.getText().toString();

        EditText campo5= this.findViewById(R.id.contrasena2);
        String contrasena2=campo5.getText().toString();

        EditText campo6=this.findViewById(R.id.altura);
        String altura=campo6.getText().toString();

        EditText campo7=this.findViewById(R.id.peso);
        String peso = campo7.getText().toString();

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("peso",peso);
        startActivity(i);
    }

}