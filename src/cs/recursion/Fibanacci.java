package cs.recursion;

/**
 * Fibanacci series: 1 1 2 3 5 8 13 21 34 55...
 * f(n) = f(n-1) + f(n-2), n>1
 * f(n) = 1 , n = 1
 * f(n) = 0 , n = 0
 * */
public class Fibanacci {
	
	public static int fib(int n) {
		
		//base cases
		if(n == 1 || n == 0) {
			return n;
		}
		
		//recursive step
		return fib(n-1) + fib(n-2);
	}
	
	

	public static void main(String[] args) {

		int r = Fibanacci.fib(6);
		
		System.out.println(r);
	}

}
