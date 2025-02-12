package ds.hashtables;

/**
 * Collision resolution through chaining
 * */
import java.util.LinkedList;

public class HashTableChaining {
	
	//declare an array of linked list
	LinkedList<Integer>[] hashtable;
	
	//constructors
	public HashTableChaining() {
		
	}
	
	@SuppressWarnings("unchecked")
	public HashTableChaining(int n) {
		
		//create an array of linked lists
		this.hashtable = new LinkedList[n];
		
		//assign a linked list to each slot of the array
		for(int i = 0; i < n; i++) {
			
			hashtable[i] = new LinkedList<Integer>();
		}
	
	}
	
	//insert an element into the hash table
	public void insert(int key) {
		
		//get the index
		int i = hash(key);
		
		//insert element into the LinkedList
		hashtable[i].add(new Integer(key));
	}
	
	//search for an element
	public Integer search(int key) {
		
		//get the array index
		int index = hash(key);
		
		//compare each element of the list hashtable[index] with x
		for(Integer e: hashtable[index]) {
			
			if(key == e.intValue()) {
				
				return e;
			}
		}
		
		
		return null;
	}
	
	//delete an element
	public Integer delete(int key) {
		
		//get the index of the array
		int index = hash(key);
		
		//deletion process
		for(Integer e : hashtable[index]) {
			
			if(key == e.intValue()) {
				
				//get the index of the element in the list
				int i = hashtable[index].indexOf(e);
				
				//remove the element from the list
				hashtable[index].remove(i);
				
				return e;
			}
		}
		
		return null;
	}
	
	//hash function
	public int hash(int key) {
		
		int index = key%10;
		
		return index;
	}
	
	//print the hash table
	public void printTable() {
		
		for(int i = 0; i < hashtable.length; i++) {
			
			System.out.println(hashtable[i]);
		}
	}
	

}
