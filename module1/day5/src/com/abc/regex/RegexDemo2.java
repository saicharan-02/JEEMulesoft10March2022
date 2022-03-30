package com.abc.regex;

import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {

		String input = "hkd_jdf9dfdfdf";

		boolean result1 = Pattern.matches("\\w{5,10}", input);

		System.out.println(result1);

//		String str = "Hello_How#are_you?";
//		
//		String[] stAry = str.split("_");
//		
//		for(String s : stAry) {
//			System.out.println(s);
//		}

		String str = "20,100@30,100@40,100";

		String[] stAry = str.split("[,@]");
		
		for(String s:stAry) {
			System.out.println(s);
		}

//		for (String s : stAry) {
//
//			String[] stAry2 = s.split(",");
//
//			for (String s1 : stAry2) {
//				System.out.println(s1);
//			}
//
//		}
		
		String st4 = "Hi how are you?";  //task - replace all whitespace with # character

	}

}
