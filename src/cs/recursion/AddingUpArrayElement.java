package cs.recursion;

/**
 * Given an array a = {2, 4, 6, 8, 10}
 * Add up all the numbers in the array
 * */

public class AddingUpArrayElement {
	
	public static int sum(int[] a) {
		
		return sumRecur(a, a.length - 1);  //wrap the sumRecur() method inside sum() method
	}
	
	//helper function
	private static int sumRecur(int[] a, int i) {

		//base case
		if(i == 0) {
			
			return a[i];
		}
		
		//recursive step
		
		return a[i] + sumRecur(a, i-1);
	}

	public static void main(String[] args) {

		int[] a = {2, 4, 6, 8};
		
		int s = AddingUpArrayElement.sum(a);
		
		System.out.println(s);
	}

}










