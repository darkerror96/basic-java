/**
 * 
 */
package annotationexamples;

import java.lang.reflect.Method;

/**
 * @author rutpatel
 *
 */
public class Test {

	@MyAnnotation
	private String reverse(String data) {
		return new StringBuilder(data).reverse().toString();
	}

	public static void main(String[] args) {

		Test t = new Test();
		System.out.println(t.reverse("olleh"));

		System.out.println(MyAnnotation.class.isAnnotation());
		System.out.println(Test.class.isAnnotation());
		System.out.println("Package Name - " + Test.class.getPackageName());

		for (Method m : Test.class.getDeclaredMethods()) {
			System.out.print(m.getName() + " - ");

			if (m.toString().contains("public")) {
				System.out.print("PUBLIC ");
			}
			if (m.toString().contains("private")) {
				System.out.print("PRIVATE ");
			}
			if (m.toString().contains("static")) {
				System.out.print("STATIC ");
			}
			if (m.toString().contains("final")) {
				System.out.print("FINAL ");
			}
			if (m.toString().contains("protected")) {
				System.out.print("PROTECTED ");
			}
			if (m.toString().contains("default")) {
				System.out.print("DEFAULT ");
			}
			System.out.print("Method\n");
		}
		String E = "\033[31m", S = "\033[32m", D = "\033[0m";
		System.out.println(E + "Red" + D + ", " + S + "Green" + D);

	}
}
