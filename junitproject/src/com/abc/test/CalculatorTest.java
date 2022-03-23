package com.abc.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.abc.service.Calculator;

public class CalculatorTest {
	
	Calculator cal;
	
	@BeforeClass
	public static void initalSetup() {
		System.out.println("Before class...");
	}
	
	@AfterClass
	public static void close() {
		System.out.println("after class...");
	
	}
	
	@Before
	public void initBeforeEachTest() {
		System.out.println("Before Each...");
		cal = new Calculator();
	}
	
	@After
	public void cleanUpAfterEachTest() {
		System.out.println("After Each...");
		cal = null;
	}
	
	@Test
	public void testSum() {		
		System.out.println("testSum...");
		//Calculator cal = new Calculator();
		int actualResult = cal.sum(10, 30);
		assertEquals(40,actualResult);
	}
	@Test
	public void testSumWithNegatives() {	
		System.out.println("testSumWithNegatives...");
		//Calculator cal = new Calculator();
		int actualResult = cal.sum(-10, -30);
		assertEquals(-40,actualResult);
	}
	@Test
	public void testSumWithPositiveNegative() {	
		System.out.println("testSumWithPositiveNegative...");
		//Calculator cal = new Calculator();
		int actualResult = cal.sum(10, -30);
		assertEquals(-20,actualResult);
	}

}
