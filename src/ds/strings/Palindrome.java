package ds.strings;

public class Palindrome {
	
	public static boolean isPalindrome(String word) {
		
		int j = word.length();
		
		for(int i = 0; i < word.length()/2; i++) {
			
			//decrement j
			j--;
			
			if(word.charAt(i) != word.charAt(j)) {
				
				return false; //not palindrome
			}
		}
		
		//palindrome
		return true;
	}

	public static void main(String[] args) {

		
		boolean b = Palindrome.isPalindrome("abba");
		System.out.println(b);
		
		b = Palindrome.isPalindrome("abbac");
		System.out.println(b);
		
	}

}
