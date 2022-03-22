package com.abc.service;

public interface MyInterface {

	int k = 10;
	default public void m1() {
		System.out.println("m1 inside MyInterface");
	}
}
