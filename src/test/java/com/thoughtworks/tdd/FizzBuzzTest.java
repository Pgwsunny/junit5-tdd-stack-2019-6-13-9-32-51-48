package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	@Test
	public void should_return_1_when_input_1() {
		Game game = new Game();
		String result = game.FizzBuzz(1);
		Assertions.assertEquals("1", result);		
	}
	@Test
	public void should_return_2_when_input_2() {
		Game game = new Game();
		String result = game.FizzBuzz(2);
		Assertions.assertEquals("2", result);		
	}
	@Test
	public void should_return_Fizz_when_input_3() {
		Game game = new Game();
		String result = game.FizzBuzz(3);
		Assertions.assertEquals("Fizz", result);		
	}
	@Test
	public void should_return_Buzz_when_input_5() {
		Game game = new Game();
		String result = game.FizzBuzz(5);
		Assertions.assertEquals("Buzz", result);		
	}
	@Test
	public void should_return_Whizz_when_input_7() {
		Game game = new Game();
		String result = game.FizzBuzz(7);
		Assertions.assertEquals("Whizz", result);		
	}
	@Test
	public void should_return_FizzBuzz_when_input_15() {
		Game game = new Game();
		String result = game.FizzBuzz(15);
		Assertions.assertEquals("FizzBuzz", result);		
	}
	@Test
	public void should_return_FizzWhizz_when_input_21() {
		Game game = new Game();
		String result = game.FizzBuzz(21);
		Assertions.assertEquals("FizzWhizz", result);		
	}
	@Test
	public void should_return_BuzzWhizz_when_input_35() {
		Game game = new Game();
		String result = game.FizzBuzz(35);
		Assertions.assertEquals("BuzzWhizz", result);		
	}
	@Test
	public void should_return_FizzBuzzWhizz_when_input_105() {
		Game game = new Game();
		String result = game.FizzBuzz(105);
		Assertions.assertEquals("FizzBuzzWhizz", result);		
	}
	@Test
	public void should_return_invalid_when_input_0() {
		Game game = new Game();
		String result = game.FizzBuzz(0);
		Assertions.assertEquals("invalid", result);		
	}
}
