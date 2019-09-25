package ds.heap;

public class HeapMain {

	public static void main(String[] args) {

		int arrayLength = 11;  //number of elements
		int heapSize = 10;  //number of nodes in the heap
		
		Heap heap = new Heap(heapSize);
		
		int[] ha = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1, 0};
		
		int i = 7;
		int parent = heap.parent(i);
		int left = heap.left(i);
		int right = heap.right(i);
		
		//nodes with no left or right children will show 0
		
		System.out.println("Node:" + ha[i]);
		System.out.println("Parent:" + ha[parent]);
		System.out.println("Left:" + ha[left]);
		System.out.println("Right:" + ha[right]);
	}

}
