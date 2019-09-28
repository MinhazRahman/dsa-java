package ds.strings;

public class StringReversalInPlace {

	public static String reverse(String s) {

		//convert the string to char array
		char[] chars = s.toCharArray();

		int j = chars.length;

		//keep swapping the characters from both sides and meet in the middle
		for (int i = 0; i < chars.length / 2; i++) {

			//decrement j by 1
			j--;
			
			//swap values
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}

		return new String(chars);
	}

	public static void main(String[] args) {

		String str = "Java Programming";
		
		String s = StringReversalInPlace.reverse(str);
		
		System.out.println(s);
	}

}
