package DevOps_Maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class additionTest {

	SimpleCalculator testObject = new SimpleCalculator();

	@Test
	public void test() {
		int firstParameter = 3;
		int secondParameter = 6;
		int result = testObject.addition(firstParameter, secondParameter);
		int expected = 9; 
		
		assertEquals("addition() failed - [" + firstParameter + " + " + secondParameter + " should be " + expected + ", but it was " + result + " instead]", expected, result);
	}

}
