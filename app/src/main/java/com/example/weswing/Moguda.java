package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Moguda extends AppCompatActivity {
    CardView escola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moguda);
        getSupportActionBar().hide();

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Moguda.this, Newsfeed.class);
                startActivity(i);
            }
        });

        Button assistentsButton = findViewById(R.id.assistentsButton);
        assistentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Moguda.this, Assistents.class);
                startActivity(i);
            }
        });

        escola =findViewById(R.id.mogudaOrganitzador);
        escola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Moguda.this, Escola.class);
                startActivity(i);
            }
        });

        ImageView calendar = findViewById(R.id.back5);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Moguda.this,Calendar.class);
                startActivity(a);
            }
        });
    }
}