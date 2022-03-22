package com.abc.main;

import com.abc.service.Demo;
import com.abc.service.MyInterface;

public class DefaultInterfaceDemo {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.m1();
		
		System.out.println(MyInterface.k);
		

	}

}
