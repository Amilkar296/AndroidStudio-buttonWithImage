package com.example.sistemasdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class coffe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe);
    }
    public void RetInicio(View view)
    {
        Intent retInicio=new Intent(this, MainActivity.class);
        startActivity(retInicio);
    }
    public void Inici(View view)
    {
        Intent retIn=new Intent(this, MainActivity.class);
        startActivity(retIn);
    }
}