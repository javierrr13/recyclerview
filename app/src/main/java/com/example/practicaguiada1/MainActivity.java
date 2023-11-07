package com.example.practicaguiada1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugadores.add(new Jugador("pepe","21334",R.drawable.a));
        jugadores.add(new Jugador("pepe","32434",R.drawable.ccc));

        RecyclerView rv = findViewById(R.id.recycler);

    rv.setLayoutManager(new LinearLayoutManager(this));
    rv.setAdapter(new JugadoresAdapter(getApplicationContext(),jugadores));
    }
}