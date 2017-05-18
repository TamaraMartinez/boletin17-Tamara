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
		
		//Introdúcese o lado, que mide 2. O perímetro debe ser 8.
		assertEquals(8, xeometria.perimetroCadrado(2));
		
		//Introdúcese un lado negativo.
		assertEquals(-1, xeometria.perimetroCadrado(-2));
		
		//Introdúcese un lado con valor cero.
		assertEquals(-1, xeometria.perimetroCadrado(0));
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeometria = new Xeometria();
		
		//Introdúcese o lado que mide 2. A área debe ser 4.
		assertEquals(4, xeometria.areaCadrado(2));
		
		//Introdúcese un lado negativo.
		assertEquals(-1, xeometria.areaCadrado(-2));
		
		//Introdúcese un lado con valor cero.
		assertEquals(-1, xeometria.areaCadrado(0));
	}

	/**
	 * O terceiro argumento do assertEquals indica a precisión dos decimais. Neste
	 * caso é cero para comprobar que o resultado da proba coincida co primeiro 
	 * argumento de forma exacta.
	 */
	
	@Test
	
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeometria = new Xeometria();
		
		/*Introdúcense os catetos A e B, que miden 3 e 4 respectivamente.
		A hipotenusa debe valer 5.*/
		assertEquals(5.0, xeometria.teoremaPitagoras(3, 4), 0);
		
		//Introdúcese o cateto A con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(-3, 4), 0);
		
		//Introdúcese o cateto B con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(3, -4), 0);
		
		//Introdúcense dous catetos negativos.
		assertEquals(-1, xeometria.teoremaPitagoras(-3, -4), 0);
		
		//Introdúcese o cateto A con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0, 4), 0);
		
		//Introdúcese o cateto B con valir cero.
		assertEquals(-1, xeometria.teoremaPitagoras(3, 0), 0);
		
		//Introdúcense dous catetos con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0, 0), 0);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeometria = new Xeometria();
		
		/*Introdúcese a hipotenusa, que vale 10 e o cateto A que vale
		 * 8. O cateto B debe medir 6*/
		assertEquals(6.0, xeometria.teoremaPitagoras(10.0, 8.0), 0);
		
		//O cateto A é maior que a hipotenusa.
		assertEquals(-1, xeometria.teoremaPitagoras(10.0, 20.0), 0);
		
		//Introdúcese a hipotenusa con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(-10.0, 8.0), 0);
		
		//Introdúcese o cateto A con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(10.0, -8.0), 0);
		
		//Introdúcense a hipotenusa e o cateto A, os dous con valor negativo.
		assertEquals(-1, xeometria.teoremaPitagoras(-10.0, -8.0), 0);
		
		//Introdúcese a hipotenusa con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0.0, 8.0), 0);
		
		//Introdúcese o cateto A con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(10.0, 0.0), 0);
		
		//Introdúcense a hipotenusa e o cateto, os dous con valor cero.
		assertEquals(-1, xeometria.teoremaPitagoras(0.0, 0.0), 0);
	}
}
