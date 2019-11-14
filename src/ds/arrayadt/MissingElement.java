package ds.arrayadt;

/**Finding Missing elements in an array
 * 
 * 1. Single missing element in a sorted array
 * 2. multiple missing elements in a sorted array
 * 3. missing elements in an unsorted array
 * 
 * Sum of first n natural numbers: 1, 2, 3, 4,5...n-1 = n*(n + 1)/n
 * */

public class MissingElement {
	
	//finding missing element using sum of n natural numbers
	//missing element = sum of first n natural numbers - sum of all the elements in the array
	public int findMissingElementInSortedArray(int[] a) {
		
		int sum = 0;
		
		//number of natural numbers
		int n = a.length + 1;
		
		//sum of n natural numbers
		int S = n*(n + 1)/2;
		
		//sum of array elements
		for(int i = 0; i < a.length; i++) {
			
			sum += a[i];
		}
		
		return S - sum;
	}
	
	//finding missing element using difference
	//difference = first element - zero
	//missing element = difference + index;
	//time : O(n)
	public int getMissingElementInSortedArray(int[] a) {
		
		//variables
		int n = a.length, index = 0, missingElement = 0;
		int low = a[0];
		int high = a[n - 1];
		int diff = low - index;
		
		//finding missing element
		for(index = 0; index < n; index ++) {
			
			if((a[index] - index) != diff) {
				
				missingElement = diff + index;
				
				//found
				return missingElement;
			}
		}
		
		//not found
		return missingElement;
	}

	public static void main(String[] args) {
		
		MissingElement me = new MissingElement();

		int[] a = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		
		int missingElement = me.findMissingElementInSortedArray(a);
		System.out.println(missingElement);
		
		missingElement = me.getMissingElementInSortedArray(a);
		System.out.println(missingElement);
	}

}















