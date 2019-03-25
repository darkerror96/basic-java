package nestedClass;

interface Personable {
	void print();
}

public class AnonymousInterfaceInnerClass {

	public static void main(String[] args) {

		Personable p = new Personable() {

			@Override
			public void print() {
				System.out.println("Helloable");

			}
		};
		p.print();
	}
}
