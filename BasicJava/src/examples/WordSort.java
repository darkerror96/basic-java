package examples;

import java.util.Iterator;
import java.util.TreeSet;

public class WordSort {

	public static void main(String[] args) {

		TreeSet<String> data = new TreeSet<String>();
		data.add("object");
		data.add("class");
		data.add("data");
		data.add("variable");

		// System.out.println(data);

		Iterator<String> i = data.iterator();

		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

}
