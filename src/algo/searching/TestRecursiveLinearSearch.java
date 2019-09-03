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
class TestRecursiveLinearSearch {
	
	//create object
	RecursiveLinearSearch ls = new RecursiveLinearSearch();

	@Test
	void testFound() {
		
		//Parameters
		int[] a = {3, 10, 5, 1, 8, 6};
		int n = a.length;
		int x = 10;
		
		//searching for x in array a of length n
		int actualIndex = ls.search(a, n, x);
		int expecteIndex = 1;
		
		assertTrue(actualIndex == expecteIndex);
	}
	
	@Test
	void testNotFound() {
		
		//Parameters
		int[] a = {3, 10, 5, 1, 8, 6};
		int n = a.length;
		int x = 90;
		
		//searching for x in array a of length n
		int actualIndex = ls.search(a, n, x);
		int expecteIndex = -1;
		
		assertTrue(actualIndex == expecteIndex);
	}

}
