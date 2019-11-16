package Programa3;

public class FindLast {
	
	/**
	* Find last index of element
	*
	* @param x array to search
	* @param y value to look for
	* @return last index of y in x; -1 if absent
	* @throws NullPointerException if x is null
	*/
	// No se tiene cuenta el elemento de la posicion 0
	public static int findLast (int[] x, int y){
		for (int i=x.length-1; i > 0; i--){
			if (x[i] == y){
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	* Find last index of element
	*
	* @param x array to search
	* @param y value to look for
	* @return last index of y in x; -1 if absent
	* @throws NullPointerException if x is null
	*/
	// No se tiene cuenta el elemento de la posicion 0
	public static int findLastFixed (int[] x, int y){
		for (int i=x.length-1; i >= 0; i--){
			if (x[i] == y){
				return i;
			}
		}
		return -1;
	}

}
