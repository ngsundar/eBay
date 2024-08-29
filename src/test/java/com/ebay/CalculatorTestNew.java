package com.synopsis.homework;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTestNew {
	CalculatorNew calculator;
	@Before
	public void setUp() throws Exception {
		calculator = new CalculatorNew();
	}

	@Test
	public void testAdd1() {
		Number result = calculator.calculate(Operation.ADD, 2, 3);
		assertEquals(result.intValue(), 5);
	}

	@Test
	public void testAdd2() {
		Number result = calculator.calculate(Operation.ADD, 2.5, 3.6);
		assertTrue(result.floatValue() == 6.1f);
	}

	@Test
	public void testAdd3() {
		Number result = calculator.calculate(Operation.ADD, 2.0/3.0, 1.0/3.0);
		assertTrue(result.floatValue() == 1.0f);
	}

	@Test
	public void testSub1() {
		Number result = calculator.calculate(Operation.SUBTRACT, 2, 3);
		assertEquals(result.intValue(), -1);
	}

	@Test
	public void testSub2() {
		Number result = calculator.calculate(Operation.SUBTRACT, 2.4, 1.2);
		assertTrue(result.floatValue() == 1.2f);
	}

	@Test
	public void testSub3() {
		Number result = calculator.calculate(Operation.SUBTRACT, 2/3, 1/3);
		assertTrue(result.doubleValue() == 1/3);
	}

	@Test
	public void testMult1() {
		Number result = calculator.calculate(Operation.MULTIPLY, 2, 3);
		assertEquals(result.intValue(), 6);
	}

	@Test
	public void testMult2() {
		Number result = calculator.calculate(Operation.MULTIPLY, 2.5, 3.6);
		assertTrue(result.floatValue() == 9.0f);
	}

	@Test
	public void testDiv1() {
		Number result = calculator.calculate(Operation.DIVIDE, 2, 3);
		assertTrue(result.doubleValue() == 2.0/3.0);
	}

	@Test
	public void testDiv2() {
		Number result = calculator.calculate(Operation.DIVIDE, 2, 0);
		assertTrue(result == null);
	}

	@Test
	public void testChain1() {
		CalculatorNew.Chain[] chains = new CalculatorNew.Chain[]{calculator.new Chain(Operation.ADD, 2), calculator.new Chain(Operation.MULTIPLY, 3)};
		Number result = calculator.evaluate(4, chains);
		assertTrue(result.intValue() == 18);
	}

	@Test
	public void testChain2() {
		CalculatorNew.Chain[] chains = new CalculatorNew.Chain[]{calculator.new Chain(Operation.ADD, 1.5), calculator.new Chain(Operation.MULTIPLY, 3.6)};
		Number result = calculator.evaluate(1.0, chains);
		assertTrue(result.floatValue() == 9.0f);
	}

}
