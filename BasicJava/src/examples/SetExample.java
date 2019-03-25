package examples;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> s = new TreeSet<Integer>();

		for (int i = 4; i < 10; i++) {
			s.add(i);
		}

		System.out.println(s);

		s.add(2);
		System.out.println(s);
		s.add(1);

		System.out.println(s);

	}

}
