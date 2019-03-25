package examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String - ");
		String data = sc.nextLine().trim();
		System.out.println(validateName(data));

		sc.close();
	}

	public static boolean validateName(String name) {

		if (name.length() == 0 || name.split(" ").length > 2) {
			return false;
		} else {
			String regx = "[^a-zA-Z\\s]";
			Pattern pattern = Pattern.compile(regx);
			Matcher matcher = pattern.matcher(name);
			return !matcher.find();
		}
	}
}
