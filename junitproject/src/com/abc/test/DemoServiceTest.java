package com.abc.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.abc.service.DemoService;

public class DemoServiceTest {
	
	@Test
	public void testIsPalindromOk() {
		
		DemoService demoService = new DemoService();
		boolean actualResult = demoService.isPalindrom(121);
		assertTrue(actualResult);
	}
	
	@Test
	public void testIsPalindromNotOk() {
		
		DemoService demoService = new DemoService();
		boolean actualResult = demoService.isPalindrom(11231);
		assertFalse(actualResult);
	}
	

	@Test
	public void testSort() {
		
		DemoService demoService = new DemoService();
		
		//int[] nums = {20,35,10,28,34};
		
		//int[] actual = demoService.sort(nums);
		
		//int[] expected = {10,20,28,34,35};
		
		int[] actual = demoService.sort(new int[] {20,35,10,28,34});
		
		assertArrayEquals(new int[]{10,20,28,34,35}, actual);
	}

}
