package algo.heapsort;

/**
 * Parent node
 * Left child
 * Right child
 * Maintain maximum heap property
 * Build Maximum Heap
 * Heap sort
 * */

public class Heapsort {
	
	//declare the variables
	int heapSize;
	
	//constructor
	Heapsort(int size){
		
		this.heapSize = size;
	}
	
	//sort the array using heap sort algorithm
	public void heapSort(int[] a) {
		
		buildMaximumHeap(a);
	
		for(int i = a.length - 1; i>0; i--) {
			
			//swap a[0] with a[i]
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			
			//decrement the heap size by 1
			heapSize --;
			
			//call the maxHeapify() method
			maxHeapify(a, 0);
		}
	}
	
	//build maximum heap
	public void buildMaximumHeap(int[] a) {
		
		//heapSize = a.length;
		
		//For n-element heap, each node n/2, n/2 + 1, n/2 + 2,.....n is a leaf 
		//and is thus the root of a trivial max-heap
		for(int i = (a.length - 1)/2; i >= 0; i--) {
			
			maxHeapify(a, i);
		}
	}
	
	//method to maintain maximum heap property
	//i is an index of the array a
	public void maxHeapify(int[] a, int i) {
		
		//declare the variables
		int l, r, largest;
		
		//get the indices of the left and right children
		l = left(i);
		r = right(i);
		
		//compare the node at i, with the left child
		if(l < heapSize && a[l] > a[i]) {
			
			largest = l;
		}
		else {
			
			largest = i;
		}
		
		//compare the right child with the largest node
		if(r < heapSize && a[r] > a[largest]) {
			
			largest = r;
		}
		
		//swap a[largest] with a[i] and recursive call
		if(largest != i) {
			
			//swap
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			
			//recursive call
			maxHeapify(a, largest);
		}	
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
