package generics;
public class PrintArray {
	public static <E> E[] printArray(E [] arr) {
		System.out.print("[");
	for (E element : arr) {
		System.out.print(element + " ");
	}
		System.out.print("]");
	return arr;
	}

	public static <T extends Comparable <T>> T findMax(T a, T b) {
		int n = a.compareTo(b);
		if (n < 0) {
			return b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		Integer[] numbersArr = {1, 2, 3, 4, 5};
		printArray(numbersArr);

		System.out.println();

		String[] stringsArr = {"hi", "hey", "hello"};
		printArray(stringsArr);

		System.out.println();

		System.out.println(findMax(3, 5));
		System.out.println(findMax(8, 14));
		System.out.println(findMax("hello", "fall"));
		System.out.println(findMax('a', 'j'));
	}
}
