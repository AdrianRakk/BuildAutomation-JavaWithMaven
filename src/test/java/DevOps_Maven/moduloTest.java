package DevOps_Maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class moduloTest {

	SimpleCalculator testObject = new SimpleCalculator();
	
	@Test
	public void test() {
		int firstParameter = 43;
		int secondParameter = 7;
		int result = testObject.modulo(firstParameter, secondParameter);
		int expected = 1; 
		
		assertEquals("modulo() failed - [" + firstParameter + " mod " + secondParameter + " should be " + expected + ", but it was " + result + " instead]", expected, result);
	}

}
