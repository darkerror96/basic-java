/**
 * 
 */
package functinalInterface;

/**
 * @author rutpatel
 *
 */
@FunctionalInterface
interface doOperation {

	int doMath(int a);

	default void sayHello() {
		System.out.println("Hello from Functional Interface!!!");
	}
}
