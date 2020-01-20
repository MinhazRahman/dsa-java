package algo.sorting;

import java.util.Arrays;

public class BubbleSortDesc {
	
	public static int[] sort(int[] a) {
		
		for(int j = 0; j < a.length; j++) {
			
			for(int i = j + 1; i < a.length; i++) {
				
				if(a[i] > a[j]) {
					
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;	
				}
			}
		}
		
		return a;
	}

	public static void main(String[] args) {

		int[] arr = {40, 10, 50, 30, 60};
		
		System.out.println(Arrays.toString(sort(arr)));
	}

}
