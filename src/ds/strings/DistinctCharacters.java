package ds.strings;

/**
 * Print each character that the string consists of
 * */
public class DistinctCharacters {

	public static void getDistinctCharacters(String str) {

		// create an array of type boolean
		boolean[] present = new boolean[256];

		// initialize the array with false values
		for (int i = 0; i < 256; i++) {

			present[i] = false;
		}

		// iterate over the string and based on the ascci value of each character
		// change the value in the count array at corresponding position
		for (int i = 0; i < str.length(); i++) {

			// ascii value of the character at i
			int j = str.charAt(i);

			// change the value in count array at index j
			present[j] = true;;
		}

		// print the distinct characters
		for (int i = 0; i < present.length; i++) {

			if (present[i]) {
				
				System.out.println((char) i);
			}
		}

	}

	public static void main(String[] args) {

		String str = "Programming in Java";
		
		System.out.println(str);

		DistinctCharacters.getDistinctCharacters(str);

	}

}
