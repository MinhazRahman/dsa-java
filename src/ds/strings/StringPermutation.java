package ds.strings;

public class StringPermutation {

	public static String permute(String str) {

		// convert the character into char array
		char[] chars = str.toCharArray();

		// string will hold all the permutations
		String permutations = "";

		char[] tempArray = new char[str.length()];

		// perform permutation
		for (int i = 0; i < str.length(); i++) {

			tempArray = swap(str.toCharArray(), 0, i);

			//System.out.println(String.valueOf(tempArray));

			for (int j = 1; j < str.length(); j++) {
				
				tempArray = swap(tempArray, 1, j);

				permutations += String.valueOf(tempArray) + " ";
			}
		}

		return permutations;
	}

	private static char[] swap(char[] charArray, int i, int j) {

		// swap characters
		char temp = charArray[i];

		charArray[i] = charArray[j];

		charArray[j] = temp;

		return charArray;
	}

	public static void main(String[] args) {

		String abc = "ABC";

		abc = StringPermutation.permute(abc);

		System.out.println(abc);

	}

}
