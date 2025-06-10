package basicCalc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import basicCalc.Logic;

class TestLogic {
	Logic logic = new Logic();
	
	@Test
	public void canAddTwoNumbers() {
		double a = 11;
		double b = 7;
		
		String expected = "Result = 18.0";	
		String actual = logic.calculate(a, b, '+');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void canSubtract() {
		double a = 11;
		double b = 7;
		
		String expected = "Result = 4.0";	
		String actual = logic.calculate(a, b, '-');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void canMultiply() {
		double a = 11;
		double b = 7;
		
		String expected = "Result = 77.0";	
		String actual = logic.calculate(a, b, '*');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void canDivide() {
		double a = 14;
		double b = 7;
		
		String expected = "Result = 2.0";	
		String actual = logic.calculate(a, b, '/');
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDvideByZero() {
	double a = 11;
	double b = 0;
	
	String expected = "Error! Division by zero is not allowed.";	
	String actual = logic.calculate(a, b, '/');
	
	assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidOperator() {
		double a = 11;
		double b = 7;
		
		String expected = "Error: Invalid operator!";
		String actual = logic.calculate(a, b, 's');
		assertEquals(expected, actual);
	}
}
