package examples;

import java.util.ArrayList;
import java.util.List;

public class CombineList {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			l1.add(i);
		}

		for (int i = 6; i <= 10; i++) {
			l2.add(i);
		}

//		for (int i = 0; i < l1.size(); i++) {
//			l3.add(l1.get(i));
//		}
//
//		for (int i = 0; i < l2.size(); i++) {
//			l3.add(l2.get(i));
//		}

		l3.addAll(l1);
		l3.addAll(l2);
		l3.add(1, null);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
