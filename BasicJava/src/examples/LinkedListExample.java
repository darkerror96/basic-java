package examples;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * @author rutpatel
 *
 */

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();

		for (int i = 1; i <= 10; i++) {
			ll.add(i);
		}
		ll.add(14);
		ll.add(12);

		for (Integer i : ll) {
			System.out.print(i + " ");
		}

		ll.pop();
		ll.sort(null);
		System.out.println();

		for (Integer i : ll) {
			System.out.print(i + " ");
		}

		System.out.println();
		ListIterator<Integer> li = ll.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

	}

}
