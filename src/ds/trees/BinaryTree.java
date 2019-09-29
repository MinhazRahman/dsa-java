package ds.trees;

public class BinaryTree {

	//attributes
	Node root;
	
	//constructor
	public BinaryTree() {
		
		this.root = null;
	}
	
	public void insert(int x) {
		
		Node node = new Node(x);
		
		//start from the root node
		Node current = root;
		
		if(isEmpty()) {
			
			current = node;
		}
		else if (current.left == null) {
			
			current.left = node;
		}
		else if (current.right == null) {
			
			current.right = node;
		}
	}
	
	public boolean isEmpty() {
		
		return root == null;
	}
}
