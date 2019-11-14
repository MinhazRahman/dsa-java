package ds.arrayadt;

/**
 * Find multiple missing elements in an unsorted array
 * by using similar approach as hash table.
 * */

public class MissingElementsInUnsortedArray {
	
	public void findMissingElements(int[] a) {
		
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
			
			if(h[i] == 0) {
				
				System.out.println(i);
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
		MissingElementsInUnsortedArray me = new MissingElementsInUnsortedArray();

		//input
		int[] a = {10, 5, 13, 7, 18, 6, 11, 17, 9};
		
		me.findMissingElements(a);
		
	}

}








