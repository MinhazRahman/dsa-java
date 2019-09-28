package ds.maxpriorityqueue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestPriorityQueue {

	@Test
	void testMaximum() {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the maximum heap
		pq.buildMaximumHeap(a);
		
		int expected = 16;
		int actual = pq.maximum(a);
		
		assertTrue(expected == actual);
		
	}
	
	@Test
	void testExtractMaximum() throws HeapUnderflow {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the maximum heap
		pq.buildMaximumHeap(a);
		
		int expected = 16;
		int actual = pq.extractMaximum(a);
		
		assertTrue(expected == actual);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	@Test
	void testIncreaseKey() throws SmallerKey {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the maximum heap
		pq.buildMaximumHeap(a);
		
		pq.increaseKey(a, 3, 15);
		
		pq.buildMaximumHeap(a);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	@Test
	void testInsert() throws SmallerKey{
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7, 0, 0}; //length = 12
		int heapSize = 10;
		
		PriorityQueue pq = new PriorityQueue(heapSize);
		
		//build the maximum heap
		pq.buildMaximumHeap(a);
		
		pq.insert(a, 17);
		
		System.out.println(Arrays.toString(a));
		
		//pq.insert(a, 18);
		
		//System.out.println(Arrays.toString(a));
		
		
		
	}

}
