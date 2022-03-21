package com.abc.main;

public class Demo {

	public static void main(String[] args) {
	
		 System.out.println("Main starts....");	      
		 
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("Result: "+c);
		}
		catch(ArithmeticException e) {
			//option1
			//System.out.println("denominator should not be zero");
			
			//option2
			//System.out.println(e); //e.toString() called
			
			//option3
			//e.printStackTrace();
			
			//option4		
			System.out.println(e.getMessage());
		}
		
		 System.out.println("Main endss....");	      

	}

}
