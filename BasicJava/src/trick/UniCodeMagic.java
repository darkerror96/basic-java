/**
 * 
 */
package trick;

/**
 * @author rutpatel
 *
 */
public class UnicodeMagic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// the line below this gives an output
		// \u000d System.out.println("comment executed");
		
		// no error in naming variable as below
		int $_ = 5;
		
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
	}

}
