package examples;

import java.util.Scanner;

public class PrintReverseWord {

	public static void main(String[] args) {

		String a, lW = null;
		int maxLength = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Line - ");
		a = sc.nextLine();

		System.out.print("Seperate Reverse Words - ");
		String arr[] = a.trim().split(" ");

		for (String s : arr) {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}

		for (String s : arr) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				lW = s;
			}
		}
		System.out.println("\nLongest Word - " + lW + "(" + lW.length() + ")");

		System.out.print("Replacing 'e' with 'a' - ");
		for (String s : arr) {
			a = s.replace('e', 'a');
			System.out.print(a + " ");
		}

		sc.close();
	}

}
