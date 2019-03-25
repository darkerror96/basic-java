/**
 * 
 */
package threadpkg;

/**
 * @author rutpatel
 *
 */
public class PrintNumber {

	public static void printNumbers() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getId() + " : " + i);
		}
	}
}
