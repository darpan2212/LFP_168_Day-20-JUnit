package com.bl.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bl.arithmetic.Arithmetic;

@RunWith(Parameterized.class)
public class ArithmeticTest {

	double input1, input2, expected;

	Arithmetic arithmetic;

	public ArithmeticTest(double input1, double input2, double expected) {
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}

	@Before
	public void init() {
		arithmetic = new Arithmetic();
	}

	@Parameters
	public static Collection listInput() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 70, 14, 5 }, { 10, 2, 5 },
				{ 1000, 20, 50 }, { 1, 0, 0 }, { 22, 7, 3.14 } });
	}

	@Test
	public void testDiv() {
		double result = arithmetic.division(input1, input2);
		System.out.println(result);
		assertEquals(expected, result, 1);
	}
}