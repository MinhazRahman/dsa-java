package ds.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		// insert elements

		bst.insert(bst.root, 30);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 25);
		bst.insert(bst.root, 35);
		bst.insert(bst.root, 50);

		// insert elements
		/*
		 * bst.insertNode(bst.root, 30); bst.insertNode(bst.root, 20);
		 * bst.insertNode(bst.root, 40); bst.insertNode(bst.root, 10);
		 * bst.insertNode(bst.root, 25); bst.insertNode(bst.root, 35);
		 * bst.insertNode(bst.root, 50);
		 */
		
		//search for a node
		Node node = bst.search(bst.root, 25);
		System.out.println("Found: " + node);
		
		node = bst.searchRecur(bst.root, 35);
		System.out.println("Found: " + node);
		
		//find minimum and maximum in a tree
		Node min = bst.minimum(bst.root);
		System.out.println("Minimum: " + min);
		
		Node minVal = bst.minimumRecur(bst.root);
		System.out.println("Minimum Val: " + minVal);
		
		Node max = bst.maximum(bst.root);
		System.out.println("Maximum: " + max);
		
		Node maxVal = bst.maximumRecur(bst.root);
		System.out.println("Maximum Val: " + maxVal);

		// print elements
		System.out.println("Preorder:");
		bst.preorder(bst.root);

		System.out.println("Inorder:");
		bst.inorder(bst.root);

		System.out.println("Postorder");
		bst.postorder(bst.root);

	}

}
