package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	public CalculatorTest() {
		// TODO Auto-generated constructor stub
	}

	private final Calculator calculator =new Calculator();
	
	@Test
	public void testAdd() {
		int result=calculator.add(3, 2);
		assertEquals(5,result);
	}
	
	@Test
	public void testSubtract() {
		int result=calculator.add(5, 3);
		assertEquals(2,result);
	}
}
