package com.abc;

public class DaySelection {

	private int id;
	private String name;	
	private Days days;
	
	DaySelection(int id,String name, Days days) {
		this.id = id;
		this.name= name;
		this.days = days;
	}
	
	public void test() {
		
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		
		switch(days) {
		
		case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
		
	}
	
}
