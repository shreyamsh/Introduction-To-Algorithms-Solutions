
class BinarySearchTree {
	class Node {
		int key;
		Node left, right;

		Node(int item) {
			key = item;
			left=right=null;
		}	
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	//A recursive function to insert a key
	Node insertRec(Node root, int key) {

		//If the tree is empty insert a new node
		if(root == null) {
			root = new Node(key);
			return root;
		}

		//Otherwise recur down the tree
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if(key > root.key) {
			root.right = insertRec(root.right, key);
		}

		return root;
 	}

 	void deleteKey(int key) {
 		root = deleteRec(root, key);
 	}

 	Node deleteRec(Node root, int key) {
 		if(root == null) return root;

 		 /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
 
 		// if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
 
        return root;
 	}	

 	int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

 	void inOrder() {
 		return inOrderRec(root);
 	}

 	void inOrderRec(Node root) {
 		if(root!==null) {
 			inOrderRec(root.left);
 			System.out.println(root.key);
 			inOrderRec(root.right);
 		}
 	}

 	public static void main(String[] args) {
 		BinarySearchTree tree = new BinarySearchTree();

 		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // print inorder traversal of the BST
        tree.inorder();

        //The worst case time complexity of search and insert is O(h). h is the height of the BST.
 	}
}