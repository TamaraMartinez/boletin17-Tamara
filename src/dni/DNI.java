package dni;

import java.util.ArrayList;

public class DNI {

	private char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	public ArrayList<Integer> numeros = new ArrayList<Integer>();

	public int calculaLetra(String numero) {
		int num, letra;
		num = Integer.parseInt(numero);
		letra = num % 23;
		if (num > 99999999)
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
