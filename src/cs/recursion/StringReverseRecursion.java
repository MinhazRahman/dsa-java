package cs.recursion;

public class StringReverseRecursion {
	
	//reverse a string
	public static String reverse(String str) {
		
		int n = str.length();
		
		return reverseRecur(str, n - 1);
		
	}
	
	//helper recursive method
	public static String reverseRecur(String s, int i) {
		
		//base case 
		if(i < 0) {
			
			return "";
		}
		
		//recursive step
		return s.charAt(i) + reverseRecur(s, i - 1);
	}

	public static void main(String[] args) {

		String s = "Java Programming";
		
		s = StringReverseRecursion.reverse(s);
		
		System.out.println(s);
		
	}

}
