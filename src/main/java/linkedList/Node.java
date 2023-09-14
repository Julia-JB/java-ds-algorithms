package linkedList;

public class Node {
	Node next;
	int data;

	public Node(int newData) {
		this.data = newData;
		this.next = null;
	}

	public Node(int newData, Node next) {
		this.data = newData;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(int newData) {
		data = newData;
	}

	public void setNext(Node newNode) {
		next = newNode;
	}
}
