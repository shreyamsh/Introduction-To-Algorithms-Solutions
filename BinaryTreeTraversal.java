class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = NULL;
	}
}

class BinaryTree {
	//Root of Binary Tree
	Node root;

	BinaryTree() {
		root = NULL;
	}

	/*Given a binary tree, print its nodes accroding to the "bottom-up" postorder traversal*/
	void printPostOrder(Node node) {
		if(node == NULL)
			return;

		//First recur on the left subtree
		printPostOrder(node.left);

		//The recur on the right subtree
		printPostOrder(node.right);

		//Deal with the root
		System.out.println(node.key + " ");
	}

	void printInOrder(Node node) {
		if(node == NULL) 
			return;

		//first left child
		printInOrder(node.left);

		//Root
		System.out.println(node.key + " ");

		//Right child
		printInOrder(node.right);
	}

	void printPreOrder(Node node) {
		if(node == NULL)
			return

		System.out.println(node.key + " ");

		printPostOrder(node.left);

		printPostOrder(node.right);	
	}

	//Wrappers over above recursive functions
	void printPostOrder() {
		printPostOrder(root);
	}	

	void printInOrder() {
		printPostOrder(root);
	}

	void printPreOrder() {
		printPostOrder(root);
	}		

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
	}
}