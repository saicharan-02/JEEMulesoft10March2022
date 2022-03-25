package com.abc.java8interface;

import com.abc.java8interface.A;
import com.abc.java8interface.MyInterface;

public class Java8InterfaceMain {

	public static void main(String[] args) {
		
		MyInterface mi = new A();
		
		mi.m1();
		mi.m2();
		
		MyInterface.m3();
		A.m3();
		

	}

}
