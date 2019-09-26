package ds.maxheap;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestBuildingMaximumHeap {

	@Test
	void test() {
		
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		
		int heapSize = a.length;
		
		System.out.println("Unordered List:" + Arrays.toString(a));
		
		BuildingMaximumHeap heap = new BuildingMaximumHeap(heapSize);
		
		heap.buildMaximumHeap(a);
		
		System.out.println("Ordered List: " + Arrays.toString(a));
		
		int[] expected = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
		int[] actual = a;
		
		assertTrue(Arrays.equals(expected, actual));
		
	}

}
