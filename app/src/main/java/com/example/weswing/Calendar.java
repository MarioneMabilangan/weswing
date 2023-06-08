package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Calendar extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CalendariAdapter calendariAdapter;
    private List<Calendari> calendariList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        getSupportActionBar().hide();

        TextView botonFiltros = findViewById(R.id.filtres);
        botonFiltros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calendar.this, Filtres.class);
                startActivity(intent);
            }
        });
        recyclerView = findViewById(R.id.recyclerMogudes);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        calendariList = new ArrayList<>();
        calendariList.add(new Calendari(R.drawable.usuario5, "17 de abril de 2017", "I'm beggining to see the light","Organitzat per Big Mama","17/04/2017-17/04/2017 | 2horas","Madrid, Spain"));
        calendariList.add(new Calendari(R.drawable.usuario5, "18 de abril de 2017", "Big Martes","Organitzat per Big Mama","18/04/2017-18/04/2017 | 2horas","Madrid, Spain"));
        calendariList.add(new Calendari(R.drawable.usuario5, "19 de abril de 2017", "I'm beggining to see the light","Organitzat per Big Mama","19/04/2017-19/04/2017 | 2horas","Madrid, Spain"));
        calendariList.add(new Calendari(R.drawable.usuario5, "20 de abril de 2017", "Big Miércoles","Organitzat per Big Mama","20/04/2017-20/04/2017 | 2 horas","Madrid, Spain"));
        calendariList.add(new Calendari(R.drawable.usuario5, "21 de abril de 2017", "I'm seeing the light","Organitzat per Big Mama","21/04/2017-21/04/2017 | 2 horas","Madrid, Spain"));
        calendariList.add(new Calendari(R.drawable.usuario5, "22 de abril de 2017", "Big Jueves","Organitzat per Big Mama","22/04/2017-22/04/2017 | 2 horas","Madrid, Spain"));
        calendariAdapter = new CalendariAdapter(calendariList);

        recyclerView.setAdapter(calendariAdapter);

        ImageView news = findViewById(R.id.back2);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Calendar.this, Newsfeed.class);
                startActivity(a);
            }
        });
    }
}