package ds.strings;

public class DigitChecker {
	
	public static boolean isDigitOnly(String str) {
		
		//create boolean variable
		boolean d = false;
		
		//iterate over the string
		for(int i = 0; i < str.length(); i++) {
			
			//check if each character is digit or not
			d = isDigit(str.charAt(i));
			
			//if not digit
			if (!d) {
				
				return d;
			}
			
		}
		
		return d;
	}
	
	public static boolean isDigit(char c) {
		
		//string containing all the digits
		String digits = "0123456789";
		
		//iterate over the string digits
		for(int j = 0; j < digits.length(); j++) {
			
			if(digits.charAt(j) == c) {
				
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {

		String str = "f1234f";
		
		System.out.println(DigitChecker.isDigitOnly(str));
	}

}
