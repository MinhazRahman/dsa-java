package ds.matrices;

/**
 * Representation of sparse matrices
 * 1. 3-column or co-ordinate list representation
 * 2. compressed sparse row representation
 * 
 * 1. create a sparse matrix
 * 2. print the matrix
 * 3. count the non zero elements
 * 4. 3 column or coordinate list representation of a sparse matrix
 * 5. print the coordinate list
 * */

public class SparseMatrixRepresentation {
	
	//variables
	int row, col;
	
	//two 6x7 matrices
	int[][] a = { {0, 0, 0, 0, 0, 0, 0},
				  {0, 0, 0, 0, 6, 0, 0},
				  {0, 0, 7, 0, 0, 0, 0},
				  {0, 0, 2, 0, 5, 0, 0},
				  {0, 0, 0, 0, 0, 0, 0},
				  {0, 4, 0, 0, 0, 0, 0},
				};
	
	int[][] b = {{0, 0, 0, 0, 0, 0, 0},
				 {0, 0, 0, 0, 0, 0, 0},
			 	 {0, 0, 3, 0, 0, 5, 0},
			     {0, 0, 0, 2, 0, 0, 7},
			     {0, 0, 0, 0, 9, 0, 0},
			     {0, 8, 0, 0, 6, 0, 0},
			    };
	
	//constructor
	public SparseMatrixRepresentation(int row, int col) {
		
		this.row = row;
		this.col = col;	
	}
	
	//number of non-zero elements in a matrix
	public int nonZero(int[][] matrix) {
		
		//no of non-zero elements
		int count = 0;
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				
				if(matrix[i][j] != 0) {
					
					count++;
				}
			}
		}
		
		return count;
	}
	
	//3-column representation or co-ordinate list
	public int[][] coordinateListOf(int[][] matrix) {
		
		//no of non zero elements
		int nz = nonZero(matrix);
		//row value
		int r = 0;
		
		//rowX3 (row, column and element) array to represent matrix
		int[][] am = new int[nz + 1][3];
		
		//insert no of rows, no of columns and no of non zero elements of matrix
		//into the first row of am[][] array
		am[r][0] = row;
		am[r][1] = col;
		am[r][2] = nz;
		
		//scan through each row
		for(int i = 1; i < row; i++ ) {
			
			//scan through each column
			for(int j = 1; j < col; j++) {
				
				//for non-zero element
				if(matrix[i][j] != 0) {
					
					r ++;
					
					//insert row no, column no and element into array am[][]
					am[r][0] = i;
					am[r][1] = j;
					am[r][2] = matrix[i][j];
					
				}
			}	
		}
		
		return am;
	}
	
	//display the array
	public void display(int[][] matrix, int row, int col) {
		
		for(int i = 1; i < row; i++ ) {
			
			for(int j = 1; j< col; j++) {
				
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}	
	}
	
	//display co-ordinate list
	public void displayList(int[][] list, int row, int col) {
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				
				System.out.print(list[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	

	public static void main(String[] args) {

		//create object reference
		SparseMatrixRepresentation smr = new SparseMatrixRepresentation(6, 7);
		
		//print the matrix
		System.out.println("Sparse Matrix: ");
		smr.display(smr.a, 6, 7);
		
		//number of non-zero elements
		System.out.println("Number of non-zero elements: " + smr.nonZero(smr.a));
		
		//co-ordinate list representation
		int[][] lr = smr.coordinateListOf(smr.a);
		
		//print the matrix
		System.out.println("3-column representation(row, column and element): ");
		smr.displayList(lr, 6, 3);
		
		
	}

}
