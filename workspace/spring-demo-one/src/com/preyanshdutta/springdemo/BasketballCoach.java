package com.preyanshdutta.springdemo;

public class BasketballCoach implements Coach {
	private RandomFortuneTeller randomFortune;
	
	public BasketballCoach() {
	}
	
	public void setRandomFortuneTeller(RandomFortuneTeller randomFortune) {
		this.randomFortune = randomFortune;
	}
	
	
	@Override
	public String getDailyWorkout() {

		return "Better shoot those balls billy!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return randomFortune.getFortune();
	}
	
}
