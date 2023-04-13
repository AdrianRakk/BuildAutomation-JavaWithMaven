package DevOps_Maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ additionTest.class, moduloTest.class, multiplicationTest.class, squareTest.class,
		subtractionTest.class })
public class AllTests {

}
