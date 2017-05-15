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
	public void eValidoUn(){
		DNI dni = new DNI();
		assertEquals(true, dni.eValido("12345678Z"));
		assertEquals(false, dni.eValido("12345678Y"));
		assertEquals(false, dni.eValido("1234567"));
		assertEquals(false, dni.eValido("-12345678Z"));
		assertEquals(false, dni.eValido("JJJJJJJJH"));
		assertEquals(false, dni.eValido("JJJ8JJJJH"));
		assertEquals(false, dni.eValido("J"));
		assertEquals(false, dni.eValido(""));
	}
	
	@Test
	public void calculaLetraUn() {
		DNI dni = new DNI();
		assertEquals(14, dni.calculaLetra("12345678"));
		assertEquals(-1, dni.calculaLetra("-12345678"));
		assertEquals(-1, dni.calculaLetra("1234567"));
		assertEquals(-1, dni.calculaLetra("FFFFFFFF"));
		assertEquals(-1, dni.calculaLetra("FFF1FFFF"));
		assertEquals(-1, dni.calculaLetra("F"));
		assertEquals(-1, dni.calculaLetra(""));
	}
	
	@Test
	
	public void eValidoDous() {
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
	
	@Test
	public void calculaLetraDous(){
		DNI dni = new DNI();
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		dni.numeros.add(8);
		assertEquals(14, dni.calculaLetra(dni.numeros));
		dni.numeros.clear();
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		assertEquals(-1, dni.calculaLetra(dni.numeros));
		dni.numeros.clear();
		assertEquals(-1, dni.calculaLetra(dni.numeros));
	}
	

}
