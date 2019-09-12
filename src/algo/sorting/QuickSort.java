package algo.sorting;

import java.util.Arrays;

/**
 * Quick Sort works in place
 * */
public class QuickSort {
	
	//sort an array a[p...r] using quick sort algorithm
	public void quickSort(int[] a, int p, int r) {
		
		//pivot index
		int q;
		
		//base case 
		if(p >= r) {
			
			return;
		}
		
		//recursive steps
		q = partition(a, p, r);
		quickSort(a, p, q-1);
		quickSort(a, q+1, r);
	}

	private int partition(int[] a, int p, int r) {
		
		//q will contain the index of the pivot
		int q = p;
		
		//We consider a[r] is the pivot
		//move all the values that are < or = to a[r] to the left
		//and move all other values that are > than a[r] to the right
		for(int u = p; u <= r-1; u++) {
			
			if(a[u] <= a[r]) {
				
				//swap a[q] with a[u]
				int temp = a[u];
				a[u] = a[q];
				a[q] = temp;
				
				//increment q
				q++;
			}
		}
		
		//swap a[q] with a[r]
		int temp = a[q];
		a[q] = a[r];
		a[r] = temp;
			
		//at this point all the values that are < or = to a[q] are on the left side of a[q]
		//and all the values that are > than a[q] is on the right
		
		return q;
	}

	public static void main(String[] args) {


		QuickSort s = new QuickSort();
		
		int[] a = {5, 2, 4, 6, 1, 3};
		int[] b = {12, 9, 3, 7, 14, 11};
		
		s.quickSort(a, 0, a.length-1);
		s.quickSort(b, 0, b.length-1);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}






















