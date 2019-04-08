/**
 * 
 */
package functinalInterface;

/**
 * @author rutpatel
 *
 */
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		doOperation doOp = (int x) -> x * x;
		doOp.sayHello();
		System.out.println(doOp.doMath(5));
	}

}
