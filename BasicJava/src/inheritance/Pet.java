package inheritance;

public class Pet {

	private String name;

	public Pet() {
		System.out.println("This is Pet class");
	}

	public Pet(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("Pet");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pname = " + name;
	}
}
