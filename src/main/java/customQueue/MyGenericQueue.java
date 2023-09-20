package customQueue;

import java.util.LinkedList;

public class MyGenericQueue <E>{
	private LinkedList<E> queue;

	public MyGenericQueue() {
		queue = new LinkedList<>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public void enqueue(E e) {
		queue.addLast(e);
	}

	public E dequeue() {
		return queue.remove(0);
	}

	public E peek() {
		return queue.get(0);
	}

	public static void main(String[] args) {
		MyGenericQueue myQueue = new MyGenericQueue();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);

		System.out.println("Peek at first item: " + myQueue.peek());
		System.out.println("First out: " + myQueue.dequeue());
		System.out.println("Second out: " + myQueue.dequeue());
		System.out.println("Third out: " + myQueue.dequeue());

		MyGenericQueue myNewQueue = new MyGenericQueue();
		myNewQueue.enqueue("fall");
		myNewQueue.enqueue("winter");
		myNewQueue.enqueue("spring");

		System.out.println("Peek at first item: " + myNewQueue.peek());
		System.out.println("First out: " + myNewQueue.dequeue());
		System.out.println("Second out: " + myNewQueue.dequeue());
		System.out.println("Third out: " + myNewQueue.dequeue());
	}
}
