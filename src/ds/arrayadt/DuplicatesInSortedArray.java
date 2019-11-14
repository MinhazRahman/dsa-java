package ds.arrayadt;

/**
 * 1. Finding duplicates in sorted array
 * 2. Counting duplicates in sorted array
 * */
public class DuplicatesInSortedArray {
	
	//find only duplicate values
	public void findDuplicates(int[] a) {
		
		//variables
		int lastDuplicate = 0, i;
		
		//iterate over the array
		for(i = 0; i < a.length - 1; i++) {
			
			//print duplicates
			if(a[i] == a[i+1] && lastDuplicate != a[i+1]) {
				
				//set last duplicate
				lastDuplicate = a[i+1];
				
				System.out.println(a[i]);
			}
		}
		
	}
	
	//find and count duplicate values, time complexity: O(n)
	public void findDuplicate(int[] a) {
		
		//variables
		int i, j;
		
		//iterate over the array
		for(i = 0; i < a.length - 1; i++) {
			
			if(a[i] == a[i + 1]) {
				
				j = i + 1;
				
				//keep i fixed and increment j, compare a[i] with a[j]
				while(a[i] == a[j]) {
					
					j++;
				}
				
				System.out.println(a[i] + ": " + (j - i) );
				
				//at this point i indicates the last duplicate element
				i = j - 1;
			}
		}
	}

	public static void main(String[] args) {

		//object reference
		DuplicatesInSortedArray d = new DuplicatesInSortedArray();
		
		//input
		int[] a = {4, 5, 5, 6, 7, 8, 8, 8, 9, 10};
		
		d.findDuplicates(a);
		
		System.out.println();
		d.findDuplicate(a);
	}
}






























