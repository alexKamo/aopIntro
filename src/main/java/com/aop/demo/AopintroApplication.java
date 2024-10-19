package com.aop.demo;

import appDao.FruitDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopintroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopintroApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(FruitDAO fruitDAO){
		return runner -> runAddFruit(fruitDAO);
	}

	private void runAddFruit(FruitDAO fruitDAO) {
		fruitDAO.addFruit();
	}
}
