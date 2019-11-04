package ds.hashtables;

public class HashTableLinearProbingMain {

	public static void main(String[] args) {

		//create a hash table that contains n slots
		HashTableLinearProbing table = new HashTableLinearProbing(10);
		
		//insert values
		table.insert(5);
		table.insert(15);
		table.insert(25);
		table.insert(2);
		table.insert(12);
		table.insert(7);
		table.insert(17);
		
		//print the hash table
		System.out.println("Hash Table:");
		table.printTable();
		
		//search for elements
		int i = table.search(15);
		System.out.println("Found at position:" + i);
		
		i = table.search(12);
		System.out.println("Found at position:" + i);
		
	}

}
