package com.vinnorman.nbatop10app;

import androidx.annotation.NonNull;

public class Data {

    String position;

    String player;


    int stat;

    Data(String position, String player, int stat) {
        this.position = position;
        this.player = player;
        this.stat = stat;
    }

    @NonNull
    @Override
    public String toString() {
        return position + player + " - " + stat;
    }

}
