package ds.arrayadt;

import java.util.Arrays;

/**
 * A set does not contain duplicate elements
 *
 *1. union
 *2. intersection
 *3. difference
 *4. set membership: as search operation on an array
 * */

public class SetOperationsOnArray {
	
	//union operation on two sorted array
	public int[] union(int[] a, int[] b, int[] c) {
		
		//variables
		int i = 0, j = 0, k = 0, m = a.length, n = b.length;
		
		//insert duplicate elements from a[0..n-1] and b[0..m-1] into c[0..(m+n)-1]
		while(i < m && j < n) {
			
			if(a[i] < b[j]) {
				
				c[k++] = a[i++];	
			}
			else if(b[j] < a[i]) {
				
				c[k++] = b[j++];
			}
			else {
				
				c[k++] = a[i];
				i++;
				j++;
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
	
	//perform intersection on two sorted array
	public int[] intersection(int[] a, int[] b, int[] c) {
		
		//variables
		int i = 0, j = 0, k = 0, m = a.length, n = b.length;
		
		//insert common elements from a[0..n-1] and b[0..m-1] into c[0..(m+n)-1]
		while(i < m && j < n) {
			
			if(a[i] < b[j]) {
				
				i++;	
			}
			else if(b[j] < a[i]) {
				
				j++;
			}
			else {
				
				c[k] = a[i];
				
				i++;
				j++;
				k++;
			}
		}
		
		return c;
	}
	
	//difference operation on two sorted array
	public int[] difference(int[] a, int[] b, int[] c) {
		
		//variables
		int i = 0, j = 0, k = 0, m = a.length, n = b.length;
		
		//insert only those elements from a[0..n-1] that are not in b[0..m-1] into c[0..(m+n)-1]
		while(i < m && j < n) {
			
			if(a[i] < b[j]) {
				
				c[k] = a[i];
				
				i++;
				k++;
			}
			else if(b[j] < a[i]) {
				
				j++;
			}
			else {
				
				i++;
				j++;
			}
		}
		
		return c;
		
	}

	public static void main(String[] args) {

		//create object
		SetOperationsOnArray set = new SetOperationsOnArray();
		
		//inputs
		int[] a = {3, 4, 5, 6, 10};
		int[] b = {2, 4, 5, 7, 12};
		
		int[] u = new int[a.length + b.length];
		int[] n = new int[a.length + b.length];
		int[] d = new int[a.length + b.length];
		
		//union
		u = set.union(a, b, u);
		System.out.println(Arrays.toString(u));
		
		//intersection
		n = set.intersection(a, b, n);
		System.out.println(Arrays.toString(n));
		
		//difference
		d = set.difference(a, b, d);
		System.out.println(Arrays.toString(d));
	}

}














