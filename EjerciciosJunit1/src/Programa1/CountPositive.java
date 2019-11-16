package Programa1;

public class CountPositive {
	
	/**
	* Counts positive elements in array
	*
	* @param x array to search
	* @return number of positive elements in x
	* @throws NullPointerException if x is null
	*/
	// El cero no es positivo y este metodo lo cuenta como tal
	public static int countPositive (int[] x){
		int count = 0;
		for (int i=0; i < x.length; i++){
			if (x[i] >= 0){
				count++;
			}
		}
		return count;
	}
	
	/**
	* Counts positive elements in array
	*
	* @param x array to search
	* @return number of positive elements in x
	* @throws NullPointerException if x is null
	*/
	// En este metodo el bucle utiliza x.length cuando deberia usar el metodo x.length()
	public static int countPositiveFixed (int[] x){
		int count = 0;
		for (int i=0; i < x.length; i++){
			if (x[i] > 0){
				count++;
			}
		}
		return count;
	}

}
