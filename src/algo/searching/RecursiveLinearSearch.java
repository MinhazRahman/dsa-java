package algo.searching;

/**
 * Recursively searching an array for a particular value.
 * we are given an array, and we want to know which entry in
 * the array, if any, holds a given value.
 * */
public class RecursiveLinearSearch {
	
	//wrap the searchRecur() method within search() method
	public int search(int[] a, int n, int x) {
		
		return searchRecur(a, n, 0, x);
		
	}
	
	public int searchRecur(int[] a, int n, int i, int x) {
		
		//base cases
		if(i == n) {
			
			return -1;
		}
		else if( a[i] == x) {
			return i;
		}
		
		//recursive step
		return searchRecur(a, n, i+1, x);
	}

}
