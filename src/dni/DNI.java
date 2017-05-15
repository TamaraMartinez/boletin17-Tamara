package dni;

import java.util.ArrayList;

/**
 * 
 * @author dam115 Os m�todos que devolvan o valor -1 estar�n indicando que houbo
 *         un erro
 */

public class DNI {

	/*
	 * Array que garda as letras do DNI. O �ndice de cada letra indica o resto
	 * que debe quedar � dividir o n�mero de DNI entre 23
	 */

	private char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	// ArrayList onde se almacenar�n os d�xitos do n�mero de DNI

	public ArrayList<Integer> numeros = new ArrayList<Integer>();

	/**
	 * M�todo que comproba que o DNI sexa v�lido.
	 * @param numeroLetra Cont�n o n�mero de DNI seguido da letra
	 * @return Dev�lvese true ou false, dependendo de que o DNI sexa v�lido ou non respectivamente.
	 */

	public boolean eValido(String numeroLetra) {
		// Compr�base que o valor introducido sexa de 9 caracteres (8 d�xitos e unha letra).
		if (numeroLetra.length() < 9 || numeroLetra.length() > 9)
			return false;

		// Declaraci�n das variables n�mero, letra, calcLetra e comprobaLetra
		String numero;
		int calcLetra;
		char letra, comprobaLetra;

		// O n�mero corresponder� �s oito primeiros caracteres e a letra � �ltimo caracter.
		numero = numeroLetra.substring(0, 8);
		letra = numeroLetra.charAt(8);
		
		/*calcLetra calcular� a letra correspondente � n�mero de DNI. Se o c�culo devolve -1,
		 significa que houbo un erro, polo tanto devolverase false*/
		calcLetra = calculaLetra(numero);
		if (calcLetra == -1)
			return false;
		
		// comprobaLetra conter� a letra do array que resulte do c�lculo da letra do DNI.
		comprobaLetra = letraDNI[calcLetra];

		// Compr�base que a letra introducida coincida coa letra do array.
		if (letra != comprobaLetra)
			return false;
		
		return true;
	}

	/**
	 * M�todo que calcula a letra do DNI a partir do n�mero. 
	 * @param numero N�mero de DNI
	 * @return Devolve o n�mero de letra correspondente � n�mero de DNI
	 */

	public int calculaLetra(String numero) throws NumberFormatException {

		// Compr�base que o n�mero conte�a 8 d�xitos.
		if (numero.length() < 8 || numero.length() > 8)
			return -1;

		// Decl�ranse as variables num e letra.
		int num, letra;
		// Int�ntase pasar o n�mero de String a int
		try {
			num = Integer.parseInt(numero);
		} 
		// Se hai alg�n caracter que non sexa un n�mero, manexarase a excepci�n e devolverase -1.
		catch (NumberFormatException e) {
			return -1;
		}
		
		//Se o int resultante da operaci�n anterior � negativo devolverase -1.
		if (num < 0)
			return -1;
		
		// Calc�lase a letra correspondente � n�mero.
		letra = num % 23;

		// Devolve o n�mero de letra.
		return letra;
	}

	/**
	 * M�todo que comproba que o DNI sexa v�lido.
	 * @param numeros ArrayList que cont�n os d�xitos do n�mero de DNI.
	 * @param letra Letra do DNI
	 * @return Dev�lvese true ou false, dependendo de que o DNI sexa v�lido ou non respectivamente.
	 */

	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		//Decl�ranse as variables n�mero e numLetra.
		String numero = "";
		int numLetra;

		//Concat�nanse os d�xitos do ArrayList e g�rdanse en forma de String na variable numero.
		for (int i = 0; i < numeros.size(); i++)
			numero = numero + numeros.get(i).toString();

		//Se non se introduciu ning�n n�mero devolverase false.
		if (numero == "")
			return false;
		
		//Decl�rase a variable numLetra, que conter� a letra correspondente � DNI.
		numLetra = calculaLetra(numeros);

		//Se o c�culo  da letra devolve -1, significa que houbo un erro, polo tanto devolverase false.
		if (numLetra == -1)
			return false;

		/* Compr�base que a lonxitude do n�mero de DNI sexa de 8 d�xitos e que a letra introducida e a
		resultante do c�lculo coincidan.*/
		
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
