package ds.strings;

public class StringPermutation {

	public static void permute(char[] s, int l, int h) {
		
		int i;
		
		if(l == h) {
			
			System.out.println(String.valueOf(s));
		}
		else {
			
			for(i = l ; i <= h; i++) {
				
				swap(s, l, i);
				
				permute(s, l + 1, h);
				
				swap(s, l, i);
			}
		}

		
	}

	private static char[] swap(char[] charArray, int i, int j) {

		// swap characters
		char temp = charArray[i];

		charArray[i] = charArray[j];

		charArray[j] = temp;

		return charArray;
	}

	public static void main(String[] args) {

		String str = "ABC";
		
		char[] charSet = str.toCharArray();

		StringPermutation.permute(charSet, 0, str.length() - 1);

	}

}
