package ds.matrices;

public class SparseMatrix {

	public static void main(String[] args) {

		//create Sparse matrix object
		Sparse sm = new Sparse(6, 7, 5);
		
		//create matrix
		Sparse s = sm.create(sm);
		
		//display the matrix
		sm.display(s);
	}

}
