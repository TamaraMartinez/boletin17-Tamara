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
		
		//Introdúcese un DNI válido e devolve true.
		assertEquals(true, dni.eValido("12345678Z"));
		
		//Contémplase o caso no que a letra non sexa a correcta.
		assertEquals(false, dni.eValido("12345678Y"));
		
		//Contémplase o caso no que o número exceda os 8 díxitos.
		assertEquals(false, dni.eValido("123456789Y"));
		
		//Contémplase o caso de que se introduza unha cadea menor a 9 caracteres.
		assertEquals(false, dni.eValido("1567"));
		
		//Contémplase o caso no que non se introduza a letra.
		assertEquals(false, dni.eValido("1234567"));
		
		//Contémplase o caso no que o número introducido sexa negativo.
		assertEquals(false, dni.eValido("-12345678Z"));
		
		/*Contémplase o caso no que se introduzan caracteres non permitidos onde
		debería ir o número de DNI.*/
		assertEquals(false, dni.eValido("%JJJJJJJH"));
		
		//Contémplase o mesmo que no caso anterior pero con números polo medio.
		assertEquals(false, dni.eValido("JJJ8JJJJH"));

		//Contémplase o caso no que non se introduciu nada.
		assertEquals(false, dni.eValido(""));
	}
	
	@Test
	public void calculaLetraUn() {
		DNI dni = new DNI();
		//Introdúcese un número de DNI válido e devólvese o número de letra 14.
		assertEquals(14, dni.calculaLetra("12345678"));
		
		//Contémplase o caso no que o número exceda os 8 díxitos.
		assertEquals(-1, dni.calculaLetra("123456789"));
		
		//Contémplase o caso onde o número esté composto por menos de oito díxitos.
		assertEquals(-1, dni.calculaLetra("1234567"));
		
		//Contémplase o caso no que o número introducido sexa negativo.
		assertEquals(-1, dni.calculaLetra("-12345678"));
		
		/*Contémplase o caso no que se introduzan caracteres non permitidos onde
		debería ir o número de DNI.*/
		assertEquals(-1, dni.calculaLetra("FFFF)FFF"));
		
		//Contémplase o mesmo que no caso anterior pero con números polo medio.
		assertEquals(-1, dni.calculaLetra("FFF1FFFF"));
		
		//Contémplase o caso no que non se introduciu nada.
		assertEquals(-1, dni.calculaLetra(""));
	}
	
	@Test
	
	public void eValidoDous() {
		DNI dni = new DNI();
		
		//Introdúcense os valores no ArrayList.
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		dni.numeros.add(8);
		
		//Os valores do ArrayList son correctos e a letra tamén. Devolve true.
		assertEquals(true, dni.eValido(dni.numeros,'Z'));
		
		//Os valores do ArrayList son correctos pero a letra non.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		
		//Elimínase un díxito do ArrayList.
		dni.numeros.remove(7);
		
		//O número non contén os 8 díxitos que debería.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		
		//Engádense valores no ArrayList.
		dni.numeros.add(8);
		dni.numeros.add(9);
		
		//O número excede os 8 díxitos.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
		
		//Valéirase o ArrayList
		dni.numeros.clear();
		
		//O ArrayList non contén números.
		assertEquals(false, dni.eValido(dni.numeros,'G'));
	}
	
	@Test
	public void calculaLetraDous(){
		DNI dni = new DNI();
		
		//Introdúcense os valores no ArrayList.
		dni.numeros.add(1);
		dni.numeros.add(2);
		dni.numeros.add(3);
		dni.numeros.add(4);
		dni.numeros.add(5);
		dni.numeros.add(6);
		dni.numeros.add(7);
		dni.numeros.add(8);
		
		//Os valores do ArrayList son correctos e devólvese o número de letra 14.
		assertEquals(14, dni.calculaLetra(dni.numeros));
		
		//Elimínase un díxito do ArrayList.
		dni.numeros.remove(7);
		
		//O número non contén os 8 díxitos que debería.
		assertEquals(-1, dni.calculaLetra(dni.numeros));
		
		//Engádense valores no ArrayList.
		dni.numeros.add(8);
		dni.numeros.add(9);
		
		//O número excede os 8 díxitos.
		assertEquals(-1, dni.calculaLetra(dni.numeros));
		
		//Valéirase o ArrayList.
		dni.numeros.clear();
		
		//O ArrayList non contén números.
		assertEquals(-1, dni.calculaLetra(dni.numeros));
	}
	

}
