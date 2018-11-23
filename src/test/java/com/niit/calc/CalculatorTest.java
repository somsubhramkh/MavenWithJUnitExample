package com.niit.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		Calculator calculator=new Calculator();
		assertEquals(15,calculator.add(10, 5));
	}
	
	@Test
	public void testSubtract() {
		
		Calculator calculator=new Calculator();
		assertEquals(5,calculator.subtract(10, 5));
	}
	
	@Test
	public void testMultiply() {
		
		Calculator calculator=new Calculator();
		assertEquals(50,calculator.multiply(10, 5));
	}
	
	
	@Test
	public void testDivide() {
		
		Calculator calculator=new Calculator();
		assertEquals(2,calculator.divide(10, 5));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		
		Calculator calculator=new Calculator();
		assertEquals(2,calculator.divide(10, 0));
	}

}
