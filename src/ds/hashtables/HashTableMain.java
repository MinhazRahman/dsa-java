package ds.hashtables;

public class HashTableMain {

	public static void main(String[] args) {

		//create a hash table that contains n slots
		HashTableDemo table = new HashTableDemo(10);
		
		//insert values
		table.insert(5);
		table.insert(15);
		table.insert(25);
		table.insert(2);
		table.insert(12);
		table.insert(7);
		table.insert(17);
		
		//print hash table
		System.out.println("Hash Table:");
		table.printTable();
		
		//search for an element
		int val = table.search(5);
		System.out.println("Found: " + val);
		val = table.search(27);
		System.out.println("Found: " + val);
		
		//delete an element from the hash table
		int value = table.delete(5);
		System.out.println("Deleted: " + value);
		val = table.search(5);
		System.out.println("Found: " + val);
		
		//print hash table
		System.out.println("Hash Table:");
		table.printTable();
		
	}

}
