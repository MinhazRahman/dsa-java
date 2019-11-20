package ds.matrices;

import java.util.Scanner;

public class Sparse {
	
	//variables
	int m; //no of rows
	
	int n; //no of columns
	
	int nz; //no of non zero elements
	
	//declare an array reference variable of type Element
	Element[] e; 
	
	//constructor
	public Sparse(int m, int n, int nz) {
		
		this.m = m;
		this.n = n;
		this.nz = nz;
		//create the array
		this.e = new Element[nz + 1];
	}

	//create a sparse matrix
	public Sparse create(Sparse s) {
		
		System.out.println("No of rows: " + s.m);
		System.out.println("No of columns: " + s.n);
		System.out.println("No of non zero elements: " + s.nz);
		
		//create an object of type Scanner to get input from the keyboard
		Scanner input = new Scanner(System.in);
		int rowNo, colNo, x;
		
		Element ele = new Element();
		
		//insert elements into array e
		for(int i = 0; i < s.nz; i++) {
			
			//enter row number
			 rowNo= input.nextInt();
			 ele.row = rowNo;
			 
			 //enter col number
			 colNo = input.nextInt();
			 ele.col = colNo;
			 
			 //enter value of the element
			 x = input.nextInt();
			 ele.x = x;	
			 
			 //insert Element
			 e[i] = ele;
		}	
		
		return s;
	}
	
	//display matrix
	public void display(Sparse s) {
		
		int i, j, k = 0;
		
		for(i = 0; i < s.m; i++) {
			
			for(j = 0; j < s.n; j++) {
				
				if(i == s.e[k].row && j == s.e[k].col) {
					
					System.out.print(s.e[k++].x + " ");
				}
				else {
					
					System.out.print("0" + " ");
				}
			}
			
			System.out.println();
		}
		
	}

}
















