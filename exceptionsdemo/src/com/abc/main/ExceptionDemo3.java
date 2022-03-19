package com.abc.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.abc.service.Calculator;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		System.out.println("Main starts....");

		Calculator cal = new Calculator();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = sc.nextInt();
			System.out.println("Enter b value");
			int b = sc.nextInt();
			sc.close();

			int result = cal.divison(a, b);

			System.out.println("Result: " + result);

		} catch (InputMismatchException e) {
			System.out.println("plz provide correct input type");
		} catch (ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		} catch (Exception e) {
			System.out.println("Something goes wrong");
		}

		System.out.println("Main ends....");
	}

}
