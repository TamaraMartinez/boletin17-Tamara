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
		
		//Introd�cese un DNI v�lido e devolve true.
		assertEquals(true, dni.eValido("12345678Z"));
		
		//Cont�mplase o caso no que a letra non sexa a correcta.
		assertEquals(false, dni.eValido("12345678Y"));
		
		//Cont�mplase o caso no que o n�mero exceda os 8 d�xitos.
		assertEquals(false, dni.eValido("123456789Y"));
		
		//Cont�mplase o caso de que se introduza unha cadea menor a 9 caracteres.
		assertEquals(false, dni.eValido("1567"));
		
		//Cont�mplase o caso no que non se introduza a letra.
		assertEquals(false, dni.eValido("1234567"));
		
		//Cont�mplase o caso no que o n�mero introducido sexa negativo.
		assertEquals(false, dni.eValido("-12345678Z"));
		
		/*Cont�mplase o caso no que se introduzan caracteres non permitidos onde
		deber�a ir o n�mero de DNI.*/
		assertEquals(false, dni.eValido("%JJJJJJJH"));
		
		//Cont�mplase o mesmo que no caso anterior pero con n�meros polo medio.
		assertEquals(false, dni.eValido("JJJ8JJJJH"));

		//Cont�mplase o caso no que non se introduciu nada.
		assertEquals(false, dni.eValido(""));
	}
	
	@Test
	public void calculaLetraUn() {
		DNI dni = new DNI();
		//Introd�cese un n�mero de DNI v�lido e dev�lvese o n�mero de letra 14.
		assertEquals(14, dni.calculaLetra("12345678"));
		
		//Cont�mplase o caso no que o n�mero exceda os 8 d�xitos.
		assertEquals(-1, dni.calculaLetra("123456789"));
		
		//Cont�mplase o caso onde o n�mero est� composto por menos de oito d�xitos.
		assertEquals(-1, dni.calculaLetra("1234567"));
		
		//Cont�mplase o caso no que o n�mero introducido sexa negativo.
		assertEquals(-1, dni.calculaLetra("-12345678"));
		
		/*Cont�mplase o caso no que se introduzan caracteres non permitidos onde
		deber�a ir o n�mero de DNI.*/
		assertEquals(-1, dni.calculaLetra("FFFF)FFF"));
		
		//Cont�mplase o mesmo que no caso anterior pero con n�meros polo medio.
		assertEquals(-1, dni.calculaLetra("FFF1FFFF"));
		
		//Cont�mplase o caso no que non se introduciu nada.
		assertEquals(-1, dni.calculaLetra(""));
	}
	
	@Test
	
	public void eValidoDous() {
		DNI dni = new DNI();
		
		//Introd�cense os valores no ArrayList.
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		dni.numeros.add(8);
		
		//Os valores do ArrayList son correctos e a letra tam�n. Devolve true.
		assertEquals(true, dni.eValido(dni.numeros,'Z'));
		
		//Os valores do ArrayList son correctos pero a letra non.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		
		//Elim�nase un d�xito do ArrayList.
		dni.numeros.remove(7);
		
		//O n�mero non cont�n os 8 d�xitos que deber�a.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		
		//Eng�dense valores no ArrayList.
		dni.numeros.add(8);
		dni.numeros.add(9);
		
		//O n�mero excede os 8 d�xitos.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		
		//Val�irase o ArrayList
		dni.numeros.clear();
		
		//O ArrayList non cont�n n�meros.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
	}
	
	@Test
	public void calculaLetraDous(){
		DNI dni = new DNI();
		
		//Introd�cense os valores no ArrayList.
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		dni.numeros.add(8);
		
		//Os valores do ArrayList son correctos e dev�lvese o n�mero de letra 14.
		assertEquals(14, dni.calculaLetra(dni.numeros));
		
		//Elim�nase un d�xito do ArrayList.
		dni.numeros.remove(7);
		
		//O n�mero non cont�n os 8 d�xitos que deber�a.
		assertEquals(-1, dni.calculaLetra(dni.numeros));
		
		//Eng�dense valores no ArrayList.
		dni.numeros.add(8);
		dni.numeros.add(9);
		
		//O n�mero excede os 8 d�xitos.
		assertEquals(-1, dni.calculaLetra(dni.numeros));
		
		//Val�irase o ArrayList.
		dni.numeros.clear();
		
		//O ArrayList non cont�n n�meros.
		assertEquals(-1, dni.calculaLetra(dni.numeros));
	}
	

}
