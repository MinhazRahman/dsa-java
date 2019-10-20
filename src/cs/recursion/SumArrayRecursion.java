package cs.recursion;

import java.util.Arrays;

/**Given an array arr of integers. write a recursive function that
add sum of previous numbers to each index of the array.
input array = {1, 2, 3, 4, 5, 6} and output array = [1, 3, 6, 10, 15, 21]
*/

public class SumArrayRecursion {
	
	public static int[] sum(int[] a, int i) {
		
		//base case
		if( i == a.length) {
			
			return a;
		}
		
		//recursive case
		if(i == 0 ) {
			
			a[i] = a[i];
		}
		
		else {
			 
			a[i] = a[i - 1] + a[i];
		}
		
		sum(a, i + 1);
		
		return a;
		
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		

		a = SumArrayRecursion.sum(a, 0);

		System.out.println(Arrays.toString(a));
		
	}

}
