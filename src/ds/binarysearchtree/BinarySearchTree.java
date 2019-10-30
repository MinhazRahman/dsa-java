package ds.binarysearchtree;

public class BinarySearchTree {

	//attributes
	Node root;
	
	//constructor
	public BinarySearchTree() {
		
	}
	
	//insertion using recursive method
	public Node insert(Node ptr, int key) {
		
		Node temp;
		
		if(root == null) {
			
			root = new Node(key);
			ptr = root;
			return ptr;
		}
		else if(ptr == null) {
			
			temp = new Node(key);
			return temp;
		}
		
		if(key <= ptr.data) {
			
			ptr.left = insert(ptr.left, key);
		}
		else {
			
			ptr.right = insert(ptr.right, key);
		}
		
		return ptr;
	}
	
	// recursive preorder traversal: root, left, right
		public void preorder(Node node) {

			if (node != null) {

				System.out.println(node);
				preorder(node.left);
				preorder(node.right);
			}
		}
		
		// recursive inorder traversal: left, root, right
		public void inorder(Node node) {

			if (node != null) {

				inorder(node.left);
				System.out.println(node);
				inorder(node.right);
			}
		}

		// recursive postorder: left, right, root
		public void postorder(Node node) {

			if (node != null) {

				postorder(node.left);
				postorder(node.right);
				System.out.println(node);
			}
		}
}
























