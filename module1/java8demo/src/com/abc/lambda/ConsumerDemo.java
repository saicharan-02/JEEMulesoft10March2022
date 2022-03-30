package com.abc.lambda;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
	
		Consumer<String> c1 = x -> System.out.println("hello "+x);
		
		c1.accept("Java");
		
		 BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
	      addTwo.accept(1, 2); 

	}

}



