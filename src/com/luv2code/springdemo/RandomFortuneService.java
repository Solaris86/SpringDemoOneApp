package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private final String[] fortunes = new String[] {"Today it's up to you to create the peacefulness you long for.", "A friend asks only for your time not your money.", "If you refuse to accept anything but the best, you very often get it."};
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int randomFortune = random.nextInt(fortunes.length);
		return fortunes[randomFortune];
	}

}
