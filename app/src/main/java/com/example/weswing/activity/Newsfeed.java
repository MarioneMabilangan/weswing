package com.example.weswing.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weswing.R;

public class Newsfeed extends AppCompatActivity {
    ImageButton botonPerfil;
    TextView txtview1,txtview2,txtview3,txtview4,txtview5;
    ImageView flecha1, flecha2, flecha3, flecha4, flecha5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);
        getSupportActionBar().hide();
        txtview1 = findViewById(R.id.txtview1);
        txtview2= findViewById(R.id.txtview2);
        txtview3=findViewById(R.id.txtview3);
        txtview4=findViewById(R.id.txtview4);
        txtview5=findViewById(R.id.txtview5);
        flecha1=findViewById(R.id.flecha1);
        flecha2=findViewById(R.id.flecha2);
        flecha3=findViewById(R.id.flecha3);
        flecha4=findViewById(R.id.flecha4);
        flecha5=findViewById(R.id.flecha5);
        botonPerfil=findViewById(R.id.perfil);

        SpannableString spannableString = new SpannableString("I'm beginning to see the light (0 assistents) avui a las 22:10");
        applyColorSpan(spannableString, "I'm beginning to see the light", R.color.swing);

        SpannableString spannableString1 = new SpannableString("Angela Mena Also asistirà a Festa d'Inici de Trimestre i presentació dels professors! (5 assistents).");
        applyColorSpan(spannableString1, "Angela Mena Also", R.color.swing);
        applyColorSpan(spannableString1, "Festa d'Inici de Trimestre i presentació dels professors!", R.color.swing);

        SpannableString spannableString2 = new SpannableString("Cristina Sánchez assistirà a Classe oberta d'Afrobeat amb el Jordi Maho! (1 assistent).");
        applyColorSpan(spannableString2, "Cristina Sánchez", R.color.swing);
        applyColorSpan(spannableString2, "Classe oberta d'Afrobeat amb el Jordi Maho!", R.color.swing);

        SpannableString spannableString3 = new SpannableString("Cristina Sánchez assistirà a Classe oberta de Pilates amb la Lara Fontana! (1 assistent).");
        applyColorSpan(spannableString3, "Cristina Sánchez", R.color.swing);
        applyColorSpan(spannableString3, "Classe oberta de Pilates amb la Lara Fontana!", R.color.swing);

        SpannableString spannableString4 = new SpannableString("Juan Pérez va a asistir al Taller de Swing con Laura Gómez! (3 asistentes).");
        applyColorSpan(spannableString4, "Juan Pérez", R.color.swing);
        applyColorSpan(spannableString4, "Taller de Swing con Laura Gómez!", R.color.swing);

        txtview1.setText(spannableString);
        txtview2.setText(spannableString1);
        txtview3.setText(spannableString2);
        txtview4.setText(spannableString3);
        txtview5.setText(spannableString4);

        flecha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Newsfeed.this,Moguda.class);
                startActivity(i);
            }
        });

        flecha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Newsfeed.this,Moguda.class);
                startActivity(i);
            }
        });

        flecha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Newsfeed.this,Moguda.class);
                startActivity(i);
            }
        });

        flecha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Newsfeed.this,Moguda.class);
                startActivity(i);
            }
        });

        flecha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Newsfeed.this,Moguda.class);
                startActivity(i);
            }
        });

        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Newsfeed.this,Perfil.class);
                startActivity(a);
            }
        });

        ImageView calendar = findViewById(R.id.back5);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Newsfeed.this, Calendar.class);
                startActivity(a);
            }
        });


    }
    private void applyColorSpan(SpannableString spannableString, String textToHighlight, int color) {
        int startIndex = spannableString.toString().indexOf(textToHighlight);
        int endIndex = startIndex + textToHighlight.length();
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(getResources().getColor(color));
        spannableString.setSpan(colorSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

}