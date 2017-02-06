
public class StackUsingTwoQueues {

	private Queue<Integer> q1;
	private Queue<Integer> q2; 
	public StackUsingTwoQueues {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
		private int top;
	}

	public void push(int item) {
		q1.add(item);
		top = item;
	}	

	// TIme complexity is O(1). Queue is implemented as LinkedList and add operation is O(1).
	//Space complexity is O(1)

	public void pop() {
		while(q1.size() > 1) {
			top = q1.remove();
			q2.add(top);
		}
		q1.remove();
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	//O(n) time complexity. The algorithm dequeues n elements from q1 and enqueues n-1 elements to q2, where n is stack size. This gives 2n-1 operations.
	//Space complexity O(1)
}

