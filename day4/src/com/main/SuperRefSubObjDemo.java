package com.main;

import com.abc.A;
import com.abc.B;

public class SuperRefSubObjDemo {

	public static void main(String[] args) {
		
		//A a1 = new A();
		//a1.m1();
		
//		B b1 = new B();		
//		b1.m1();
//		b1.m5();
//		b1.test();
		
		A a1 = new B();  //super class reference variable refer to subclass object
		a1.m1();
		//a1.m5();
		a1.test();	
	

	}

}
