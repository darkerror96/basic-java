/**
 * 
 */
package filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author rutpatel
 *
 */
public class ReadfromFileandSort {

	public static void main(String[] args) throws IOException {

		File f = new File("data.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		ArrayList<String> names = new ArrayList<String>();

		String name = br.readLine();
		while (name != null) {
			names.add(name);
			// System.out.println(name);
			name = br.readLine();
		}

		// names.sort(null);
		Collections.sort(names);

		int i = 1;
		for (String d : names) {
			System.out.println((i++) + ") " + d);
		}
		br.close();
	}

}
