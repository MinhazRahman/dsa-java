package cs.recursion;

/**Print a word in the following format using recursion
g
ng
ing
ming
mming
amming
ramming
gramming
ogramming
rogramming
Programming
*/

public class StringPrinting {
	
	public static String printString(String str) {
		
		//base case
		if(str.length() == 0) {
			
			return "";
		}
		
		printString(str.substring(1));
		
		//recursive step
		System.out.println(str);
		
		return str;
	}

	public static void main(String[] args) {

		String str = "Programming";
		
		StringPrinting.printString(str);
		
	}

}
