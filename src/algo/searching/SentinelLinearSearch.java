package algo.searching;

public class SentinelLinearSearch {

	public int search(int[] a, int n, int x) {

		//save a[n] to last
		int last = a[n];

		//put x into a[n]
		a[n] = x;

		int i = 0;

		//test if x is in a
		while(a[i] != x) {
			i++;
		}

		//put last back to a[n]
		a[n] = last;

		//test if x is in a
		if(i<n || a[n] == x) {
			return i;
		}

		return -1;
	}

	public static void main(String[] args) {

		//create object reference
		SentinelLinearSearch s = new SentinelLinearSearch();
		
		//Parameters
		int[] a = {3, 10, 5, 1, 8, 6};
		int n = a.length-1;
		int x = 1;
		
		int i = s.search(a, n, x);
		
		System.out.println(i);
	}

}












