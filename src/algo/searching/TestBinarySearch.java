package algo.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Test Cases:
 * 1. correct index
 * 2. wrong index
 * 3. elements are in the array
 * 4. elements are not the array
 * 5. wrong length
 * */
class TestBinarySearch {
	
	//create object
	BinarySearch bs = new BinarySearch();

	@Test
	void testFound() {
		
		//Parameters
		int[] a = {1, 2, 3, 4, 6, 8, 9, 10};
		int n = a.length;
		int x = 10;
		
		//searching for x in array a of length n
		int actualIndex = bs.search(a, n, x);
		int expectedIndex = 7;
		
		assertTrue(actualIndex == expectedIndex);
	}
	
	@Test
	void testNotFound() {
		
		//Parameters
		int[] a = {1, 2, 3, 4, 6, 8, 9, 10};
		int n = a.length;
		int x = 90;
		
		//searching for x in array a of length n
		int actualIndex = bs.search(a, n, x);
		int expectedIndex = -1;
		
		assertTrue(actualIndex == expectedIndex);
	}

}
