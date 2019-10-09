package ds.strings;

import java.util.Set;
import java.util.TreeSet;

public class Permutation {

	public static Set<String> permute(String str) {

		// convert the character into char array
		Set<String> strSet = new TreeSet<String>();

		char[] tempArray = new char[str.length()];

		// perform permutation
		for (int i = 0; i < str.length(); i++) {

			tempArray = swap(str.toCharArray(), 0, i);

			for (int j = 0; j < str.length(); j++) {
				
				tempArray = swap(tempArray, 0, j);

				strSet.add(String.valueOf(tempArray));
			}
		}

		return strSet;
	}

	private static char[] swap(char[] charArray, int i, int j) {

		// swap characters
		char temp = charArray[i];

		charArray[i] = charArray[j];

		charArray[j] = temp;

		return charArray;
	}

	public static void main(String[] args) {

		String abc = "ABCD";
		
		Set<String> set = new TreeSet<>();

		set = Permutation.permute(abc);

		for(String str: set) {
			
			System.out.println(str);
		}

	}

}
