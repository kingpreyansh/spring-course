package com.preyanshdutta.springdemo;

import java.util.Random;

public class RandomFortuneTeller implements FortuneService {
	
	private String[] RandomFortune = {
			"Fortune 1",
			"Fortune 2",
			"Fortune 3"};
	
	Random rand = new Random();
	
	// Obtain a number between [0-2] - this will be the index of the random fortune array
	int n = rand.nextInt(3);
	
	@Override
	public String getFortune() {
		return RandomFortune[n];
	}

}
