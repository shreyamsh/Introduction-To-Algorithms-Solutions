//Method 1: Use function to print a given level
class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = NULL;
	}
}

class BFSTraversal {
	//Root of the binary tree'
	Node root;

	public BFSTraversal {
		root = NULL;
	}

	//function to print level order of the tree
	void printLevelOrder() {
		int h = height(root);
		int i;
		for(i=1; i<h; i++) {
			printGivenLevel(root,i);
		}
	}

	//Compute the height of the tree -- the number of nodes along the longest path from the root node down to the farthest leaf node.
	int height(Node root) {
		if(root == NULL) {
			return 0;
		}
		else {
			/*compute the height of each subtree*/
			int lheight = height(root.left);
			int rheight = height(root.right);

			//Use the larger one
			if(lheight > rheight) {
				return (lheight+1);
			}	
			else {
				return (rheight+1);
			}
		}
	}

	//Function to print nodes at a given level
	printGivenLevel(Node node, int level) {
		if(root == NULL)
			return;
		if(level == 1) {
			System.out.println(root.data + " ");
		}
		else if(level > 1) {
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Level order traversal of binary tree is:");
		tree.printLevelOrder(); 
	}
}
//Time complexity is O(n^2)