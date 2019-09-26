package cs.recursion;

public class PrintingArrayElement {
	
	public static void print(int[] a, int i) {
		
		//base case
		if(i > a.length - 1) {
			
			return;
		}
		
		//recursive step
		System.out.println(a[i]);
		print(a, i + 1);
	}

	public static void main(String[] args) {

		
		int[] a = {1, 2, 3, 4, 5};
		
		PrintingArrayElement.print(a, 0);
	}

}
