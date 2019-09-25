package ds.heap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHeap {

	@Test
	void testParent() {
		
		int arrayLength = 11;  //number of elements
		int heapSize = arrayLength - 1;  //number of nodes in the heap
		
		Heap heap = new Heap(heapSize);
		
		int[] ha = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1, 0};
		
		int i = 7; //ha[7] = 2
		int parent = heap.parent(i);
		
		int expected = 8;
		int actual = ha[parent];
		
		assertTrue(expected == actual);
	}
	
	@Test
	void testLeft() {
		
		int arrayLength = 11;  //number of elements
		int heapSize = arrayLength - 1;  //number of nodes in the heap
		
		Heap heap = new Heap(heapSize);
		
		int[] ha = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1, 0};
		
		int i = 7; //ha[7] = 2
		int left = heap.left(i);
		
		int expected = 0;
		int actual = ha[left];
		
		assertTrue(expected == actual);
		
	}
	
	@Test
	void testRight() {
		
		int arrayLength = 11;  //number of elements
		int heapSize = arrayLength - 1;  //number of nodes in the heap
		
		Heap heap = new Heap(heapSize);
		
		int[] ha = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1, 0};
		
		int i = 7; //ha[7] = 2
		int right = heap.right(i);
		
		int expected = 0;
		int actual = ha[right];
		
		assertTrue(expected == actual);
	}

}
