/**
 * 
 */
package streamexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author rutpatel
 *
 */
public class FilterString {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abe", " abc-fer", "bc", "efg", "abcd", "", "jkl");

		strings.stream().dropWhile(e -> e.contains("a")).filter(e -> e.contains("e")).forEach(System.out::println);

		// Map
		strings.stream().filter(e -> e.contains("abc")).map(e -> "Name : " + e).forEach(System.out::println);

		// Length Sort
		Comparator<String> stringCmp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		};
		strings.stream().sorted(stringCmp).forEach(System.out::println);

		// Reverse Sort
		ArrayList<String> ipNames = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Name - ");
			String name = sc.nextLine();
			ipNames.add(name);
		}
		sc.close();
		ipNames.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
