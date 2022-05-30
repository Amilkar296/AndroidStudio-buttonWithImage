package com.example.sistemasdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class imagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
    }
    public void Ini(View view)
    {
        Intent retIn=new Intent(this, MainActivity.class);
        startActivity(retIn);
    }
}