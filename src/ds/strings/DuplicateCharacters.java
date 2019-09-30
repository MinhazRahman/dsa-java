package ds.strings;

public class DuplicateCharacters {
	
	public static void printDuplicate(String str) {
		
		//create an array
		int[] count = new int[256];
		
		//initialize the array with zeros
		for(int i = 0; i < 256; i++) {
			
			count[i] = 0;
		}
		
		//iterate over the string and based on the ascci value of each character
		//increment the value in the count array at corresponding position
		for(int i = 0; i < str.length(); i++) {
			
			//ascii equivalent of the character at i
			int j = str.charAt(i); 
			
			//increment the value in count array at index j
			count[j] ++;
		}
		
		//print the duplicate characters
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] > 1) {
				System.out.println( (char)i + ":" + count[i]);
			}
		}
		
	}

	public static void main(String[] args) {

		String str = "Java Programming";
		
		DuplicateCharacters.printDuplicate(str);
		
	}

}
















