package Programa3;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Programa2.LastZero;

public class FindLastTest {

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
		input[0] = 1;
		assertTrue("Posicion incorrecto", 0 == FindLast.findLast(input,1));
	}
	
	
	@Test
	public void testAvoidFailure() {
		input[1] = 1;
		assertTrue("Posicion incorrecto", 1 == FindLast.findLast(input,1));
	}
	
	@Test
	public void testMethodFixed() {
		input [0] = -1;
		assertTrue("Posicion incorrecto", 0 == FindLast.findLastFixed(input,-1));
	}
	
}
