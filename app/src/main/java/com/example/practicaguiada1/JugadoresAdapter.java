package com.example.practicaguiada1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class JugadoresAdapter extends RecyclerView.Adapter<JugadorViewHolder> {

    Context context;
    List<Jugador> jugadores;

    public JugadoresAdapter(Context applicationContext, ArrayList<Jugador> jugadores) {

    }

    @NonNull
    @Override
    public JugadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new JugadorViewHolder(LayoutInflater.from(context).inflate(R.layout.jugador_vista,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull JugadorViewHolder holder, int position) {
        holder.nick.setText(jugadores.get(position).getNick());
        holder.monedas.setText(jugadores.get(position).getMonedas());
        holder.nick.setImageResource(jugadores.get(position).getImagen());



        //holder.monedas.setText(jugadores.get(position).getMonedas);
        //holder.nick.setImageResource(jugadores.get(position).getImagen);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
