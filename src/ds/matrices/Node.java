package ds.matrices;

public class Node {
	
	//characteristics
	int col;
	int x;
	
	//constructor
	public Node(int col, int x) {
		
		this.col = col;
		this.x = x;
	}
	
	@Override
	public String toString() {
		
		return "(" + this.col + "," + this.x + ")";
	}

}
