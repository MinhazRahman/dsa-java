package ds.binarytreeusingrecursion;

public class BinarySearchTreeImplementation {
	
	public static void main(String[] args) {
		
		//create a tree object
		BinarySearchTree binaryTree = new BinarySearchTree();

		//insert values
		binaryTree.insert(6);
		binaryTree.insert(4);
		binaryTree.insert(8);
		binaryTree.insert(3);
		binaryTree.insert(2);
		binaryTree.insert(5);
		binaryTree.insert(7);
		binaryTree.insert(9);
		
		//tree traversals
		System.out.println("Preorder:");
		binaryTree.preorder(binaryTree.root);
		
		System.out.println("Inorder:");
		binaryTree.inorder(binaryTree.root);
		
		System.out.println("Postorder:");
		binaryTree.postorder(binaryTree.root);
		
		//search for a node in a tree
		System.out.println("Search for a node: ");
		Node node = binaryTree.search(binaryTree.root, 10);
		System.out.println(node);
		
		//find a node in a tree
		System.out.println("Find a node: ");
		Node target = binaryTree.find(binaryTree.root, 9);
		System.out.println(target);
		
		//find maximum and minimum node
		System.out.println("Maximum: ");
		Node max = binaryTree.maximum(binaryTree.root);
		System.out.println(max);
		
		System.out.println("Minimum: ");
		Node min = binaryTree.minimum(binaryTree.root);
		System.out.println(min);
		
		//find maximum and minimum node
		System.out.println("Maximum using recursion: ");
		Node maxi = binaryTree.maximumRecursive(binaryTree.root);
		System.out.println(maxi);
		
		System.out.println("Minimum using recursion: ");
		Node mini = binaryTree.minimumRecursive(binaryTree.root);
		System.out.println(mini);
		
		//delete a node 
		System.out.println("Delete a node: ");
		binaryTree.delete(2);
		
		System.out.println("Preorder:");
		binaryTree.preorder(binaryTree.root);
		
		//find successor
		System.out.println("Successor: ");
		Node successor = binaryTree.successorOf(binaryTree.root, 6);
		System.out.println(successor);
		
		//find predecessor
		System.out.println("Predecessor: ");
		Node predecessor = binaryTree.predecessorOf(binaryTree.root, 6);
		System.out.println(predecessor);
		
		//level order traversal
		System.out.println("Level Order Traversal: ");
		binaryTree.levelOrderTraversal();
		
	}
	
}



























