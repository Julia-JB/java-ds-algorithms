package linkedList;

public class CustomLinkedList<E> {
	Node<E> head; // reference to the first node
	int count;

	public CustomLinkedList(Node<E> newHead) {
		head = newHead;
		count = 1;
	}

	public void add(E newData) {
		Node<E> temp = new Node(newData);
		Node<E> current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}

	public E get(int index) {
		Node<E> current = head;
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
		Node<E> current = head;

		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
}
