package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{
	// test to assert that the calculator object is not null when created
	@Test
	public void testCalculator()
	{
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}

	// test to assert that getTotal() returns the total correctly
	@Test
	public void testGetTotal()
	{
		Calculator testCalc = new Calculator();
		int totalTest = testCalc.getTotal();
		assertEquals(totalTest, 0);
	}

	// test to assert that add(), correctly adds two numbers together: (total(0)+5)+2 = 7
	@Test
	public void testAdd()
	{
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		testCalc.add(2);
		assertEquals(testCalc.getTotal(), 7);
	}

	// test to assert that subtract(), correctly subtracts two numbers: (total(0)+5)-2 = 3
	@Test
	public void testSubtract()
	{
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		testCalc.subtract(2);
		assertEquals(testCalc.getTotal(), 3);
	}
	
	// test to assert that multiply(), correctly multiplies two numbers: (total(0)+10)*2 = 20
	@Test
	public void testMultiply()
	{
		Calculator testCalc = new Calculator();
		testCalc.add(10);
		testCalc.multiply(2);
		assertEquals(testCalc.getTotal(), 20);
	}

	// test to assert that divide(), correctly divides two numbers: (total(0)+10)/2 = 5
	// and also asserts that when dividing by zero, the result is 0: total(5)/0 = 0
	@Test
	public void testDivide()
	{
		Calculator testCalc = new Calculator();
		testCalc.add(10);
		testCalc.divide(2);
		assertEquals(testCalc.getTotal(), 5);
		testCalc.divide(0);
		assertEquals(testCalc.getTotal(), 0);
	}

	@Test
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}

}
