package algo.heapsortminheap;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestHeapsort {

	@Test
	void testHeapSort() {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		System.out.println("Unsorted Array:" + Arrays.toString(a));
		
		Heapsort sorter = new Heapsort(heapSize);
		
		sorter.heapSort(a);
		
		System.out.println("Sorted Array: " + Arrays.toString(a));
		
		int[] expected = {16, 14, 10, 9, 8, 7, 4, 3, 2, 1};
		int[] actual = a;
		
		assertTrue(Arrays.equals(expected, actual));
		
	}

}
