package ds.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Create a binary tree using queue data structure
 */
public class BinaryTree {

	// attributes
	Node root, node, child;
	Queue<Node> queue;

	Scanner input;
	int x, counter, leafCounter;

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

	// iterative preorder
	public void iterativePreorder(Node node) {

		Stack<Node> stack = new Stack<>();

		while (node != null || !stack.empty()) {

			if (node != null) {

				System.out.println(node);
				stack.push(node);

				node = node.left;
			} else {

				node = stack.pop();
				node = node.right;
			}
		}
	}

	// iterative inorder
	public void iterativeInorder(Node node) {

		Stack<Node> stack = new Stack<>();

		while (node != null || !stack.empty()) {

			if (node != null) {

				stack.push(node);

				node = node.left;
			} else {

				node = stack.pop();

				System.out.println(node);

				node = node.right;
			}
		}
	}

	// iterative postorder
	public void iterativePostorder(Node node) {

		Stack<Node> s = new Stack<>();

		while (node != null) {

			if (node.right != null) {

				s.push(node.right);
				node = node.right;
			} else if (node.left != null) {

				s.push(node.left);
				node = node.left;
			}
		}
	}

	// iterative level order traversal
	public void iterativeLevelorder(Node node) {

		Queue<Node> q = new ArrayDeque<>();
		Node temp;

		if (q != null) {

			// add the root to the queue
			q.add(node);
		}

		System.out.println(node);

		while (!q.isEmpty()) {

			// returns and removes the node from the queue
			temp = q.remove();

			if (temp.left != null) {

				q.add(temp.left);
				System.out.println(temp.left);
			}

			if (temp.right != null) {

				q.add(temp.right);
				System.out.println(temp.right);
			}

		}
	}

	// counting nodes in a binary tree
	public int countNode(Node node) {

		if (node != null) {

			counter++;

			countNode(node.left);
			countNode(node.right);

		}

		return counter;
	}

	// counting nodes in a binary tree
	public int countNodesXY(Node node) {
		int x, y;

		if (node != null) {

			x = countNodesXY(node.left);
			y = countNodesXY(node.right);

			return x + y + 1;
		}

		return 0;
	}

	// counting nodes of degree two
	public int countNodesOfDegreeTwo(Node node) {
		int x, y;

		if (node != null) {

			x = countNodesOfDegreeTwo(node.left);
			y = countNodesOfDegreeTwo(node.right);

			if (node.left != null && node.right != null) {

				return x + y + 1;
			} else {
				return x + y;
			}

		}

		return 0;
	}

	// count nodes of degree one or two
	public int countNodesOfDegreeOneOrTwo(Node node) {

		int x, y;

		if (node != null) {

			// recursive step
			x = countNodesOfDegreeOneOrTwo(node.left);
			y = countNodesOfDegreeOneOrTwo(node.right);

			if (node.left != null || node.right != null) {

				return x + y + 1;
			} else {

				return x + y;
			}
		}

		return 0;

	}

	// count nodes of degree one
	public int countNodesOfDegreeOne(Node node) {

		int x, y;

		// base case
		if (node == null) {

			return 0;
		}

		// recursive steps
		x = countNodesOfDegreeOne(node.left);
		y = countNodesOfDegreeOne(node.right);

		// using Exclusive OR: node.left != null ^ node.right != null
		if ((node.left != null && node.right == null) || 
				(node.left == null && node.right != null)) {

			return x + y + 1;
		} 
		else {

			return x + y;
		}
	}

	// counting sum of all the nodes in a binary tree
	public int sumOfAllElements(Node node) {
		int x, y;

		if (node != null) {

			x = sumOfAllElements(node.left);
			y = sumOfAllElements(node.right);

			return x + y + node.data;
		}

		return 0;
	}

	// counting leaf nodes
	public int countLeafNodes(Node node) {

		if (node != null) {

			if (node.left == null && node.right == null) {

				leafCounter++;
			}

			countLeafNodes(node.left);
			countLeafNodes(node.right);
		}

		return leafCounter;
	}

	// height of a binary tree
	public int height(Node node) {

		return getHeight(node) - 1;
	}

	// helper function to get the height
	public int getHeight(Node node) {

		int x, y;

		// base case
		if (node == null) {

			return 0;
		}

		// recursive steps
		x = getHeight(node.left);
		y = getHeight(node.right);

		if (x > y) {

			return x + 1;
		} else {

			return y + 1;
		}
	}

}
