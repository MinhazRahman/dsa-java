package ds.strings;

public class OccurenceOfGivenCharacter {

	public static void countOccurenceOf(String str, char c) {
		
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
		
		//check for the given character and print the number of occurrence
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == c) {
				
				int j = str.charAt(i);
				
				System.out.println(str.charAt(i) + ":" + count[j]);
				
				break;
			}
		}
		
		//another way of checking the number of occurrence
		for(int i = 0; i < count.length; i++) {
			
			if((char) i == c) {
				System.out.println( (char)i + ":" + count[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {

		String str = "Java Programming";
		
		char c = 'r';
				
		OccurenceOfGivenCharacter.countOccurenceOf(str, c);
		
	}

}
