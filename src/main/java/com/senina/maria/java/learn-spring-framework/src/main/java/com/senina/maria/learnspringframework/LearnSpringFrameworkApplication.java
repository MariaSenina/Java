package com.senina.maria.learnspringframework;

import com.senina.maria.learnspringframework.game.GameRunner;
import com.senina.maria.learnspringframework.game.MarioGame;
import com.senina.maria.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		SuperContraGame game2 = new SuperContraGame();
		System.out.println("Mario:");
		GameRunner runner = new GameRunner(game);
		runner.runGame();
		System.out.println("SuperContra:");
		GameRunner runner2 = new GameRunner(game2);
		runner2.runGame();
	}

}
