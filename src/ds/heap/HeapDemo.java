package ds.heap;

public class HeapDemo {

	public static void main(String[] args) {

		Heap heap = new Heap();
		
		int arrayLength = 21;  //number of elements
		int heapSize = 10;  //number of nodes in the heap
		
		int[] ha = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int i = 9;
		int parent = heap.parent(i);
		int left = heap.left(i);
		int right = heap.right(i);
		
		System.out.println("Node:" + ha[i]);
		System.out.println("Parent:" + ha[parent]);
		System.out.println("Left:" + ha[left]);
		System.out.println("Right:" + ha[right]);
	}

}
