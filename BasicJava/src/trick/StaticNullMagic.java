/**
 * 
 */
package trick;

/**
 * @author rutpatel
 *
 */

class Abc {
	static void staticMethod() {
		System.out.println("Static Method");
	}
}

public class StaticNullMagic {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Abc a = null;
		a.staticMethod();
		
		// Check which statement will give you complie time error
		Integer i = new Integer(null);
		String s = new String(null);
	}
}
