package com.example.weswing.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weswing.R;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        getSupportActionBar().hide();

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Perfil.this, Newsfeed.class);
                startActivity(i);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView mogudesTextView = findViewById(R.id.text_view_mogudes);
        mogudesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil.this, Moguda.class);
                startActivity(intent);
            }
        });

        ImageView calendar = findViewById(R.id.back5);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Perfil.this, Calendar.class);
                startActivity(a);
            }
        });
    }
}