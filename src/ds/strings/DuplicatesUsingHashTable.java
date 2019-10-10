package ds.strings;

/**Finding duplicates in a string
 * 1. Compare with other characters
 * 2. Using HashTable as counting
 * 3. Using Bits
 * */

/*
 * Finding duplicates in a string by using hash table
 */

public class DuplicatesUsingHashTable {
	
	public static void printDuplicate(String str) {
		
		//create an array
		int[] hashTable = new int[256];
		
		//initialize the array with zeros, hashTable[0..255]
		for(int i = 0; i < 256; i++) {
			
			hashTable[i] = 0;
		}
		
		//iterate over the string and based on the ascci value of each character
		//increment the value in the hash table at corresponding position
		for(int i = 0; i < str.length(); i++) {
			
			//ascii equivalent of the character at i
			int j = str.charAt(i); 
			
			//increment the value in hash table at index j
			hashTable[j] ++;
		}
		
		//print the duplicate characters
		for(int i = 0; i < hashTable.length; i++) {
			
			if(hashTable[i] > 1) {
				System.out.println( (char)i + ":" + hashTable[i]);
			}
		}
		
	}

	public static void main(String[] args) {

		String str = "Java Programming";
		
		DuplicatesUsingHashTable.printDuplicate(str);
		
	}

}
















