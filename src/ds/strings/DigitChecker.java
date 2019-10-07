package ds.strings;

public class DigitChecker {
	
	public static boolean isDigitOnly(String str) {
		
		//create boolean variable
		boolean d = false;
		
		if(str == null) {
			
			return d;
		}
		
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
		
		System.out.println(DigitChecker.isDigitOnly("f1234f"));
		
		System.out.println(DigitChecker.isDigitOnly(""));
		
		System.out.println(DigitChecker.isDigitOnly(null));
		
		System.out.println(DigitChecker.isDigitOnly("1234"));
		
		System.out.println(DigitChecker.isDigitOnly("1234v"));

		System.out.println(DigitChecker.isDigitOnly("123v4"));	
		
	}

}

















