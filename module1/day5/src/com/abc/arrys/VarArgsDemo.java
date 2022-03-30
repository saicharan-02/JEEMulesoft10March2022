package com.abc.arrys;

public class VarArgsDemo {

	public static void main(String[] args) {
		
	    print(10);
       print(10,20);
       print(10,20,30);
       

	}
	
	static void print(int...a) {
		
		int len = a.length;
		if(len ==1) {
			int sum = a[0];
			System.out.println("Sum: "+sum);
		}
		if(len ==2) {
			int sum = a[0]+a[1];
			System.out.println("Sum: "+sum);
		}
		if(len ==3) {
			int sum = a[0]+a[1]+a[2];
			System.out.println("Sum: "+sum);
		}
		
	}

}
