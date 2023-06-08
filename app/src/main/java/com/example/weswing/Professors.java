package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Professors extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AssistentAdapter assistentAdapter;
    private List<Assistent> assistentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professors);
        getSupportActionBar().hide();

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Professors.this, Escola.class);
                startActivity(i);
            }
        });

        recyclerView = findViewById(R.id.recyclerAssistents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        assistentList = new ArrayList<>();
        assistentList.add(new Assistent(R.drawable.usuario1, "Laura Pérez", "Professor"));
        assistentList.add(new Assistent(R.drawable.usuario2, "Daniel Ramírez", "Professor"));
        assistentList.add(new Assistent(R.drawable.usuario3, "Ana Morales", "Professor"));
        assistentList.add(new Assistent(R.drawable.usuario4, "Eduardo Fernández", "Professor"));

        assistentAdapter = new AssistentAdapter(assistentList);

        recyclerView.setAdapter(assistentAdapter);

        ImageView calendar = findViewById(R.id.back5);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Professors.this,Calendar.class);
                startActivity(a);
            }
        });
    }
}