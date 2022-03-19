package com.abc.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
				
		Pattern pattern = Pattern.compile(".s");
		
		String input1 = "sd";
		
		Matcher matcher = pattern.matcher(input1);
		
		boolean isValid = matcher.matches();
		
		System.out.println(isValid);
		
		// 2nd option
		
		String input2 = "a&s";
		
		boolean result2 = Pattern.matches("a.s", input2);
		
		System.out.println(result2);		

	}

}
