package ds.arrayadt;

/**ADT: Abstract Data Representation
 * 1. Representation of data
 * 2. Operations on data
 * 
 * Representation of Array:
 * 1. Array space
 * 2. size of an array
 * 3. length of an array
 * 
 * Few points:
 * 1. We can create an array in stack or heap memory
 * 2. size of an array: The amount of space an array takes in the memory
 * 3. length of an array: The number of elements in an array
 * */

public class ArrayADT {

	public static void main(String[] args) {
		
		//declaration of an array variable
		int[] arr; //stored in stack
		
		//number of elements in an array
		int n = 10;
		
		//creation of an array
		arr = new int[n]; //stored in heap
		
		//size of an array: The amount of space an array takes in the memory
		int size = arr.length* 32;  //10*32 bits = 10*4 bytes = 40 bytes

		
	}

}
