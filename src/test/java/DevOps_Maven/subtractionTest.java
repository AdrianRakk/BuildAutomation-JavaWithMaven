package DevOps_Maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtractionTest {

	SimpleCalculator testObject = new SimpleCalculator();
	
	@Test
	public void test() {
		int firstParameter = 14;
		int secondParameter = 7;
		int result = testObject.subtraction(firstParameter, secondParameter);
		int expected = 7; 
		
		assertEquals("subtraction() failed - [" + firstParameter + " - " + secondParameter + " should be " + expected + ", but it was " + result + " instead]", expected, result);
	}

}
