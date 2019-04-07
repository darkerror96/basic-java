/**
 * 
 */
package trick;

/**
 * @author rutpatel
 *
 */
class A {
	static int i = 1111;

	static {
		i = i-- - --i;
		System.out.println("ASBlk " + i);
	}

	{
		i = i++ + ++i;
		System.out.println("ABlk " + i);
	}
}

class B extends A {
	static {
		i = --i - i--;
		System.out.println("BSBlk " + i);
	}

	{
		i = ++i + i++;
		System.out.println("BBlk " + i);
	}
}

public class StaticMagic {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
	}

}
