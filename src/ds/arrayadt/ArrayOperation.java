package ds.arrayadt;

/**
 * 
 * 1. Display()
 * 2. Add(x)/Append(x)
 * 3. Insert(index i)
 * 4. Delete(index)
 * 5. Search(x) : Linear search and Binary search
 * 6. Get(index)
 * 7. Set(index, x)
 * 8. Max()/Min()
 * 9. Reverse()
 * 10. Left Shift(): loss of an element
 * 11. Left Rotate(): elements are copied at the back 
 * 12. Right Shift()
 * 13. Right Rotate()
 * 
 * */

public class ArrayOperation {
	
	//1. print the array elements O(n)
	public void display(int[] a) {
		
		for(int i = 0; i<a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
	}
	
	//2. add element at the end O(1)
	public void add(int[] a, int x) {
		
		a[a.length - 1] = x;
	}
	
	//3. insert element O(n)
	public void insert(int[] a, int i, int x) {
		
		for(int j = a.length - 1; j >= i; j--) {
			
			if(j == i) {
				
				a[j] = x;
			}
			else {
				
				a[j] = a[j - 1];
			}	
		}
	}
	
	//4. delete element O(n)
	public void delete(int[] a, int x) {
		
		for(int i = 0; i<a.length; i++) {
			
			//find x 
			if(a[i] == x) {
				
				for(int j = i; j < a.length - 1; j ++) {
					
					a[j] = a[j + 1];
				}
				
				break;
			}
		}
	}	
	
	//5. maximum and minimum O(n)
	public void maxMin(int[] a) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] > max) {
				
				max = a[i];
			}
			
			if(a[i] < min) {
				
				min = a[i];
			}
		}
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		
	}
	
	//6. reverse an array by interchanging, time: O(n) space: O(n)
	public int[] reverse(int[] a) {
		
		int i = 0, j = a.length; 
		
		while(i <= a.length/2) {
		
			//decrement j by 1
			j--;
			
			//swap value
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			//increment i by 1
			i++;
		}
		
		return a;
	}
	
	//6. reverse an array by interchanging, time: O(n), space: O(n)
	public int[] reverseArray(int[] a) {
		
		int i = 0, j = a.length; 
		
		while(i <= j) {
		
			//decrement j by 1
			j--;
			
			//swap value
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			//increment i by 1
			i++;
		}
		
		return a;
	}
	
	//7. left shift, O(n)
	// 2 3 4 5 6 0 <-- 1 2 3 4 5 6
	public int[] shiftLeft(int[] a, int k){
		
		//shift element on the left
		for(int i = 0; i < a.length - 1; i++) {
			
			a[i] = a[i + 1];
		}
		
		//insert zero at the last position
		a[a.length - 1] = 0;
		
		return a;
	}
	
	//8. right shift, O(n)
	//  1 2 3 4 5 6 --> 0 1 2 3 4 5
	public int[] shiftRight(int[] a, int k){
		
		//shift element on the right
		for(int i = a.length - 1; i >0; i--) {
			
			a[i] = a[i - 1];
		}
		
		//insert zero at the first position
		a[0] = 0;
		
		return a;
	}
	
	//9. rotate left, O(n)
	//  2 3 4 5 6 1 <-- 1 2 3 4 5 6 
	public int[] rotateLeft(int[] a, int k){
		
		int first = a[0];
		
		//shift element on the left
		for(int i = 0; i < a.length - 1; i++) {
			
			a[i] = a[i + 1];
		}
		
		//insert first at the last
		a[a.length - 1] = first;
		
		return a;
	}
	
	//10. rotate right, O(n)
	//  1 2 3 4 5 6 --> 6 1 2 3 4 5
	public int[] rotateRight(int[] a, int k){
		
		int last = a[a.length - 1];
		
		//shift element on the right
		for(int i = a.length - 1; i >0; i--) {
			
			a[i] = a[i - 1];
		}
		
		//insert last at the first
		a[0] = last;
		
		return a;
	}
	

	public static void main(String[] args) {

		ArrayOperation op = new ArrayOperation();
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {1, 2, 3, 4, 5, 6};
		
		//display 
		op.display(a);
		
		
		b = op.rotateRight(a, 1);
		
		System.out.println();
		//display 
		op.display(b);
		
		
	}

}











