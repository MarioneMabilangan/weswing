package com.example.weswing.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.weswing.model.Assistent;
import com.example.weswing.adapters.AssistentAdapter;
import com.example.weswing.R;

import java.util.ArrayList;
import java.util.List;

public class Assistents extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AssistentAdapter assistentAdapter;
    private List<Assistent> assistentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistents);
        getSupportActionBar().hide();

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Assistents.this, Moguda.class);
                startActivity(i);
            }
        });

        recyclerView = findViewById(R.id.recyclerAssistents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        assistentList = new ArrayList<>();
        assistentList.add(new Assistent(R.drawable.usuario1, "Sara Rodríguez", "Dancer"));
        assistentList.add(new Assistent(R.drawable.usuario2, "Pablo López", "Professor"));
        assistentList.add(new Assistent(R.drawable.usuario3, "María García", "Dancer"));
        assistentList.add(new Assistent(R.drawable.usuario4, "Carlos Martínez", "Professor"));

        assistentAdapter = new AssistentAdapter(assistentList);

        recyclerView.setAdapter(assistentAdapter);

        ImageView calendar = findViewById(R.id.back5);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (Assistents.this, Calendar.class);
                startActivity(a);
            }
        });
    }
}