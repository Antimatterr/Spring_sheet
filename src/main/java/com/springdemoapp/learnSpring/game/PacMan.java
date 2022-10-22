package com.springdemoapp.learnSpring.game;

public class PacMan implements GamingConsole{

    @Override
    public void up() {
        System.out.println("pac man up");
    }

    @Override
    public void left() {
        System.out.println("pac man left");
    }

    @Override
    public void down() {
        System.out.println("pac man down");
    }

    @Override
    public void right() {
        System.out.println("pac man right");
    }
}
