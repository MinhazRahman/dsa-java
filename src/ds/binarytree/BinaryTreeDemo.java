package ds.binarytree;

public class BinaryTreeDemo {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.create();
		
		/*
		System.out.println("Pre order traversal: ");
		binaryTree.preorder(binaryTree.root);
		
		System.out.println("In order traversal: ");
		binaryTree.inorder(binaryTree.root);
		
		System.out.println("Post order traversal: ");
		binaryTree.postorder(binaryTree.root);
		
		*/
		
		/*
		 * System.out.println("Iterative preorder traversal: ");
		 * binaryTree.iterativePreorder(binaryTree.root);
		 * 
		 * System.out.println("Iterative inorder traversal: ");
		 * binaryTree.iterativeInorder(binaryTree.root);
		 * 
		 * System.out.println("Iterative levelorder traversal: ");
		 * binaryTree.iterativeLevelorder(binaryTree.root);
		 */
		
		System.out.println("Number of nodes: ");
		System.out.println(binaryTree.countNode(binaryTree.root));
		
		System.out.println("Number of leaf nodes: ");
		System.out.println(binaryTree.countLeafNodes(binaryTree.root));
		
		System.out.println("Number of nodes of degree one or two:");
		System.out.println(binaryTree.countNodesOfDegreeOneOrTwo(binaryTree.root));
		
		System.out.println("Number of nodes of degree one:");
		System.out.println(binaryTree.countNodesOfDegreeOne(binaryTree.root));
		
		System.out.println("Height of the tree:");
		System.out.println(binaryTree.height(binaryTree.root));

	}

}
