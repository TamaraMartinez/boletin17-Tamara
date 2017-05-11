package dni;

import java.util.ArrayList;

/**
 * 
 * @author dam115
 * Os m�todos que devolvan o valor -1 estar�n indicando que houbo un erro
 */

public class DNI {

	/* Array que garda as letras do DNI. O �ndice de cada letra indica o resto que debe quedar � dividir o n�mero de
	DNI entre 23*/
	
	private char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	
	//ArrayList onde se almacenar�n os d�xitos do n�mero de DNI
	
	public ArrayList<Integer> numeros = new ArrayList<Integer>();

	/**
	 * M�todo que calcula a letra do DNI a partir do n�mero
	 * @param numeroLetra O n�mero de letra debe pasarse como unha cadea de texto
	 * @return Dev�lvese o n�mero que corresponder� � letra
	 */
	
	public boolean eValido(String numeroLetra) {
		if (numeroLetra.length() < 9 || numeroLetra.length() > 9)
			return false;

		String numero;
		char letra, comprobaLetra;

		numero = numeroLetra.substring(0, 8);
		letra = numeroLetra.charAt(8);
		comprobaLetra = letraDNI[calculaLetra(numero)];

		if (letra != comprobaLetra)
			return false;
		else
			return true;
	}

	public int calculaLetra(String numero) {

		if (numero.length() < 8 || numero.length() > 8)
			return -1;

		int num, letra;
		num = Integer.parseInt(numero);
		letra = num % 23;

		return letra;
	}

	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		String numero = "";
		int numLetra;

		for (int i = 0; i < numeros.size(); i++)
			numero = numero + numeros.get(i).toString();

		if (numero == "")
			return false;
		numLetra = calculaLetra(numeros);

		if (numLetra == -1)
			return false;

		else if (numeros.size() > 8 || numeros.size() < 8 || letra != letraDNI[numLetra])
			return false;

		else
			return true;
	}

	public int calculaLetra(ArrayList<Integer> numeros) {
		if (numeros.size() > 8 || numeros.size() < 8)
			return -1;

		int i;
		String numero;
		numero = "";
		for (i = 0; i < numeros.size(); i++)
			numero = numero+numeros.get(i);

		int letra;
		letra = Integer.parseInt(numero) % 23;
		return letra;
	}
}
