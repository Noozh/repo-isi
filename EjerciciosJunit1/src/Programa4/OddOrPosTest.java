package Programa4;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OddOrPosTest {

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
	public void testInitial() {
		input [0] = 1;
		assertTrue(1 == OddOrPos.oddOrPos(input));
	}
	
	@Test
	public void testInitial2() {
		input [0] = -1;
		assertTrue(1 == OddOrPos.oddOrPos(input));
	}
	
	
	@Test
	public void testInitial3() {
		input [0] = -1;
		assertTrue(1 == OddOrPos.oddOrPosFixed(input));
	}
	
	@Test
	public void testInitial4() {
		input [0] = -1;
		input [1] = 2;
		assertTrue(2 == OddOrPos.oddOrPosFixed(input));
	}
}
