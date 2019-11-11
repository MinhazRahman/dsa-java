package ds.arrayadt;

import java.util.Arrays;

public class SortedArray {
	
	//time: O(n^2)
	public boolean isSorted(int[] a) {
		
		for(int i = 0; i < a.length - 1; i++) {
			
			if(a[i] > a[i + 1]) {
				
				return false;
			}
		}
		
		return true;
	}
	
	//insertion in a sorted array, O(n)
	public int[] insert(int[] a, int x) {
		
		for(int i = a.length - 1; i >=1; i--) {
			
			if(x <= a[i - 1]) {
				
				a[i] = a[i - 1];
				a[i - 1] = x;
				System.out.println(Arrays.toString(a));	
			}
			else { //e > a[i - 1]
				
				a[i] = x;
				
				return a;
			}
		}
		
		return a;
	}
	
	//insert element in a sorted array, O(n)
	public int[] insertElement(int[] a, int x) {
		
		//last element
		int i = a.length - 2;
		
		//perform right shifting
		while(i != -1 && a[i] > x) {
			
			a[i + 1] = a[i];
			i--;
			
			System.out.println(Arrays.toString(a));
		}
		
		//insert element
		a[i + 1] = x;
		
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
		
		c = sr.insertElement(c, 8);
		System.out.println(Arrays.toString(c));
	}

}

















