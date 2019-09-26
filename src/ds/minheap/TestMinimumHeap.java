package ds.minheap;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class TestMinimumHeap {

	@Test
	void testMinHeapify() {
		
		//array and heap size
		int[] a = {1, 2, 8, 4, 7, 3, 9, 10, 14, 16};
		int heapSize = 10;
		
		//object creation
		MinimumHeap heap = new MinimumHeap(heapSize);
		
		System.out.println("Before heapify:" + Arrays.toString(a));
		
		//call maxHeapify() method
		heap.minHeapify(a, 2);
		System.out.println("After heapify:" + Arrays.toString(a));
		
		int[] expected = {1, 2, 3, 4, 7, 8, 9, 10, 14, 16};
		int[] actual = a;
		
		assertTrue(Arrays.equals(expected, actual));
	}

}
