package xeometria;
/**
 * 
 * @author dam115
 * Se os m�todos devolven o valor -1 significa que houbo un erro.
 */
public class Xeometria {

	/**
	 * M�todo que calcula o per�metro dun cadrado.
	 * @param lado Lonxitude do lado.
	 * @return Devolve o per�metro.
	 */
	
	public int perimetroCadrado(int lado) {
		//Compr�base que o lado sexa positivo e que o seu valor non sexa cero.
		
		if (lado <= 0)
			return -1;

		//Def�nese a variable per�metro e calc�lase o per�metro.
		int perimetro;
		perimetro = lado * 4;
		
		return perimetro;
	}

	/**
	 * M�todo que calcula a �rea dun cadrado.
	 * @param lado Lonxitude do lado.
	 * @return Devolve a �rea.
	 */

	public int areaCadrado(int lado) {
		//Compr�base que o lado sexa positivo e que o seu valor non sexa cero.
		
		if (lado <= 0)
			return -1;
		
		//Def�nese a variable area e calc�lase a �rea
		int area;
		area = lado * lado;
		
		return area;
	}

	/**
	 * M�todo que calcula a hipotenusa utilizando o teorema de Pit�goras
	 * @param catetoA Lonxitude do cateto A
	 * @param catetoB Lonxitude do cateto B
	 * @return Devolve a hipotenusa
	 */

	public double teoremaPitagoras(int catetoA, int catetoB) {
		//Compr�base que os catetos sexan positivos e que o valor destes non sexa cero.
		
		if (catetoA <= 0 || catetoB <= 0)
			return -1;
		
		//Definici�n da variable hipotenusa e c�lculo da hipotenusa
		
		double hipotenusa;
		hipotenusa = Math.sqrt((catetoA * catetoA + catetoB * catetoB));
		
		return hipotenusa;
	}
	
	/**
	 * M�todo que calcula un cateto utilizando o teorema de Pit�goras.
	 * @param hipotenusa Lonxitude da hipotenusa.
	 * @param catetoA Lonxitude do cateto A.
	 * @return Devolve o cateto B.
	 */
	
	public double teoremaPitagoras(double hipotenusa, double catetoA){

		/* Compr�base que a hipotenusa sexa maior que o cateto, que a hipotenusa e o catetoA sexan positivos
		 * e que ning�n deles vala cero*/
		
		if (hipotenusa < catetoA || hipotenusa <= 0 || catetoA <= 0)
			return -1;
		
		// Definici�n da variable catetoB e c�lculo do catetoB
		
		double catetoB;
		catetoB = Math.sqrt((hipotenusa * hipotenusa - catetoA * catetoA));
		
		return catetoB;
	}
}
