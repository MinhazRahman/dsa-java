package ds.arrayadt;

/**
 * Find sum of pair (b, c) where b + c = k using hash table in an unsorted array
 * 
 * */

public class SumOfPairUsingHashTable {
	
	//time complexity: O(n)
	public void pairOfSum(int[] a, int k) {
		
		//variables
		int c;
		
		//get maximum
		int max = maximum(a);
		
		//create an array of length max + 1
		int[] h = new int[max + 1];
		
		//initialize h
		for(int i = 0; i < h.length; i++) {
			
			h[i] = 0;
		}
		
		//look for pair (b, c) where b + c = k
		for(int i = 0; i < a.length; i++) {
			
			//second element of the pair(b, c)
			c = k - a[i];
			
			if(h[c] == 1) {
				
				System.out.println(a[i] + "+" + c + "=" + k);
			}
			else if(h[a[i]] == 0) {
				
				h[a[i]]++;
			}	
		}
		
	}
	
	public int maximum(int[] a) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > max) {
				
				max = a[i];
			}
		}
		
		return max;	
	}

	public static void main(String[] args) {

		//object reference
		SumOfPairUsingHashTable pair = new SumOfPairUsingHashTable();
		
		//input
		int[] a = {5, 7, 8, 9, 10, 11, 12, 20};
		int k = 20; 
		
		pair.pairOfSum(a, k);
		
	}

}
