package ds.avl;

public class Node {
	
	//variables
	Node left;
	int data;
	Node right;
	
	//constructor
	public Node (int data) {
		
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
	
	//represent the node
	@Override
	public String toString() {
		
		return Integer.toString(this.data);
	}

}
