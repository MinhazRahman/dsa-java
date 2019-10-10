package ds.strings;

/**
 * Finding duplicates in a string 
 * 1. Compare with other characters 
 * 2. Using HashTable as counting 
 * 3. Using Bits
 */

/*
 * Finding duplicates in a string by comparing each character with rest of the
 * characters in the string
 */

public class DuplicatesByComparing {

	public static void findDuplicates(String word) {

		// variables
		int i = 0, count, j = 0;

		// convert the string into an array of char
		char[] chars = word.toCharArray();

		for (i = 0; i < chars.length; i++) {

			count = 1;

			//if character is '0' then don't count
			if (chars[i] != '0') {

				for (j = i + 1; j < chars.length; j++) {

					// find the match
					if (chars[i] == chars[j]) {

						count++;
						chars[j] = '0'; // mark the duplicates as '0'
					}
				}
			}

			//print the duplicates
			if (count > 1) {

				System.out.println(chars[i] + ":" + count);
			}
		}
	}

	public static void main(String[] args) {

		String word = "Programming in Java";

		DuplicatesByComparing.findDuplicates(word);
	}

}
