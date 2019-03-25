/**
 * 
 */
package filesIO;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author rutpatel
 *
 */
public class ReadingFile {

	private static String filePath = "/Users/rutpatel/Documents/Rut/Collabera_JuMP/SpringTool_Workspace";

	private static Map<Long, String> sortFile = new TreeMap<Long, String>();

	public static void main(String[] args) throws IOException {

		File file = new File(filePath);
		if (file.exists()) {
			sortDirectory(file);
		}

		for (Map.Entry<Long, String> entry : sortFile.entrySet()) {
			Long key = entry.getKey();
			String value = entry.getValue();

			System.out.println(new Date(new Timestamp(key).getTime()) + " => " + value);
		}

//		File file = new File(filePath);
//		if (file.exists()) {
//			printDirectory(file);
//		}

//		File f = new File("test.txt");
//		System.out.println("File Length - " + f.length());

//		Scanner sc = new Scanner(f);
//		while (sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
//		sc.close();

//		FileInputStream fis = new FileInputStream(f);
//		int data = fis.read();
//		while (data != (-1)) {
//			System.out.print((char)fis.read());
//			data = fis.read();
//		}
//		fis.close();

//		File f = new File("text.data");
//		FileOutputStream fos = new FileOutputStream(f);
//		String data = "Hello from Output Stream";
//		fos.write(data.getBytes());
//		fos.close();

//		File f = new File("Data");
//		if (f.mkdir()) {
//			File f1 = new File(f.getAbsolutePath() + "/data.txt");
//			f1.createNewFile();
//			FileOutputStream fos = new FileOutputStream(f1);
//			String data = "Hello New File from Output Stream";
//			fos.write(data.getBytes());
//
//			System.out.println("New Folder and File created");
//
//			fos.close();
//		}

	}

	public static void sortDirectory(File folder) {
		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				sortFile.put(file.lastModified(), file.getName());
				sortDirectory(file);
			} else {
				// System.out.println(file.getName() + file.lastModified());
				sortFile.put(file.lastModified(), file.getName());

			}
		}

	}

	public static void printDirectory(File folder) {
		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				System.out.println("---" + file.getName() + " Directory---(" + file.listFiles().length + ")");
				printDirectory(file);
			} else {
				System.out.println(file.getName());
			}
		}

	}
}
