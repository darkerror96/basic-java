/**
 * 
 */
package HtmlReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author rutpatel
 *
 */
public class PrintWebPage {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html");
		InputStream iS = url.openStream();

		int count = 0, countS = 0;

//		Scanner sc = new Scanner(iS);
//		while (sc.hasNext()) {
//			String data = sc.next();
//			// System.out.println(data);
//			if (data.toUpperCase().contains("COLLECTION")) {
//				count++;
//			}
//			if (data.toUpperCase().contains("COLLECTIONS")) {
//				countS++;
//			}
//		}

		long startTime = System.currentTimeMillis();

		String collection[] = new String(iS.readAllBytes()).split(" ");

		for (int i = 0; i < collection.length; i++) {
			if (collection[i].toLowerCase().contains("collection")) {
				count++;
			}
			if (collection[i].toLowerCase().contains("collections")) {
				count++;
			}
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Total Time - " + (endTime - startTime) + " ms");
		System.out.println("'Collection' Word Count - " + (count + countS));
//		sc.close();

	}
}
