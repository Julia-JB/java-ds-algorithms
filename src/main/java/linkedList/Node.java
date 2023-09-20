package linkedList;

public class Node <E> {
	Node next;
	E data;

	public Node(E newData) {
		this.data = newData;
		this.next = null;
	}

	public Node(E newData, Node next) {
		this.data = newData;
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setData(E newData) {
		data = newData;
	}

	public void setNext(Node<E> newNode) {
		next = newNode;
	}
}
