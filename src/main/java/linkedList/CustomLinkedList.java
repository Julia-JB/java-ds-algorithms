package linkedList;

public class CustomLinkedList {
	Node head; // reference to the first node
	int count;

	public CustomLinkedList(Node newHead) {
		head = newHead;
		count = 1;
	}

	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}

	public int get(int index) {
		if (index <= 0) {
			return -1;
		}
		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	//size

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void removeLast() {
		if (head == null) {
			return;
		}

		if (head.getNext() == null) {
			head = null;
			count = 0;
		}
		Node current = head;

		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
}
