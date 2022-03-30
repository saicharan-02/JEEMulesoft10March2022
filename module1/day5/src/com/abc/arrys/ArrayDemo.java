package com.abc.arrys;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] num= new int[5];

		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		
//		for(int k : num) {			
//			System.out.println(k);		
//		}	
//		
		int sum = 0;
				
		for(int k : num) {			
			sum = sum+k;			
		}	
		
		System.out.println("Sum: "+sum);
		

	}

}
