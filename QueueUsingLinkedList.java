
class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = NULL;
	}
}

class QueueUsingLinkedList {
	Node head, tail;

	public void enqueue(Node new_data) {
		if(head == NULL) {
			head = new_data;
			tail = head;
		}
		else {
			tail.next = new_data;
			tail = new_data;
		}
	}

	public void dequeue() {
		if(head == NULL) {
			return NULL;
		}
		else {
			Node temp = new Node(head.data);
			head = head.next;
			return temp;
		}
	}
}