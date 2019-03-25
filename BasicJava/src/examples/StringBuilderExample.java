package examples;

/**
 * 
 * @author rutpatel
 *
 */

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);

		sb.append("Programmming");
		System.out.println(sb);

		sb.insert(4, " ");
		System.out.println(sb);

		sb.delete(11, 12);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}
