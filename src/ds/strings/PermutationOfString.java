package ds.strings;

public class PermutationOfString {

	public static String permute(String permutations, String word) {
		
		int i;
		
		for(i = 0; i < word.length(); i++) {
			
			permutations += swap(permutations, word, 0, i);
		}
		
		return permutations;
	}

	private static String swap(String permutations, String word, int i, int j) {

		// convert to char array
		char[] charArray = word.toCharArray();

		// swap characters
		char temp = charArray[i];

		charArray[i] = charArray[j];

		charArray[j] = temp;
		 
		return  String.valueOf(charArray) + " ";
	}

	public static void main(String[] args) {

		String abc = "ABC";
		
		abc = PermutationOfString.permute("", abc);
		
		System.out.println(abc);
	}

}
