package algo.sorting;

/**
 * sort an array using bubble sort algorithm
 * */
public class BubbleSort {

	//returns the sorted array
	public int[] sort(int[] a, int n ) {
				
		//iterate over the array
		for(int i=0; i<n; i++) {
			
			//move the largest element at the end on each iteration
			for(int j=0; j<(n-i-1); j++) {
				
				if(a[j] > a[j+1]) {
					
					swap(a, j);
				}
			}
		}
		
		return a;
	}
	
	public void swap(int[] a, int i) {
		
		//swap positions
		int temp = a[i];
		a[i] = a[i+1];
		a[i+1] = temp;
	}
	
}


















