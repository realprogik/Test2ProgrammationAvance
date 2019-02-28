import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.seb.test2.RomanAdditionner;

public class RomanAdditionnerTest {
	
	RomanAdditionner addition;

	@Before
	public void setUp() throws Exception {
		addition=new RomanAdditionner();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(new String("II"), addition.compute("I", "I","+"));
	}

}
