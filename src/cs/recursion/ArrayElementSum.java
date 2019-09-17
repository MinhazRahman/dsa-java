package cs.recursion;

/**
 * Given an array a = {2, 4, 6, 8, 10}
 * Add up all the numbers in the array
 * */ 
public class ArrayElementSum {
	
	//n is the length of the array
	public static int sum(int[] a, int n) {
		
		//base case
		if(n <= 0) {
			
			return 0;
		}
		
		//recursive step
		return a[n-1] + sum(a, n-1);
	}

	public static void main(String[] args) {

		int[] a = {2, 4, 6, 8, 10};
		
		int s = ArrayElementSum.sum(a, a.length);
		
		System.out.println(s);
	}

}
