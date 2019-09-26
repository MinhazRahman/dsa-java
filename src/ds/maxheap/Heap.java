package ds.maxheap;

public class Heap {
	
	//declare variables
	int heapSize;
	
	//constructor
	Heap(int size){
		
		this.heapSize = size;
	}
	
	//get the index of the parent
	public int parent(int i) {
		
		return i/2;
	}
	
	//get the index of the left child
	public int left(int i) {
		
		int l = 2*i + 1;
		
		if(l <= heapSize) {
			
			return l;
		}
		
		return heapSize; //last index of the array
		
	}
	
	//get the index of the right child
	public int right(int i) {
		
		int r = 2*i + 2;
		
		if(r <= heapSize) {
			
			return r;
		}
		
		return heapSize; //last index of the array
	}

}
