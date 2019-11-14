package ds.arrayadt;

/*
 * Finding duplicates in an unsorted array by comparing each element with rest of the
 * elements in the array
 */

public class FindingDuplicatesInUnsortedArray {

	public void findDuplicates(int[] a) {

		// variables
		int i = 0, count, j = 0;

		//iterate over the array
		for (i = 0; i < a.length; i++) {

			count = 1;

			//if character is 0 then don't count
			if (a[i] != 0) {

				for (j = i + 1; j < a.length; j++) {

					// find the match
					if (a[i] == a[j]) {

						count++;
						a[j] = 0; // mark the duplicates as 0
					}
				}
			}

			//print the duplicates
			if (count > 1) {

				System.out.println(a[i] + ":" + count);
			}
		}
	}

	public static void main(String[] args) {
		
		//object reference
		FindingDuplicatesInUnsortedArray d = new FindingDuplicatesInUnsortedArray();
		
		//input
		int[] a = {10, 5, 13, 7, 18, 6, 7, 11, 7, 5, 17, 9, 10};

		d.findDuplicates(a);
	}

}













