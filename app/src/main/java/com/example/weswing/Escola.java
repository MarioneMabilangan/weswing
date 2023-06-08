package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Escola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escola);
        getSupportActionBar().hide();

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Escola.this, Moguda.class);
                startActivity(i);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView mogudesPantalla = findViewById(R.id.mogudes);
        mogudesPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Escola.this, Moguda.class);
                startActivity(intent);
            }
        });

        TextView professorsTextView = findViewById(R.id.text_view_professors);
        professorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Escola.this, Professors.class);
                startActivity(intent);
            }
        });

        ImageView calendar = findViewById(R.id.back5);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Escola.this,Calendar.class);
                startActivity(a);
            }
        });
    }
}