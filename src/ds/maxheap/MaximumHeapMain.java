package ds.maxheap;

import java.util.Arrays;

public class MaximumHeapMain {

	public static void main(String[] args) {
		
		//array and heap size
		int[] a = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
		int heapSize = 10;
		
		//object creation
		MaximumHeap heap = new MaximumHeap(heapSize);
		
		System.out.println("Before heapify:" + Arrays.toString(a));
		
		//call maxHeapify() method
		heap.maxHeapify(a, 1);
		System.out.println("After heapify:" + Arrays.toString(a));

	}

}
