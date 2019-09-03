package algo.searching;

/**
 * Searching an array for a particular value.
 * we are given an array, and we want to know which entry in
 * the array, if any, holds a given value.
 * Time complexity: O(n), an n-element array
 * */
public class LinearSearch {

	//a is an array, n is the size of the array and x is the value we are searching for
	public int search(int[] a, int n, int x) {
		
		if(n != a.length) {
			
			return -1;
		}
		//iterate over the array
		for(int i=0; i<n; i++) {
			
			if(a[i] == x) {
				//found at index i
				return i;
			}
		}
		
		//not found
		return -1;
	}
	
}
