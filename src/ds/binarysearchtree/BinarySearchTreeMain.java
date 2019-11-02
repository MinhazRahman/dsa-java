package ds.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		// insert elements using recursive method
		bst.insert(bst.root, 15);
		bst.insert(bst.root, 6);
		bst.insert(bst.root, 18);
		bst.insert(bst.root, 3);
		bst.insert(bst.root, 7);
		bst.insert(bst.root, 17);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 2);
		bst.insert(bst.root, 4);
		bst.insert(bst.root, 13);
		bst.insert(bst.root, 9);

		// insert elements using iterative method
		/*
		 * bst.insertNode(bst.root, 30); bst.insertNode(bst.root, 20);
		 * bst.insertNode(bst.root, 40); bst.insertNode(bst.root, 10);
		 * bst.insertNode(bst.root, 20); bst.insertNode(bst.root, 35);
		 * bst.insertNode(bst.root, 50);
		 **/

		// search for a node
		Node node = bst.search(bst.root, 25);
		System.out.println("Found: " + node);

		node = bst.searchRecur(bst.root, 35);
		System.out.println("Found: " + node);

		// find minimum and maximum in a tree
		Node min = bst.minimum(bst.root);
		System.out.println("Minimum: " + min);

		Node minVal = bst.minimumRecur(bst.root);
		System.out.println("Minimum Val: " + minVal);

		Node max = bst.maximum(bst.root);
		System.out.println("Maximum: " + max);

		Node maxVal = bst.maximumRecur(bst.root);
		System.out.println("Maximum Val: " + maxVal);
		
		//parent node
		Node parentNode = bst.parentOf(15);
		System.out.println("parent node: " + parentNode);
		
		//successor and predecessor
		Node successor = bst.successor(new Node(15));
		System.out.println("Successor: " + successor);
		
		Node predecessor = bst.predecessor(new Node(15));
		System.out.println("Predecessor: " + predecessor);
		
		successor = bst.inorderSuccessor(new Node(6));
		System.out.println("Inorder Successor: " + successor);
		
		predecessor = bst.inorderPredecessor(new Node(6));
		System.out.println("Inorder Predecessor: " + predecessor);
		
		int h = bst.height(bst.root);
		System.out.println("Height: " + h);

		// print elements
		System.out.println("Preorder:");
		bst.preorder(bst.root);

		System.out.println("Inorder:");
		bst.inorder(bst.root);

		System.out.println("Postorder");
		bst.postorder(bst.root);

	}

}
