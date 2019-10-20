package cs.recursion;

import java.util.Arrays;

public class SumArray {

	//naive approach
	public static int[] sumArrayElements(int[] a) {

		int[] r = new int[a.length];

		int i = 0, j = 0, sum = 0;

		for (i = 0; i < a.length; i++) {

			sum = a[0];

			for (j = 1; j <= i; j++) {

				sum += a[j];
			}

			r[i] = sum;
		}

		return r;
	}
	
	// a much better approach
	public static int[] sumArrayElement(int[] a) {


		int i = 0;

		//start from a[1] because there is no previous element of a[0]
		for (i = 1; i < a.length; i++) {
			
			a[i] = a[i - 1] + a[i];
		}

		return a;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		a = SumArray.sumArrayElements(a);

		System.out.println(Arrays.toString(a));
	}

}
