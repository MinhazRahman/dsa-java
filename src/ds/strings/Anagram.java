package ds.strings;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String word, String anagram) {
		
		char[] chars = word.toCharArray();
		char[] charstr = anagram.toCharArray();
		
		Arrays.sort(chars);
		Arrays.sort(charstr);
		
		return Arrays.equals(chars, charstr);
	}

	public static void main(String[] args) {

		boolean a = Anagram.isAnagram("army", "mary");
		
		System.out.println(a);
	}

}
