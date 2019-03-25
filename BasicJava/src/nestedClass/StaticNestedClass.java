package nestedClass;

public class StaticNestedClass {

	static class InnerSC {
		static void print() {
			System.out.println("Hello");
		}
	}

	public static void main(String args[]) {
		StaticNestedClass.InnerSC.print();
	}

}
