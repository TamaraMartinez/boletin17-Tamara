package xeometria;

public class Xeometria {

	/**
	 * M�todo que calcula o per�metro dun cadrado
	 * @param lado Lonxitude do lado
	 * @return Devolve o per�metro
	 */
	
	public int perimetroCadrado(int lado) {
		int perimetro;
		perimetro = lado * 4;

		if (lado <= 0)
			return -1;
		else
			return perimetro;
	}

	/**
	 * M�todo que calcula a �rea dun cadrado
	 * @param lado Lonxitude do lado
	 * @return Devolve a �rea
	 */

	public int areaCadrado(int lado) {
		int area;
		area = lado * lado;

		if (lado <= 0)
			return -1;
		else
			return area;
	}

	/**
	 * M�todo que calcula a hipotenusa utilizando o teorema de Pit�goras
	 * @param catetoA Lonxitude do cateto A
	 * @param catetoB Lonxitude do cateto B
	 * @return Devolve a hipotenusa
	 */

	public double teoremaPitagoras(int catetoA, int catetoB) {
		double hipotenusa;
		hipotenusa = Math.sqrt((catetoA * catetoA + catetoB * catetoB));

		if (catetoA <= 0 || catetoB <= 0)
			return -1;
		else
			return hipotenusa;
	}
	
	/**
	 * M�todo que calcula un cateto utilizando o teorema de Pit�goras
	 * @param hipotenusa Lonxitude da hipotenusa
	 * @param catetoA Lonxitude do cateto A
	 * @return Devolve o cateto B
	 */
	
	public double teoremaPitagoras(double hipotenusa, double catetoA){
		double catetoB;
		catetoB = Math.sqrt((catetoA * catetoA - hipotenusa * hipotenusa));
		
		if (hipotenusa <= 0 || catetoA <= 0)
			return -1;
		else
			return catetoB;
	}
}
