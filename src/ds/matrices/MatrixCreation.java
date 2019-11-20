package ds.matrices;

import java.util.Scanner;

public class MatrixCreation {
	
	//dimensions
	int row,col;
	
	//array variable
	int[][] a;
	
	//create Scanner variable to get input from the keyboard
	Scanner input;
	
	//constructor
	public MatrixCreation(int row, int col) {
		
		this.row = row;
		this.col = col;
		this.a = new int[row][col];
		input = new Scanner(System.in);
	}
	
	//create matrix
	public int[][] create() {
		
		int i, j, x;
		
		System.out.println("Enter elements: ");
		for(i = 0; i < row; i++) {
			
			for(j = 0; j < col; j++) {
				
				//get input from the keyboard
				x = input.nextInt();
				a[i][j] = x;		
			}
		}
		
		return a;
	}
	
	//display the array
	public void display(int[][] matrix, int row, int col) {
		
		for(int i = 0; i < row; i++ ) {
			
			for(int j = 0; j< col; j++) {
				
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		
		//dimensions
		int row = 3;
		int col = 3;
		
		//create object
		MatrixCreation mc = new MatrixCreation(row, col);
		
		//create matrix 
		int[][] matrix = mc.create();
		
		//display matrix
		System.out.println("Matrix: ");
		mc.display(matrix, row, col);

	}

}


















