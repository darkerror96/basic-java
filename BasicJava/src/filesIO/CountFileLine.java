/**
 * 
 */
package filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author rutpatel
 *
 */
public class CountFileLine {

	private static int totalFileLine = 0;

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/rutpatel/Documents/Rut/Collabera_JuMP/SpringTool_Workspace/BasicJava/src");
		if (file.exists()) {
			printDirectory(file);
		}

		System.out.println("\nTotal Lines in file - " + totalFileLine);

	}

	private static void printDirectory(File folder) throws IOException {

		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				printDirectory(file);
			} else {

				int tempCount = 0;
				BufferedReader br = new BufferedReader(new FileReader(file));

				if (file.getName().endsWith(".java")) {
					while (br.readLine() != null) {
						tempCount++;
					}
				}
				br.close();

				totalFileLine += tempCount;
				System.out.println(file.getName() + " - " + tempCount);
			}

		}
	}
}
