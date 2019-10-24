package ds.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Create a binary tree using queue data structure
 * */
public class BinaryTree {

	//attributes
	Node root, node, child;
	Queue<Node> queue;
	
	Scanner input;
	int x;
	
	//constructor
	public BinaryTree() {
		
		this.root = new Node();
		this.child = new Node();
		this.node = new Node();
		this.queue = new ArrayDeque<>();
		this.input = new Scanner(System.in);
	}
	
	//create the binary tree
	public void create() {
		
		System.out.println("Enter root value: ");
		x = input.nextInt();
		
		//create root node
		root = new Node(x);
		
		//push the root in the queue
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			//removes the node at the head of the queue
			node = queue.remove();
			
			System.out.println("Enter left child of: " + node);
			x = input.nextInt();
			
			if(x != -1) {
				
				child = new Node(x);
				node.left = child;
				queue.add(child);
			}
			
			System.out.println("Enter right child of: " + node);
			x = input.nextInt();
			
			if(x != -1) {
				
				child = new Node(x);
				node.right = child;
				queue.add(child);
			}
		}	
	}
	
	//preorder traversal: root, left, right
	public void preorder(Node node) {
		
		if(node != null) {
			
			System.out.println(node);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	//inorder traversal: left, root, right
	public void inorder(Node node) {
		
		if(node != null) {
			
			inorder(node.left);
			System.out.println(node);
			inorder(node.right);
		}
	}
	
	//postorder: left, right, root
	public void postorder(Node node) {
		
		if(node != null) {
			
			postorder(node.left);
			postorder(node.right);
			System.out.println(node);
		}
	}
	
	//iterative preorder
	public void iterativePreorder(Node node) {
		
		Stack<Node> stack = new Stack<>();
		
		while(node != null || !stack.empty()) {
			
			if(node != null) {
				
				System.out.println(node);
				stack.push(node);
				
				node = node.left;
			}
			else {
				
				node = stack.pop();
				node = node.right;
			}	
		}	
	}
	
	//iterative inorder
	public void iterativeInorder(Node node) {
		
		Stack<Node> stack = new Stack<>();
		
		while(node != null || !stack.empty()) {
			
			if(node != null) {
				
				stack.push(node);
				
				node = node.left;
			}
			else {
				
				node = stack.pop();
				
				System.out.println(node);
				
				node = node.right;
			}
		}	
	}
	
	//iterative postorder
	public void iterativePostorder(Node node) {
		
		Stack<Node> stack = new Stack<>();
		
		while(node != null || !stack.empty()) {
			
			if(node != null) {
				
				stack.push(node);
				
				node = node.left;
				
			}
			else {
				
				node = stack.pop();	
				stack.push(node);
				node = node.right;
				
				System.out.println(node);

			}
		}	
	}
	
}


























