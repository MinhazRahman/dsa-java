package algo.searching;

public class RecursiveBinarySearch {
	
	public int search(int[] a, int start, int end, int x) {
		
		//base case 
		if(start > end) {
			return -1;
		}
		
		//recursive steps
		int mid = (start + end)/2;
		
		if(a[mid] == x) {
			return mid;
		}
		
		else if(a[mid] > x) {
			
			return search(a, start, mid-1, x);
		}
		
		else{ // a[mid] < x
			
			return search(a, mid+1, end, x);
		}
	}

	public static void main(String[] args) {

		RecursiveBinarySearch s = new RecursiveBinarySearch();
		
		int[] a = {1, 2, 3, 4, 6, 8, 9, 10};
		
		int i = s.search(a, 0, a.length-1, 10);
		
		System.out.println(i);
	}

}









