package ds.binarytreerecursion;

public class Node {

	//attributes
	int data;
	Node left;
	Node right;
	
	//constructors
	public Node() {
		
		this.left = null;
		this.right = null;
		
	}
	public Node(int data) {
		
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	@Override 
	public String toString() {
		
		return Integer.toString(this.data);
	}
}
