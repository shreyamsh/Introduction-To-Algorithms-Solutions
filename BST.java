
public Node search(Node root, int key) {

	//Base cases: Root is null or key is present at root
	if(root == null || root.key == key) {
		return root;
	}

	//If value is greater than root's key
	if(root.key > key) {
		return search(root.left, key);
	}

	//If value is less than root's key
	return search(root.right, key);
}