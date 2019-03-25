package nestedClass;

abstract class Person {

	public abstract void print();

}

public class AnonymousAbstractInnerClass {

	public static void main(String[] args) {

		Person p = new Person() {

			@Override
			public void print() {
				System.out.println("Hello");
			}
		};
		p.print();

	}

}
