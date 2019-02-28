import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.seb.test2.NumeralToRoman;

public class NumeralToRomanTest {
	NumeralToRoman roman;

	@Before
	public void setUp() throws Exception {
		roman=new NumeralToRoman();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(new String("MLI"),roman.getRoman(1051));
	}

}
