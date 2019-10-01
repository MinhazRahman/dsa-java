package ds.minpriorityqueue;

public class MinimumHeap {

	//declare the variables
	int heapSize;
	
	//constructor
	MinimumHeap(int size){
		
		this.heapSize = size;
	}
	
	public void buildMinimumHeap(int[] a) {

		// heapSize = a.length;

		// For n-element heap, each node n/2, n/2 + 1, n/2 + 2,.....n is a leaf
		// and is thus the root of a trivial min-heap
		for (int i = (a.length - 1) / 2; i >= 0; i--) {

			minHeapify(a, i);
		}
	}
	
	//method to maintain maximum heap property
	//i is an index of the array a
	public void minHeapify(int[] a, int i) {
		
		//declare the variables
		int l, r, smallest;
		
		//get the indices of the left and right children
		l = left(i);
		r = right(i);
		
		//compare the node at i, with the left child
		if(l < heapSize && a[l] < a[i]) {
			
			smallest = l;
		}
		else {
			
			smallest = i;
		}
		
		//compare the right child with the largest node
		if(r < heapSize && a[r] < a[smallest]) {
			
			smallest = r;
		}
		
		//swap a[smallest] with a[i] and recursive call
		if(smallest != i) {
			
			//swap
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
			
			//recursive call
			minHeapify(a, smallest);
		}	
	}
	
	//get the index of the parent
	public int parent(int i) {
		
		if (i % 2 == 0) {

			return (i / 2 - 1);
		} 
		else {

			return i / 2;
		}
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
