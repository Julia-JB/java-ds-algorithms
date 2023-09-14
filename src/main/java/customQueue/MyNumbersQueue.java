package customQueue;

import java.util.LinkedList;

public class MyNumbersQueue {
	private LinkedList queue;

	public MyNumbersQueue() {
		queue = new LinkedList<>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public void enqueue(int a) {
		queue.addLast(a);
	}

	public int dequeue() {
		return (int) queue.remove(0);
	}

	public int peek() {
		return (int) queue.get(0);
	}

	public static void main(String[] args) {
		MyNumbersQueue myQueue = new MyNumbersQueue();

		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);

		System.out.println("Peek at first item: " + myQueue.peek());
		System.out.println("First out: " + myQueue.dequeue());
		System.out.println("Second out: " + myQueue.dequeue());
		System.out.println("Third out: " + myQueue.dequeue());
	}
}
