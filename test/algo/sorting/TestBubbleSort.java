package algo.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestBubbleSort {
	
	//create object
	BubbleSort obj = new BubbleSort();
	
	@Test
	void isEqual() {
		
		int[] d = {3, 10, 5, 1, 8, 6};
		
		int[] dSorted = {1, 3, 5, 6, 8, 10};
		
		
		int[] c = obj.sort(d, d.length);
		
		assertTrue(Arrays.equals(c, dSorted));
		
	}
	
	@Test
	void isNotEqual() {
		
		int[] d = {3, 10, 5, 1, 8, 6};
		
		int[] notSorted = {1, 3, 10, 6, 8, 5};
		
		
		int[] c = obj.sort(d, d.length);
		
		assertFalse(Arrays.equals(c, notSorted));
		
	}

}
