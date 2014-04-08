package dp.ua.pavelmorozov.archer;

/**
 * This class shows index of the value in array
 * @author P
 *
 */

public class FindInArray {
	/**
	 * Function searches value in down sorted array,
	 * and returns index if find, else returns -1
	 * @param intArray Sorted down array of int. 
	 * @param value - value to find in array.
	 * @return index of element if found. If not found returns -1.
	 */
	public static Integer findIndex(int[] intArray, int value){
		if (intArray == null) throw new NullPointerException(
				"The first argument should be not empty array."); 
		int low = 0;
		int hi = intArray.length-1;
		int mid = 0;
		while (low <= hi) {
			mid = (low + hi) >>> 1;
			final int valueFromArray = intArray[mid];
			if (valueFromArray == value)
				return mid;
			else if (valueFromArray > value)
				low = ++mid;
			else
				hi = --mid;
		}
		return -1;
	}
}
