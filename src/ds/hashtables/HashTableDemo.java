package ds.hashtables;

import java.util.LinkedList;

public class HashTableDemo {
	
	//declare an array of linked list
	LinkedList<Integer>[] hashtable;
	
	//constructors
	public HashTableDemo() {
		
	}
	
	@SuppressWarnings("unchecked")
	public HashTableDemo(int n) {
		
		//create an array of linked lists
		this.hashtable = new LinkedList[n];
		
		//assign a linked list to each slot of the array
		for(int i = 0; i < n; i++) {
			
			hashtable[i] = new LinkedList<Integer>();
		}
	
	}
	
	//insert an element into the hash table
	public void insert(int x) {
		
		//get the index
		int i = hash(x);
		
		//insert x into the LinkedList at array index i
		hashtable[i].add(x);
	}
	
	//search for an element
	public int search(int x) {
		
		//get the array index
		int index = hash(x);
		
		//compare each element of the list hashtable[index] with x
		for(int e: hashtable[index]) {
			
			if(x == e) {
				
				return e;
			}
		}
		
		
		return -1;
	}
	
	//delete an element
	public int delete(int x) {
		
		//get the index of the array
		int index = hash(x);
		
		//deletion process
		for(int e : hashtable[index]) {
			
			if(x == e) {
				
				//get the index of the element in the list
				int i = hashtable[index].indexOf(e);
				
				//remove the element from the list
				hashtable[index].remove(i);
				
				return e;
			}
		}
		
		return -1;
	}
	
	//hash function
	public int hash(int x) {
		
		int index = x%10;
		
		return index;
	}
	
	//print the hash table
	public void printTable() {
		
		for(int i = 0; i < hashtable.length; i++) {
			
			System.out.println(hashtable[i]);
		}
	}
	

}
