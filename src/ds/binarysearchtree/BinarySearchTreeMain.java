package ds.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		
		//insert elements
		bst.insert(bst.root, 30);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 25);
		bst.insert(bst.root, 35);
		bst.insert(bst.root, 50);
		
		//print elements
		System.out.println("Preorder:");
		bst.preorder(bst.root);
		
		System.out.println("Inorder:");
		bst.inorder(bst.root);
		
		System.out.println("Postorder");
		bst.postorder(bst.root);
		
	}

}
