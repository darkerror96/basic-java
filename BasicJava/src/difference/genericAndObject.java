/**
 * 
 */
package difference;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rutpatel
 *
 */
public class genericAndObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		var temp = "hfbjwe";
		System.out.println(temp);

		Character c = '\u2000';
		String s = c + "abc" + c;

		System.out.println(s.trim());
		System.out.println(s.strip());

		List<String> listObj = new ArrayList<>();
		listObj.add("Hello");
		processList(listObj);

	}

	// Use Object and ? instead of String for difference
	private static void processList(List<String> listObj) {
		listObj.add("World");
		System.out.println(listObj);
	}

}
