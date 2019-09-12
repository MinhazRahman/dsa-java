package algo.sorting;

import java.util.Arrays;

public class MergeSort {

	//sort an array a[p...r] using merge sort algorithm
	public void mergeSort(int[] a, int p, int r) {

		int q;
		
		//base case 
		if(p >= r) {
			return;
		}

		//recursive steps
		q = (p+r)/2; 

		mergeSort(a, p, q);
		mergeSort(a, q+1, r);
		merge(a, p, q, r);
	}

	//merge the sorted sub arrays a[p....q] and a[q+1...r]
	private void merge(int[] a, int p, int q, int r) {

		//number of elements in a[p...q]
		int n1 = q-p+1;
		//number of elements in a[q+1...r]
		int n2 = r-q;

		//create two temporary arrays of size n1+1 and n2+1 respectively
		int[] b = new int[n1+1];
		int[] c = new int[n2+1];
		
		//declare variables
		int i, j, k;

		//copy a[p...q] into b[0..n1-1]
		for(i= 0; i<n1; i++) {

			b[i] = a[p+i];
		}

		//copy a[q+1...r] into c[0..n2-1]
		for(j= 0;j<n2; j++) {

			c[j] = a[q+1+j];
		}
		
		//we will assign sentinels to the last slots(b[n1], c[n2])
		//set the sentinels to the maximum integer value
		b[n1] = Integer.MAX_VALUE;
		c[n2] = Integer.MAX_VALUE;
		
		//set i and j to 0
		i = 0;
		j = 0;
		
		//copy elements from both b and c to a[p...r]
		for(k = p; k<=r; k++) {
			
			if(b[i] <= c[j]) {
				a[k] = b[i];
				i++;
			}
			else { //c[j] < b[i]
				
				a[k] = c[j];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		

		MergeSort s = new MergeSort();
		
		int[] a = {5, 2, 4, 6, 1, 3};
		int[] b = {12, 9, 3, 7, 14, 11};
		
		s.mergeSort(a, 0, a.length-1);
		s.mergeSort(b, 0, b.length-1);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));


	}

}












