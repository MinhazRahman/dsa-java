package ds.binarysearchtree;

/**
 * 1. Insertion using recursive method 2. Insertion using iterative method 3.
 * Tree traversals (preorder, inorder, postorder) 4. Searching in a tree 5.
 * Minimum and Maximum 6. Successor and Predecessor 7. Deletion 8. Parent node
 * 
 * Binary search tree doesn't contain duplicate data
 */
public class BinarySearchTree {

	// attributes
	Node root;

	// constructor
	public BinarySearchTree() {

	}

	// 1. insertion using recursive method
	public Node insert(Node ptr, int key) {

		// create reference node
		Node temp;

		// create root node
		if (root == null) {

			root = new Node(key);
			ptr = root;
			return ptr;
		}
		// create new child node
		else if (ptr == null) {

			temp = new Node(key);
			return temp;
		}

		// put the new node at the correct position
		if (key == ptr.data) { // if there is any matching node then don't insert
								// simply return
			return ptr;
		} else if (key < ptr.data) {

			ptr.left = insert(ptr.left, key); // recursive call
		} else {

			ptr.right = insert(ptr.right, key); // recursive call
		}

		return ptr;
	}

	// 2. insertion using iterative method
	public Node insertNode(Node ptr, int key) {

		// create reference nodes
		Node temp, prev = null;

		// create root node
		if (root == null) {

			root = new Node(key);
			ptr = root;
			return ptr;
		}

		// find the position
		while (ptr != null) {

			// if there is already a duplicate key in the tree
			// then don't insert it
			if (key == ptr.data) { // Binary search tree doesn't contain duplicate data

				return ptr;
			}

			// prev refers to the previous node
			prev = ptr;

			if (key < ptr.data) {

				ptr = ptr.left;
			} else {

				ptr = ptr.right;
			}
		}

		// create new node
		temp = new Node(key);

		// insert the node into the tree
		if (key < prev.data) {

			prev.left = temp;
		} else {

			prev.right = temp;
		}

		return temp;

	}

	// 3. Tree traversals
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

	// 4. searching iterative and recursive
	public Node search(Node node, int key) {

		while (node != null && key != node.data) {

			if (key < node.data) {

				node = node.left;
			} else {

				node = node.right;
			}
		}

		return node;
	}

	public Node searchRecur(Node node, int key) {

		if (node != null && key != node.data) {

			if (key < node.data) {

				return searchRecur(node.left, key);
			} else {

				return searchRecur(node.right, key);
			}
		}

		return node;
	}

	// 5. minimum iterative and recursive
	public Node minimum(Node node) {

		while (node.left != null) {

			node = node.left;
		}

		return node;
	}

	public Node minimumRecur(Node node) {

		if (node.left == null) {

			return node;
		}

		return minimumRecur(node.left);
	}

	// 6. maximum iterative and recursive
	public Node maximum(Node node) {

		while (node.right != null) {

			node = node.right;
		}

		return node;
	}

	public Node maximumRecur(Node node) {

		if (node.right == null) {

			return node;
		}

		return maximumRecur(node.right);
	}
	
	//7. parent node of a given node
	public Node parentOf(int key) {
		
		//parent holds the parent node
		Node parent = null;
		//start the search from the root node
		Node node = root;

		while(node != null && key != node.data) {
			
			//points to the parent node
			parent = node;
			
			if(key < node.data) {
				
				node = node.left;
			}
			else {
				
				node = node.right;
			}
		}
		
		return parent;
		
	}
	
	//8. successor of a node
	public Node successor(Node x) {
		
		//declare reference nodes
		Node y;
		
		//find x in the tree
		x = search(root, x.data);
		
		//if the right subtree of node x is non empty
		if(x.right != null) {
			
			return minimum(x.right);
		}
		
		//if the right subtree of node x is empty
		y = parentOf(x.data);
		
		while(y != null && x == y.right) {
			
			x = y;
			y = parentOf(y.data);
		}
		
		return y;
	}
	
	//9. predecessor of a node
	public Node predecessor(Node x) {
		
		//declare reference nodes
		Node y;
		
		//find x in the tree
		x = search(root, x.data);
		
		//if the the left subtree of node x is nonempty
		if(x.left != null) {
			
			return maximum(x.left);
		}
		
		//if the left subtree of node x is empty
		y = parentOf(x.data);
		
		while(y != null && x == y.left) {
			
			x = y;
			y = parentOf(y.data);
		}
		
		return y;
	}
}


































