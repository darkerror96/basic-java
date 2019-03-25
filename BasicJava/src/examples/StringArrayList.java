package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringArrayList {

	public static void main(String[] args) {

		System.out.print("Enter string - ");
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split(" ");

//		ArrayList<String> wordList = new ArrayList<String>();
//
//		for (String word : data) {
//			wordList.add(word);
//		}

		List<String> wordList = Arrays.asList(data);

		System.out.println(wordList);

		ArrayList<String> revWordList = new ArrayList<String>();

		for (int i = wordList.size() - 1; i >= 0; i--) {
			revWordList.add(wordList.get(i));
		}

		System.out.println(revWordList);

		Collections.sort(wordList);
		System.out.println(wordList);

		sc.close();
	}
}
