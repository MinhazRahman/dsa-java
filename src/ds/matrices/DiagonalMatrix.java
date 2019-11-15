package ds.matrices;

/**
 * Diagonal matrix : M[i,j] = 0 where i = j
 * 
 * M = 1  2  3  4  5
 * 
 *	1  3  0  0  0  0
 *	2  0  7  0  0  0
 *	3  0  0  9  0  0
 *	4  0  0  0  6  0
 *	5  0  0  0  0  4
 *
 * Array a holds only the diagonal values
 * int[] a = {3, 7, 9, 6, 4}
 * */

public class DiagonalMatrix {
	
	//a holds the diagonal values
	int[] a;
	
	//in diagonal matrix row and column are same, row = col = n
	int n;
	
	//constructor
	public DiagonalMatrix(int n) {
		
		this.n = n;
		this.a = new int[n];
	}
	
	//set value
	public void set(int row, int col, int x) {
		
		if(row == col) {
			
			a[row - 1] = x;
		}
	}
	
	//get value
	public int get(int row, int col) {
		
		if(row == col) {
			
			return a[row - 1];
		}
		
		return 0;
	}
	
	//print the matrix
	void display() {
		
		for(int row = 1; row <= n; row++) {
			
			for(int col = 1; col <= n; col++) {
				
				if(row == col) {
					
					System.out.print(get(row, col) + " ");
				}
				else {
					
					System.out.print(get(row, col) + " ");
				}
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		//create object reference
		DiagonalMatrix dm = new DiagonalMatrix(5);
		
		//set values
		dm.set(1, 1, 3);
		dm.set(2, 2, 7);
		dm.set(3, 3, 6);
		dm.set(4, 4, 9);
		dm.set(5, 5, 4);
		
		//display the matrix
		dm.display();
		
	}

}














