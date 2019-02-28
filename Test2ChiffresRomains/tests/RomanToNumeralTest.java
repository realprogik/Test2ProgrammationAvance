import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.seb.test2.RomanToNumeral;

public class RomanToNumeralTest {
	RomanToNumeral a;

	@Before
	public void setUp() throws Exception {
		a=new RomanToNumeral();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals(new Integer(1001),a.getNumeral(new String("MI")));
	}

}
