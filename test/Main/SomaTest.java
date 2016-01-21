package Main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SomaTest {
	
	Soma soma;

	@Before
	public void setUp() throws Exception {
		soma = new Soma();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSomar() {
		assertEquals(3, soma.somar(1, 2));
	}

}
