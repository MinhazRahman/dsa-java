package ds.binarytreerecursion;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Create a binary tree from a given array
 */
public class BinaryTreeFromArray {

	// attributes
	Node root, node, child;
	Queue<Node> queue;

	// constructors
	public BinaryTreeFromArray() {
		
		this.node = new Node();
		this.queue = new ArrayDeque<>();
	
	}

	// create the binary tree, recursive method
	public void create(int[] a, int i) {

		//index of left child
		int l = 2 * i + 1;
		//index of right child
		int r = 2 * i + 2;
		
		//create root node
		if (root == null) {

			// create the root node
			root = new Node(a[i]);
			
			//add root node to the queue
			queue.add(root);
		}
		
		//base case
		if(queue.isEmpty()) {
			
			return;
		}
		
		//recursive steps
		if(!queue.isEmpty()) {
			
			//remove the the node at the head of the queue
			node = queue.remove();
			
			//link the left child
			if(l <= a.length - 1) {
				
				child = new Node(a[l]);
				node.left = child;
				//add the child node to the queue
				queue.add(child);
			}
			
			//link the right child
			if(r <= a.length - 1) {
				
				child = new Node(a[r]);
				node.right = child;
				//add the child node to the queue
				queue.add(child);
			}
			
		}
		
		//recursive call
		create(a, i + 1);
	}
	
	//create the binary tree, iterative approach
	public void createTree(int[] a){
		
		//index
		int i = 0;
		
		//index of left child
		int l;
		//index of right child
		int r ;
		
		//create root node
		root = new Node(a[i]);
		
		//add the root node to the queue
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			//index of left child
			l = 2 * i + 1;
			//index of right child
			r = 2 * i + 2;
			
			//remove the the node at the head of the queue
			node = queue.remove();
			
			//link the left child
			if(l <= a.length - 1) {
				
				child = new Node(a[l]);
				node.left = child;
				//add the child node to the queue
				queue.add(child);
			}
			
			//link the right child
			if(r <= a.length - 1) {
				
				child = new Node(a[r]);
				node.right = child;
				//add the child node to the queue
				queue.add(child);
			}
			
			//increment index i
			i++;
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
}






















