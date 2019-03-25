package examples;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {

		int vowelCount = 0;
		System.out.print("Enter String - ");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine().trim();
		String dataUC = data.toUpperCase();

		long inTime = System.currentTimeMillis();
		for (int i = 0; i < data.length(); i++) {
			switch (dataUC.charAt(i)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.print(data.charAt(i) + "(" + i + ") ");
				vowelCount++;
				break;

			default:
				break;
			}
		}
		long outTime = System.currentTimeMillis();
		System.out.println("\nTotal Time taken - " + (outTime - inTime) + " ms");
		System.out.println("Total Vowel Count - " + vowelCount);

		System.out.println("* Replacement - " + data.replaceAll("[aeiouAEIOU]", "*").toString());
		sc.close();
	}

}
