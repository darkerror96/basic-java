package examples;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(1, "Object");
		m.put(3, "Data");
		m.put(2, "Class");

		System.out.println(m);

		m.put(3, "Value");
		System.out.println(m);

		for (Entry<Integer, String> i : m.entrySet()) {
			System.out.print(i.getKey() + " ");
			System.out.print(i.getValue() + "\n");
		}

		System.out.println(m.containsValue("Class"));

		System.out.println(m.size());

	}

}
