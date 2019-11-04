package ds.hashtables;

import java.util.Arrays;

public class HashTableLinearProbing {

	//declare an array of type Integer
	Integer[] hashtable;
	
	//size of the hash table
	int m;
	
	//constructors
	public HashTableLinearProbing() {
		
	}
	
	public HashTableLinearProbing(int n) {
		
		//create an array of linked lists
		this.hashtable = new Integer[n];
		
		this.m = n;
		
		//assign null to each slot of the array
		for(int i = 0; i < n; i++) {
			
			hashtable[i] = null;
		}
	}
	
	//insert value using linear probing
	public int insert(int key) {
		
		//variables
		int i = 0, j;
		
		//insert key at index j
		while(i <= m - 1) {
			
			//get the index of the array
			j = hash(key, i);
			
			//if there is no collision, then insert value at index j 
			if(hashtable[j] == null) {
				
				hashtable[j] = new Integer(key);
				
				//inserted
				return j;
			}
			else {
				
				//in case of collision increment i
				i++;
			}	
		}
		
		//if no value is inserted
		return -1;
		
	}
	
	//search for an element using linear probing
	public int search(int key) {
		
		//variables
		int i = 0, j;
		
		//look for an element
		do{
			//get the array index
			j = hash(key, i);
			
			//check for the match
			if(key == hashtable[j].intValue()) {
				
				//found
				return j;
			}
			else {
				
				//increment i
				i++;
			}
				
		}while(hashtable[j] == null || i <= m - 1);
		
		//not found
		return -1;
	}
	
	//hash functions
	public int hash(int key) {
		
		int index = key%m;
		
		return index;
	}
	
	public int hash(int key, int i) {
		
		int index = key%m + i;
		
		return index;
	}
	
	//print the hash table
	public void printTable() {
		
		System.out.println(Arrays.toString(hashtable));
	}
	
	
}






























