package ds.strings;

/**
 * Reverse a string using an empty string variable and charAt() method
 * Reverse a Sting using recursion (use both charAt() and substring() methods)
 * */
public class StringReversal {
	
	//reverse a string
	public static String reverse(String str) {
		
		//create an empty string
		String revStr = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			revStr += str.charAt(i);
		}
		
		return revStr;
		
	}
	
	//reverse a string using recursion
	public static String reverseRecur(String str) {
		
		//base case
		if(str.length() < 1){
			
			return "";
		}
		
		//recursive step
		return str.substring(str.length() - 1) + reverseRecur(str.substring(0, str.length() - 1));
		
	}

	public static void main(String[] args) {

		String s = "Java Programming";
		
		String str = StringReversal.reverse(s);
		System.out.println(str);
		
		str = StringReversal.reverseRecur(s);
		System.out.println(str);
		
	}

}
