package cs.recursion;

/**
 * Summation of n natural numbers using recursion: 1..2..3..4...(n-2)..(n-1)..n.
 * 
 * Add the numbers 1 to 100 using recursion
 * */
public class RecursiveSummation {
	
	public static int sum(int n) {
		
		//base case
		if(n<1) {
			
			return 0;
		}
		//recursive step
		return n+sum(n-1);
		
	}

	public static void main(String[] args) {

		int s = RecursiveSummation.sum(100);
		
		System.out.println(s);
	}

}
