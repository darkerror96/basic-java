package nestedClass;

public class OuterInnerClass {

	private String name = "Spring";

	public String getName() {
		return name;
	}

	OuterInnerClass() {
		System.out.println("Constructor from Outer Class");
	}

	public class InnerClass {

		InnerClass() {
			System.out.println("Constructor from Inner Class");
		}

		public void message() {
			System.out.println("Hello " + getName() + " from Inner Class");

		}
	}

	void localClass() {
		class Local {

			Local() {
				System.out.println("Constructor from Local Class");
			}

			void localMessage() {
				System.out.println("Hello " + getName() + " from Local Class");
			}
		}
		Local l = new Local();
		l.localMessage();
	}

	public static void main(String[] args) {

		OuterInnerClass oic = new OuterInnerClass();
		OuterInnerClass.InnerClass ic = oic.new InnerClass();
		oic.localClass();
		ic.message();

	}

}
