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
		
		//Introd�cese o lado, que mide 2. O per�metro debe ser 8.
		assertEquals(8, xeometria.perimetroCadrado(2));
		
		//Introd�cese un lado negativo.
		assertEquals(-1, xeometria.perimetroCadrado(-2));
		
		//Introd�cese un lado con valor cero.
		assertEquals(-1, xeometria.perimetroCadrado(0));
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeometria = new Xeometria();
		
		//Introd�cese o lado que mide 2. A �rea debe ser 4.
		assertEquals(4, xeometria.areaCadrado(2));
		
		//Introd�cese un lado negativo.
		assertEquals(-1, xeometria.areaCadrado(-2));
		
		//Introd�cese un lado con valor cero.
		assertEquals(-1, xeometria.areaCadrado(0));
	}

	/**
	 * O terceiro argumento do assertEquals indica a precisi�n dos decimais. Neste
	 * caso � cero para comprobar que o resultado da proba coincida co primeiro 
	 * argumento de forma exacta.
	 */
	
	@Test
	
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeometria = new Xeometria();
		
		/*Introd�cense os catetos A e B, que miden 3 e 4 respectivamente.
		A hipotenusa debe valer 5.*/
		assertEquals(5.0, xeometria.teoremaPitagoras(3, 4), 0);
		
		//Introd�cese o cateto A con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(-3, 4), 0);
		
		//Introd�cese o cateto B con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(3, -4), 0);
		
		//Introd�cense dous catetos negativos.
		assertEquals(-1, xeometria.teoremaPitagoras(-3, -4), 0);
		
		//Introd�cese o cateto A con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0, 4), 0);
		
		//Introd�cese o cateto B con valir cero.
		assertEquals(-1, xeometria.teoremaPitagoras(3, 0), 0);
		
		//Introd�cense dous catetos con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0, 0), 0);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeometria = new Xeometria();
		
		/*Introd�cese a hipotenusa, que vale 10 e o cateto A que vale
		 * 8. O cateto B debe medir 6*/
		assertEquals(6.0, xeometria.teoremaPitagoras(10.0, 8.0), 0);
		
		//O cateto A � maior que a hipotenusa.
		assertEquals(-1, xeometria.teoremaPitagoras(10.0, 20.0), 0);
		
		//Introd�cese a hipotenusa con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(-10.0, 8.0), 0);
		
		//Introd�cese o cateto A con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(10.0, -8.0), 0);
		
		//Introd�cense a hipotenusa e o cateto A, os dous con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(-10.0, -8.0), 0);
		
		//Introd�cese a hipotenusa con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0.0, 8.0), 0);
		
		//Introd�cese o cateto A con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(10.0, 0.0), 0);
		
		//Introd�cense a hipotenusa e o cateto, os dous con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0.0, 0.0), 0);
	}
}
