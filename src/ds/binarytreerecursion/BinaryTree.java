package ds.binarytreerecursion;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/** How to create binary tree using recursion
 * 1. Create a binary tree from a given array.
 * 2. Create a binary tree from a given queue
 * 3. Create a binary tree using console inputs and queue data structure
 * 4. Create a binary tree by pushing/inserting one element at a time
 * 
 */
public class BinaryTree {

	// attributes
	Node root, node, child;
	Queue<Node> queue;

	Scanner input;
	int x;

	// constructor
	public BinaryTree() {

		this.root = new Node();
		this.child = new Node();
		this.node = new Node();
		this.queue = new ArrayDeque<>();
		this.input = new Scanner(System.in);
	}

	// create the binary tree
	public void create() {

		System.out.println("Enter root value: ");
		x = input.nextInt();

		// create root node
		root = new Node(x);

		// push the root in the queue
		queue.add(root);

		while (!queue.isEmpty()) {

			// removes the node at the head of the queue
			node = queue.remove();

			System.out.println("Enter left child of: " + node);
			x = input.nextInt();

			if (x != -1) {

				child = new Node(x);
				node.left = child;
				queue.add(child);
			}

			System.out.println("Enter right child of: " + node);
			x = input.nextInt();

			if (x != -1) {

				child = new Node(x);
				node.right = child;
				queue.add(child);
			}
		}
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
	
	// count all the nodes in a binary tree
	public int countAllNodes(Node node) {

		//base case 
		if(node == null) {
			
			return 0;
		}
		
		//recursive step
		return countAllNodes(node.left) + countAllNodes(node.right) + 1;
	}


	// counting nodes of degree two
	public int countNodesOfDegreeTwo(Node node) {
		
		//base case
		if(node == null) {
			
			return 0;
		}
		
		//recursive steps
		if (node.left != null && node.right != null) {

			return countNodesOfDegreeTwo(node.left) + countNodesOfDegreeTwo(node.right) + 1;
			
		} 
		else {
			return countNodesOfDegreeTwo(node.left) + countNodesOfDegreeTwo(node.right);
		}
	}

	// count nodes of degree one or two
	public int countNodesOfDegreeOneOrTwo(Node node) {

		
		//base case 
		if(node == null) {
			
			return 0;
		}
		
		//recursive steps
		
		if (node.left != null || node.right != null) {

			return countNodesOfDegreeOneOrTwo(node.left) + countNodesOfDegreeOneOrTwo(node.right) + 1;
		} else {

			return countNodesOfDegreeOneOrTwo(node.left) + countNodesOfDegreeOneOrTwo(node.right);
		}

	}

	// count nodes of degree one
	public int countNodesOfDegreeOne(Node node) {
		
		//base case
		if(node == null) {
			
			return 0;
		}
	
		// recursive steps
		// using Exclusive OR: node.left != null ^ node.right != null
		if ((node.left != null && node.right == null) || 
				(node.left == null && node.right != null)) {

			return countNodesOfDegreeOne(node.left) + countNodesOfDegreeOne(node.right) + 1;
		} 
		else {

			return countNodesOfDegreeOne(node.left) + countNodesOfDegreeOne(node.right);
		}
	}

	// counting sum of all the nodes in a binary tree
	public int sumOfAllElements(Node node) {
		
		//base case
		if(node == null) {
			
			return 0;
		}
		
		//recursive steps
		return sumOfAllElements(node.left) + sumOfAllElements(node.right) + node.data;
	}

	// counting leaf nodes
	public int countLeafNodes(Node node) {
		
		//base case
		if(node == null) {
			
			return 0;
		}
		
		//recursive steps
		if(node.left == null && node.right == null) {
			
			return countLeafNodes(node.left) + countLeafNodes(node.right) + 1;
		}
		else {
			
			return countLeafNodes(node.left) + countLeafNodes(node.right);
		}

	}

	// height of a binary tree
	public int height(Node node) {

		return heightOf(node) - 1;
	}

	// helper function to get the height
	public int heightOf(Node node) {

		int x, y;

		// base case
		if (node == null) {

			return 0;
		}

		// recursive steps
		x = heightOf(node.left);
		y = heightOf(node.right);

		if (x > y) {

			return x + 1;
		} else {

			return y + 1;
		}
	}

}
