package cs.recursion;

/**Print a word in the following format using recursion
Programming
rogramming
ogramming
gramming
ramming
amming
mming
ming
ing
ng
g
 * */
public class PrintingString {
	
	public static String printString(String str) {
		
		//base case
		if(str.length() == 0) {
			
			return "";
		}
		
		//recursive step
		System.out.println(str);
		
		return printString(str.substring(1));
	}

	public static void main(String[] args) {

		String str = "Programming";
		
		PrintingString.printString(str);
		
	}

}
