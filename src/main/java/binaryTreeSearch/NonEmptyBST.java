package binaryTreeSearch;

public class NonEmptyBST<E extends Comparable> implements Tree<E> {

	E data;
	Tree<E> left;
	Tree<E> right;

	public NonEmptyBST(E el) {
		data = el;
		left = new EmptyBST<E>();
		right =new EmptyBST<E>();


	}

	public NonEmptyBST(E el, Tree<E> leftTree, Tree<E> rightTree) {
		data = el;
		left = leftTree;
		right = rightTree;
	}



	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}

	@Override
	public boolean member(E el) {
		if (data == el) {
			return true;
		} else {
			if (el.compareTo(data) < 0) {
				return left.member(el);
			} else {
				return right.member(el);
			}
		}
	}

	@Override
	public NonEmptyBST<E> add(E el) {
		if (data == el) {
			return this;
		} else if (el.compareTo(data) < 0) {
			return new NonEmptyBST<>(data, left.add(el), right);
		} else {
			return new NonEmptyBST<>(data, left, right.add(el));
		}
	}
}
