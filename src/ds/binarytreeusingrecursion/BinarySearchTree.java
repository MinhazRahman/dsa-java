package ds.binarytreeusingrecursion;

/**
 * 1. Insertion
 * 2. Deletion
 * 3. Searching
 * 4. Tree Traversal
 *		-Breadth First Search
 *		-Depth First Search
 * */

public class BinarySearchTree {
	
	//variables
	Node root;
	Node left;
	Node right;
	
	//constructor
	public BinarySearchTree() {
	
		
	}
	
	/** 1. insert a node recursively in a tree */
	public Node insertRecursive(Node current, int key) {
		
		if(current == null) {
			
			return new Node(key);
		}
		
		if(key < current.key) {
			
			current.left = insertRecursive(current.left, key);
		}
		else if(key > current.key) {
			
			current.right = insertRecursive(current.right, key);
		}
		else {
			
			//key already exists
			return current;
		}
		
		return current;
	}
	
	/**insert a node */
	public void insert(int key) {
		
		root = insertRecursive(root, key);
	}
	
	/** 2. search for a node using recursive method */
	public Node search(Node node, int key) {
		
		if(node != null) {
			
			if(key < node.key){
				
				node = search(node.left, key); //recursive step
			}
			else if(key > node.key) {
				
				node = search(node.right, key); //recursive step
			}
			else { //key == node.key
				
				//found
				return node;
			}	
		}
		
		//not found
		return node;
		
	}
	
	/** 3. find a node using iterative method */
	public Node find(Node node, int key) {
		
		while(node != null) {
			
			if(key < node.key){
				
				node = node.left;
			}
			else if(key > node.key) {
				
				node = node.right;
			}
			else { //key == node.key
				
				//found
				return node;
			}	
		}
		
		//not found
		return node;
		
	}
	
	/** 4. tree traversals: recursive methods */
	public void preorder(Node node) {
		
		if(node != null) {
			
			System.out.println(node);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void inorder(Node node) {
		
		if(node != null) {
			
			inorder(node.left);
			System.out.println(node);
			inorder(node.right);
		}
	}
	
	public void postorder(Node node) {
		
		if(node != null) {
			
			inorder(node.left);
			inorder(node.right);
			System.out.println(node);
		}
	}
	
	/** 5. maximum and minimum using both iterative and recursive methods */
	public Node maximum(Node node) {
		
		while(node.right != null) {
			
			node = node.right;
		}
		
		return node;
	}
	
	public Node maximumRecursive(Node node) {
		
		if(node.right != null) {
			
			node = maximumRecursive(node.right); //recursive step
		}
		
		return node;
	}
	
	public Node minimum(Node node) {
		
		while(node.left != null) {
			
			node = node.left;
		}
		
		return node;
	}
	
	public Node minimumRecursive(Node node) {
		
		if(node.left != null) {
			
			node = minimumRecursive(node.left); //recursive step
		}
		
		return node;
	}
	
	/** 6. deleting a node from a tree
	* 1. node with no children
	* 2. node with one child
	* 3. node with two children
	*/
	public Node deleteRecursive(Node current, int key) {
		
		if(current == null) {
			
			return null;
		}
		
		if(key == current.key) {
			
			//node to delete found
			//delete the node with no children
			if(current.left == null && current.right == null) {
				
				return null;
			}
			
			//delete the node with one child
			if(current.left == null) {
				
				return current.right;
			}
			
			if(current.right == null) {
				
				return current.left;
			}
			
			//to delete the node with two children we replace the node with it's successor
			//the successor of a node is the smallest node on it's right sub tree 
			if(current.left != null && current.right != null) {
				
				//find the successor value
				int successorValue = keyOfSuccessor(current.right);
				
				//set the current node'value as the successor value
				current.key = successorValue;
				
				//delete the current.right node
				current.right = deleteRecursive(current.right, successorValue);
				
				return current;
				
			}
		}
		
		if(key < current.key) {
			
			current.left = deleteRecursive(current.left, key);
			return current;
		}
		
		if(key > current.key) {
			
			current.right = deleteRecursive(current.right, key);
			return current;
		}
		
		return current;
	}
	
	//delete a node
	public void delete(int key) {
		
		root = deleteRecursive(root, key); //recursive function
	}
	
	//find the value of the successor: smallest node on the right sub tree
	private int keyOfSuccessor(Node node) {
		
		return node.left == null ? node.key: keyOfSuccessor(node.left);
	}
	
	/** 7. find the successor of a node: the smallest node on the right sub tree */
	public Node successorOf(Node node, int key) {
		
		//search for the node
		node = search(node, key);
		
		//find smallest node on the right sub tree
		if(node.left != null && node.right != null) {
			//smallest nod on the right sub tree
			node = smallestNode(node.right);
		}
		
		return node;
				
	}
	
	//find the smallest node
	private Node smallestNode(Node node) {
		
		return node.left == null ? node: smallestNode(node.left);
	}
	
	/** 8. find the predecessor of a node: the largest node on the left sub tree */
	public Node predecessorOf(Node node, int key) {
		
		//search for the node
		node = search(node, key);
		
		if(node.left != null && node.right != null) {
			
			//largest node on the left subtree
			node = largestNode(node.left);
		}
		
		return node;
	}
	
	//find the largest node
	public Node largestNode(Node node) {
		
		return node.right == null ? node: largestNode(node.right);
	}

}
























