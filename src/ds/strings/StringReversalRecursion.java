package ds.strings;

public class StringReversalRecursion {
		
	//reverse a string using recursion
	public static String reverse(String str) {
		
		//base case
		if(str.length() < 1){
			
			return "";
		}
		
		//recursive step
		int n = str.length();
		return str.substring(n - 1) + reverse(str.substring(0, n - 1));
		
	}

	public static void main(String[] args) {

		String s = "This string will be reversed!";
		
		String str = StringReversalRecursion.reverse(s);
		System.out.println(str);
		
	}

}
