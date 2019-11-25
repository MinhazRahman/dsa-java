package ds.binarytreeusingrecursion;

public class Node {

	//attributes
	int key;
	Node left;
	Node right;
	
	//constructors
	public Node() {
		
		this.left = null;
		this.right = null;
		
	}
	public Node(int key) {
		
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	@Override 
	public String toString() {
		
		return Integer.toString(this.key);
	}
}
