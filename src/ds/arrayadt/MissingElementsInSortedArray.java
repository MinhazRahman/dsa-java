package ds.arrayadt;

/**Finding Missing elements in an array
 * 
 * 1. Single missing element in a sorted array
 * 2. multiple missing elements in a sorted array
 * 3. missing elements in an unsorted array
 * 
 * Sum of first n natural numbers: 1, 2, 3, 4,5...n-1 = n*(n + 1)/n
 * */

public class MissingElementsInSortedArray {
	
	//finding missing element using difference
	//difference = first element - zero
	//missing element = difference + index;
	//time : O(n)
	public void findingMissingElementsInSortedArray(int[] a) {
		
		//variables
		int n = a.length, index = 0, missingElement = 0;
		int low = a[0];
		int high = a[n - 1];
		int diff = low - index, newdiff = 0;

		//finding missing element
		for(index = 0; index < n; index ++) {
			
			if((a[index] - index) != diff) {
				
				//new difference
				newdiff = a[index] - index;
				
				for(int j = diff; j < newdiff; j++) {
					
					missingElement = j + index;
					
					//found
					System.out.println(missingElement);
					
				}
				
				//set diff
				diff = newdiff;
			}
			
		}
	}
	
	//finding missing element using difference
	//difference = first element - zero
	//missing element = difference + index;
	//time : O(n)
	public void getMissingElementsInSortedArray(int[] a) {
		
		//variables
		int n = a.length, index = 0;
		int low = a[0];
		int high = a[n - 1];
		int diff = low - index;

		//finding missing element
		for(index = 0; index < n; index ++) {
			
			if((a[index] - index) != diff) {
				
				while(diff < a[index] - index) {
					
					System.out.println(diff + index);
					
					//increment diff by 1
					diff++;
				}
				
				//by the end of while loop the value of diff is updated
			}
			
		}
	}

	public static void main(String[] args) {
		
		MissingElementsInSortedArray me = new MissingElementsInSortedArray();

		int[] a = {5, 6, 7, 9, 10, 11, 13, 14, 17, 18};
		
		me.findingMissingElementsInSortedArray(a);
		
		System.out.println();
		me.getMissingElementsInSortedArray(a);
	}

}















