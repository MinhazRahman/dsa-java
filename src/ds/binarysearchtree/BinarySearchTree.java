package ds.binarysearchtree;

/**
 * 1. Insertion using recursive method
 * 2. Insertion using iterative method
 * 3. Tree traversals (preorder, inorder, postorder)
 * 4. Searching in a tree
 * 5. Minimum and Maximum
 * 6. Successor and Predecessor
 * 7. Deletion
 * 
 * Binary search tree doesn't contain duplicate data
 * */
public class BinarySearchTree {

	//attributes
	Node root;
	
	//constructor
	public BinarySearchTree() {
		
	}
	
	//1. insertion using recursive method
	public Node insert(Node ptr, int key) {
		
		//create reference node
		Node temp;
		
		//create root node
		if(root == null) {
			
			root = new Node(key);
			ptr = root;
			return ptr;
		}
		//create new child node
		else if(ptr == null) {
			
			temp = new Node(key);
			return temp;
		}
		
		//put the new node at the correct position
		if(key <= ptr.data) {
			
			ptr.left = insert(ptr.left, key);
		}
		else {
			
			ptr.right = insert(ptr.right, key);
		}
		
		return ptr;
	}
	
	//2. insertion using iterative method
	public Node insertNode(Node ptr, int key) {
		
		//create reference nodes
		Node prev = null, temp = null;
		
		//create root node
		if(root == null) {
			
			root = new Node(key);
			ptr = root;
			return ptr;
		}
		
		//find the correct position for the new node
		//by moving the temp and prev variables downward
		while(temp != null && key != temp.data) {
			
			//prev refers to the previous temp node
			prev = temp;
			
			if(key <= temp.data) {
				
				temp = temp.left;
			}
			else {
				
				temp = temp.right;
			}			
		}
		
		//create the new node
		temp = new Node(key);
		
		//put the new node at the correct position
		if(key <= prev.data) {
			
			prev.left = temp;
		}
		else {
			
			prev.right = temp;
		}
		
		return temp;
		
	}
	
	//3. Tree traversals
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
		
		//4. searching iterative and recursive
		public Node search(Node node, int key) {
			
			while(node != null && key != node.data) {
				
				if(key < node.data) {
					
					node = node.left;
				}
				else {
					
					node = node.right;
				}
			}
			
			return node;
		}
		
		public Node searchRecur(Node node, int key) {
			
			if(node != null && key != node.data) {
				
				if(key < node.data) {
					
					return searchRecur(node.left, key);
				}
				else {
					
					return searchRecur(node.right, key);
				}
			}
			
			return node;
		}
		
		//5. minimum iterative and recursive
		public Node minimum(Node node) {
			
			while(node.left != null) {
				
				node = node.left;
			}
			
			return node;
		}
		
		public Node minimumRecur(Node node) {
			
			if(node.left == null) {
				
				return node;
			}
			
			return minimumRecur(node.left);
		}
		
		//6. maximum iterative and recursive
		public Node maximum(Node node) {
			
			while(node.right != null) {
				
				node = node.right;
			}
			
			return node;
		}
		
		public Node maximumRecur(Node node) {
			
			if(node.right == null) {
				
				return node;
			}
			
			return maximumRecur(node.right);
		}
}
























