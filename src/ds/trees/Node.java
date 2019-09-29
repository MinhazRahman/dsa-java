package ds.trees;

public class Node {

	//attributes
	int data;
	Node parent;
	Node left;
	Node right;
	
	//constructor
	public Node(int data) {
		
		this.data = data;
	}
	
	@Override 
	public String toString() {
		
		return Integer.toString(this.data);
	}
}
