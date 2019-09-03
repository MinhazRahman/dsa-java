package algo.searching;

/**
 * Binary search requires the array being searched to be already sorted.
 * Binary search takes O(log n)time to search an n-element array.
 * */
public class BinarySearch {
	
	//a is a sorted array, n is the array length, x is the target value
	public int search(int[] a, int n, int x) {
		
		//declare variables
		int start, end, mid;
		
		//initialize the variables
		start = 0;
		end = n-1;
		
		if(n != a.length) {
			
			return -1;
		}
		
		//search for the particular value
		while(start <= end) {
			
			//calculate mid point
			mid = (start + end)/2;
			
			if(a[mid] == x) {  //mid value
				//found
				return mid;
			}
			else if( x < a[mid] ) {  //left sub array
				
				end = mid -1;
			}
			else {					//right sub array
				start = mid +1;
			}
		}
		
		//not found
		return -1;
	}

}
