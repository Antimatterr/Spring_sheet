package com.springdemoapp.learnSpring.game;

public class GameRunner {

    private MarioGame game;
    private SuperContra game2;
    public GameRunner(SuperContra game) {
        this.game2 = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
