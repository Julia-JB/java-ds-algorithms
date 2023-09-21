package binaryTreeSearch;

public interface Tree<E extends Comparable> {
	public boolean isEmpty();

	public int cardinality();

	public boolean member(E el);

	public NonEmptyBST<E> add(E el);
}
