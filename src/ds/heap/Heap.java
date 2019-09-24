package ds.heap;

public class Heap {
	
	//constructor
	Heap(){
		
	}
	
	//get the index of the parent
	public int parent(int i) {
		
		return i/2;
	}
	
	//get the index of the left child
	public int left(int i) {
		
		return 2*i + 1;
	}
	
	//get the index of the right child
	public int right(int i) {
		
		return 2*i + 2;
	}

}
