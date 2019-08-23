package com.thoughtworks.tdd;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Game {
	private static String FIZZ = "Fizz";
	private static String BUZZ = "Buzz";
	private static String WHIZZ = "Whizz";
	
	public String FizzBuzz(int i) {
		String result = "";
		if(i <1 || i>120) {
			return "invalid";
		}
		if(i % 3 ==0) {
			result+=FIZZ;
		}
		if (i % 5 ==0) {
			result +=BUZZ;
		}
		if(i%7 == 0) {
			result +=WHIZZ;
		}
		if(result == "") {
			result = String.valueOf(i);
		}
		return result;
		}
}
