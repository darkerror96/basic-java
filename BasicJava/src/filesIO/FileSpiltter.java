/**
 * 
 */
package filesIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author rutpatel
 *
 */
public final class FileSpiltter {

	private static int fileLength = 0, fileCountDone = 0;

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("/Users/rutpatel/Documents/Rut/Collabera_JuMP/SpringTool_Workspace/BasicJava/src/filesIO/data.txt");

		try (Scanner scFileSpiltCount = new Scanner(System.in);
				Scanner scCount = new Scanner(file);
				Scanner scSpilt = new Scanner(file);) {

			System.out.print("Enter number of files to spilt into - ");
			int fileSpiltCount = Integer.parseInt(scFileSpiltCount.nextLine());

			while (scCount.hasNextLine()) {
				fileLength++;
				scCount.nextLine();
			}

			int lineCount = (fileLength / fileSpiltCount);
			int lineModCount = (fileLength % fileSpiltCount);
			System.out.println(
					"Total lines in each file - " + lineCount + " (" + lineModCount + " more line/s in last file)");

			for (int i = 1; i <= fileSpiltCount; i++) {
				File f = new File("src/filesIO/data" + i + ".txt");
				PrintWriter pw = new PrintWriter(f);

				while (fileCountDone++ < lineCount) {
					pw.println(scSpilt.nextLine());
				}
				fileCountDone = 0;

				while (lineModCount > 0 && i == fileSpiltCount) {
					pw.println(scSpilt.nextLine());
					lineModCount--;
				}

				pw.close();
			}
			System.out.println(fileSpiltCount + " new files created...");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
