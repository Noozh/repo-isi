package Programa2;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Programa1.CountPositive;

public class LastZeroTest {

	private int[] input = new int[5] ;

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		for (int i= 0; i< input.length ; i++) {
			input[i] = 0;
		}
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
		for (int i= 0; i< input.length ; i++) {
			input[i] = 0;
		}
	}
	
	@Test
	public void testMethod() {
		assertTrue("Posicion incorrecto", 4 == LastZero.lastZero(input));
	}
	
	
	@Test
	public void testAvoidFailure() {
		for (int i= 1; i< input.length ; i++) {
			input[i] = 1;
		}
		assertTrue("Posicion incorrecto", 0 == LastZero.lastZero(input));
	}
	
	@Test
	public void testMethodFixed() {
		input [1] = -1;
		assertTrue("Posicion incorrecto", 4 == LastZero.lastZeroFixed(input));
	}
}
