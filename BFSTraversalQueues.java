//BFS Method 2 using Queues
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

	/*Given a binary tree. Print its nodes in level order using array for implementing queue*/
	void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.data + " ");

			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}	
	}

	public static void main(String[] args) {
		BFSTraversal tree_level = new BFSTraversal();
		tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
	}
}