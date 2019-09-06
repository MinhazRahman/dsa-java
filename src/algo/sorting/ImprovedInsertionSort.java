package algo.sorting;

import java.util.Arrays;

/**
{5, 2, 4, 6, 1, 3}
{2, 5, 4, 6, 1, 3}
{2, 4, 5, 6, 1, 3}
{1, 2, 4, 5, 6, 3}
{1, 2, 3, 4, 5, 6}
In insertion sort we divide the array into two parts: sorted and unsorted
We select the left most value of the unsorted part 
and keep comparing with the values of the sorted section from right to left
till we find the right position for the target value to be inserted.*/

public class ImprovedInsertionSort {
	
	public int[] sort(int[] a, int n) {
		
		//a[0...j] is the sorted portion, a[i...n-1] is the unsorted portion,
		//key is the target value we want to insert into the sorted portion
		int i, j, key;
		
		//iterate over the array
		for(i = 1; i< n; i++) {
			
			//on each iteration get the target value from the unsorted portion as key
			key = a[i];
			j = i-1;
			
			//move the larger values to the right
			while(j>= 0 && a[j]>key) {
				
				//move the larger element to the right
				a[j+1] = a[j];
				
				//move down the sorted portion by decreasing j
				--j;
			}
			
			//insert the key at the right position
			a[j+1] = key;
			
		}
		
		return a;
	}

	public static void main(String[] args) {

		ImprovedInsertionSort s = new ImprovedInsertionSort();
		
		int[] a = {5, 2, 4, 6, 1, 3};
		int[] b = {12, 9, 3, 7, 14, 11};
		
		int[] c = s.sort(a, a.length);
		int[] d = s.sort(b, b.length);
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}

}









