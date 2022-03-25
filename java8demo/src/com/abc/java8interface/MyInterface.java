package com.abc.java8interface;

public interface MyInterface {

	void m1();
	
    default void m2() {
		System.out.println("default m2 inside interface");
	}	
    
    
    static void m3() {
    	System.out.println("static m3 inside interface");
    }
	
}
