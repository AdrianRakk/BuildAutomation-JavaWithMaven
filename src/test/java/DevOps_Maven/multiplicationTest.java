package DevOps_Maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplicationTest {

	SimpleCalculator testObject = new SimpleCalculator();

	@Test
	public void test() {
		int firstParameter = 3;
		int secondParameter = 5;
		int result = testObject.multiplication(firstParameter, secondParameter);
		int expected = 15; 
		
		assertEquals("multiplication() failed - [" + firstParameter + " * " + secondParameter + " should be " + expected + ", but it was " + result + " instead]", expected, result);
	}

}
