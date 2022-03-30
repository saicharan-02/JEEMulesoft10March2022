package com.abc;

import java.util.Scanner;

public class EnumDemo2 {

	public static void main(String[] args) {
		
//		Days days = Days.FRIDAY;		
//	
//		DaySelection daySelection = new DaySelection(10,"dummy", days );
//		
//		daySelection.test();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter day: ");
		String day = sc.next();
		
		//convert String to enum type
		Days selectedDay = Days.valueOf(day);
		
		DaySelection daySelection = new DaySelection(id,name, selectedDay );
		daySelection.test();

	}

}
