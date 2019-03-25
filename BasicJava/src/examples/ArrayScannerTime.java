package examples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ArrayScannerTime {

	public static void main(String[] args) {

		int i = 0, lengthFileName = 0, maxLength = 0, longFile = 0;
		String fileName[] = new String[10];
		String date[] = new String[10];

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");

		do {
			System.out.print("\nEnter File Name: - ");
			fileName[i] = sc.next();
			date[i++] = fmt.format(new Date());
			lengthFileName++;

			System.out.print("\nFile Added.Do you want enter another file name?y/n...");

		} while (sc.next().equals("y"));
		sc.close();

		for (i = 0; i < lengthFileName; i++) {
			if (fileName[i].length() > maxLength) {
				maxLength = fileName[i].length();
				longFile = i;
			}
		}

		System.out.println("Longest FileName is " + fileName[longFile]);
	}

}
