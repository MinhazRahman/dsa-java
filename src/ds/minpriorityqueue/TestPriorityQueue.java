package ds.minpriorityqueue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestPriorityQueue {

	@Disabled
	@Test
	void testMaximum() {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the minimum heap
		pq.buildMinimumHeap(a);
		
		int expected = 1;
		int actual = pq.minimum(a);
		
		assertTrue(expected == actual);
		
	}
	
	@Disabled
	@Test
	void testExtractMaximum() throws HeapUnderflow {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the minimum heap
		pq.buildMinimumHeap(a);
		
		int expected = 1;
		int actual = pq.extractMinimum(a);
		
		assertTrue(expected == actual);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	@Disabled
	@Test
	void testDecreaseKey() throws LargerKey {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the minimum heap
		pq.buildMinimumHeap(a);
		
		System.out.println(Arrays.toString(a));
		
		pq.decreaseKey(a, 4, 5); // i = 4, key = 5
		
		pq.buildMinimumHeap(a);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	//@Disabled
	@Test
	void testInsert() throws LargerKey{
		
		int[] a = {4, 5, 3, 2, 16, 9, 10, 14, 8, 7, 0, 0}; //length = 12
		int heapSize = 10;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the minimum heap
		pq.buildMinimumHeap(a);
		
		pq.insert(a, 1);
		
		System.out.println(Arrays.toString(a));
		
		//pq.insert(a, 18);
		
		//System.out.println(Arrays.toString(a));
		
		
		
	}

}
