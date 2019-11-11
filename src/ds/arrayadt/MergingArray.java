package ds.arrayadt;

import java.util.Arrays;

/**
 * a = {3, 8, 16, 20, 25}; and b = {4, 10, 12, 22, 23};
 * 
 * Merge two sorted array a and b into a third array c in sorted order
 * 
 * c = {3, 4, 8, 10, 12, 16, 20, 22, 23, 25};
 * */
public class MergingArray {
	
	//time: O(m + n)
	public int[] merge(int[] a, int[] b, int[] c) {
		
		//variables
		int i = 0, j = 0, k = 0, m = a.length, n = b.length;
		
		//insert a[i] and b[j] into c[k] in sorted order
		while(i < m && j < n) {
			
			if(a[i] < b[j]) {
				
				c[k++] = a[i++];
				
			}
			else {

				c[k++] = b[j++];
			}
		}
		
		//copy the remaining elements
		for( ; i < m; i++) {
			
			c[k++] = a[i];
		}
		for(; j < n; j++) {
			
			c[k++] = b[j];
		}
		
		return c;
		
	}

	public static void main(String[] args) {

		//create object
		MergingArray m = new MergingArray();
		
		//inputs
		int[] a = {3, 8, 16, 20, 25, 25, 26};
		int[] b = {4, 10, 12, 22, 23};
		
		//inputs to be merged into array c
		int[] c = new int[a.length + b.length];
		
		//merge
		c = m.merge(a, b, c);
		System.out.println(Arrays.toString(c));
	}

}





















