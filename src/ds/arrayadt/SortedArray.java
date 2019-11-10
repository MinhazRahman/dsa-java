package ds.arrayadt;

import java.util.Arrays;

public class SortedArray {
	
	//time: O(n^2)
	public boolean isSorted(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	//insertion in a sorted array, O(n)
	public int[] insert(int[] a, int e) {
		
		for(int i = a.length - 1; i >=1; i--) {
			
			if(e <= a[i - 1]) {
				
				a[i] = a[i - 1];
				a[i - 1] = e;
				System.out.println(Arrays.toString(a));	
			}
			else { //e > a[i - 1]
				
				a[i] = e;
				
				return a;
			}
		}
		
		return a;
	}

	public static void main(String[] args) {

		SortedArray sr = new SortedArray();
		
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {1, 2, 3, 5, 6, 7, 4};
		int[] c = {1, 2, 3, 4, 6, 7, Integer.MAX_VALUE};
		
		//isSorted()
		System.out.println("isSorted: " + sr.isSorted(a));
		
		System.out.println("isSorted: " + sr.isSorted(b));
		
		c = sr.insert(c, 8);
		System.out.println(Arrays.toString(c));
	}

}

















