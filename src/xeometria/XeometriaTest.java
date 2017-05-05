package xeometria;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XeometriaTest {

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
	public void testPerimetroCadrado() {
		Xeometria xeometria = new Xeometria();
		assertEquals(8, xeometria.perimetroCadrado(2));
		assertEquals(-1, xeometria.perimetroCadrado(-2));
		assertEquals(-1, xeometria.perimetroCadrado(0));
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeometria = new Xeometria();
		assertEquals(4, xeometria.areaCadrado(2));
		assertEquals(-1, xeometria.areaCadrado(-2));
		assertEquals(-1, xeometria.areaCadrado(0));
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeometria = new Xeometria();
		assertEquals(5.0, xeometria.teoremaPitagoras(3, 4), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(-3, 4), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(3, -4), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(-3, -4), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(0, 4), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(3, 0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(0, 0), 0);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeometria = new Xeometria();
		assertEquals(6.0, xeometria.teoremaPitagoras(8.0, 10.0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(-8.0, 10.0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(8.0, -10.0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(-8.0, -10.0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(0.0, 10.0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(8.0, 0.0), 0);
		assertEquals(-1, xeometria.teoremaPitagoras(0.0, 0.0), 0);
	}
}
