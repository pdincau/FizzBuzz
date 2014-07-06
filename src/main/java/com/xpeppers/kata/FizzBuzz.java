package com.xpeppers.kata;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	private String result = "";

	public String say(int number) {
		if (isFizz(number)) {
			result += FIZZ;
		}
		if(isBuzz(number)) {
			result += BUZZ;
		}
		if (result.equals("")) {
			result = Integer.toString(number);
		}
		return result ;
	}

	private boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private boolean isFizz(int number) {
		return number % 3 == 0;
	}
}