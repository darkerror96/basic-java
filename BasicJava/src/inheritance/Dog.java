package inheritance;

import abstractImplement.Collar;
import abstractImplement.Collarable;

public class Dog extends Pet implements Collarable {

	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

	public void fetch() {
		System.out.println("Fetch from Dog");
	}

	@Override
	public void speak() {
		System.out.println("Dog");
	}

	@Override
	public Collar getCollarType() {
		Collar collar = new Collar();
		collar.setCollarType("Leather");
		return collar;
	}
}
