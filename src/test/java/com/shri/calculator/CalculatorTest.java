package com.shri.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Double x;
	private Double y;
	private Double expectedAddition;
	private Double expectedSubtraction;
	private Double expectedMultiplication;
	private Double expectedDivision;
	private Double expectedDivisionByZero;
	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		x = 6d;
		y = 5d;
		expectedAddition = 11d;
		expectedSubtraction = 1d;
		expectedMultiplication = 30d;
		expectedDivision = 1.2d;
		expectedDivisionByZero = Double.POSITIVE_INFINITY;
		calculator = new Calculator();
	}

	@Test
	public void testAddition() {
		assertEquals(expectedAddition, calculator.calculate(new Addition(), x, y));
	}

	@Test
	public void testSubtraction() {
		assertEquals(expectedSubtraction, calculator.calculate(new Subtraction(), x, y));
	}

	@Test
	public void testMultiplication() {
		assertEquals(expectedMultiplication, calculator.calculate(new Multiplication(), x, y));
	}

	@Test
	public void testDivision() {
		assertEquals(expectedDivision, calculator.calculate(new Division(), x, y));
	}

	@Test
	public void testDivisionByZero() {
		assertEquals(expectedDivisionByZero, calculator.calculate(new Division(), x, 0d));
	}

}
