package com.xpeppers.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzbuzz;

	@Before
	public void setUp() {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void oneIsOne() {
		assertEquals("1", fizzbuzz.say(1));
	}

	@Test
	public void threeIsFizz() {
		assertEquals("Fizz", fizzbuzz.say(3));
	}

	@Test
	public void fiveIsBuzz() {
		assertEquals("Buzz", fizzbuzz.say(5));
	}

	@Test
	public void sixIsFizz() {
		assertEquals("Fizz", fizzbuzz.say(6));
	}

	@Test
	public void tenIsBuzz() {
		assertEquals("Buzz", fizzbuzz.say(10));
	}

	@Test
	public void fifthteenIsFizzBuzz() {
		assertEquals("FizzBuzz", fizzbuzz.say(15));
	}
}
