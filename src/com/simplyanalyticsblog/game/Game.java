package com.simplyanalyticsblog.game;

import com.simplyanalyticsblog.enemy.Ghost;
import com.simplyanalyticsblog.pacman.Pacman;

public class Game {
    public static void main(String[] args) {
        Pacman pacman = new Pacman();
        Ghost oikake = new Ghost("oikake");

        System.out.println("Pacman has " + pacman.getLifes() + " lifes");
        System.out.println(oikake.getName());
        System.out.println(oikake.getStatus());
    }
}
