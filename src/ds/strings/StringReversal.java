package ds.strings;

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

	public static void main(String[] args) {

		String s = "Java Programming";
		
		String str = StringReversal.reverse(s);
		
		System.out.println(str);
		
	}

}
