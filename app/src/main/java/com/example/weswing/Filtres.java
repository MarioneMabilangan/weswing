package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Filtres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtres);
        getSupportActionBar().hide();

        TextView botonCole = findViewById(R.id.AplicarFiltres);
        botonCole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Filtres.this, Calendar.class);
                startActivity(intent);
            }
        });

        ImageView news = findViewById(R.id.back2);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Filtres.this, Newsfeed.class);
                startActivity(a);
            }
        });
    }
}