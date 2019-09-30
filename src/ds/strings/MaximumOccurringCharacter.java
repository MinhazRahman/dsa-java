package ds.strings;

public class MaximumOccurringCharacter {

	public static void findMaximumOccurringCharacter(String str) {
		
		//create an array
		int[] count = new int[256];
		int max, index;
		
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
		
		//print the number of occurrences of each character
		System.out.println("Number of occurrences of each character:");
		
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] > 1) {
				
				System.out.println( (char)i + ":" + count[i]);
			}
		}
		
		//another way of checking the number of occurrence
		System.out.println("Maximum occurring character:");
		
		max = count[0];
		index = 0;
		
		for(int i = 1; i < count.length; i++) {
			
			if(count[i] > max) {
				
				max = count[i];
				index = i;
				
			}
		}
		
		System.out.println( (char)index + ":" + max);
		
	}
	
	public static void main(String[] args) {

		String str = "Java Programming";
				
		MaximumOccurringCharacter.findMaximumOccurringCharacter(str);
		
	}

}
