package examples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String a;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String - ");
		a = sc.nextLine();

		System.out.print("Reverse String - ");
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}

		sc.close();
	}

}
