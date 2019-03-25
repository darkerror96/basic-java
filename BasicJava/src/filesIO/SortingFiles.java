/**
 * 
 */
package filesIO;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

/**
 * @author rutpatel
 *
 */
public class SortingFiles {

	public static void main(String[] args) {

		File file = new File(
				"/Users/rutpatel/Documents/Rut/Collabera_JuMP/SpringTool_Workspace/BasicJava/src/examples");
		if (file.exists()) {
			printDirectory(file);
		}
	}

	private static void printDirectory(File folder) {

		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				System.out.println(
						"====== Directory: " + file.getName() + " : Contains: " + files.length + " Files ========");
				printDirectory(file);
			} else {
				// System.out.println(file.getName());
			}
		}

		// folder found sorting this based on last modified timestamp
		if (folder.isDirectory()) {
			TreeMap<Long, List<String>> filesLastModified = new TreeMap<>();
			System.out.println("---------- Folder name:" + folder + " -----------");
			for (File tempFile : folder.listFiles()) {

				if (!tempFile.isDirectory()) {
					if (filesLastModified.containsKey(tempFile.lastModified())) {

						List<String> files = filesLastModified.get(tempFile.lastModified());
						files.add(tempFile.getName());
						filesLastModified.put(tempFile.lastModified(), files);

					} else {
						List<String> files = new ArrayList<String>();
						files.add(tempFile.getName());
						filesLastModified.put(tempFile.lastModified(), files);
					}
				}
			}

			for (Long timeStamp : filesLastModified.keySet()) {
				// System.out.println(timeStamp);
				for (String fileName : filesLastModified.get(timeStamp))
					System.out.println(new Date(timeStamp) + " ---> " + fileName);
			}

			System.out.println("+++++++ Folder Done ++++++");
			// printDirectory(file);
		}
	}
}
