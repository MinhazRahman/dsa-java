package ds.matrices;

import java.util.LinkedList;

public class SparseMatrixUsingLinkedList {
	
	//declare an array of type LinkedList
	LinkedList<Node>[] hashtable;
	
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
	
	//constructor
	@SuppressWarnings("unchecked")
	public SparseMatrixUsingLinkedList(int row, int col) {
		
		this.row = row;
		this.col = col;
		
		//create an array of linked lists
		this.hashtable = new LinkedList[row];
		
		//assign a linked list to each slot of the array
		for(int i = 0; i < row; i++) {
			
			hashtable[i] = new LinkedList<Node>();
		}
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
	
	//list representation of sparse matrix
	public LinkedList<Node>[] linkedListRepresentationOf(int[][] matrix) {
		
		//scan through each row
		for(int i = 0; i < row; i++) {
			
			//scan through each column
			for(int j = 0; j < col; j++) {
				
				if(matrix[i][j] != 0) {
					
					hashtable[i].add(new Node(j ,matrix[i][j]));
				}
			}
		}
		
		return hashtable;
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
	
	//print the hash table
	public void printTable() {
		
		for(int i = 0; i < hashtable.length; i++) {
			
			System.out.println("[" + i + "]-->" + hashtable[i]);
		}
	}

	public static void main(String[] args) {
		
		//dimensions
		int row = 6;
		int col = 7;
		
		//create object
		SparseMatrixUsingLinkedList sm = new SparseMatrixUsingLinkedList(row, col);
		
		//display matrix
		System.out.println("Sparse Matrix: ");
		sm.display(sm.a, row, col);
		
		//represent sparse matrix using linked list
		sm.linkedListRepresentationOf(sm.a);
		
		//linked list representation of sparse matrix
		sm.printTable();
		

	}

}


































