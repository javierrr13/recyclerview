package com.example.practicaguiada1;

import android.media.Image;

public class Jugador {




    String nick;
    String monedas;
    int imagen;
    public Jugador(String nick,String monedas,int imagen) {
        this.nick = nick;
        this.monedas=monedas;
        this.imagen=imagen;
    }
    public String getNick() {
        return nick;
    }
    public String getMonedas() {
        return monedas;
    }

    public int getImagen() {
        return imagen;
    }

}
