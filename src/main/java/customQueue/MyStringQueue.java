package customQueue;

import java.util.LinkedList;
import java.util.Stack;

public class MyStringQueue {
	private LinkedList queue;

	public MyStringQueue() {
		queue = new LinkedList<>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public void enqueue(String s) {
		queue.addLast(s);
	}

	public String dequeue() {
		return (String) queue.remove(0);
	}

	public String peek() {
		return (String) queue.get(0);
	}

	public static void main(String[] args) {

		Stack<String> myStack = new Stack<>();
		myStack.push("World");
		myStack.push("Java");
		myStack.push("Hey");


		System.out.print(myStack.pop() + " ");
		System.out.print(myStack.pop() + " ");
		System.out.print(myStack.pop() + " ");

		MyStringQueue myStringQueue = new MyStringQueue();

		myStringQueue.enqueue("Hey");
		myStringQueue.enqueue("Java");
		myStringQueue.enqueue("World");

		System.out.println();
		System.out.println("First out: " + myStringQueue.dequeue());
		System.out.println("Second out: " + myStringQueue.dequeue());
		System.out.println("Third out: " + myStringQueue.dequeue());
	}
}
