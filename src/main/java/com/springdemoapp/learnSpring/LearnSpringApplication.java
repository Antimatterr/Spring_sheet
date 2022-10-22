package com.springdemoapp.learnSpring;

import com.springdemoapp.learnSpring.game.GameRunner;
import com.springdemoapp.learnSpring.game.MarioGame;
import com.springdemoapp.learnSpring.game.PacMan;
import com.springdemoapp.learnSpring.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContra game = new SuperContra();
		PacMan game = new PacMan();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}


}
