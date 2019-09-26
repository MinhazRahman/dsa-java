package algo.heapsort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestHeapsort {

	@Test
	void testHeapSort() {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		int heapSize = a.length;
		
		System.out.println("Unordered Array:" + Arrays.toString(a));
		
		Heapsort sorter = new Heapsort(heapSize);
		
		sorter.heapSort(a);
		
		System.out.println("Ordered Array: " + Arrays.toString(a));
		
		int[] expected = {1, 2, 3, 4, 7, 8, 9, 10, 14, 16};
		int[] actual = a;
		
		assertTrue(Arrays.equals(expected, actual));
		
	}

}
