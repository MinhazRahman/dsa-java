package ds.minheap;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestBuildingMaximumHeap {

	@Test
	void test() {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		
		int heapSize = a.length;
		
		System.out.println("Unordered Array:" + Arrays.toString(a));
		
		BuildingMinimumHeap heap = new BuildingMinimumHeap(heapSize);
		
		heap.buildMinimumHeap(a);
		
		System.out.println("Ordered Array: " + Arrays.toString(a));
		
		int[] expected = {1, 2, 3, 4, 7, 9, 10, 14, 8, 16};
		int[] actual = a;
		
		assertTrue(Arrays.equals(expected, actual));
		
	}

}
