package Programa1;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountPositiveTest {
	
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
	// Caso de prueba sin error en el estado
	public void testMethod() {
		input [1] = -1;
		assertTrue("Conteo incorrecto", 0 == CountPositive.countPositive(input));
	}
	
	
	@Test
	// Si todos los elementos son mayores que 0 no se ejecuta el codigo con error
	public void testAvoidFailure() {
		for (int i= 0; i< input.length ; i++) {
			input[i] = 1;
		}
		assertTrue("Conteo incorrecto", 5 == CountPositive.countPositive(input));
	}
	
	@Test
	public void testMethodFixed() {
		input [1] = -1;
		assertTrue("Conteo incorrecto", 0 == CountPositive.countPositiveFixed(input));
	}
}
