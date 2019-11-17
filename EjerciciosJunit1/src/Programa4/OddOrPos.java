package Programa4;

public class OddOrPos {

	/**
	* Count odd or positive elements in an array
	*
	* @param x array to search
	* @return count of odd or positive elements in x
	* @throws NullPointerException if x is null
	*/
	// No cuenta los impares negativos
	public static int oddOrPos (int[] x){
		int count = 0;
		for (int i = 0; i < x.length; i++){
			if (x[i]%2 == 1 || x[i] > 0){
				count++;
			}
		}
		return count;
	}
	
	public static int oddOrPosFixed (int[] x){
		int count = 0;
		for (int i = 0; i < x.length; i++){
			if ( x[i]%2 == -1 || x[i] > 0){
				count++;
			}
		}
		return count;
	}
	
}
