package ds.binarytree;

public class BinaryTreeDemo {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.create();
		
		System.out.println("Pre order traversal: ");
		binaryTree.preorder(binaryTree.root);
		
		System.out.println("In order traversal: ");
		binaryTree.inorder(binaryTree.root);
		
		System.out.println("Post order traversal: ");
		binaryTree.postorder(binaryTree.root);

	}

}
