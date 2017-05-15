package dni;

import java.util.ArrayList;

/**
 * 
 * @author dam115 Os métodos que devolvan o valor -1 estarán indicando que houbo
 *         un erro
 */

public class DNI {

	/*
	 * Array que garda as letras do DNI. O índice de cada letra indica o resto
	 * que debe quedar ó dividir o número de DNI entre 23
	 */

	private char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	// ArrayList onde se almacenarán os díxitos do número de DNI

	public ArrayList<Integer> numeros = new ArrayList<Integer>();

	/**
	 * Método que comproba que o DNI sexa válido.
	 * @param numeroLetra Contén o número de DNI seguido da letra
	 * @return Devólvese true ou false, dependendo de que o DNI sexa válido ou non respectivamente.
	 */

	public boolean eValido(String numeroLetra) {
		// Compróbase que o valor introducido sexa de 9 caracteres (8 díxitos e unha letra).
		if (numeroLetra.length() < 9 || numeroLetra.length() > 9)
			return false;

		// Declaración das variables número, letra, calcLetra e comprobaLetra
		String numero;
		int calcLetra;
		char letra, comprobaLetra;

		// O número corresponderá ós oito primeiros caracteres e a letra ó último caracter.
		numero = numeroLetra.substring(0, 8);
		letra = numeroLetra.charAt(8);
		
		/*calcLetra calculará a letra correspondente ó número de DNI. Se o cáculo devolve -1,
		 significa que houbo un erro, polo tanto devolverase false*/
		calcLetra = calculaLetra(numero);
		if (calcLetra == -1)
			return false;
		
		// comprobaLetra conterá a letra do array que resulte do cálculo da letra do DNI.
		comprobaLetra = letraDNI[calcLetra];

		// Compróbase que a letra introducida coincida coa letra do array.
		if (letra != comprobaLetra)
			return false;
		
		return true;
	}

	/**
	 * Método que calcula a letra do DNI a partir do número. 
	 * @param numero Número de DNI
	 * @return Devolve o número de letra correspondente ó número de DNI
	 */

	public int calculaLetra(String numero) throws NumberFormatException {

		// Compróbase que o número conteña 8 díxitos.
		if (numero.length() < 8 || numero.length() > 8)
			return -1;

		// Decláranse as variables num e letra.
		int num, letra;
		// Inténtase pasar o número de String a int
		try {
			num = Integer.parseInt(numero);
		} 
		// Se hai algún caracter que non sexa un número, manexarase a excepción e devolverase -1.
		catch (NumberFormatException e) {
			return -1;
		}
		
		//Se o int resultante da operación anterior é negativo devolverase -1.
		if (num < 0)
			return -1;
		
		// Calcúlase a letra correspondente ó número.
		letra = num % 23;

		// Devolve o número de letra.
		return letra;
	}

	/**
	 * Método que comproba que o DNI sexa válido.
	 * @param numeros ArrayList que contén os díxitos do número de DNI.
	 * @param letra Letra do DNI
	 * @return Devólvese true ou false, dependendo de que o DNI sexa válido ou non respectivamente.
	 */

	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		//Decláranse as variables número e numLetra.
		String numero = "";
		int numLetra;

		//Concaténanse os díxitos do ArrayList e gárdanse en forma de String na variable numero.
		for (int i = 0; i < numeros.size(); i++)
			numero = numero + numeros.get(i).toString();

		//Se non se introduciu ningún número devolverase false.
		if (numero == "")
			return false;
		
		//Declárase a variable numLetra, que conterá a letra correspondente ó DNI.
		numLetra = calculaLetra(numeros);

		//Se o cáculo  da letra devolve -1, significa que houbo un erro, polo tanto devolverase false.
		if (numLetra == -1)
			return false;

		/* Compróbase que a lonxitude do número de DNI sexa de 8 díxitos e que a letra introducida e a
		resultante do cálculo coincidan.*/
		
		if (numeros.size() > 8 || numeros.size() < 8 || letra != letraDNI[numLetra])
			return false;
		
		return true;
	}

	public int calculaLetra(ArrayList<Integer> numeros) {
		if (numeros.size() > 8 || numeros.size() < 8)
			return -1;

		int i;
		String numero;
		numero = "";
		for (i = 0; i < numeros.size(); i++)
			numero = numero + numeros.get(i);

		int letra;
		letra = Integer.parseInt(numero) % 23;
		return letra;
	}
}
