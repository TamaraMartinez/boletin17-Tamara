package xeometria;
/**
 * 
 * @author dam115
 * Se os métodos devolven o valor -1 significa que houbo un erro.
 */
public class Xeometria {

	/**
	 * Método que calcula o perímetro dun cadrado.
	 * @param lado Lonxitude do lado.
	 * @return Devolve o perímetro.
	 */
	
	public int perimetroCadrado(int lado) {
		//Compróbase que o lado sexa positivo e que o seu valor non sexa cero.
		
		if (lado <= 0)
			return -1;

		//Defínese a variable perímetro e calcúlase o perímetro.
		int perimetro;
		perimetro = lado * 4;
		
		return perimetro;
	}

	/**
	 * Método que calcula a área dun cadrado.
	 * @param lado Lonxitude do lado.
	 * @return Devolve a área.
	 */

	public int areaCadrado(int lado) {
		//Compróbase que o lado sexa positivo e que o seu valor non sexa cero.
		
		if (lado <= 0)
			return -1;
		
		//Defínese a variable area e calcúlase a área
		int area;
		area = lado * lado;
		
		return area;
	}

	/**
	 * Método que calcula a hipotenusa utilizando o teorema de Pitágoras
	 * @param catetoA Lonxitude do cateto A
	 * @param catetoB Lonxitude do cateto B
	 * @return Devolve a hipotenusa
	 */

	public double teoremaPitagoras(int catetoA, int catetoB) {
		//Compróbase que os catetos sexan positivos e que o valor destes non sexa cero.
		
		if (catetoA <= 0 || catetoB <= 0)
			return -1;
		
		//Definición da variable hipotenusa e cálculo da hipotenusa
		
		double hipotenusa;
		hipotenusa = Math.sqrt((catetoA * catetoA + catetoB * catetoB));
		
		return hipotenusa;
	}
	
	/**
	 * Método que calcula un cateto utilizando o teorema de Pitágoras.
	 * @param hipotenusa Lonxitude da hipotenusa.
	 * @param catetoA Lonxitude do cateto A.
	 * @return Devolve o cateto B.
	 */
	
	public double teoremaPitagoras(double hipotenusa, double catetoA){

		/* Compróbase que a hipotenusa sexa maior que o cateto, que a hipotenusa e o catetoA sexan positivos
		 * e que ningún deles vala cero*/
		
		if (hipotenusa < catetoA || hipotenusa <= 0 || catetoA <= 0)
			return -1;
		
		// Definición da variable catetoB e cálculo do catetoB
		
		double catetoB;
		catetoB = Math.sqrt((hipotenusa * hipotenusa - catetoA * catetoA));
		
		return catetoB;
	}
}
