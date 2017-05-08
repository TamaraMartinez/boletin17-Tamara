package dni;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DNITest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calculaLetra() {
		DNI dni = new DNI();
		assertEquals(14, dni.calculaLetra("12345678"));
	}
	
	@Test
	
	public void eValido() {
		DNI dni = new DNI();
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		dni.numeros.add(8);
		assertEquals(true, dni.eValido(dni.numeros,'Z'));
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		dni.numeros.clear();
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		dni.numeros.clear();
		assertEquals(false, dni.eValido(dni.numeros,'G'));
	}

}
