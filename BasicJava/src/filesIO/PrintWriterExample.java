/**
 * 
 */
package filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author rutpatel
 *
 */
public class PrintWriterExample {

	public static void main(String[] args) throws IOException {

		File f = new File("test");
		PrintWriter pw = new PrintWriter(f);

		pw.println(1);
		pw.println(12.2);
		pw.println("Hello");

		System.out.println("Data Added...");
		pw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String data = br.readLine();
		while (data != null) {
			System.out.println(data);
			data = br.readLine();
		}

		br.close();
	}

}
