package inheritance;

public class Cat extends Pet {

	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println("Cat");
	}
}
