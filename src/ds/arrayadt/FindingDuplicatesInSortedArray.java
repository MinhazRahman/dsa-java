package ds.arrayadt;

/**
 * Find duplicates in a sorted array
 * by using hash table.
 * */

public class FindingDuplicatesInSortedArray {
	
	//time complexity: O(n)
	public void findDuplicates(int[] a) {
		
		//get the maximum element of array a
		int max = maximum(a);
		
		//create an array of length max + 1
		int[] h = new int[max + 1];
		
		//initialize h with zero
		for(int i = 0; i < h.length; i++) {
			
			h[i] = 0;
		}
		
		//update h by considering elements of a, as index values
		for(int i = 0; i < a.length; i++) {
			
			h[a[i]] ++;
		}
		
		//print the missing elements
		for(int i = 1; i < h.length; i++) {
			
			if(h[i] > 1) {
				
				System.out.println(i + ": " + h[i]);
			}
		}
	}
	
	public int maximum(int[] a) {
		
		int maxVal = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > maxVal) {
				
				maxVal = a[i];
			}
		}
		
		return maxVal;
	}

	public static void main(String[] args) {
		
		//get object reference
		FindingDuplicatesInSortedArray me = new FindingDuplicatesInSortedArray();

		//input
		int[] a = {5, 5, 6, 7, 8, 8, 8, 9, 10};
		
		me.findDuplicates(a);
		
	}

}








