package ds.strings;

public class VowelCounter {

	public static int countVowel(String str) {

		String vowels = "aeiou";

		int count = 0;

		// iterate through the string word
		for (int i = 0; i < str.length(); i++) {

			// iterate through vowels
			for (int j = 0; j < vowels.length(); j++) {

				if (vowels.toLowerCase().charAt(j) == str.toLowerCase().charAt(i)) {

					count++;
				}
			}
		}

		return count;
	}

	public static int countConsonant(String word) {

		int count = word.length() - countVowel(word);

		return count;
	}

	public static int countVowels(String str) {

		//convert the string to character array
		char[] chars = str.toLowerCase().toCharArray();

		//vowel counter
		int count = 0;

		//for each character in chars
		for (char c : chars) {

			switch (c) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "Computer Programming ABC";

		System.out.println("Length: " + str.length());

		System.out.println("Vowels: " + VowelCounter.countVowel(str));

		System.out.println("Consonants: " + VowelCounter.countConsonant(str));
		
		System.out.println("Vowels: " + VowelCounter.countVowels(str));

	}

}
