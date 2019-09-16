package cs.recursion;

/**
 * Write a recursive function to count down:3..2..1
 * */
public class CountingDown {
	
	public static void countDown(int n) {
		
		//base case
		if(n<1) {
			return;
		}
		
		//recursive steps
		System.out.println(n);
		countDown(n-1);
	}

	public static void main(String[] args) {

		//call the recursive function
		CountingDown.countDown(3);
	}

}
