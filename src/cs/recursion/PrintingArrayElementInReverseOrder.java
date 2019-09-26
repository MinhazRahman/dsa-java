package cs.recursion;

public class PrintingArrayElementInReverseOrder {
	
	public static void print(int[] a, int i) {
		
		//base case
		if(i < 0) {
			
			return;
		}
		
		//recursive step
		System.out.println(a[i]);
		print(a, i - 1);
	}

	public static void main(String[] args) {

		
		int[] a = {1, 2, 3, 4, 5};
		
		PrintingArrayElementInReverseOrder.print(a, a.length - 1);
	}

}
