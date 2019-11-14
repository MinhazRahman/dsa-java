package ds.arrayadt;

public class SumOfPair {
	
	//time complexity: O(n^2)
	public void pairOfSum(int[] a, int k) {
		
		//variables
		int i, j;
		
		//find the pair (b, c) whose sum is k
		for(i = 0; i < a.length - 1; i++) {
			
			for(j = i + 1; j < a.length; j++) {
				
				if(a[i] + a[j] == k) {
					
					System.out.println("Pair: "  + a[i] + ", " + a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {

		//object reference
		SumOfPair pair = new SumOfPair();
		
		//input
		int[] a = {5, 7, 8, 9, 10, 11, 12};
		int k = 20; 
		
		pair.pairOfSum(a, k);
		
	}

}


















