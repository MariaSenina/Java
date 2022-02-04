package com.senina.maria.learnspringframework;

import com.senina.maria.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame, GameRunner -> components

		//get a specific component out of the context
		GameRunner runner = context.getBean(GameRunner.class);

		System.out.println("Game using Spring:");
		runner.runGame();

//		System.out.println("SuperContra:");
//		SuperContraGame game2 = new SuperContraGame();
//		GameRunner runner2 = new GameRunner(game2);
//		runner2.runGame();
	}

}
