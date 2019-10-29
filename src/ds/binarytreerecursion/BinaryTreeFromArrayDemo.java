package ds.binarytreerecursion;

public class BinaryTreeFromArrayDemo {

	public static void main(String[] args) {

		BinaryTreeFromArray binaryTree = new BinaryTreeFromArray();
		
		int[] a = {10, 20, 30, 40, 50, 60, 70};
		
		binaryTree.create(a, 0);
		//binaryTree.createTree(a);
		
		
		System.out.println("Pre order traversal: ");
		binaryTree.preorder(binaryTree.root);
		
		System.out.println("In order traversal: ");
		binaryTree.inorder(binaryTree.root);
		
		System.out.println("Post order traversal: ");
		binaryTree.postorder(binaryTree.root);
	}

}
