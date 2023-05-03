package DevOps_Maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	SimpleCalculator testObject = new SimpleCalculator();

	@Test
	public void test() {
		int parameter = 6;
		int result = testObject.square(parameter);
		int expected = 36; 
		
		assertEquals("square() failed - [" + parameter + "^2" + " should be " + expected + ", but it was " + result + " instead]", expected, result);
	}

}
