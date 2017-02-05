class Node{
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = NULL;
	}
}
class Stack {
	Node top;

	public Node peek() {
		if(top != NULL)
			return top;
	}

	public Node push(Node n) {
		if(n != NULL) {
			n.next = top;
			top = n;
		}
	}

	public Node pop() {
		if(top == NULL) {
			return NULL;
		}
		else {
			Node temp = new Node(top.data);
			top = top.next;
			return temp;
		}
	}
}