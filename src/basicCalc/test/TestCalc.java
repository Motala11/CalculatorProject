package basicCalc.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import basicCalc.Calc;

public class TestCalc {
	Calc calc = new Calc();
	
	@Test
	public void canAddTwoNumbers() {
		double a = 11;
		double b = 7;
		
		double expected = 18;	
		double actual = calc.add(a, b);
		
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void canSubtract() {
		double a = 11;
		double b = 7;
		
		double expected = 4;	
		double actual = calc.subtract(a, b);
		
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void canMultiply() {
		double a = 11;
		double b = 7;
		
		double expected = 77;	
		double actual = calc.multiply(a, b);
		
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void canDivide() {
		double a = 14;
		double b = 7;
		
		double expected = 2;	
		double actual = calc.divide(a, b);
		
		assertEquals(expected, actual, 0.0001);
	}
}

