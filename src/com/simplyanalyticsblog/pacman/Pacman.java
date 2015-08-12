package com.simplyanalyticsblog.pacman;

public class Pacman {
    private int lifes = 3;
    private int prizes = 0;

    public int getPrizes() {
        return prizes;
    }

    public void setPrizes(int prizes) {
        this.prizes = prizes;
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    // TOOD(grossi): read user inputs to make Pacman move
}
