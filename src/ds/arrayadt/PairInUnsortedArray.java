package ds.arrayadt;

/**
 * Find sum of pair (b, c) where b + c = k in a sorted array
 * 
 * */

public class PairInUnsortedArray {
	
	//time complexity: O(n)
	public void pairOfSum(int[] a, int k) {
		
		//variables
		int i = 0, j = a.length - 1;
		
		//look for pair (b, c) where b + c = k
		while(i < j) {
			
			if(a[i] + a[j] < k) {
				
				i++;
			}
			else if(a[i] + a[j] > k) {
				
				j--;
			}
			
			else { //a[i] + a[j] == k
				
				System.out.println(a[i] + "+" + a[j] + "=" + k);
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		//object reference
		PairInUnsortedArray pair = new PairInUnsortedArray();
		
		//input
		int[] a = {1, 3, 4, 5, 6, 8, 9, 10, 12, 14};
		int k = 10; 
		
		pair.pairOfSum(a, k);
	}

}
