package algo.sorting;

public class SelectionSort {
	
	//n is the length of the array a
	public int[] sort(int[] a, int n) {
		
		//declare the variables
		int i, j, min, found;
		
		//iterate over the array
		for(i=0; i<n; i++) {
			
			//contains the index of the smallest element
			//in this case we consider a[i] is the smallest element
			min = i;
			found = 0;
			
			//find the smallest element
			for(j= i+1; j<n; j++) {
				
				if(a[min] > a[j]) {
					
					min = j;
					found = 1;
				}
			}
			
			//swap only when we find a smaller element than a[i]
			//if a[i] is the smallest element then don't swap
			if(found == 1) {
				
				//swap the smallest element a[min] with a[i]
				swap(a, i, min);
			}

		}
		
		return a;
	}
	
	public void swap(int[] a, int i, int min) {
		
		//swap the a[i] with a[min]
		int temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}
}



















