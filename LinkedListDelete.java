
class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node {
			data = d;
			next = NULL;
		}
	}

	/* Deletes the first occurence of key in the Linked LIst*/

	void deleteNode (int key) {
		//Store the head node
		Node temp = head, prev = NULL;

		// If the node itself holds the key to be deleted
		if(temp != NULL && temp.data == key) {
			head = temp.next;	//Changed the head
			return;
		}
		//Search the node to be deleted and keep track of previous node as we need to change temp.next
		while(temp != NULL && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		//if key was not present in the list
		if(temp == NULL) return;

		// Unlink the node from the list
		prev.next = temp.next;
	}




/* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

     public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
 
        System.out.println("\nCreated Linked list is:");
        llist.printList();
 
        llist.deleteNode(1); // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }
}