package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Inici extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inici);
        getSupportActionBar().hide();

        Button registro = findViewById(R.id.registro);
        Button login = findViewById(R.id.iniciar);
        Intent i = new Intent(Inici.this, Registre.class);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inici.this, Newsfeed.class);
                startActivity(i);
            }
        });
    }
}