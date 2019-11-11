package ds.arrayadt;

import java.util.Arrays;

/**a = {-6, 3, -8, 10, 5, -7, -9, 12, -4, 2};
 *  
 * Move all the negative numbers to the left and all the positive numbers to the right
 * 
 * a = {-6, -4, -8, -9, -7, 5, 10, 12, 3, 2};
 * 
 * */

public class NegativePositive {
	
	//time: O(n)
	public int[] moveNegativeNumbersToLeft(int[] a) {
		
		//variables
		int i = 0, j = a.length - 1;
		
		//bring all the negative numbers on the left side
		while(i <= j) {
			
			//swap positive and negative numbers
			if(a[i] > 0 && a[j] < 0) {
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				i++;
				j--;
			}
			
			//if a number on the left side is negative
			if(a[i] < 0) {
				
				i++;
			}
			
			//if a number on the right side is positive
			if(a[j] > 0) {
				
				j--;
			}		
		}
		
		return a;
		
	}
	
	//time: O(n)
	public int[] movePositiveNumbersToRight(int[] a) {
		
		//variables
		int i = 0, j = a.length - 1;
		
		//move positive numbers to right
		while(i < j) {
			
			//swap positive and negative numbers
			if(a[i] > 0 && a[j] < 0) {
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				i++;
				j--;
			}
			
			//if a number on the left side is negative
			while(a[i] < 0) {
				
				i++;
			}
			
			//if a number on the right side is positive
			while(a[j] >= 0) {
				
				j--;
			}
			
		}
		
		return a;
	}

	public static void main(String[] args) {
		
		NegativePositive np = new NegativePositive();

		int[] a = {-6, 3, -8, 10, 5, -7, -9, 12, -4, 2};
		
		int[] b = {-6, 3, -8, 10, 5, -7, -9, 12, -4, 2, -11};
		
		int[] input = {-6, 3, -8, 10, 5, -7, -9, 12, -4, 2};
		
		
		//move numbers to left
		int[] c = np.moveNegativeNumbersToLeft(a);
		
		System.out.println(Arrays.toString(c));
		
		//move numbers to left
		c = np.moveNegativeNumbersToLeft(b);
		
		System.out.println(Arrays.toString(c));
		
		
		//move numbers to right
		input = np.moveNegativeNumbersToLeft(input);
		
		System.out.println(Arrays.toString(input));
		
	}

}

























