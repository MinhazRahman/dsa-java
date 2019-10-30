package ds.binarysearchtree;

public class Node {
	
	//attributes
	Node left;
	int data;
	Node right;
	
	//constructor
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
