package dni;

import java.util.ArrayList;

public class DNI {

	private char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	public ArrayList<Integer> numeros = new ArrayList<Integer>();

	public boolean eValido(String numeroLetra) {
		int numero;
		char letra, comprobaLetra;
		numero = Integer.parseInt(numeroLetra.substring(0, 8));
		letra = numeroLetra.charAt(8);
		comprobaLetra = letraDNI[numero % 23];
		if (numeroLetra.length() < 9 || numeroLetra.length() > 9 || letra != comprobaLetra)
			return false;
		else
			return true;
	}
	
	public int calculaLetra(String numero) {
		int num, letra;
		num = Integer.parseInt(numero);
		letra = num % 23;
		if (num > 99999999 || num <= 9999999)
			return -1;
		else
			return letra;
	}

	public boolean eValido(ArrayList<Integer> numeros, char letra) {
		String numero = "";
		int numLetra;
		for (int i = 0; i < numeros.size(); i++)
			numero = numero + numeros.get(i).toString();
		if (numero == "")
			return false;
		numLetra = calculaLetra(numero);
		if (numLetra == -1)
			return false;
		else if (numeros.size() > 8 || numeros.size() < 8 || letra != letraDNI[numLetra])
			return false;
		else
			return true;
	}
}
