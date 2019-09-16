package cs.recursion;

public class Factorial {
	
	public static int fact(int n) {
		
		//base case
		if(n == 1) {
			return 1;
		}
		
		//recursive steps
		return n*fact(n-1);
	}

	public static void main(String[] args) {

		int f = Factorial.fact(5);
		
		System.out.println(f);
	}

}
