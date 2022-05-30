package com.example.sistemasdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void coffee_class(View view)
    {
        //Toast.makeText(this, "IMAGEN DEL ARCHIVO coffee.jpg", Toast.LENGTH_LONG).show();
        Intent sigImCoffe=new Intent(this, coffe.class);
        startActivity(sigImCoffe);
    }
    public void imagen_class(View view)
    {
        //Toast.makeText(this, "IMAGEN DEL ARCHIVO imagen.png", Toast.LENGTH_LONG).show();
        Intent sigImImagen=new Intent(this, imagen.class);
        startActivity(sigImImagen);
    }
    public void SigCoffe(View view)
    {
        Intent sigCoffe=new Intent(this, coffe.class);
        startActivity(sigCoffe);
    }
}