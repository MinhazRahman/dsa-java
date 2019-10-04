package ds.strings;

public class FirstNonReaptingCharacter {

	public static char getFirstNonReaptingCharacter(String str) {
		
		char c = 0;
		
		//create an array
		int[] count = new int[256];
		
		//initialize the array with zeros
		for(int i = 0; i < 256; i++) {
			
			count[i] = 0;
		}
		
		//iterate over the string and based on the ascci value of each character
		//increment the value in the count array at corresponding position
		for(int i = 0; i < str.length(); i++) {
			
			//ascii value of the character at i
			int j = str.charAt(i); 
			
			//increment the value in count array at index j
			count[j] ++;
		}
		
		//check for the given character and print the number of occurrence
		for(int i = 0; i < str.length(); i++) {
			
			//ascii value of the character at index i
			int j = str.charAt(i);
			
			//get the first non-repeating character
			if(count[j] == 1) {
				
				//character at index i
				c = str.charAt(i);
				
				break;
			}
		}
			
		return c; //first non-repeating character
	}
	public static void main(String[] args) {

		
		String str = "swiss";
		
		char c = FirstNonReaptingCharacter.getFirstNonReaptingCharacter(str);
		
		System.out.println(c);
		
	}

}
