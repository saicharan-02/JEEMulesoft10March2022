package com.abc.main;

public class FinallyDemo {

	public static void main(String[] args) {
		
	
		
		int a = 50;
		
		int b = 10;
		
		int c = divison(a, b);
		
		System.out.println("Result:"+c);		
		
		

	}
	
	static int divison(int a, int b) {	

        try {
        	System.out.println("Open resource like database connection, stream etc....");
        	int c = a/b;
        	
    		return c;	
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }	
        finally {
        	System.out.println("closing resources....");
        }		
		
		return 0;
	}

}
