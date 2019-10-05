package ds.arrays;

import java.util.Arrays;

public class ArrayInitialization {

	// If you add '0' with int variable, it will return actual value in the char
	// variable.
	// The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which
	// is equal to 1.
	// The ASCII character of 49 is 1.
	public static char[] initialize(char[] chars) {

		for (int i = 0; i < chars.length; i++) {

			chars[i] = (char) (i + '0');
		}

		return chars;
	}

	public static void main(String[] args) {

		char[] chars = new char[10];

		chars = ArrayInitialization.initialize(chars);

		System.out.println(Arrays.toString(chars));

	}

}
