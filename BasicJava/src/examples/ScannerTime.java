package examples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerTime {

	public static void main(String[] args) {

		String fileName;
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");

		do {
			System.out.print("\nEnter File Name: - ");
			fileName = sc.next();
			System.out.println("File Name: - " + fileName + " @ " + fmt.format(new Date()));

			System.out.print("\nDo you want enter another file name?y/n...");

		} while (sc.next().equals("y"));

		System.out.println("\n----Exit----\n");
		sc.close();
	}
}